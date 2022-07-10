package com.example.bookshop.service;

import com.example.bookshop.entity.Book;
import com.example.bookshop.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

    public Optional<Book> getBookById(Integer bookId) {
        return bookRepository.findById(bookId);
    }

    public void addBook(Book book) {
        bookRepository.save(book);
    }

    public void deleteBookById(Integer bookId) {
        bookRepository.deleteById(bookId);
    }
}
