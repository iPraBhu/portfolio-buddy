/**
 * 
 */
package com.adevguide.pb.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;

/**
 * @author pbhuite
 *
 */
@RestController
@RequestMapping("/")
public class TestController {
	

	@Operation(summary = "Test API", description = "")
	@GetMapping(path = "test", produces = MediaType.APPLICATION_JSON_VALUE)
	public String verifyAddressAndSave() {
		return "Welcome";
	}


	
}
