package com.balarinfotech.book.service;

import java.util.Set;

import com.balarinfotech.book.models.TblBook;

public interface BookService {
	
	public TblBook addBook(TblBook tblBook);
	
	public TblBook updateBook(TblBook tblBook);
	
	public Set<TblBook> getBooks();
	
	public TblBook getBookById(Long bookId);
	
	public void deleteBookById(Long bookId);

}
