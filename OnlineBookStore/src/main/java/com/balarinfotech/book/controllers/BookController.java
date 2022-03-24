package com.balarinfotech.book.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.balarinfotech.book.models.TblBook;
import com.balarinfotech.book.service.BookService;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1/book")
public class BookController {
	

	@Autowired
	private BookService bookService;
	
	//add book
	@PostMapping("/")
	public ResponseEntity<TblBook> addBook(@RequestBody TblBook tblBook){
		TblBook addBook = this.bookService.addBook(tblBook);
		return ResponseEntity.ok(addBook);
	}
	
	//get book by id
	@GetMapping("/{bookId}")
	public TblBook getBookById(@PathVariable("bookId") Long bookId) {
		return this.bookService.getBookById(bookId);
	}
	
	//get all book
	@GetMapping("/")
	public ResponseEntity<?> getAllBook(){
		return ResponseEntity.ok(this.bookService.getBooks());
	}

	//update book
	@PutMapping("/")
	public TblBook updateBook(@RequestBody TblBook tblBook) {
	    return this.bookService.updateBook(tblBook);
	}
	
	//delete book by id
	@DeleteMapping("/{bookId}")
	public void deleteBookById(@PathVariable("bookId") Long bookId) {
		this.bookService.deleteBookById(bookId);
	}
	




}
