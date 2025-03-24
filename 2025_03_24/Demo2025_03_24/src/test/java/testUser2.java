import cn.edu.hbsi.User2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testUser2
{
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        User2 user2  = (User2) applicationContext.getBean("user2");
        System.out.println(user2);
    }
}
