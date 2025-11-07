package com.livraria.service;

import com.livraria.entity.Book;
import com.livraria.repository.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    private BookRepository bookRepository;

    public Book salvar(Book book){
        return bookRepository.save(book);
    }

}
