package cn.edu.hbsi.service;

import cn.edu.hbsi.domain.Account;

public interface AccountService
{
    //根据id查询账户信息
    public Account selectAccountById(Integer id);
}
