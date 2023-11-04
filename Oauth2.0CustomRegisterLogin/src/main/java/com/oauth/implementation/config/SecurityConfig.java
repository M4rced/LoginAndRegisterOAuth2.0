package com.oauth.implementation.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;


@SuppressWarnings("deprecation")
public class SecurityConfig  extends WebSecurityConfiguration{
	
	protected void configure(HttpSecurity http) throws Exception{
		http.authorizeRequests().anyRequest().authenticated().and().oauth2Login();	}
	
}
