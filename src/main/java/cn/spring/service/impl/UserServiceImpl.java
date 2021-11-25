package cn.spring.service.impl;

import cn.spring.beans.User;
import cn.spring.dao.UserDao;
import cn.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {
   /* @Autowired
    @Qualifier("userDao")*/
    @Resource(name = "userDao")
    private UserDao userDao;
    @Override
    public void addUser() {
        userDao.saveUser(new User());



    }
}
