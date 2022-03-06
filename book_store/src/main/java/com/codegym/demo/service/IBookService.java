package com.codegym.demo.service;


import com.codegym.demo.model.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IBookService extends IGeneralService<Book> {

    List<Book> getAll();

    Page<Book> findAllBook(String name, Pageable pageable);

}
