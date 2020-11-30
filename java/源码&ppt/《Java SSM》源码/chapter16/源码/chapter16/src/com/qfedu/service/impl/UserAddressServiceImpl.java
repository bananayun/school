/**
* @author Feri
*/
package com.qfedu.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.qfedu.dao.UserAddressDao;
import com.qfedu.domain.UserAddress;
import com.qfedu.service.UserAddressService;
@Service
public class UserAddressServiceImpl implements UserAddressService{
	@Autowired
	private UserAddressDao dao;
	//新增收货地址
	@Override
	public boolean insert(UserAddress ua) {
		// TODO Auto-generated method stub
		return dao.insert(ua)>0;
	}
	//查询收货地址
	@Override
	public List<UserAddress> queryByUid(int uid) {
		// TODO Auto-generated method stub
		return dao.queryByUid(uid);
	}
	//修改地址
	@Override
	public boolean update(UserAddress ua) {
		// TODO Auto-generated method stub
		return dao.update(ua)>0;
	}

}
