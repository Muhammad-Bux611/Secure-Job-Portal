package com.job.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.job.service.impl.UserDetailServiceImpl;

@Configuration
//@EnableWebSecurity
public class ApplicationConfiguration {
	
	@Autowired
	UserDetailServiceImpl detailServiceImpl;
	
	@Bean
	public ModelMapper mapper() {
		return new ModelMapper();
	}
	
	@Bean
	public SecurityFilterChain chain(HttpSecurity  httpSecurity) throws Exception{
		
		httpSecurity.csrf(csrf->csrf.disable())
		.authorizeHttpRequests(auth->auth.requestMatchers("/api/**").hasRole("COMPANY")
				.anyRequest().permitAll()
				)
		.httpBasic(Customizer.withDefaults());
		
		return httpSecurity.build();
	}
	
	@Bean
	AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) {
		return authenticationConfiguration.getAuthenticationManager();
	}
	
	AuthenticationProvider authenticationProvider() {
		DaoAuthenticationProvider authenticationProvider =new DaoAuthenticationProvider(detailServiceImpl);
		authenticationProvider.setPasswordEncoder(encoder());
		return authenticationProvider;
	}
	
	@Bean
	public PasswordEncoder encoder() {
		return new BCryptPasswordEncoder();
	}
	
	

}
