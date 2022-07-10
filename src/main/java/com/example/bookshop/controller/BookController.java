package com.example.bookshop.controller;

import com.example.bookshop.entity.Book;
import com.example.bookshop.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    public String showBookList(Model model) {
        List<Book> bookList = bookService.getBooks();
        model.addAttribute("bookList", bookList);
        return "books";
    }

    @GetMapping("/books/add")
    public String addBookForm(Model model){
        model.addAttribute("book", new Book());
        return "addBookForm";
    }

    @PostMapping("/books/addBook")
    public String addBook(Book book){
        bookService.addBook(book);
        return "redirect:/books";
    }

    @GetMapping("/books/delete/{id}")
    public String deleteBook(@PathVariable("id") Integer id) {
        bookService.deleteBookById(id);
        return "redirect:/books";
    }


}
