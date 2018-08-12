package com.study.service;

import com.study.mapper.BookMapper;
import com.study.pojo.Book;
import com.study.utils.DataSource;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

/**
 * Created by acer on 2018/8/7.
 */
public interface BookService  {
    @DataSource("slave")
    public List<Book> findAll();
    public void save(Book book);
    @DataSource("master")
    public Book findById(Integer id);
    public void updateBook(Book book);
    @DataSource("master")
    public void deletBook(Integer id);

}
