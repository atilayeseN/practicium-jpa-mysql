package atisoft.ecommerce.service;

import java.util.List;

import atisoft.ecommerce.entity.Comment;
import atisoft.ecommerce.entity.Product;

public interface ProductService {

	List<Comment> getCommentsByProduct(Integer productId);
	
	List<Product> getExpiredProducts();
	
	List<Product> getNonExpiredProducts();

}
