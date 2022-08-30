package atisoft.ecommerce.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "urun_yorum", schema = "commerce_db")
public class Comments {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
	
	@Column(name = "isim", length = 500, nullable = false, unique = false)
	private String comment;
	
	@Column(name = "yorum_tarihi", nullable = false, unique = false)
	private Date comment_date;
	
	@Column(name = "urunId", nullable = false, unique = false)
	private int productId;
	
	@Column(name = "kullaniciId", unique = false)
	private int userId;
}
