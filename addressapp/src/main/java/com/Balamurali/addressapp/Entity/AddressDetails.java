package com.Balamurali.addressapp.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name= "address")
public class AddressDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="id")
	private int id;
	@Column(name ="lane1")
	private String lane1;
	@Column(name ="lane2")
	private String lane2;
	@Column(name ="state")
	private String state;
	@Column(name ="zip")
	private String zip;

}
