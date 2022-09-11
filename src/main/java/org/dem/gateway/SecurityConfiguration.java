package org.dem.gateway;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
public class SecurityConfiguration {

	/*
	 * public void configure(WebSecurity web) {
	 * web.ignoring().antMatchers("/helpdesk/**", "/ignore2"); }
	 */
	
	 @Bean
	    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
	        http
	                .authorizeHttpRequests((authorize) -> authorize
	                        .mvcMatchers("/helpdesk/**", "/api-docs/**").permitAll()
	                        .anyRequest().permitAll());

	        return http.build();
	    }

}
