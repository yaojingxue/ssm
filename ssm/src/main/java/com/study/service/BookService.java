package com.study.service;

import com.study.mapper.BookMapper;
import com.study.pojo.Book;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

/**
 * Created by acer on 2018/8/7.
 */
@Named
@Transactional
public class BookService {
    @Inject
    private BookMapper bookMapper;

    public List<Book> findAll(){
        return bookMapper.findAll();
    }
    public void save(Book book){
        bookMapper.save(book);
    }

}
