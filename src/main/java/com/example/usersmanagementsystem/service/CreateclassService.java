package com.example.usersmanagementsystem.service;



import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.usersmanagementsystem.entity.CreateClass;

import com.example.usersmanagementsystem.repository.CreateclassRepository;

@Service
public class CreateclassService {
	@Autowired
	private CreateclassRepository repository;
	
	public CreateClass postCreateClass(CreateClass createclass) {
		System.out.println(createclass.toString());
		return repository.save(createclass);
		
	}

	 public List<CreateClass> getAllClass(){
	    	System.out.println("created classes:");
			return repository.findAll();
	    	
	    }
	 
	 public List<CreateClass> getClassByloginuser(String loginuser){
		 return repository.findClassBylogin(loginuser);
		 
	 }
	 
	 public static String generateClassCode(CreateClass c) {
			SecureRandom random = new SecureRandom();
			String classCode = new BigInteger(30, random).toString(32).toUpperCase();
return classCode;
			
		}
}
