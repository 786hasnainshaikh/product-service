package com.product_service.Product.Service.Entity.Model.Response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


public class ProductResponseDTO {
	 private int id;
	    private String name;
	    private double price;
	    private String productDescription;
	    
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
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
		public ProductResponseDTO() {
			super();
			// TODO Auto-generated constructor stub
		}
		public ProductResponseDTO(int id, String name, double price, String productDescription) {
			super();
			this.id = id;
			this.name = name;
			this.price = price;
			this.productDescription = productDescription;
		}
		@Override
		public String toString() {
			return "ProductResponseDTO [id=" + id + ", name=" + name + ", price=" + price + ", productDescription="
					+ productDescription + "]";
		}
	    
		
	    
	    
}
