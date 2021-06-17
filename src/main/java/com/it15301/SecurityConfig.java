package com.it15301;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private UserDetailsService userDetailsService;

	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

//	@Bean
//	public UserDetailsService userDetailsService() {
//		return new UserDetailsServiceImpl();
//	}

//
//	@Bean
//	public DaoAuthenticationProvider authenticationProvider() {
//		DaoAuthenticationProvider authenticationProvider = new DaoAuthenticationProvider();
//		authenticationProvider.setUserDetailsService(userDetailsService());
//		authenticationProvider.setPasswordEncoder(passwordEncoder());
//		return authenticationProvider;
//	}
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable();
//		http.authorizeRequests().antMatchers("/admin/**").hasRole("1").and().authorizeRequests()
//				.antMatchers("/user/**").hasRole("0").anyRequest().permitAll().and().formLogin().failureUrl("/login")
//				.and().exceptionHandling().accessDeniedPage("/login");
		http.authorizeRequests().antMatchers("/resources/**", "/signup", "/home", "/css/*", "/register/**","/change-password/**").permitAll()
				.and().authorizeRequests().antMatchers("/rest/**", "/user").hasAnyRole("0", "1").and()
				.authorizeRequests()
				.antMatchers("/secure/**", "/admin/**", "**/create/**", "**/update/**", "**/delete/**").hasAnyRole("1")
				.anyRequest().authenticated().and().formLogin().defaultSuccessUrl("/home", true).and().rememberMe();
		http.logout();
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		auth.authenticationProvider(authenticationProvider());
//		auth.inMemoryAuthentication().withUser("test").password("password").roles("0");
		auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
	}

}
