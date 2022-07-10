package com.example.bookshop.config;

import com.example.bookshop.entity.Book;
import com.example.bookshop.entity.Category;
import com.example.bookshop.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class BookConfig {
    @Bean
    CommandLineRunner commandLinerRunnerBook(BookRepository bookRepository) {
        return args -> {
            Book book1 = new Book(
                    "Ostatnie życzenie",
                    "superNowa",
                    32,
                    "Andrzej Sapkowski"
            );
            book1.setCategory(new Category("fantasy"));
            Book book2 = new Book(
                    "W pustyni i w puszczy",
                    "Greg",
                    20,
                    "Henryk Sienkiewicz"
            );
            book2.setCategory(new Category("powieść przygodowa"));
            bookRepository.saveAll(List.of(book1, book2));
        };
    }
}
