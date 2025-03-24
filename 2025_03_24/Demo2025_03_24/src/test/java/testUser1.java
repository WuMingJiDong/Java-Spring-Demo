import cn.edu.hbsi.User1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testUser1
{
    public static void main(String[] args) {
        //1.获取spring容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        //2.到spring容器中获取对象
        User1 user1 = (User1) applicationContext.getBean("user1");

        //3.输出对象
        System.out.println(user1);
    }
}
