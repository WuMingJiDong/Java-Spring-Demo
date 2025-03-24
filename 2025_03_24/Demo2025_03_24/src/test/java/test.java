import cn.edu.hbsi.HelloSpring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test
{
    public static void main(String[] args) {
        //1.获取Spring容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        //2.从Spring容器中获取对象
        HelloSpring helloSpring = (HelloSpring) applicationContext.getBean("helloSpring");

        //3.调用对象的方法
        helloSpring.show();
    }
}
