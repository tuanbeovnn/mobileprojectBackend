package com.mobileproject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class ProductEntity extends BaseEntity {
	
	@Column
    private String name;
	@Column
    private Long price;
	@Column
    private String description;
	@Column
    private int rating;
	@Column
    private String image;
	
	@ManyToOne
    @JoinColumn(name = "producer_id")
    private ProducerEntity producer;
	
	
	public ProducerEntity getProducer() {
		return producer;
	}
	public void setProducer(ProducerEntity producer) {
		this.producer = producer;
	}
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
