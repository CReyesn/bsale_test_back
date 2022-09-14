package cl.creyes.bsale.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.creyes.bsale.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer>{

}
