package com.salesxl.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExcelToDbApplication implements CommandLineRunner {
	
	@Autowired
	ExcelReadService service ;
	
	public static void main(String[] args) {
		SpringApplication.run(ExcelToDbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("application start");
		service.ReadDataFromExcel();
		System.out.println("application end");
	}

}
