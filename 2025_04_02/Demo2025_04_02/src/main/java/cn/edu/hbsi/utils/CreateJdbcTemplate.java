package cn.edu.hbsi.utils;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class CreateJdbcTemplate
{
    private static JdbcTemplate jdbcTemplate = null;
    //private static ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

    static {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        jdbcTemplate = (JdbcTemplate) applicationContext.getBean("jdbcTemplate");
    }

    public static JdbcTemplate createJdbcTemplate(){
        return jdbcTemplate;
    }
}
