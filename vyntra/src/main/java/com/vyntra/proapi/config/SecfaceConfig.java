package com.vyntra.proapi.config;

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableOAuth2Sso
@Configuration
@Order(1001)
public class SecfaceConfig extends WebSecurityConfigurerAdapter {
	 @Override
	    protected void configure(HttpSecurity http) throws Exception {
	        http
	                .antMatcher("/**")
	                .authorizeRequests()
	                .antMatchers("/login**")
	                .permitAll()
	                .anyRequest()
	                .authenticated();
	    }

}
