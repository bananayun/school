/**  
* @Title: UserAddressDao.java  
* @Package banana.dao  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Feri 
* @date 2018年5月31日  
* @version V1.0  
*/  
package banana.dao;
import banana.pojo.UserAddress;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;
public interface UserAddressDao {
	//新增
	@Insert("insert into t_useraddress(name,phone,detail,uid,flag ) values(#{name},#{phone},#{detail},#{uid},1)")
	public int insert(UserAddress ua);
	//修改
	@Update("update t_useraddress set name=#{name},phone=#{phone},detail=#{detail} where id=#{id}")
	public int update(UserAddress ua);
	//修改
	@Update("update t_useraddress set flag=3 where id=#{id}")
	public int updateDea(int id);
	//查询地址
	@Select("select * from t_useraddress where uid=#{uid} order by flag desc")
	@ResultType(UserAddress.class)
	public List<UserAddress> queryByUid(int uid);
	//删除地址信息
	 int deleteById(int id);
}