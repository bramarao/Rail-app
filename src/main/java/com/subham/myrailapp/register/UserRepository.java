package com.subham.myrailapp.register;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {
	User findByEmail(String email);
	User findByconfirmationToken(String confirmationToken);
	User BCryptPasswordEncoder(String bCryptPasswordEncoder);
	
}
