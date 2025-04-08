package cn.edu.hbsi.dao.Impl;

import cn.edu.hbsi.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Repository("AccountDao")
public class AccountDaoImpl implements AccountDao
{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,readOnly = false)
    @Override
    public void transfer(String outUser, String inUser, Double money) {
        String sql1 = "update account set balance=balance+? where username=?";
        String sql2 = "update account set balance=balance-? where username=?";

        jdbcTemplate.update(sql1,money,inUser);
//        int i = 1/0;
        jdbcTemplate.update(sql2,money,outUser);
    }
}
