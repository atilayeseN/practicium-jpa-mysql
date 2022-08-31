package atisoft.ecommerce.service;

import java.util.List;

import atisoft.ecommerce.entity.Comment;
import atisoft.ecommerce.models.Dates;

public interface CommentService {
	
	
	List<Comment> getCommentsBetweenDates(Dates dates);
	
	
}
