package atisoft.ecommerce.models;

import java.util.Objects;

public class UserCommentDates extends Dates{
	private int userId;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(userId);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserCommentDates other = (UserCommentDates) obj;
		return userId == other.userId;
	}

	@Override
	public String toString() {
		return "UserCommentDates [userId=" + userId + "]";
	}
	
	
}
