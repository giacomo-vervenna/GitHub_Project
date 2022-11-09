package org.exercise.library.controller;

import org.exercise.library.models.Book;
import org.exercise.library.models.Book;
import org.exercise.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value = "/remove_book", method = RequestMethod.DELETE)
    public ResponseEntity<String> removeBook(@RequestParam Integer id){
        service.deleteBook(id);
        return ResponseEntity.ok("Book deleted");
    }
}
