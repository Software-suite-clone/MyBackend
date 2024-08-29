package com.example.usersmanagementsystem.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.example.usersmanagementsystem.entity.CreateClass;
@Repository
public interface CreateclassRepository extends JpaRepository<CreateClass, Long> {
	 @Query("SELECT a FROM CreateClass a WHERE a.loginuser = :loginuser ")
	    List<CreateClass> findClassBylogin(String loginuser);

}
