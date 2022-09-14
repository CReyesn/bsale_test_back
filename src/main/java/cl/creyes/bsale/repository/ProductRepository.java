package cl.creyes.bsale.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.creyes.bsale.model.Product;
import java.lang.String;
import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{
	
	public List<Product> findByName(String name);
	public List<Product> findByCategory(int category);
}
