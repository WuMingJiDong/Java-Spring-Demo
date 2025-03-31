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

    @Override
    public void updateUser() {
        System.out.println("修改用户");
        int n = 10/0;
        /*try {
            int n = 10/0;
        }catch (Exception e){
            System.out.println("出现异常");
        }*/
    }

    @Override
    public void selectUser() {
        System.out.println("查询用户");
    }
}
