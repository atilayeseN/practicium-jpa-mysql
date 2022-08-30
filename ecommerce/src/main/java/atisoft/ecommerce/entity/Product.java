package atisoft.ecommerce.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "urun", schema = "commerce_db")
public class Product{
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
	
	@Column(name = "isim", length = 50, nullable = false, unique = false)
	private String name;
	
	@Column(name = "fiyat" , nullable = false, unique = false)
	private BigDecimal price;
	
	@Column(name = "son_kullanma_tarihi" , nullable = true, unique = false)
	private Date expire_date;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Date getExpire_date() {
		return expire_date;
	}

	public void setExpire_date(Date expire_date) {
		this.expire_date = expire_date;
	}
	
	
}
