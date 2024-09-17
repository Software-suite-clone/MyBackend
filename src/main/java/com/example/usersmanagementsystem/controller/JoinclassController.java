package com.example.usersmanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.usersmanagementsystem.entity.JoinClass;
import com.example.usersmanagementsystem.entity.JoinCreateClassDTO;
import com.example.usersmanagementsystem.service.JoinclassService;

@RestController
@RequestMapping("/jclass")
public class JoinclassController {

    @Autowired
    private JoinclassService service;

    @PostMapping("/joinclass")
    public JoinClass postJoinClass(@RequestBody JoinClass joinclass) {
        System.out.println(joinclass);
        return service.postJoinClass(joinclass);
    }
@PostMapping("/postdto")
public ResponseEntity<JoinCreateClassDTO> postJoincreateclass(@RequestBody JoinCreateClassDTO dto) {
	return service.saveJoinCreateClassDTO(dto);
}
  

    @GetMapping("/getjoinclass/{email}") 
    public List<JoinCreateClassDTO> getMergedClassDataByEmail(@PathVariable String email) {
        return service.getMergedClassDataByEmail(email);
    }
}
