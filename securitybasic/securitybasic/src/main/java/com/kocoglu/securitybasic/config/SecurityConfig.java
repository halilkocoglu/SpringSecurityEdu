package com.kocoglu.securitybasic.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AuthorizeHttpRequestsConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {

       /* Custom Security Configuration */
        /*http.authorizeHttpRequests((requests) -> {
            requests
                    .requestMatchers("/myProfile").authenticated()
                    .requestMatchers("/").permitAll();
        });
        http.httpBasic(Customizer.withDefaults());
        http.formLogin(Customizer.withDefaults());
        return (SecurityFilterChain)http.build();*/


        /*Every request gonna deny*/
        /*http.authorizeHttpRequests((requests) -> {
            requests
                    .anyRequest().denyAll();
        });
        http.httpBasic(Customizer.withDefaults());
        http.formLogin(Customizer.withDefaults());
        return (SecurityFilterChain)http.build();*/

        /*Permit all*/
        http.authorizeHttpRequests((requests) -> {
            requests
                    .anyRequest().permitAll();
        });
        http.httpBasic(Customizer.withDefaults());
        http.formLogin(Customizer.withDefaults());
        return (SecurityFilterChain)http.build();


    }
}
