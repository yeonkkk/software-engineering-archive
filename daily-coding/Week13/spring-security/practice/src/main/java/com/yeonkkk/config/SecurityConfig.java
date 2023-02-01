package com.yeonkkk.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity // 스프링 시큐리티 필터가 스프링 필터체인에 등록됨
@EnableGlobalMethodSecurity(securedEnabled = true, prePostEnabled = true)
public class SecurityConfig {

    // 패스워드 암호화
    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.csrf().disable();
        http.headers().frameOptions().disable();

        // (1) 권한 확인을 한 사용자에 한하여 url에 접근 가능하게 함
        // (2) 해당 역할을 가진 사용자에게만 url 접근을 가능하게 함
        // (ROLE_ADMIN은 규약이기에 ADMIN만 써도 자동으로 ROLE을 붙여줌)
        // 권한 처리를 위해서는 반드시 DB에도 권한 관련 정보가 있어야한다.
        // (3) 이외에는 로그인하지 않아도 접근 가능 (로그인 하지 않으면 생략 시 모든 url 접근 불가)

        http.authorizeRequests()
                .antMatchers("/user/**").authenticated() // (1)
                .antMatchers("/manager/**").access("hasRole('ROLE_ADMIN') or hasRole('ROLE_MANAGER')") // (2)
                .antMatchers("/admin/**").access("hasRole('ROLE_ADMIN')")
                .anyRequest().permitAll() // (3)
                .and()
                .formLogin()
                .loginPage("/login");
        return http.build();
    }
}
