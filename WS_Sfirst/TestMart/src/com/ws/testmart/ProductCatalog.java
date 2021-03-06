package com.ws.testmart;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.ws.testmart.business.ProductServiceImpl;
import com.ws.testmart.businessi.ProductService;

@WebService
public class ProductCatalog {

	ProductService productService = new ProductServiceImpl();

	@WebMethod
	public List<String> getProductCatagory() {

		return productService.getProductCatagory();

	}
	
	@WebMethod(exclude = true)
	public List<String> getProducts(String category) {

		return productService.getProducts(category);

	}
	
	@WebMethod(exclude = true)
	public boolean addProduct(String category, String product) {
		return productService.addProduct(category, product);	
	}
}
