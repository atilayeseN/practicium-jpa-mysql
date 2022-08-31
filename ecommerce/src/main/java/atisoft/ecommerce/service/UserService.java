package atisoft.ecommerce.service;

import java.util.List;

import atisoft.ecommerce.entity.Comment;
import atisoft.ecommerce.models.UserCommentDates;

public interface UserService {

	List<Comment> getCommentsByUser(Integer userId);

	List<Comment> getCommentsByUserBetweenDays(UserCommentDates userCommentDates);
}
