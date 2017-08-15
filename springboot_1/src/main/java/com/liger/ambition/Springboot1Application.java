package com.liger.ambition;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.liger.ambition.mapper")
public class Springboot1Application {

	public static void main(String[] args) {
		SpringApplication.run(Springboot1Application.class, args);
	}
}
