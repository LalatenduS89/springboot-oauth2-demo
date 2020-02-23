package com.example.springbootoauth2demo;

import java.security.Principal;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableOAuth2Sso
@RestController
public class SpringbootOauth2DemoApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(SpringbootOauth2DemoApplication.class, args);
	}

	@PostConstruct
	public void init() {
		System.out.println("Inside init method");
	}
	
	@GetMapping("/")
	public String getMessage(Principal principal) {
		return "Hi, " + principal.getName() + " Welcome to OAuth2 Application";
	}
}
