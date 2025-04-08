import cn.edu.hbsi.dao.AccountDao;
import cn.edu.hbsi.domain.Account;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUpdateAccount
{
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountDao accountDao = (AccountDao) applicationContext.getBean("AccountDao", AccountDao.class);
        Account account = (Account) applicationContext.getBean("Account");
        if (accountDao.deleteAccount(3) > 0){
            System.out.println("删除成功");
        }else{
            System.out.println("删除失败");
        }

        /*account.setId(3);
        account.setUsername("悸");
        account.setBalance(66.00);
        if (accountDao.updateAccount(account) > 0){
            System.out.println("更新成功");
        }else{
            System.out.println("更新失败");
        }*/
    }
}