package com.mobileproject.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "producer")
public class ProducerEntity extends BaseEntity {
	@Column
	private String producer;
	@Column
	private String code;

	@OneToMany(mappedBy = "producer")
	private List<ProductEntity> products = new ArrayList<>();
	
	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	

}
