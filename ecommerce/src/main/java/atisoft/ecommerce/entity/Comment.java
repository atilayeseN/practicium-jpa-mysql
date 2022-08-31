package atisoft.ecommerce.entity;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "urun_yorum", schema = "commerce_db")
public class Comment {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
	
	@Column(name = "yorum", length = 500, nullable = false, unique = false)
	private String comment;
	
	@Column(name = "yorum_tarihi", nullable = false, unique = false)
	private Date commentDate;
	
	@Column(name = "urun_id", nullable = false, unique = false)
	private Integer productId;
	
	@Column(name = "kullanici_id",nullable = false, unique = false)
	private Integer userId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Date getComment_date() {
		return commentDate;
	}

	public void setComment_date(Date commentDate) {
		this.commentDate = commentDate;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(comment, commentDate, id, productId, userId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Comment other = (Comment) obj;
		return Objects.equals(comment, other.comment) && Objects.equals(commentDate, other.commentDate)
				&& id == other.id && productId == other.productId && userId == other.userId;
	}

	@Override
	public String toString() {
		return "Comment [id=" + id + ", comment=" + comment + ", comment_date=" + commentDate + ", productId="
				+ productId + ", userId=" + userId + "]";
	}
	
	
}
