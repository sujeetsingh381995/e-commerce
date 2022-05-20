package com.ziletech.mlm.controller;

import com.ziletech.mlm.entity.Book;
import com.ziletech.mlm.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping("/{id}")
    public ResponseEntity<Book> findById(@PathVariable("id") long id){
        Book book = bookService.findById(id);
        return  new ResponseEntity<>(book, HttpStatus.OK);
    }




}
