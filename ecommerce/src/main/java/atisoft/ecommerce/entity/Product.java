package atisoft.ecommerce.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

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
    private Integer id;
	
	@Column(name = "isim", length = 50, nullable = false, unique = false)
	private String name;
	
	@Column(name = "fiyat" , nullable = false, unique = false)
	private BigDecimal price;
	
	@Column(name = "son_kullanma_tarihi" , nullable = true, unique = false)
	private Date expirationDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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
		return expirationDate;
	}

	public void setExpire_date(Date expire_date) {
		this.expirationDate = expire_date;
	}

	@Override
	public int hashCode() {
		return Objects.hash(expirationDate, id, name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(expirationDate, other.expirationDate) && Objects.equals(id, other.id)
				&& Objects.equals(name, other.name) && Objects.equals(price, other.price);
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", expirationDate=" + expirationDate + "]";
	}
	
	
	
	
}
