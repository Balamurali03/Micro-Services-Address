package com.Balamurali.addressapp.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.Balamurali.addressapp.Entity.AddressDetails;

public interface AddressRepo extends JpaRepository<AddressDetails,Integer> {

	//address based on a employee id
	
	@Query(nativeQuery= true , value="SELECT ea.id,ea.lane1,ea.lane2,ea.state,ea.zip,ea.employee_id FROM micro_services.address ea join micro_services.employee e on e.id = ea.employee_id where ea.employee_id =:employeeId")
	AddressDetails findAddressByEmployeeId(@Param("employeeId")int employeeId);
}
