/**
 * @author Feri
*/ 
package banana.dao;
import banana.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;
public interface UserDao {
	//新增
	@Insert("insert into t_user(role ,username,password,email,sex,createtime ,flag ,activatecode) values(1,#{username},#{password},#{email},#{sex},now(),1,#{activatecode})")
	int insert(User user);
	//登录 用户名或密码都可以使用
	@Select("select * from t_user where flag=2 and (username=#{name} or email=#{email})")
	@ResultType(User.class)
	User select(String name);
	//检查用户名是否存在
	@Select("select count(*) from t_user where username=#{username}")
	int checkName(String name);
	//检查用户名是否存在
	@Select("select count(*) from t_user where email=#{email}")
	int checkEmail(String email);
	//查询全部
	@Select("select * from t_user where flag=2")
	@ResultType(User.class)
	List<User> selectAll();
	//激活
	@Update("update t_user set flag=2 where email=#{email} and activatecode=#{code}")
	int updateAcode(@Param("email")String email,@Param("code")String code);
	//删除用户
	@Delete("delete from t_user where id=#{id} ")
	int deleteByid(int id);
	//根据用户名和性别搜索用户
	@Select("select * from t_user where username like CONCAT('%',#{username},'%')  and sex=#{sex}")
	@ResultType(User.class)
	List<User> selectsearch(@Param("username")String username , @Param("sex")String sex);
}