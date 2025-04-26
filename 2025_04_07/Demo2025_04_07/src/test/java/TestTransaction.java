import cn.edu.hbsi.dao.AccountDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringJUnitConfig(locations = "classpath:applicationContext.xml")
public class TestTransaction
{
    @Autowired
    private AccountDao accountDao;

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountDao accountDao = (AccountDao) applicationContext.getBean("AccountDao");
        accountDao.transfer("悸动","吾名悸动悸动",50.00);
        System.out.println("转账成功");
    }

    @Test
    public void test(){
        System.out.println("===================================");
        System.out.println(accountDao.selectById(1));
        System.out.println("===================================");
    }
}
