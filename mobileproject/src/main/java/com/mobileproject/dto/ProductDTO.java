package com.mobileproject.dto;

public class ProductDTO extends AbstractDTO<ProductDTO> {

    private String name;
    private Long price;
    private String description;
    private int rating;
    private String image;
//    private String producerCode;
//    
//
//	public String getProducerCode() {
//		return producerCode;
//	}
//	public void setProducerCode(String producerCode) {
//		this.producerCode = producerCode;
//	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
    
    
}
