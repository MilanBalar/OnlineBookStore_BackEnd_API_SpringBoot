package com.balarinfotech.book.service;

import java.util.List;
import java.util.Set;

import com.balarinfotech.book.models.TblBookCategory;



public interface CategoryService {
	
	public TblBookCategory addCategory(TblBookCategory tblBookCategory);
	
	public TblBookCategory updateCategory(TblBookCategory tblBookCategory);
	
	public Set<TblBookCategory> getCategories();
	
	public TblBookCategory getCategoryById(Long categoryId);
	
	public void deleteCategoryById(Long categoryId);

}
