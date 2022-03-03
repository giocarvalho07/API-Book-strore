package com.bookstore.service;

import com.bookstore.domain.Book;
import com.bookstore.dto.MessageResponseDTO;
import com.bookstore.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {


    @Autowired
    private BookRepository bookRepository;

    public MessageResponseDTO create(Book book){
        Book savedBook = bookRepository.save(book);
        return MessageResponseDTO.builder().message("Book created with id " + savedBook.getId())
                .build();
    }

}
