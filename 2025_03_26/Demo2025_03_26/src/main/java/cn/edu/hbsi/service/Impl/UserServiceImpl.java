package cn.edu.hbsi.service.Impl;

import cn.edu.hbsi.dao.UserDao;
import cn.edu.hbsi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("UserService")
public class UserServiceImpl implements UserService
{
//    @Resource(name = "UserDao")
    @Autowired
    private UserDao userDao;

    @Override
    public void save() {
        System.out.println("UserService---save()");
        userDao.save();
    }
}
