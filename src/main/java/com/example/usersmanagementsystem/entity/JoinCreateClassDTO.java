package com.example.usersmanagementsystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="allclass")
public class JoinCreateClassDTO {
		 @Id
		    @GeneratedValue(strategy = GenerationType.IDENTITY)
		    private Long joinId;
		    private String joinClassCode;
		    private String email;
		    private String name;
		    private String className;
		    private Long createId;
		    private String createClassCode;
		    private String roomNo;
		    private String section;
		    private String subject;

		    public JoinCreateClassDTO(Long joinId, String joinClassCode, String email, 
		                              String name, String className, Long createId, 
		                              String createClassCode, String roomNo, 
		                              String section, String subject) {
		        this.joinId = joinId;
		        this.joinClassCode = joinClassCode;
		        this.email = email;
		        this.name = name;
		        this.className = className;
		        this.createId = createId;
		        this.createClassCode = createClassCode;
		        this.roomNo = roomNo;
		        this.section = section;
		        this.subject = subject;
		    }

			public Long getJoinId() {
				return joinId;
			}

			public void setJoinId(Long joinId) {
				this.joinId = joinId;
			}

			public String getJoinClassCode() {
				return joinClassCode;
			}

			public void setJoinClassCode(String joinClassCode) {
				this.joinClassCode = joinClassCode;
			}

			public String getEmail() {
				return email;
			}

			public void setEmail(String email) {
				this.email = email;
			}

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getClassName() {
				return className;
			}

			public void setClassName(String className) {
				this.className = className;
			}

			public Long getCreateId() {
				return createId;
			}

			public void setCreateId(Long createId) {
				this.createId = createId;
			}

			public String getCreateClassCode() {
				return createClassCode;
			}

			public void setCreateClassCode(String createClassCode) {
				this.createClassCode = createClassCode;
			}

			public String getRoomNo() {
				return roomNo;
			}

			public void setRoomNo(String roomNo) {
				this.roomNo = roomNo;
			}

			public String getSection() {
				return section;
			}

			public void setSection(String section) {
				this.section = section;
			}

			public String getSubject() {
				return subject;
			}

			public void setSubject(String subject) {
				this.subject = subject;
			}

		    // Getters and Setters
		    
	

}