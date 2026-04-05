package com.product_service.Product.Service.Entity.Model.Request;




public class ProductRequestDTO {
	private String name;
    private double price;
    private String productDescription;
    
    
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getProductDescription() {
		return productDescription;
	}


	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}


	public ProductRequestDTO() {
		super();
		// TODO Auto-generated constructor stub
	}


	public ProductRequestDTO(String name, double price, String productDescription) {
		super();
		this.name = name;
		this.price = price;
		this.productDescription = productDescription;
	}
    
    
    
}
