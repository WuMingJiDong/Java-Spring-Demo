import cn.edu.hbsi.domain.Bean1;
import cn.edu.hbsi.domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test
{
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//        User user = (User) applicationContext.getBean("user");
//        System.out.println(user);
    }
}
