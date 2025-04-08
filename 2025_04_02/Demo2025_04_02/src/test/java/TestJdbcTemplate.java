import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class TestJdbcTemplate
{
    public static void main(String[] args) {
        //1.获取spring ioc容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.通过容器获取jdbc模板
        JdbcTemplate jdbcTemplate = (JdbcTemplate) applicationContext.getBean("jdbcTemplate");
        //3.调用jdbc模板的execute()方法，创建一个account表
        /*String sql = "create table account(\n" +
                "id int primary key auto_increment,\n" +
                "username varchar(50),\n" +
                "balance double\n" +
                ")";*/
//        jdbcTemplate.execute(sql);
//        System.out.println("账户表account创建成功");

        String sql = "insert into account values(null,'吾名悸动',99.99)";
        jdbcTemplate.update(sql);
        System.out.println("插入成功");
    }
}
