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
        .requestMatchers("/record/**").permitAll() // Разрешить доступ к /record/**
        .requestMatchers("/", "/public/**").permitAll() // Разрешить доступ к корневому URL и публичным ресурсам
        .anyRequest().authenticated() // Остальные запросы требуют аутентификации
        .and()
        .csrf().disable() // Отключение CSRF для простоты, по желанию
        .formLogin().disable() // Отключение формы входа, если она не нужна
        .httpBasic().disable(); // Отключение базовой аутентификации, если не нужна
    return http.build();
  }
}
