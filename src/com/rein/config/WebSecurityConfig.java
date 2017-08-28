package com.rein.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

import com.rein.repo.UserRepository;
/*
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
            .antMatchers("/contact").hasRole("ADMIN")
                .antMatchers("/**").permitAll()                
                .and()
            .formLogin()
                .loginPage("/sign_in")
                .permitAll()
                .and()
            .logout()
                .permitAll();
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth
            .inMemoryAuthentication()
                .withUser("vipul").password("password").roles("USER");
        auth.inMemoryAuthentication().withUser("aditya").password("123").roles("ADMIN");
    }
}
*/
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
@EnableGlobalMethodSecurity(prePostEnabled=true)
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
 
	@Autowired
	private UserDetailsService userDetailsService;
 
	@Autowired
	public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception {
		System.out.println("in configAuthentication");
		auth.userDetailsService(userDetailsService);
		
	}
 
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		System.out.println("in configure");
		http.authorizeRequests().antMatchers("/").permitAll().antMatchers("/contact").access("hasRole('ADMIN')")
				.anyRequest().authenticated().and().formLogin().loginPage("/sign_in").permitAll().and().logout()
				.permitAll();
		http.exceptionHandling().accessDeniedPage("/error");
	}
 
}