import cn.edu.hbsi.dao.Impl.UserDaoImpl;
import cn.edu.hbsi.dao.UserDao;
import cn.edu.hbsi.domain.AnnoAdvice;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test
{
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        /*userDao.insert();
        System.out.println();
        userDao.delete();
        System.out.println();
        userDao.select();
        System.out.println();
        userDao.update();*/

        Class<AnnoAdvice> clazz = AnnoAdvice.class;
        if (clazz.isAnnotationPresent(Aspect.class)) {
            Aspect aspectAnnotation = clazz.getAnnotation(Aspect.class);
            String aspectId = aspectAnnotation.value();
            System.out.println("当前切面的标识是: " + aspectId);
        }
    }
}