package com.estudos.registro_estudos.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .csrf(csrf -> csrf.disable()) // Desativa CSRF temporariamente
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/", "/estudos/**", "/css/**", "/js/**").permitAll() // libera rotas de estudos
                .anyRequest().authenticated() // protege o resto
            )
            .formLogin(form -> form.disable()) // desativa login padrão
            .httpBasic(httpBasic -> httpBasic.disable()); // desativa auth básica

        return http.build();
    }
}
