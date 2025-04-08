import cn.edu.hbsi.dao.AccountDao;
import cn.edu.hbsi.domain.Account;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Iterator;
import java.util.List;

public class TestSelectAccount
{
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountDao accountDao = (AccountDao) applicationContext.getBean("AccountDao");
        System.out.println(accountDao.selectAccountById(1));

        List<Account> list = accountDao.selectAllCount();
        Iterator var = list.iterator();
        while(var.hasNext()){
            Account account = (Account) var.next();
            System.out.println(account);
        }

        System.out.println(accountDao.getAccountNumber());
    }
}