package com.halis.libraryRestAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
public class LibraryRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryRestApiApplication.class, args);
	}

}
