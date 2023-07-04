package com.Balamurali.addressapp.Service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Balamurali.addressapp.Entity.AddressDetails;
import com.Balamurali.addressapp.Repo.AddressRepo;
import com.Balamurali.addressapp.Response.AddressResponse;

@Service
public class AddressService {
	
	@Autowired
	private AddressRepo addressRepo;
	@Autowired
	private ModelMapper modelMapper;
	
	public AddressResponse findAddressByEmployeeId(int employeeId) {
		AddressDetails address = addressRepo.findAddressByEmployeeId(employeeId);
		AddressResponse addressResponse = modelMapper.map(address, AddressResponse.class);
		
		return addressResponse;
	}

}
