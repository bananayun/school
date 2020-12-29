/**
* @author Feri
*/
package banana.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import banana.dao.UserAddressDao;
import banana.pojo.UserAddress;
import banana.service.UserAddressService;
@Service
public class UserAddressServiceImpl implements UserAddressService{
	@Autowired
	private UserAddressDao dao;
	//新增收货地址
	@Override
	public boolean insert(UserAddress ua) {
return dao.insert(ua)>0;
	}
	//查询收货地址
	@Override
	public List<UserAddress> queryByUid(int uid) {
return dao.queryByUid(uid);
	}
	//修改地址
	@Override
	public boolean update(UserAddress ua) {
return dao.update(ua)>0;
	}

}
