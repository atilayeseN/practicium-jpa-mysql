package atisoft.ecommerce.respository;

import org.springframework.data.repository.CrudRepository;

import atisoft.ecommerce.entity.User;

public interface UserRepository extends CrudRepository<User, Integer>{

}
