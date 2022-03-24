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

import com.balarinfotech.book.models.TblBookCategory;
import com.balarinfotech.book.service.CategoryService;


@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1/category")
public class CategoryController {
	@Autowired
	private CategoryService categoryService;
	
	//add category
	@PostMapping("/")
	public ResponseEntity<TblBookCategory> addCategory(@RequestBody TblBookCategory tblBookCategory){
		TblBookCategory addCategory = this.categoryService.addCategory(tblBookCategory);
		return ResponseEntity.ok(addCategory);
	}
	
	//get category by id
	@GetMapping("/{categoryId}")
	public TblBookCategory getCategoryById(@PathVariable("categoryId") Long categoryId) {
		return this.categoryService.getCategoryById(categoryId);
	}
	
	//get all category
	@GetMapping("/")
	public ResponseEntity<?> getAllCategory(){
		return ResponseEntity.ok(this.categoryService.getCategories());
	}

	//update category
	@PutMapping("/")
	public TblBookCategory updateCategory(@RequestBody TblBookCategory tblBookCategory) {
	    return this.categoryService.updateCategory(tblBookCategory);
	}
	
	//delete category by id
	@DeleteMapping("/{categoryId}")
	public void deleteCategoryById(@PathVariable("categoryId") Long categoryId) {
		this.categoryService.deleteCategoryById(categoryId);
	}
	


}
