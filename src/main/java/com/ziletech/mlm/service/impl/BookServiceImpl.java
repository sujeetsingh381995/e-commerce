package com.ziletech.mlm.service.impl;

import com.ziletech.mlm.entity.Book;
import com.ziletech.mlm.repository.BookRepository;
import com.ziletech.mlm.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookRepository bookRepository;

    @Override
    public Book findById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }
}
