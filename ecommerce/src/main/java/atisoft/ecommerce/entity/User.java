package atisoft.ecommerce.entity;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "kullanici", schema = "commerce_db")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "isim", length = 50, nullable = false, unique = false)
	private String name;

	@Column(name = "soyisim", length = 50, nullable = false, unique = false)
	private String surname;

	@Column(name = "email", length = 50, nullable = false, unique = false)
	private String email;

	@Column(name = "telefon", length = 15, nullable = false, unique = false)
	private String phone;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public int hashCode() {
		return Objects.hash(email);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(email, other.email);
	}

	@Override
	public String toString() {
		return "User [id=" + id +", name=" + name + ", surname=" + surname + ", email=" + email + ", phone=" + phone + "]";
	}

}
