package com.balarinfotech.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.balarinfotech.book.models.TblBookCategory;

//@CrossOrigin("*")
//@RepositoryRestResource(collectionResourceRel = "bookCategory",path = "book-category") //for changing the API ends points
public interface CategoryRepository extends JpaRepository<TblBookCategory, Long> {

}
