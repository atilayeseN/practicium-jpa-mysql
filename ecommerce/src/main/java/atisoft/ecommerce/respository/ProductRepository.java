package atisoft.ecommerce.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import atisoft.ecommerce.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{
	
	@Query("SELECT c FROM Product c WHERE CURRENT_DATE > c.expirationDate")
	List<Product> listExpiredProducts();
	
	@Query("SELECT c FROM Product c WHERE CURRENT_DATE < c.expirationDate OR c.expirationDate = NULL")
	List<Product> listNonExpiredProducts();
}
