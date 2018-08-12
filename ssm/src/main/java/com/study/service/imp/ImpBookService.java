package com.study.service.imp;

import com.study.mapper.BookMapper;
import com.study.pojo.Book;
import com.study.service.BookService;
import com.study.utils.DataSource;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

/**
 * Created by acer on 2018/8/7.
 */
@Named

public class ImpBookService implements BookService {
    @Inject
    private BookMapper bookMapper;
    public List<Book> findAll(){
        return bookMapper.findAll();
    }
    public void save(Book book){
        bookMapper.save(book);
    }
    @Transactional
    public Book findById(Integer id){
       return bookMapper.findById(id);
    }
    public void updateBook(Book book){
        bookMapper.updateBook(book);
    }
    @Transactional
    public void deletBook(Integer id){
        bookMapper.deleteBook(id);
    }

}
