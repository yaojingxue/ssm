package com.study.mapper;

import com.study.pojo.Book;

import java.util.List;

/**
 * Created by acer on 2018/8/7.
 */
public interface BookMapper {
    List<Book> findAll();
    void save(Book book);
    Book findById(Integer id);
    void updateBook(Book book);
    void deleteBook(Integer id);

}
