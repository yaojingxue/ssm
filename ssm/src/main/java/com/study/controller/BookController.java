package com.study.controller;

import com.study.pojo.Book;
import com.study.service.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by acer on 2018/8/7.
 */
@Controller
@RequestMapping("/books")
public class BookController {
    Logger logger= LoggerFactory.getLogger(BookController.class);
    @Inject
    private BookService bookService;
    @RequestMapping(method = RequestMethod.GET)
    public String list(Model model){
        List<Book> bookList= bookService.findAll();
        model.addAttribute("bookList",bookList);
        return "books/list";
    }

    @RequestMapping(value = "/new",method = RequestMethod.GET)
    public String saveBook() {
        return "books/new";
    }
    @RequestMapping(value = "/new",method = RequestMethod.POST)
    public String saveBook(Book book, RedirectAttributes redirectAttributes) {
        logger.debug("Book {}"+book);
        bookService.save(book);

        //redirectAttributes.addFlashAttribute("message","操作成功");
        return "redirect:/books";
    }
}
