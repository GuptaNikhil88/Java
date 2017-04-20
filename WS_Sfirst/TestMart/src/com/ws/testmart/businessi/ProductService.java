/**
 * 
 */
package com.ws.testmart.businessi;

import java.util.List;

/**
 * @author Sony
 *
 */
public interface ProductService {
	public List<String> getProductCatagory();
	public List<String> getProducts(String category);
	public boolean addProduct(String category, String product);
}
