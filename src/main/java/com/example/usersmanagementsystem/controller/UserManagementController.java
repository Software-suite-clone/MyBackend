package com.example.usersmanagementsystem.controller;

import com.example.usersmanagementsystem.dto.ReqRes;
import com.example.usersmanagementsystem.entity.OurUsers;
import com.example.usersmanagementsystem.service.UsersManagementService;

import jakarta.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class UserManagementController {
    @Autowired
    private UsersManagementService usersManagementService;

    @PostMapping("/auth/register")
    public ResponseEntity<String> regeister(@RequestBody ReqRes reg){
    	  if (usersManagementService.isEmailAlreadyRegistered(reg.getEmail())) {
    		  System.out.println(new ResponseStatusException(HttpStatus.CONFLICT, "Email is already registered"));
              throw new ResponseStatusException(HttpStatus.CONFLICT, "Email is already registered");
              
          }else {
        	  
        	  usersManagementService.register(reg);
        	  return ResponseEntity.ok("User registered successfully aniket");
          }
    	
//    	 try {
//    	        usersManagementService.register(reg);
//    	        return ResponseEntity.ok("User registered successfully aniket");
//    	    } catch (ResponseStatusException e) {
//    	        return ResponseEntity.status(e.getStatusCode()).body(e.getReason());
//    	    } catch (RuntimeException e) {
//    	        return ResponseEntity.status(409).body(e.getMessage());
//    	    }
    	}

    @PostMapping("/auth/login")
    public ResponseEntity<ReqRes> login(@RequestBody ReqRes req){
        return ResponseEntity.ok(usersManagementService.login(req));
    }

    @PostMapping("/auth/refresh")
    public ResponseEntity<ReqRes> refreshToken(@RequestBody ReqRes req){
        return ResponseEntity.ok(usersManagementService.refreshToken(req));
    }

//    @GetMapping("/admin/get-all-users")
//    public ResponseEntity<ReqRes> getAllUsers(){
//        return ResponseEntity.ok(usersManagementService.getAllUsers());
//
//    }
//
//    @GetMapping("/admin/get-users/{userId}")
//    public ResponseEntity<ReqRes> getUSerByID(@PathVariable Integer userId){
//        return ResponseEntity.ok(usersManagementService.getUsersById(userId));
//
//    }
//
//    @PutMapping("/admin/update/{userId}")
//    public ResponseEntity<ReqRes> updateUser(@PathVariable Integer userId, @RequestBody OurUsers reqres){
//        return ResponseEntity.ok(usersManagementService.updateUser(userId, reqres));
//    }
//
//    @GetMapping("/adminuser/get-profile")
//    public ResponseEntity<ReqRes> getMyProfile(){
//        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//        String email = authentication.getName();
//        ReqRes response = usersManagementService.getMyInfo(email);
//        return  ResponseEntity.status(response.getStatusCode()).body(response);
//    }
//
//    @DeleteMapping("/admin/delete/{userId}")
//    public ResponseEntity<ReqRes> deleteUSer(@PathVariable Integer userId){
//        return ResponseEntity.ok(usersManagementService.deleteUser(userId));
//    }
//    
  



}
