package cl.creyes.bsale.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.creyes.bsale.model.Category;
import cl.creyes.bsale.repository.CategoryRepository;
import cl.creyes.bsale.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService{

	
	CategoryRepository categoryRepository;
	
	@Autowired
	public CategoryServiceImpl(CategoryRepository categoryRepository) {
		this.categoryRepository=categoryRepository;
	}

	@Override
	public List<Category> findAll() {
		return categoryRepository.findAll();
	}
	
	
}
