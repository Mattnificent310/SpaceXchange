package com.oauth.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.encoding.ShaPasswordEncoder;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;



@Configuration
@EnableWebSecurity

@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	    @Autowired
	    public void globalUserDetails(AuthenticationManagerBuilder auth) throws Exception {
	        auth.inMemoryAuthentication().withUser("user").password("password").roles("USER").and().withUser("admin")
	                .password("password").roles("USER", "ADMIN");
	    }
	    
	    @Override
	    protected void configure(HttpSecurity http) throws Exception {
	     http
	        .authorizeRequests()
	            .antMatchers(HttpMethod.OPTIONS).permitAll()
	            .antMatchers("/http://localhost:8084/**").hasRole("ADMIN")
	            .anyRequest().authenticated()
	            .and().httpBasic()	    	            
	            .and().formLogin()
                .loginPage("/login").permitAll();
	    }
	    
	    @Override
	    @Bean
	    public AuthenticationManager authenticationManagerBean() throws Exception {
	        return super.authenticationManagerBean();
	    }
	}

