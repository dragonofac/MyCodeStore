package com.blogsys.supporter;

import com.blogsys.supporter.Domain.BookInfo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import javax.security.auth.login.Configuration;
import java.io.Reader;
import java.util.List;

/**
 * Created by mzlin on 14-12-18.
 */
public class IbatisTest {

    public static SqlSessionFactory sqlSessionFactory;

    static {
        ApplicationContext context = new ClassPathXmlApplicationContext("config/mysql-source.xml");
        sqlSessionFactory = (SqlSessionFactory)context.getBean("sqlSessionFactory");
    }

    @Test
    public void testIbatis()
    {
        try {
            org.apache.ibatis.session.Configuration cg = sqlSessionFactory.getConfiguration();
            SqlSession sqlSession = sqlSessionFactory.openSession();
            List<BookInfo> bi = sqlSession.selectList("com.blogsys.supporter.book.mapper.selectAll");
            for( BookInfo info:bi){
                System.out.println(info.toString());
            }
        }catch(Exception ex) {ex.printStackTrace();}
    }
}
