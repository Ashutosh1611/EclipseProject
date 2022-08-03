package com.ashu.bootsecondresthiber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = {"com.ashu.bootsecondresthiber.repository", "com.ashu.bootsecondresthiber.services", "com.ashu.bootsecondresthiber.controllers"})
@EntityScan({"com.ashu.bootsecondresthiber.model"})
public class BootSecondRestHiberApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootSecondRestHiberApplication.class, args);
	}
}
