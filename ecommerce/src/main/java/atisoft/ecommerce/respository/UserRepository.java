package atisoft.ecommerce.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import atisoft.ecommerce.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	
	
	
}
