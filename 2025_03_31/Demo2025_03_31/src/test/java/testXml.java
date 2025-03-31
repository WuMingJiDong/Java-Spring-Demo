import cn.edu.hbsi.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testXml
{
    public static void main(String[] args) {
        //1.获取Spring ioc容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.通过容器获取对象
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        //3.执行方法
        userDao.addUser();
        //userDao.deleteUser();
        userDao.updateUser();
        //userDao.selectUser();
    }
}
