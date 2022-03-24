package com.balarinfotech.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.balarinfotech.book.models.TblBook;

//@CrossOrigin("*")
public interface BookRepository extends JpaRepository<TblBook, Long> {

}
