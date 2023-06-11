package com.jikim.mywebapp.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SpringSecurityConfiguration {

	// LDAP or Database
	// In Memory

	@Bean
	public InMemoryUserDetailsManager createUserDetailsManager() {
		UserDetails userDetails = User.withDefaultPasswordEncoder()
			.username("user")
			.password("12345")
			.roles("USER", "ADMIN")
			.build();

		return new InMemoryUserDetailsManager(userDetails);
	}
}

