package com.example.usersmanagementsystem.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.usersmanagementsystem.entity.CreateClass;

import com.example.usersmanagementsystem.service.CreateclassService;

@RestController
@RequestMapping("/cclass/cc")
public class CreateclassController {

	@Autowired
	private CreateclassService service;
	
	@PostMapping("/createclass")
	public CreateClass postCreateClass(@RequestBody CreateClass createclass) {
		createclass.setClasscode(service.generateClassCode(createclass));
		return service.postCreateClass(createclass);
	

	}
	@GetMapping("/getcreateclass/{loginuser}") 
	public List<CreateClass> getClasBylogin(@PathVariable String loginuser){
		return service.getClassByloginuser(loginuser);
		
	}
	

}
