package com.solar.mars;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan({"com.solar.mars.entity"})
public class MarsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarsApplication.class, args);
	}

}
