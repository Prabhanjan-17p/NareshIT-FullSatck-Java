package com.nt.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    // ==============================
    // 1️⃣ Authentication Configuration
    // ==============================
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        // Building Authentication Manager using In-Memory authentication
//        auth.inMemoryAuthentication()
//                .withUser("raja").password("{noop}rani").roles("CUSTOMER")
//            .and()
//                .withUser("kanha").password("{noop}hyd").roles("MANAGER")
//            .and()
//                .withUser("babu").password("{noop}suna").roles("CUSTOMER", "MANAGER")
//            .and()
//                .withUser("nayak").password("{noop}nayak").roles("SALESMAN");
    	
    	auth.inMemoryAuthentication()
        .passwordEncoder(new BCryptPasswordEncoder()).withUser("raja").password("$2a$10$5vp7M1uvBeF2.ENbAt303OqPb1auj.Wnl4zsOPsoEsUjv.q8m38Nq").roles("CUSTOMER")
    .and()
    	.passwordEncoder(new BCryptPasswordEncoder()).withUser("kanha").password("$2a$10$kVIC6M3QGpPZ1H745ztq/ON2cTMZQogjxXPDclARqn2xjzEaWam6.").roles("MANAGER")
    .and()
    	.passwordEncoder(new BCryptPasswordEncoder()).withUser("babu").password("$2a$10$Ytyxrd.KCSQqOQtf9W5R/.fukkR5DgVI9rIzmt/JDI7Ghgwd/Dndy").roles("CUSTOMER", "MANAGER")
    .and()
//    	.passwordEncoder(new BCryptPasswordEncoder()).withUser("nayak").password("$2a$10$Y/oEKWNvrpSQRLhhEoRiXOZXf6HWgMZhEAfG.VlY/7tjY/UbrdclK").roles("SALESMAN");
    	.passwordEncoder(new BCryptPasswordEncoder()).withUser("nayak").password("$2a$10$Y/oEKWNvrpSQRLhhEoRiXOZXf6HWgMZhEAfG.VlY/7tjY/UbrdclK").roles("SALESMAN").accountLocked(true); // Account Teamperally Locked


    }
    // ==============================
    // 2️⃣ Authorization Configuration
    // ==============================
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests()
                // Public access
                .antMatchers("/").permitAll()

                // Authentication required
                .antMatchers("/offers").authenticated()

                // Role-based authorization
                .antMatchers("/balance").hasAnyRole("CUSTOMER", "MANAGER")
                .antMatchers("/loanApprove").hasRole("MANAGER")

                // All remaining requests require authentication
                .anyRequest().authenticated()

            // Authentication methods
            .and().formLogin()   // Provides login form
            .and().httpBasic()   // Enables browser popup login

            // Access denied page for 403 errors
            .and().exceptionHandling().accessDeniedPage("/accessDenied")

            // Logout support
            .and().logout()
            
            // Mange how many accont wil be open
            .and().sessionManagement().maximumSessions(2).maxSessionsPreventsLogin(true);
            
            // Disable CSRF for simplicity (optional for testing)
//            .and().csrf().disable();
    }
}
