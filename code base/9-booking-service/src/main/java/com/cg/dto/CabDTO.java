package com.cg.dto;

import jakarta.persistence.Column;
import lombok.Data;
@Data
public class CabDTO {
	private int cabId;
	private String cabType;
	private String brand;
	private String regNo;
	private boolean booked;
}
