package com.oauth.implementation.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OauthLoginRegisterApplication {
	@GetMapping
	public String welcome() {
		return "¡Welcome to google!";
	}
	
	@GetMapping("/user")
    public Principal user(Principal principal) {
        System.out.println("username : " + principal.getName());
        return principal;
    }
}
