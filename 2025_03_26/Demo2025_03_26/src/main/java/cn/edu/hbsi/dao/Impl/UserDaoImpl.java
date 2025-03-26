package cn.edu.hbsi.dao.Impl;

import cn.edu.hbsi.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository("UserDao")
public class UserDaoImpl implements UserDao
{
    @Override
    public void save() {
        System.out.println("UserDao---save()");
    }
}
