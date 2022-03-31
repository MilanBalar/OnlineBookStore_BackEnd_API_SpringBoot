package com.balarinfotech.book.service;

import java.util.List;
import java.util.Set;

import com.balarinfotech.book.models.TblBook;
import com.balarinfotech.book.models.TblBookCategory;

public interface BookService {
	
	public TblBook addBook(TblBook tblBook);
	
	public TblBook updateBook(TblBook tblBook);
	
	public Set<TblBook> getBooks();
	
	public TblBook getBookById(Long bookId);
	
	public void deleteBookById(Long bookId);

	public List<TblBook> getBooksOfCategory(TblBookCategory tblCategorie);

}
