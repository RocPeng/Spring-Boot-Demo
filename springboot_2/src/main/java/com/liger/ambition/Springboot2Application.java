package com.liger.ambition;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Controller
@EnableWebMvc
@SpringBootApplication
@MapperScan(basePackages = "com.liger.ambition.mapper")
public class Springboot2Application extends WebMvcConfigurerAdapter {

	public static void main(String[] args) {
		SpringApplication.run(Springboot2Application.class, args);
	}

	@RequestMapping("/")
    String home() {
        return "redirect:user";
    }
}
