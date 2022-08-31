package atisoft.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import atisoft.ecommerce.entity.Comment;
import atisoft.ecommerce.entity.Product;
import atisoft.ecommerce.models.Dates;
import atisoft.ecommerce.models.UserCommentDates;
import atisoft.ecommerce.service.CommentService;
import atisoft.ecommerce.service.ProductService;
import atisoft.ecommerce.service.UserService;

@RestController
public class BaseController {

	@Autowired
	CommentService commentService;

	@Autowired
	ProductService productService;

	@Autowired
	UserService userService;

	@GetMapping("/get-comments-by-product/{productId}")
	List<Comment> getCommentsByProduct(@PathVariable int productId) {

		return productService.getCommentsByProduct(productId);
	}

	@GetMapping("/get-comments-by-user/{userId}")
	List<Comment> getCommentsByUser(@PathVariable int userId) {

		return userService.getCommentsByUser(userId);
	}

	@PostMapping("/get-comments-between-days")
	List<Comment> getCommentsBetwenDates(@RequestBody Dates dates) {
		return commentService.getCommentsBetweenDates(dates);
	}

	@PostMapping("/get-comments-between-days-by-user")
	List<Comment> getUserCommentsBetwenDates(@RequestBody UserCommentDates dates) {
		return userService.getCommentsByUserBetweenDays(dates);
	}
	
	@GetMapping("/get-expired-products")
	List<Product> getExpiredProducts() {

		return productService.getExpiredProducts();
	}
	
	@GetMapping("/get-non-expired-products")
	List<Product> getNonExpiredProducts() {

		return productService.getNonExpiredProducts();
	}

}
