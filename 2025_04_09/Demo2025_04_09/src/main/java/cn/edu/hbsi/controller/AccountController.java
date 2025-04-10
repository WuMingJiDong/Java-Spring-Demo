package cn.edu.hbsi.controller;

import cn.edu.hbsi.domain.Account;
import cn.edu.hbsi.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class AccountController
{
    @Autowired
    private AccountService accountService;

    public void selectAccountById(){
        Integer id = 1;
        Account account = accountService.selectAccountById(id);
        System.out.println(account);
    }
}
