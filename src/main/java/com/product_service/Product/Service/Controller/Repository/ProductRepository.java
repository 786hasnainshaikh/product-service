package com.product_service.Product.Service.Controller.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product_service.Product.Service.Entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{
   
}
