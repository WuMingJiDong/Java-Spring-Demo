import cn.edu.hbsi.domain.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testStudent
{
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = (Student) applicationContext.getBean("Student2");
        System.out.println(student);

        //销毁Spring中的所有Bean
        AbstractApplicationContext abstractApplicationContext = (AbstractApplicationContext) applicationContext;
        abstractApplicationContext.registerShutdownHook();
    }
}
