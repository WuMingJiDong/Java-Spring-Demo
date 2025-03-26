import cn.edu.hbsi.domain.Bean1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testBean1
{
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Bean1 bean11 = (Bean1) applicationContext.getBean("bean1");
        Bean1 bean12 = (Bean1) applicationContext.getBean("bean1");
        System.out.println(bean11 + "\n" + bean12);
    }
}
