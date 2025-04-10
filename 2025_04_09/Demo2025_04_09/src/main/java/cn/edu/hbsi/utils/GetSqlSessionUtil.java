package cn.edu.hbsi.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.io.Reader;

public class GetSqlSessionUtil {
    @Autowired
    private static SqlSessionFactory sqlSessionFactory;

    /*static {
        Reader reader = null;
        try {
            reader = Resources.getResourceAsReader("mybatis-config.xml");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
    }*/

    //获取SqlSession对象的静态方法
    public static SqlSession getSqlSession() {
        return sqlSessionFactory.openSession();
    }
}