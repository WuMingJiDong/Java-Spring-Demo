package cn.edu.hbsi.dao;

import cn.edu.hbsi.domain.Account;

import java.util.List;

public interface AccountDao
{
    //获取Account表的总人数
    public Integer getAccountNumber();
    //根据id查询账户
    public Account selectAccountById(Integer id);
    //查询所有账户
    public List<Account> selectAllCount();
    //添加账户
    public Integer addAccount(Account account);
    //更新账户
    public Integer updateAccount(Account account);
    //删除账户
    public Integer deleteAccount(Integer id);
}