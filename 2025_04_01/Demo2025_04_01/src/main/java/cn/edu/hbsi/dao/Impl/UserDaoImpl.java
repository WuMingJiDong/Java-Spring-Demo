package cn.edu.hbsi.dao.Impl;

import cn.edu.hbsi.dao.UserDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaoImpl implements UserDao
{
    @Override
    public void insert() {
        System.out.println("插入用户");
    }

    @Override
    public void update() {
        System.out.println("更改用户");
    }

    @Override
    public void delete() {
        System.out.println("删除用户");
    }

    @Override
    public void select() {
        System.out.println("查询用户");
    }
}
