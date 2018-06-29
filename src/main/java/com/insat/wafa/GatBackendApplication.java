package com.insat.wafa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.insat.wafa.entities.AssuranceUser;
import com.insat.wafa.repositories.AssuranceUserRepository;

@SpringBootApplication
public class GatBackendApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(GatBackendApplication.class, args);
	}


}
