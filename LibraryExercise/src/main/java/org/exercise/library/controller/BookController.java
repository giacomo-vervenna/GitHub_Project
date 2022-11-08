package org.exercise.library.controller;

import org.exercise.library.models.Book;
import org.exercise.library.models.Book;
import org.exercise.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@ResponseBody
@RequestMapping(value = "/book")
public class BookController {
    private final BookService service;

    @Autowired
    public BookController(BookService bookService) {
        this.service = bookService;
    }

    @RequestMapping("/find_books")
    public ResponseEntity<List<Book>> findAllBooks() {
        List<Book> response = service.findBooks();
        return ResponseEntity.ok(response);
    }

    @RequestMapping(value = "/add_book", method = RequestMethod.POST)
    public ResponseEntity<Book> addBook(@RequestBody Book newBook) {
        Book response = service.addBook(newBook);
        return ResponseEntity.ok(response);
    }
}
