package com.detechxify.webservice.ApplicationMVC;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ApplicationRepository extends CrudRepository<ApplicationModel, String>{

	public List<ApplicationModel> findByUsername(String username);
	
}
