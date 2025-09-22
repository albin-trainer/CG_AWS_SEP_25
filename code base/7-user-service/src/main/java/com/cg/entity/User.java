package com.cg.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class User {
	@Id
private int userId;
private String userName;
private String email;
private String address;
private long phoneNo;
}
