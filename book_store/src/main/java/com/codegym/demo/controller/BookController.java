package com.codegym.demo.controller;


import com.codegym.demo.dto.CartDto;
import com.codegym.demo.dto.ListCartDto;
import com.codegym.demo.model.Book;
import com.codegym.demo.model.OrderDetail;
import com.codegym.demo.model.User;
import com.codegym.demo.service.IBookService;
import com.codegym.demo.service.IUserService;
import com.codegym.demo.service.OderDetailService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/book")
@CrossOrigin
public class BookController {

    @Autowired
    private IBookService iBookService;

    @Autowired
    private OderDetailService oderDetailService;


    @Autowired
    private IUserService iUserService;

    @GetMapping("/OderDetail")
    public ResponseEntity<?> getOderDetail() {
        List<OrderDetail> movieList = oderDetailService.findAll();
        return new ResponseEntity<>(movieList, HttpStatus.OK);
    }

    @GetMapping("/list")
    public ResponseEntity<?> getBookList() {
        List<Book> movieList = iBookService.getAll();
        return new ResponseEntity<>(movieList, HttpStatus.OK);
    }

    @GetMapping("/info/{id}")
    public ResponseEntity<Optional<User>> findInfoUser(@PathVariable Long id) {
        Optional<User> user = iUserService.findById(id);
        if (user.isPresent()) {
            return new ResponseEntity<>(user, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


    @GetMapping("")
    public ResponseEntity<?> findAllBook(@RequestParam String name,
                                          @RequestParam int page ,
                                          @RequestParam int size ) {
        Pageable pageable = PageRequest.of(page, size, Sort.Direction.ASC, "name");
        Page<Book> bookPage = iBookService.findAllBook(name, pageable);
        if (bookPage.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(bookPage, HttpStatus.OK);
    }
    @GetMapping("/detail/{id}")
    public ResponseEntity<Optional<Book>> findDetailBookById(@PathVariable Long id) {
        Optional<Book> book = iBookService.findById(id);
        if (book.isPresent()) {
            return new ResponseEntity<>(book, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


    @PostMapping("/history")
    public ResponseEntity<?> addOrder(@RequestBody OrderDetail orderDetail ){

        return new ResponseEntity<>(oderDetailService.saveOrderDetail(orderDetail) , HttpStatus.OK);
    }


}
