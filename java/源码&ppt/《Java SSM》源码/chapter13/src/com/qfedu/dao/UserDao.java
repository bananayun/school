package com.qfedu.dao;
import com.qfedu.pojo.User;
public interface UserDao {
	User login(String username,String password);
}
