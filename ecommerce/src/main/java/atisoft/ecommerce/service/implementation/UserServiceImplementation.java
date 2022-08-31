package atisoft.ecommerce.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import atisoft.ecommerce.entity.Comment;
import atisoft.ecommerce.models.UserCommentDates;
import atisoft.ecommerce.respository.CommentRepository;
import atisoft.ecommerce.service.UserService;

@Service
public class UserServiceImplementation implements UserService{
	
	@Autowired
	CommentRepository commentRepository;

	@Override
	public List<Comment> getCommentsByUser(Integer userId) {
		// TODO Auto-generated method stub
		return commentRepository.listUserComments(userId);
	}

	@Override
	public List<Comment> getCommentsByUserBetweenDays(UserCommentDates userCommentDates) {
		// TODO Auto-generated method stub
		return commentRepository.listUserCommentsBetweenDays(userCommentDates.getUserId(), userCommentDates.getDate1(), userCommentDates.getDate2());
	}

}
