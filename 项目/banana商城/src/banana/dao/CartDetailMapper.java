package banana.dao;

import banana.pojo.CartDetail;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface CartDetailMapper {
    @Delete({
        "delete from t_cartdetail",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into t_cartdetail (id, cid, ",
        "gid, num, money)",
        "values (#{id,jdbcType=INTEGER}, #{cid,jdbcType=INTEGER}, ",
        "#{gid,jdbcType=INTEGER}, #{num,jdbcType=INTEGER}, #{money,jdbcType=BIGINT})"
    })
    int insert(CartDetail record);

    @InsertProvider(type=CartDetailSqlProvider.class, method="insertSelective")
    int insertSelective(CartDetail record);

    @Select({
        "select",
        "id, cid, gid, num, money",
        "from t_cartdetail",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="cid", property="cid", jdbcType=JdbcType.INTEGER),
        @Result(column="gid", property="gid", jdbcType=JdbcType.INTEGER),
        @Result(column="num", property="num", jdbcType=JdbcType.INTEGER),
        @Result(column="money", property="money", jdbcType=JdbcType.BIGINT)
    })
    CartDetail selectByPrimaryKey(Integer id);

    @UpdateProvider(type=CartDetailSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(CartDetail record);

    @Update({
        "update t_cartdetail",
        "set cid = #{cid,jdbcType=INTEGER},",
          "gid = #{gid,jdbcType=INTEGER},",
          "num = #{num,jdbcType=INTEGER},",
          "money = #{money,jdbcType=BIGINT}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(CartDetail record);
}