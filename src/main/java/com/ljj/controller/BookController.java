package com.ljj.controller;

import com.ljj.domain.Book;
import com.ljj.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;
    @PostMapping
    public boolean save(@RequestBody Book book) {
        return bookService.save(book);
    }
    @PutMapping
    public boolean update(@RequestBody Book book) {
        return bookService.update(book);
    }
    //路径参数
    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable Integer id) {
        return bookService.delete(id);
    }
    @GetMapping("/{id}")
    public Book getById(@PathVariable Integer id) {
        return bookService.getById(id);
    }
    @GetMapping
    public List<Book> getAll() {
        return bookService.getAll();
    }
}
