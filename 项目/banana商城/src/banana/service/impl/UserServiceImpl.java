/**
 * @author Feri
 */
package banana.service.impl;

import banana.common.utils.Base64Utils;
import banana.common.utils.MD5Utils;
import banana.common.utils.StrUtils;
import banana.dao.UserDao;
import banana.pojo.User;
import banana.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao dao;

    @Override
    public boolean save(User user) {
//密码使用密文
        user.setPassword(MD5Utils.md5(user.getPassword()));
        return dao.insert(user) > 0;
    }

    @Override
    public User getUserByName(String name) {
        return dao.select(name);
    }

    @Override
    public List<User> selectAll() {
        return dao.selectAll();
    }

    /* 检查用户名
     * true 表示存在 false不存在*/
    @Override
    public boolean checkName(String name) {
        return dao.checkName(name) > 0;
    }

    /* 检查邮箱
     *  true 表示存在 false不存在*/
    @Override
    public boolean checkEmail(String email) {
        return dao.checkEmail(email) > 0;
    }

    @Override
    public boolean activateUser(String email, String code) {
        if (!StrUtils.empty(email, code)) {
            return dao.updateAcode(Base64Utils.decode(email), Base64Utils.decode(code)) > 0;
        } else {
            return false;
        }
    }

    /* @Return true存在 false不存在
     */
    @Override
    public boolean checkLogin(String name) {
        return dao.select(name) != null;
    }

    @Override
    public int deleteById(int id) {
        return dao.deleteByid(id);
    }

    //搜索用户（根据username和sex）
    @Override
    public List<User> usersearch(String username, String sex) {
        return dao.selectsearch(username, sex);
    }
}