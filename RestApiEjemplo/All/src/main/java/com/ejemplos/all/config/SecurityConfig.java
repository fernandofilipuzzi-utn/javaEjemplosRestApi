package com.ejemplos.all.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationEventPublisher;
import org.springframework.security.authentication.DefaultAuthenticationEventPublisher;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

//https://docs.spring.io/spring-security/reference/servlet/getting-started.html
//$ curl -i -u user:8e557245-73e2-4286-969a-ff57fe326336 http://localhost:8080/some/path

//https://spring.io/blog/2022/02/21/spring-security-without-the-websecurityconfigureradapter

//ejemplo con token
//https://github.com/spring-projects/spring-security/issues/10822
//https://es.stackoverflow.com/questions/553591/cannot-find-symbol-websecurityconfigureradapter


/* ejemplo 
@Configuration
@EnableWebSecurity
public class SecurityConfig  extends WebSecurityConfigurerAdapter{

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception
	{
		auth.inMemoryAuthentication()
		.withUser("usuario").password("123").roles("USER");		
	}
	
	@Override
	public void configure(HttpSecurity http) throws Exception
	{
		http.authorizeRequests()
			.antMatchers("/resources/**","/signup","/about").permitAll()
			.antMatchers("/admin/**").hasRole("ADMIN")
			.antMatchers("/admin/**").hasRole("USER")
			.anyRequest().authenticated()
			.and()
		.formLogin()
			.loginPage("/login")
			.permitAll()
			.and()
		.logout()
			.permitAll();
	}
}
*/


/* 
 * autentificación basic.
 *
C:\Users\fernando>curl -u user:123 http://localhost:8080/telemetry/
{"fecha":"2024-05-19T20:52:18.695+00:00","distancia":41.46196640108116}
 * */

@EnableWebSecurity 
@Configuration
public class SecurityConfig {
	@Bean
    @ConditionalOnMissingBean(UserDetailsService.class)
    InMemoryUserDetailsManager inMemoryUserDetailsManager(PasswordEncoder passwordEncoder) { 
        String generatedPassword = passwordEncoder.encode("123");
        return new InMemoryUserDetailsManager(
            User.withUsername("user")
                .password(generatedPassword)
                .roles("USER")
                .build()
        );
    }

    @Bean
    @ConditionalOnMissingBean(AuthenticationEventPublisher.class)
    DefaultAuthenticationEventPublisher defaultAuthenticationEventPublisher(ApplicationEventPublisher delegate) { 
        return new DefaultAuthenticationEventPublisher(delegate);
    }
    
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}