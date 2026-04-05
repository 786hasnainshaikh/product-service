package com.product_service.Product.Service.Controller.Service;

import org.modelmapper.ModelMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product_service.Product.Service.Controller.Repository.ProductRepository;
import com.product_service.Product.Service.Entity.*;
import com.product_service.Product.Service.Entity.Model.Request.ProductRequestDTO;
import com.product_service.Product.Service.Entity.Model.Response.ApiResponse;
import com.product_service.Product.Service.Entity.Model.Response.ProductResponseDTO;




@Service
public class ProductService {
	
	 @Autowired
	    private ModelMapper mapper;

	    @Autowired
	    private ProductRepository repository;

	    public ApiResponse<ProductResponseDTO> createProduct(ProductRequestDTO request) {
	        try {
	            Product product = mapper.map(request, Product.class);
	            Product savedProduct = repository.save(product);
	            ProductResponseDTO responseDTO = mapper.map(savedProduct, ProductResponseDTO.class);

	            return new ApiResponse<>(201, "Product created", responseDTO);
	        } catch (Exception e) {
	            return new ApiResponse<>(500, "Failed to create product: " + e.getMessage(), null);
	        }
	    }

}
