package com.mobileproject.service;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.mobileproject.dto.ProductDTO;

public interface IProductService {
	ProductDTO save(ProductDTO productDTO);
//	ProductDTO update(ProductDTO productDTO);
	void delete (long[] ids);
	//List<ProductDTO> findAll(Pageable pageable);
	List<ProductDTO> findAll();
//	int totalItem();
}
