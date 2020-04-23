package com.mobileproject.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mobileproject.entity.ProductEntity;

public interface ProductRespository extends JpaRepository<ProductEntity, Long> {

}
