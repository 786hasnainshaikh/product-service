package com.product_service.Product.Service.Entity.Model.Request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProductRequestDTO {
	private String name;
    private double price;
    private String productDescription;
    
}
