package banana.dao;

import banana.pojo.Goods;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface GoodsMapper {
    @Delete({
        "delete from t_goods",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into t_goods (id, name, ",
        "price, pubdate, typename, ",
        "intro, picture, ",
        "flag, star)",
        "values (#{id,jdbcType=INTEGER}, #{name,jdbcType=VARCHAR}, ",
        "#{price,jdbcType=BIGINT}, #{pubdate,jdbcType=DATE}, #{typename,jdbcType=VARCHAR}, ",
        "#{intro,jdbcType=VARCHAR}, #{picture,jdbcType=VARCHAR}, ",
        "#{flag,jdbcType=INTEGER}, #{star,jdbcType=INTEGER})"
    })
    int insert(Goods record);

    @InsertProvider(type=GoodsSqlProvider.class, method="insertSelective")
    int insertSelective(Goods record);

    @Select({
        "select",
        "id, name, price, pubdate, typename, intro, picture, flag, star",
        "from t_goods",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="price", property="price", jdbcType=JdbcType.BIGINT),
        @Result(column="pubdate", property="pubdate", jdbcType=JdbcType.DATE),
        @Result(column="typename", property="typename", jdbcType=JdbcType.VARCHAR),
        @Result(column="intro", property="intro", jdbcType=JdbcType.VARCHAR),
        @Result(column="picture", property="picture", jdbcType=JdbcType.VARCHAR),
        @Result(column="flag", property="flag", jdbcType=JdbcType.INTEGER),
        @Result(column="star", property="star", jdbcType=JdbcType.INTEGER)
    })
    Goods selectByPrimaryKey(Integer id);

    @UpdateProvider(type=GoodsSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Goods record);

    @Update({
        "update t_goods",
        "set name = #{name,jdbcType=VARCHAR},",
          "price = #{price,jdbcType=BIGINT},",
          "pubdate = #{pubdate,jdbcType=DATE},",
          "typename = #{typename,jdbcType=VARCHAR},",
          "intro = #{intro,jdbcType=VARCHAR},",
          "picture = #{picture,jdbcType=VARCHAR},",
          "flag = #{flag,jdbcType=INTEGER},",
          "star = #{star,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Goods record);
}