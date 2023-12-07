package ro.uvt.info.designpatternslab2023.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import ro.uvt.info.designpatternslab2023.classes.*;
import ro.uvt.info.designpatternslab2023.services.BookStatistics;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/books")
public class BooksController {

    private List<Book> books = new ArrayList<>();

    @GetMapping
    public List<Book> getAllBooks() {
        return books;
    }


    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Long id) {

        return null;
    }

    @PostMapping
    public Book addBook(@RequestBody Book newBook) {

        return newBook;
    }

    @PutMapping("/{id}")
    public Book updateBook(@PathVariable Long id, @RequestBody Book updatedBook) {

        return updatedBook;
    }


    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {

    }
}