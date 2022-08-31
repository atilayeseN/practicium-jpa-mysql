package atisoft.ecommerce.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import atisoft.ecommerce.entity.Comment;
import atisoft.ecommerce.entity.Product;
import atisoft.ecommerce.respository.CommentRepository;
import atisoft.ecommerce.respository.ProductRepository;
import atisoft.ecommerce.service.ProductService;

@Service
public class ProductServiceImplementation implements ProductService{
	
	@Autowired
	CommentRepository commentRepository;
	
	@Autowired
	ProductRepository productRepository;
	
	@Override
	public List<Comment> getCommentsByProduct(Integer productId) {
		// TODO Auto-generated method stub
		return commentRepository.listProductComments(productId);
	}

	@Override
	public List<Product> getExpiredProducts() {
		
		return productRepository.listExpiredProducts();
	}

	@Override
	public List<Product> getNonExpiredProducts() {
		return productRepository.listNonExpiredProducts();
	}

}
