import cn.edu.hbsi.controller.AccountController;
import cn.edu.hbsi.dao.AccountDao;
import cn.edu.hbsi.domain.Account;
import cn.edu.hbsi.service.AccountService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;
import java.io.Reader;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class TestAccount
{
//    @Autowired
//    private AccountService accountService;

    @Test
    public void testSelectAccountById1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountController accountController = (AccountController) applicationContext.getBean("accountController", AccountController.class);

        accountController.selectAccountById();
    }

    @Test
    public void testSelectAccountById2(){
        //1.读取核心配置文件
        Reader reader = null;
        try {
            reader = Resources.getResourceAsReader("mybatis-config.xml");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //2.创建SqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        //3.创建SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //4.获取Mapper对象
        AccountDao accountDao = sqlSession.getMapper(AccountDao.class);
        //5.执行方法
        Account account = accountDao.selectAccountById(1);
        System.out.println(account);
        //6.释放资源
        sqlSession.close();
    }
}
