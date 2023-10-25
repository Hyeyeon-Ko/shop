package com.shop.shop.config;

import com.shop.shop.service.MemberService;
import jakarta.servlet.DispatcherType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.servlet.util.matcher.MvcRequestMatcher;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.web.servlet.handler.HandlerMappingIntrospector;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Autowired
    MemberService memberService;

//    @Autowired
//    private CustomAuthenticationEntryPoint customAuthenticationEntryPoint;

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http,
                                           HandlerMappingIntrospector introspector) throws Exception {
//        MvcRequestMatcher.Builder mvcMatcherBuilder = new MvcRequestMatcher.Builder(introspector);
//        http.csrf(AbstractHttpConfigurer::disable);
//        http.authorizeHttpRequests(request -> request
//                        .dispatcherTypeMatchers(DispatcherType.FORWARD).permitAll()
//                        .requestMatchers(mvcMatcherBuilder.pattern("/")).permitAll()
//                        .requestMatchers(mvcMatcherBuilder.pattern("/admin/**")).permitAll()
//                        .requestMatchers(mvcMatcherBuilder.pattern("/admin/**")).hasRole("ADMIN")
//                        .requestMatchers(mvcMatcherBuilder.pattern("/js/**")).permitAll()
//                        .requestMatchers(mvcMatcherBuilder.pattern("/img/**")).permitAll()
//                        .requestMatchers(mvcMatcherBuilder.pattern("/members/**")).permitAll()
//                        .requestMatchers(mvcMatcherBuilder.pattern("/item/**")).permitAll()
//                        .requestMatchers(mvcMatcherBuilder.pattern("/images/**")).permitAll()
//                        .anyRequest()
//                        .authenticated()
//                )
//                .formLogin(login -> login
//                        .loginPage("/members")
//                        .loginProcessingUrl("/login")
//                        .defaultSuccessUrl("/")
//                        .failureUrl("/members/login/error")
//                        .permitAll()
//                )
//                .logout(logout -> logout
//                        .logoutRequestMatcher(new AntPathRequestMatcher("/members/logout"))
//                        .logoutSuccessUrl("/")
//                );
//
//        http.exceptionHandling(exception -> exception
//                .authenticationEntryPoint
//        );

        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
//
//    @Bean
//    public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration)
//            throws Exception {
//        return authenticationConfiguration.getAuthenticationManager();
//    }

}
