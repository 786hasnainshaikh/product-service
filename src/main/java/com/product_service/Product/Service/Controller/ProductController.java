package com.product_service.Product.Service.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product_service.Product.Service.Controller.Service.ProductService;
import com.product_service.Product.Service.Entity.Model.Request.ProductRequestDTO;
import com.product_service.Product.Service.Entity.Model.Response.ApiResponse;
import com.product_service.Product.Service.Entity.Model.Response.ProductResponseDTO;

@RestController
@RequestMapping(path = "/product")
public class ProductController {

	private static final Logger logger = LoggerFactory.getLogger(ProductController.class);
	 
	@Autowired
	ProductService service;

	@PostMapping(path = "/createProduct")
	public ResponseEntity<ApiResponse<ProductResponseDTO>> createProduct(
	        @RequestBody ProductRequestDTO request) {

	    try {
	        // Call service to create product
	    	 System.out.println("DTO name = " + request.getName());
	         System.out.println("DTO price = " + request.getPrice());
	         System.out.println("DTO desc = " + request.getProductDescription());
	        ApiResponse<ProductResponseDTO> response = service.createProduct(request);
	        
	     // Log response DTO
            logger.info("ProductResponseDTO: {}", response.getData());

	        // Success response
	        ApiResponse<ProductResponseDTO> apiResponse =
	                new ApiResponse<>(200, "Product created successfully", response.getData());

	        return ResponseEntity.ok(apiResponse);
	        }
            catch (Exception ex) {
	        // Generic fallback
	        ApiResponse<ProductResponseDTO> apiResponse =
	                new ApiResponse<>(500,  ex.getMessage(), null);
	        return ResponseEntity.ofNullable(apiResponse);
	    }
	}
}
