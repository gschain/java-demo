package com.example.jwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableWebSecurity
@ComponentScan(basePackages = "com.example.jwt")
public class JwtApplication {

	@GetMapping("/hello")
	@PreAuthorize("hasRole('ADMIN')")  // Spring Security默认的角色前缀是”ROLE_”,使用hasRole方法时已经默认加上了
	public String hello() {
		return "hello";
	}

	@PreAuthorize("hasAnyAuthority()")
	@RequestMapping("/authorize")
	public String authorize() {
		return "有权限访问";
	}

	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}

	public static void main(String[] args) {
		SpringApplication.run(JwtApplication.class, args);
	}
}
