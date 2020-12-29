/** 
* @author Feri
*/
package banana.service;
import java.util.List;
import banana.pojo.UserAddress;
public interface UserAddressService {
	// 新增
	public boolean insert(UserAddress ua);
	// 修改
	public boolean update(UserAddress ua);
	// 查询地址
	public List<UserAddress> queryByUid(int uid);
}