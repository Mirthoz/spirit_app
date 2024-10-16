package com.example.spirit_be.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

  @Bean
  public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    http
        .authorizeRequests()
        .requestMatchers("/record/**").permitAll()
        .requestMatchers("/", "/public/**").permitAll()
        .anyRequest().authenticated()
        .and()
        .csrf().disable()
        .formLogin().disable()
        .httpBasic().disable();
    return http.build();
  }
}
