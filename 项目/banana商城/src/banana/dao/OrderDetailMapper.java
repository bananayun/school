package banana.dao;

import banana.pojo.OrderDetail;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface OrderDetailMapper {
    @Delete({
        "delete from t_orderdetail",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into t_orderdetail (id, gid, ",
        "oid, money, num)",
        "values (#{id,jdbcType=INTEGER}, #{gid,jdbcType=INTEGER}, ",
        "#{oid,jdbcType=VARCHAR}, #{money,jdbcType=BIGINT}, #{num,jdbcType=INTEGER})"
    })
    int insert(OrderDetail record);

    @InsertProvider(type=OrderDetailSqlProvider.class, method="insertSelective")
    int insertSelective(OrderDetail record);

    @Select({
        "select",
        "id, gid, oid, money, num",
        "from t_orderdetail",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="gid", property="gid", jdbcType=JdbcType.INTEGER),
        @Result(column="oid", property="oid", jdbcType=JdbcType.VARCHAR),
        @Result(column="money", property="money", jdbcType=JdbcType.BIGINT),
        @Result(column="num", property="num", jdbcType=JdbcType.INTEGER)
    })
    OrderDetail selectByPrimaryKey(Integer id);

    @UpdateProvider(type=OrderDetailSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(OrderDetail record);

    @Update({
        "update t_orderdetail",
        "set gid = #{gid,jdbcType=INTEGER},",
          "oid = #{oid,jdbcType=VARCHAR},",
          "money = #{money,jdbcType=BIGINT},",
          "num = #{num,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(OrderDetail record);
}