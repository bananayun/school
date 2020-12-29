package banana.dao;

import banana.pojo.Order;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface OrderMapper {
    @Delete({
        "delete from t_order",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into t_order (id, uaid, ",
        "uid, createtime, ",
        "money, flag)",
        "values (#{id,jdbcType=VARCHAR}, #{uaid,jdbcType=INTEGER}, ",
        "#{uid,jdbcType=INTEGER}, #{createtime,jdbcType=TIMESTAMP}, ",
        "#{money,jdbcType=BIGINT}, #{flag,jdbcType=INTEGER})"
    })
    int insert(Order record);

    @InsertProvider(type=OrderSqlProvider.class, method="insertSelective")
    int insertSelective(Order record);

    @Select({
        "select",
        "id, uaid, uid, createtime, money, flag",
        "from t_order",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="uaid", property="uaid", jdbcType=JdbcType.INTEGER),
        @Result(column="uid", property="uid", jdbcType=JdbcType.INTEGER),
        @Result(column="createtime", property="createtime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="money", property="money", jdbcType=JdbcType.BIGINT),
        @Result(column="flag", property="flag", jdbcType=JdbcType.INTEGER)
    })
    Order selectByPrimaryKey(String id);

    @UpdateProvider(type=OrderSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Order record);

    @Update({
        "update t_order",
        "set uaid = #{uaid,jdbcType=INTEGER},",
          "uid = #{uid,jdbcType=INTEGER},",
          "createtime = #{createtime,jdbcType=TIMESTAMP},",
          "money = #{money,jdbcType=BIGINT},",
          "flag = #{flag,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Order record);
}