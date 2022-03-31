package com.balarinfotech.book.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.balarinfotech.book.models.TblBook;
import com.balarinfotech.book.models.TblBookCategory;

//@CrossOrigin("*")
public interface BookRepository extends JpaRepository<TblBook, Long> {

	List<TblBook> findByTblBookCategory(TblBookCategory tblCategorie);
	


}
