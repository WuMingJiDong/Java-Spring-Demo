package cn.edu.hbsi.dao.Impl;

import cn.edu.hbsi.dao.UserDao;

public class UserDaoImpl implements UserDao
{
    @Override
    public void addUser() {
        System.out.println("添加用户");
    }

    @Override
    public void deleteUser() {
        System.out.println("删除用户");
    }
}
