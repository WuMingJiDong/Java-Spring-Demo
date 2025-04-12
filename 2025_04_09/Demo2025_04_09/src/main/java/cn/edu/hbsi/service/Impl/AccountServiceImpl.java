package cn.edu.hbsi.service.Impl;

import cn.edu.hbsi.dao.AccountDao;
import cn.edu.hbsi.domain.Account;
import cn.edu.hbsi.service.AccountService;
import cn.edu.hbsi.utils.GetSqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService
{
    @Autowired
    private AccountDao accountDao;

    @Override
    public Account selectAccountById(Integer id) {
        Account account = null;
        try{
            account = accountDao.selectAccountById(id);
        }catch (Exception e){
            e.printStackTrace();
        }

        return account;
    }
}
