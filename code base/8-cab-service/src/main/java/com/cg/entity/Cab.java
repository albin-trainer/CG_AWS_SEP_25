package com.cg.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Cab {
	@Id
private int cabId;
private String cabType;
private String brand;
private String regNo;
@Column(name = "is_booked")
private boolean booked;
}
