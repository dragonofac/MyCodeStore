package com.blogsys.supporter.Controller;

import com.blogsys.supporter.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by mzlin on 14-12-18.
 */
@Controller
@RequestMapping(value = "/")
public class BookController {
    @Autowired
    public BookService bookService;

    @RequestMapping(value="/")
    public String welcome(Model model)
    {
        model.addAttribute("message", "Hello world!");
        return "hello";
    }

    @RequestMapping(value = "/book/allbook",method = RequestMethod.GET)
    public void getAllBook()
    {
        bookService.getAllBookInfo();
    }
}
