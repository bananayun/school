package banana.dao;

import banana.pojo.GoodsType;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface GoodsTypeMapper {
    @Delete({
        "delete from t_goodstype",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into t_goodstype (id, name, ",
        "grade, parentname, ",
        "flag)",
        "values (#{id,jdbcType=INTEGER}, #{name,jdbcType=VARCHAR}, ",
        "#{grade,jdbcType=INTEGER}, #{parentname,jdbcType=VARCHAR}, ",
        "#{flag,jdbcType=INTEGER})"
    })
    int insert(GoodsType record);

    @InsertProvider(type=GoodsTypeSqlProvider.class, method="insertSelective")
    int insertSelective(GoodsType record);

    @Select({
        "select",
        "id, name, grade, parentname, flag",
        "from t_goodstype",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="grade", property="grade", jdbcType=JdbcType.INTEGER),
        @Result(column="parentname", property="parentname", jdbcType=JdbcType.VARCHAR),
        @Result(column="flag", property="flag", jdbcType=JdbcType.INTEGER)
    })
    GoodsType selectByPrimaryKey(Integer id);

    @UpdateProvider(type=GoodsTypeSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(GoodsType record);

    @Update({
        "update t_goodstype",
        "set name = #{name,jdbcType=VARCHAR},",
          "grade = #{grade,jdbcType=INTEGER},",
          "parentname = #{parentname,jdbcType=VARCHAR},",
          "flag = #{flag,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(GoodsType record);
}