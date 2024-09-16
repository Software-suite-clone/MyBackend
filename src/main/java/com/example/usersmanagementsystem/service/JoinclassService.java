package com.example.usersmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.usersmanagementsystem.entity.CreateClass;
import com.example.usersmanagementsystem.entity.JoinClass;
import com.example.usersmanagementsystem.entity.JoinCreateClassDTO;
import com.example.usersmanagementsystem.repository.CreateclassRepository;
import com.example.usersmanagementsystem.repository.JoinclassRepository;

@Service
public class JoinclassService {

    @Autowired
    private JoinclassRepository repository;

    
    @Autowired
    private CreateclassRepository repository2;
    

    public ResponseEntity<JoinCreateClassDTO> saveJoinCreateClassDTO(JoinCreateClassDTO dto) {
        // Convert DTO to JoinClass entity
        JoinClass joinClass = new JoinClass();
        joinClass.setClassCode(dto.getCreateClassCode());
        joinClass.setEmail(dto.getEmail());
       

        // Convert DTO to CreateClass entity (if necessary)
        CreateClass createClass = new CreateClass();
       
        createClass.setName(dto.getName());
        createClass.setClassname(dto.getCreateClassCode());
        createClass.setRoomno(dto.getRoomNo());
        createClass.setSection(dto.getSection());
        createClass.setSubject(dto.getSubject());

        // Save the JoinClass and CreateClass entities
     repository.save(joinClass);
        repository2.save(createClass);

        // Optionally, return the DTO or any other relevant response
        return ResponseEntity.ok(dto);
    }
    public JoinClass postJoinClass(JoinClass joinclass) {
        return repository.save(joinclass);
    }

    public List<JoinCreateClassDTO> getMergedClassDataByEmail(String email) {
        return repository.findMergedClassDataByEmail(email);
    }
}
