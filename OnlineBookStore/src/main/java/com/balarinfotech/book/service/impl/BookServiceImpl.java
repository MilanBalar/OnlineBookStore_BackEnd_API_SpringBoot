package com.balarinfotech.book.service.impl;

import java.util.LinkedHashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.balarinfotech.book.models.TblBook;
import com.balarinfotech.book.repository.BookRepository;
import com.balarinfotech.book.service.BookService;

@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	private BookRepository bookRepository;

	@Override
	public TblBook addBook(TblBook tblBook) {
		return this.bookRepository.save(tblBook);
	}

	@Override
	public TblBook updateBook(TblBook tblBook) {
		return this.bookRepository.save(tblBook);
	}

	@Override
	public Set<TblBook> getBooks() {
		return new LinkedHashSet<>(this.bookRepository.findAll());
	}

	@Override
	public TblBook getBookById(Long bookId) {
		return this.bookRepository.findById(bookId).get();
	}

	@Override
	public void deleteBookById(Long bookId) {
		this.bookRepository.deleteById(bookId);

	}

}
