package banana.dao;

import banana.pojo.Cart;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface CartMapper {
    @Delete({
        "delete from t_cart",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into t_cart (id, uid, ",
        "money)",
        "values (#{id,jdbcType=INTEGER}, #{uid,jdbcType=INTEGER}, ",
        "#{money,jdbcType=BIGINT})"
    })
    int insert(Cart record);

    @InsertProvider(type=CartSqlProvider.class, method="insertSelective")
    int insertSelective(Cart record);

    @Select({
        "select",
        "id, uid, money",
        "from t_cart",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="uid", property="uid", jdbcType=JdbcType.INTEGER),
        @Result(column="money", property="money", jdbcType=JdbcType.BIGINT)
    })
    Cart selectByPrimaryKey(Integer id);

    @UpdateProvider(type=CartSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Cart record);

    @Update({
        "update t_cart",
        "set uid = #{uid,jdbcType=INTEGER},",
          "money = #{money,jdbcType=BIGINT}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Cart record);
}