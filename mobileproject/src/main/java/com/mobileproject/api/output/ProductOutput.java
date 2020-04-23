package com.mobileproject.api.output;

import java.util.ArrayList;
import java.util.List;

import com.mobileproject.dto.ProductDTO;

public class ProductOutput {
//	private int page;
//	private int totalPage;
	
	private List<ProductDTO> listProducts = new ArrayList<>();

//	public int getPage() {
//		return page;
//	}
//
//	public void setPage(int page) {
//		this.page = page;
//	}
//
//	public int getTotalPage() {
//		return totalPage;
//	}
//
//	public void setTotalPage(int totalPage) {
//		this.totalPage = totalPage;
//	}

	public List<ProductDTO> getListProducts() {
		return listProducts;
	}

	public void setListProducts(List<ProductDTO> listProducts) {
		this.listProducts = listProducts;
	}

	
	
	
}
