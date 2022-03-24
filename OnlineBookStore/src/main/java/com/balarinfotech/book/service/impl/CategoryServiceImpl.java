package com.balarinfotech.book.service.impl;

import java.util.LinkedHashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.balarinfotech.book.models.TblBookCategory;
import com.balarinfotech.book.repository.CategoryRepository;
import com.balarinfotech.book.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public TblBookCategory addCategory(TblBookCategory tblBookCategory) {
		
		return this.categoryRepository.save(tblBookCategory);
	}

	@Override
	public TblBookCategory updateCategory(TblBookCategory tblBookCategory) {
		
		return this.categoryRepository.save(tblBookCategory);
	}

	@Override
	public Set<TblBookCategory> getCategories() {
		
		return new LinkedHashSet<>(this.categoryRepository.findAll());
	}

	@Override
	public TblBookCategory getCategoryById(Long categoryId) {
		
		return this.categoryRepository.findById(categoryId).get();
	}

	@Override
	public void deleteCategoryById(Long categoryId) {
		
		this.categoryRepository.deleteById(categoryId);

	}

}
