package com.balarinfotech.book.models;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

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
public class TblBook {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long bookId;
	
	private String sku;
	
	private String name;
	
	private String description;
	
	private BigDecimal unitPrice;
	
	private String imageUrl;
	
	private boolean isActive;
	
	private int unitInStock;
	
	private Date createdOn;
	
	private Date updatedOn;
	
	@ManyToOne
	@JoinColumn(name = "catId",nullable = false)
	private TblBookCategory tblBookCategory;

	public Long getBookId() {
		return bookId;
	}

	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public int getUnitInStock() {
		return unitInStock;
	}

	public void setUnitInStock(int unitInStock) {
		this.unitInStock = unitInStock;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public Date getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}

	public TblBookCategory getTblBookCategory() {
		return tblBookCategory;
	}

	public void setTblBookCategory(TblBookCategory tblBookCategory) {
		this.tblBookCategory = tblBookCategory;
	}
	
	

}
