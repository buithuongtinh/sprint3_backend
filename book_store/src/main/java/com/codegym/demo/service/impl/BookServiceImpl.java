package com.codegym.demo.service.impl;


import com.codegym.demo.dto.CartDto;
import com.codegym.demo.model.Book;
import com.codegym.demo.repository.IBookRepository;
import com.codegym.demo.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements IBookService {

    @Autowired
    private IBookRepository iBookRepository;


    @Override
    public List<Book> findAll() {
        return iBookRepository.findAll();
    }

    @Override
    public Optional<Book> findById(Long id) {
        return iBookRepository.findById(id);
    }

    @Override
    public CartDto save(Book book) {
        iBookRepository.save(book);
        return null;
    }

    @Override
    public void remove(Long id) {
        iBookRepository.deleteById(id);
    }

    @Override
    public List<Book> getAll() {
        return iBookRepository.findAll();
    }

    @Override
    public Page<Book> findAllBook(String name, Pageable pageable) {
        return iBookRepository.findAllBook("%" + name + "%",pageable);
    }
}
