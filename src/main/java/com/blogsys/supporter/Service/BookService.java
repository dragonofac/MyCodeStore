package com.blogsys.supporter.Service;

import com.blogsys.supporter.Dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by mzlin on 14-12-18.
 */
@Service
public class BookService {
    @Autowired
    public BookDao bookDao;

    public void getAllBookInfo()
    {
        bookDao.getAllBookInfo();
    }
}
