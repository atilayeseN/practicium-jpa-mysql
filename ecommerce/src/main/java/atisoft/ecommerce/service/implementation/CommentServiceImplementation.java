package atisoft.ecommerce.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import atisoft.ecommerce.entity.Comment;
import atisoft.ecommerce.models.Dates;
import atisoft.ecommerce.models.UserCommentDates;
import atisoft.ecommerce.respository.CommentRepository;
import atisoft.ecommerce.respository.ProductRepository;
import atisoft.ecommerce.respository.UserRepository;
import atisoft.ecommerce.service.CommentService;


@Service
public class CommentServiceImplementation implements CommentService{
	
	@Autowired
	CommentRepository commentRepository;

	@Override
	public List<Comment> getCommentsBetweenDates(Dates dates) {
		// TODO Auto-generated method stub
		return commentRepository.listCommentsBetweenDates(dates.getDate1(), dates.getDate2());
	}
	
	

}
