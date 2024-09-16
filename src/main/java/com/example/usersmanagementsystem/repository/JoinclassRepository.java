package com.example.usersmanagementsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.usersmanagementsystem.entity.JoinClass;
import com.example.usersmanagementsystem.entity.JoinCreateClassDTO;

public interface JoinclassRepository extends JpaRepository<JoinClass, Long> {

	@Query("SELECT new com.example.usersmanagementsystem.entity.JoinCreateClassDTO(j.id, j.classCode, j.email, " +
		       "c.name, c.classname, c.id, c.classCode, c.roomno, c.section, c.subject) " +
		       "FROM JoinClass j " +
		       "LEFT JOIN CreateClass c ON j.classCode = c.classCode " +
		       "WHERE j.email = :email")
		List<JoinCreateClassDTO> findMergedClassDataByEmail(@Param("email") String email);

	}

