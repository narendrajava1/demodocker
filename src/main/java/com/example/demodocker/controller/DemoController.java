package com.example.demodocker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
//import static com.example.demodocker.DemoProperties.DEMO1;

import com.example.demodocker.model.DemoProperties;
import com.example.demodocker.model.ServiceResponse;

@RestController
public class DemoController {
	@Autowired
	DemoProperties c;

	@GetMapping("/greet/{name}")
	public ServiceResponse<String> greeting(@PathVariable String name) {
		final ServiceResponse<String> response = new ServiceResponse<>();
		response.setData("Hi this is narendra kumar kolli");
		response.setCode(1);
//		java.lang.Error error=new java.lang.Error();
//		error.setStackTrace(new StringIndexOutOfBoundsException().getStackTrace());
		final com.example.demodocker.model.Error err = new com.example.demodocker.model.Error();
//		err.setError(error);
		err.setMessage(c.DEMO1);
		err.setError("DEMO1");
//		response.setCode(1);
//		response.setCode(null);
		response.setError(err);
		return response;
	}

}
