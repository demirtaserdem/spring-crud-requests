/**
 * 
 */
package com.de.crud.ui.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author demirtaserdem@gmail.com 3 Şub 2020
 */

@RestController
@RequestMapping("/")
public class CrudController {

	@GetMapping()
	public String getRequest() {
		String getResponse;
		getResponse = "Get Request Response";
		return getResponse;
	}

	@PostMapping()
	public String postRequest() {
		String postResponse;
		postResponse = "Post Request Response";
		return postResponse;
	}

	@PutMapping()
	public String putRequest() {
		String putResponse;
		putResponse = "Put Request Response";
		return putResponse;
	}

	@DeleteMapping()
	public String deleteRequest() {
		String deleteResponse;
		deleteResponse = "Delete Request Response";
		return deleteResponse;
	}
}
