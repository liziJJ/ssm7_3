package com.ljj.controller;

import com.ljj.domain.Book;
import com.ljj.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.ljj.controller.Code.*;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;
    @PostMapping
    public Result save(@RequestBody Book book) {
        boolean flag = bookService.save(book);
        return new Result(flag==true? SAVE_OK:SAVE_ERR,flag);
    }
    @PutMapping
    public Result update(@RequestBody Book book) {
        boolean flag = bookService.update(book);
        return new Result(flag==true?UPDATE_OK:UPDATE_ERR,flag);
    }
    //路径参数
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        boolean flag = bookService.delete(id);
        return new Result(flag==true?DELETE_OK:DELETE_ERR,flag);
    }
    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id) {
        Book book = bookService.getById(id);
        Integer code = book != null? GET_OK:GET_ERR;
        String msg = book != null?"":"数据查询失败，请重试！";
        return new Result(code,book,msg);
    }
    @GetMapping
    public Result getAll() {
        List<Book> book = bookService.getAll();
        Integer code = book != null? GET_OK:GET_ERR;
        String msg = book != null?"":"数据查询失败，请重试！";
        return new Result(code,book,msg);
    }
}
