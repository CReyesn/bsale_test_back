package cl.creyes.bsale.service;

import java.util.List;

import cl.creyes.bsale.model.Product;

public interface ProductService {

	List<Product> findAll();
	List<Product> findByCategory(int category);
	List<Product> findByName(String name);
	
}
