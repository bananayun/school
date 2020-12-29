package banana.dao;

import banana.pojo.UserAddress;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface UserAddressMapper {
    @Delete({
        "delete from t_useraddress",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into t_useraddress (id, name, ",
        "phone, detail, uid, ",
        "flag)",
        "values (#{id,jdbcType=INTEGER}, #{name,jdbcType=VARCHAR}, ",
        "#{phone,jdbcType=VARCHAR}, #{detail,jdbcType=VARCHAR}, #{uid,jdbcType=INTEGER}, ",
        "#{flag,jdbcType=INTEGER})"
    })
    int insert(UserAddress record);

    @InsertProvider(type=UserAddressSqlProvider.class, method="insertSelective")
    int insertSelective(UserAddress record);

    @Select({
        "select",
        "id, name, phone, detail, uid, flag",
        "from t_useraddress",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="phone", property="phone", jdbcType=JdbcType.VARCHAR),
        @Result(column="detail", property="detail", jdbcType=JdbcType.VARCHAR),
        @Result(column="uid", property="uid", jdbcType=JdbcType.INTEGER),
        @Result(column="flag", property="flag", jdbcType=JdbcType.INTEGER)
    })
    UserAddress selectByPrimaryKey(Integer id);

    @UpdateProvider(type=UserAddressSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(UserAddress record);

    @Update({
        "update t_useraddress",
        "set name = #{name,jdbcType=VARCHAR},",
          "phone = #{phone,jdbcType=VARCHAR},",
          "detail = #{detail,jdbcType=VARCHAR},",
          "uid = #{uid,jdbcType=INTEGER},",
          "flag = #{flag,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(UserAddress record);
}