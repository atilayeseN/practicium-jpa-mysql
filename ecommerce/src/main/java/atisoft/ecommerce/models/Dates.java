package atisoft.ecommerce.models;

import java.util.Date;
import java.util.Objects;

public class Dates {
	
	private Date date1;
	
	private Date date2;

	public Date getDate1() {
		return date1;
	}

	public void setDate1(Date date1) {
		this.date1 = date1;
	}

	public Date getDate2() {
		return date2;
	}

	public void setDate2(Date date2) {
		this.date2 = date2;
	}

	@Override
	public int hashCode() {
		return Objects.hash(date1, date2);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dates other = (Dates) obj;
		return Objects.equals(date1, other.date1) && Objects.equals(date2, other.date2);
	}

	@Override
	public String toString() {
		return "Dates [date1=" + date1 + ", date2=" + date2 + "]";
	}
	
	

}
