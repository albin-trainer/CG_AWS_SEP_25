package com.cg.dto;

import lombok.Data;

@Data
public class UserDTO {
	private int userId;
	private String userName;
	private String email;
	private String address;
	private long phoneNo;
}
