package com.archanas18.springcloud.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.archanas18.springcloud.model.Product;

public interface ProductRepo extends JpaRepository<Product, Long> {

}
