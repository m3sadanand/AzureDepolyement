package com.azure.deployement.Azure.Deployment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AzureDeploymentApplication {

	@GetMapping("/hello")
	public String sayHello(){
		return "Azure Deployment - Success";
	}

	public static void main(String[] args) {
		SpringApplication.run(AzureDeploymentApplication.class, args);
	}

}
