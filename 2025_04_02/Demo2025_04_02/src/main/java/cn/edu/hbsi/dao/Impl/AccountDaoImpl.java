package cn.edu.hbsi.dao.Impl;

import cn.edu.hbsi.dao.AccountDao;
import cn.edu.hbsi.domain.Account;
import cn.edu.hbsi.utils.CreateJdbcTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("AccountDao")
public class AccountDaoImpl implements AccountDao
{
    @Override
    public Integer getAccountNumber() {
        String sql = "select count(*) from account";
        return jdbcTemplate.queryForObject(sql,Integer.class);
    }

    //@Autowired
    //注入JdbcTemplate类型的对象
    JdbcTemplate jdbcTemplate = CreateJdbcTemplate.createJdbcTemplate();
    //JdbcTemplate jdbcTemplate;


    @Override
    public Account selectAccountById(Integer id) {
        //定义sql语句
        String sql = "select * from account where id=?";
        //定义一个RowMapper类型的对象，将查询到的记录和持久化类的属性进行映射
        //持久化类中的属性名必须和表的字段名一致，如果不一致，select语句中不能使用*，要给字段定别名，别名和属性值一致
        RowMapper<Account> rowMapper = new BeanPropertyRowMapper<Account>(Account.class);
        return jdbcTemplate.queryForObject(sql,rowMapper,id);
    }

    @Override
    public List<Account> selectAllCount() {
        String sql = "select * from account";
        RowMapper<Account> rowMapper = new BeanPropertyRowMapper<Account>(Account.class);
        return jdbcTemplate.query(sql,rowMapper);
    }

    @Override
    public Integer addAccount(Account account) {
        String sql = "insert into account values(?,?,?)";
        //定义数组来存放sql语句中参数的值
        Object[] objects = new Object[]{account.getId(),account.getUsername(),account.getBalance()};
        //执行添加
        Integer insertAccountCount = jdbcTemplate.update(sql,objects);
        return insertAccountCount;
    }

    @Override
    public Integer updateAccount(Account account) {
        String sql = "update account set username=?,balance=? where id=?";
        Object[] objects = new Object[]{account.getUsername(),account.getBalance(),account.getId()};
        Integer updateAccountCount = jdbcTemplate.update(sql,objects);
        return updateAccountCount;
    }

    @Override
    public Integer deleteAccount(Integer id) {
        String sql = "delete from account where id=?";
        Integer deleteAccountCount = jdbcTemplate.update(sql,id);
        return deleteAccountCount;
    }
}
