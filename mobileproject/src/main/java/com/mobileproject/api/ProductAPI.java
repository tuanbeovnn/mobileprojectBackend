package com.mobileproject.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mobileproject.api.output.ProductOutput;
import com.mobileproject.dto.ProductDTO;
import com.mobileproject.service.IProductService;

@RestController
public class ProductAPI {
	
	@Autowired
	private IProductService productService;
	
//	@GetMapping(value = "/products")
//	public ProductOutput showProduct(@RequestParam ("page") int page, @RequestParam("limit") int limit) {
//		
//		ProductOutput result = new ProductOutput();
//		result.setPage(page);
//		Pageable pageable = new PageRequest(page - 1, limit);
//		result.setListProducts(productService.findAll(pageable));
//		result.setTotalPage((int) Math.ceil((double) (productService.totalItem())/limit));
//		return result;
//	}
	
	@GetMapping(value = "/products")
	public List<ProductDTO> showListProduct() {
		 
		return productService.findAll() ;
	}
	
	@PostMapping(value = "/products")
	public ProductDTO createProduct(@RequestBody ProductDTO model) {
		return productService.save(model);
	}
	@PutMapping(value = "/products/{id}")
	public ProductDTO updateProduct(@RequestBody ProductDTO model, @PathVariable("id") long id) {
		model.setId(id);
		return productService.save(model);
	}
	@DeleteMapping(value = "/products")
	public void deleteProduct(@RequestBody long[] ids) {
		productService.delete(ids);
	}
	
}
