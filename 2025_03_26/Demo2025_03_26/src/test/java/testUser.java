import cn.edu.hbsi.controller.UserController;
import cn.edu.hbsi.domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testUser
{
    public static void main(String[] args) {
        /*ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
          User user = (User) applicationContext.getBean("user");
          System.out.println(user);*/
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserController userController = (UserController) applicationContext.getBean("UserController");
        userController.save();
    }
}
