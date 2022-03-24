package com.balarinfotech.book.models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TblBookCategory {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long catId;
	
	private String catName;

	@OneToMany(cascade = CascadeType.ALL,mappedBy = "tblBookCategory")
	@JsonIgnore
	private Set<TblBook> tblBooks;

	public Long getCatId() {
		return catId;
	}

	public void setCatId(Long catId) {
		this.catId = catId;
	}

	public String getCatName() {
		return catName;
	}

	public void setCatName(String catName) {
		this.catName = catName;
	}

	public Set<TblBook> getTblBooks() {
		return tblBooks;
	}

	public void setTblBooks(Set<TblBook> tblBooks) {
		this.tblBooks = tblBooks;
	}
	 
	
	
}
