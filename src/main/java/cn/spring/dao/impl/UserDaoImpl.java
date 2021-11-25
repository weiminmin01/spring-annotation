package cn.spring.dao.impl;

import cn.spring.beans.User;
import cn.spring.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaoImpl  implements UserDao {
    @Override
    public void saveUser(User user) {
        System.out.println("保存用户数据");
    }
}
