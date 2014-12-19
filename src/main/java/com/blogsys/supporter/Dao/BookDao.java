package com.blogsys.supporter.Dao;

import com.blogsys.supporter.Domain.BookInfo;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by mzlin on 14-12-18.
 */
@Repository
public class BookDao {
    @Autowired
    public SqlSessionFactory sqlSessionFactory;

    public void getAllBookInfo()
    {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<BookInfo> allBook = sqlSession.selectList("com.blogsys.supporter.book.mapper.selectAll");
        for(BookInfo bi : allBook){
            System.out.println(bi.toString());
        }
    }
}
