package cl.creyes.bsale.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.creyes.bsale.model.Product;
import cl.creyes.bsale.repository.ProductRepository;
import cl.creyes.bsale.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	ProductRepository productRepository;
	
	


	@Override
	public List<Product> findAll() {
		return productRepository.findAll();
	}

	@Override
	public List<Product> findByCategory(int category) {
		return productRepository.findByCategory(category);
	}

	@Override
	public List<Product> findByName(String name) {
		return productRepository.findByName(name);
	}

	
}
