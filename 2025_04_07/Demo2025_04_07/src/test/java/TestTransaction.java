import cn.edu.hbsi.dao.AccountDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestTransaction
{
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountDao accountDao = (AccountDao) applicationContext.getBean("AccountDao");
        accountDao.transfer("悸动","吾名悸动悸动",50.00);
        System.out.println("转账成功");
    }
}
