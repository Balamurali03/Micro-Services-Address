package com.Balamurali.addressapp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Balamurali.addressapp.Response.AddressResponse;
import com.Balamurali.addressapp.Service.AddressService;

@RestController
public class AddressController {
	
	@Autowired
	private AddressService addressService;
	
	@GetMapping("/address/{employeeId}")
	public ResponseEntity <AddressResponse> getAddressByEmployeeId(@PathVariable("employeeId") int id) {
		
		AddressResponse addressResponse = addressService.findAddressByEmployeeId(id);
		return ResponseEntity.status(HttpStatus.OK).body(addressResponse) ;
	}
	
	@PostMapping("/address")
	public ResponseEntity <String> postAddressForEmployee(@RequestBody AddressResponse addressResponse) {
		
		String addressResponse1 = addressService.postAddressForEmployee(addressResponse);
		return ResponseEntity.status(HttpStatus.OK).body(addressResponse1) ;
	}

}
