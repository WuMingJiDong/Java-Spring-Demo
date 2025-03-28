package cn.edu.hbsi.dao.Impl;

import cn.edu.hbsi.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository("UserDao2")
public class UserDaoImpl2 implements UserDao
{
    @Override
    public void save() {
        System.out.println("UserDaoImpl2");
    }
}