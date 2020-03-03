package com.webapp14.demo.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import com.webapp14.demo.security.UserRepositoryAuthProvider;

@EnableWebSecurity
public class SecureConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
    public UserRepositoryAuthProvider userRepoAuthProvider;
	
	  @Override
	  protected void configure(HttpSecurity http) throws Exception {
	    // Public pages
		  //http.httpBasic().disable();
		  
		  
		  //For h2 only delete after
		  http.authorizeRequests()
          .antMatchers("/").permitAll()
          .antMatchers("/h2-console/**").permitAll();
		  
		  http.csrf().disable();
	        http.headers().frameOptions().disable();
	      //end of delete  

		  
		  http.authorizeRequests().antMatchers("/").permitAll();
		  http.authorizeRequests().antMatchers("/login").permitAll();
		  http.authorizeRequests().antMatchers("/loginerror").permitAll();
		  http.authorizeRequests().antMatchers("/logout").permitAll();
		  
	    // Private pages (all other pages)
		  http.authorizeRequests().antMatchers("/user").hasAnyRole("USER");
		  http.authorizeRequests().antMatchers("/graphics").hasAnyRole("ADMIN");
		  
	    // Login form
		  http.formLogin().loginPage("/login");
		  http.formLogin().usernameParameter("username");
		  http.formLogin().passwordParameter("password");
		  http.formLogin().defaultSuccessUrl("/");
		  http.formLogin().failureUrl("/loginerror");
		  
	    // Logout
		  http.logout().logoutUrl("/logout");
		  http.logout().logoutSuccessUrl("/");
		 
	    // Disable CSRF at the moment
	    //http.csrf().disable();
	  }
	  
	  @Override
	    protected void configure(AuthenticationManagerBuilder auth)
	            throws Exception {
	        // Database authentication provider
	        auth.authenticationProvider(userRepoAuthProvider);
	    }
}
