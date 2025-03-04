package com.example.inmemory.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SecurityConfig {

	@Bean
	public InMemoryUserDetailsManager detailsManager() {
		UserDetails adminuser = User.withDefaultPasswordEncoder().username("kumar").password("kumar@123")
				.authorities("ADMIN").build();
		UserDetails user1 = User.withDefaultPasswordEncoder().username("raja").password("raja@123").authorities("USER")
				.build();
		UserDetails user2 = User.withDefaultPasswordEncoder().username("rani  ").password("rani@123")
				.authorities("USER").build();

		return new InMemoryUserDetailsManager(adminuser, user1, user2);

	}
}
