package atisoft.ecommerce.respository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import atisoft.ecommerce.entity.Comment;

public interface CommentRepository extends JpaRepository<Comment, Integer> {

	@Query("SELECT c FROM Comment c WHERE c.productId = ?1")
	List<Comment> listProductComments(Integer productId);

	@Query("SELECT c FROM Comment c WHERE c.commentDate BETWEEN ?1 AND ?2")
	List<Comment> listCommentsBetweenDates(Date date1, Date date2);

	@Query("SELECT c FROM Comment c WHERE c.userId = ?1")
	List<Comment> listUserComments(Integer userId);

	@Query("SELECT c FROM Comment c WHERE (c.commentDate BETWEEN ?2 AND ?3) AND c.userId = ?1")
	List<Comment> listUserCommentsBetweenDays(Integer userId, Date date1, Date date2);

}
