package com.nagarro.k8s.kubernetesdockerassignment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("/k8s")
	public String getResponse() {
		return "Successfully Deployed!!";
	}
}
