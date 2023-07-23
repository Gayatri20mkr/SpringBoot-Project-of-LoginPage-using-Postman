package com.loginpage.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.loginpage.pojo.LoginPagePOJO;

public interface LoginPageRepository extends JpaRepository<LoginPagePOJO, Integer>{
	
	@Query(value = "select * from LoginPage where username=:username and password=:password", nativeQuery=true)
	List<LoginPagePOJO> findallUsers(@Param(value="username") String username, @Param(value="password") String password);
	
	@Query(value="select * from LoginPage where username=:username", nativeQuery=true)
	LoginPagePOJO findByUserName(String username);

}
