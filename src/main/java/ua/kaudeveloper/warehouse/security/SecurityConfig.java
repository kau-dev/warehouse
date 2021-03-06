package ua.kaudeveloper.warehouse.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Qualifier("userDetailsServiceImpl")
    @Autowired
    private UserDetailsService userDetailsService;

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
@Override
protected void configure(HttpSecurity http) throws Exception
{



    //basic auth for REST api by base64 enc. in header request Authorization: Basic <your encode user:pass>
    http
            .csrf().disable()
            .httpBasic()
            .and()
            .authorizeRequests()
            .antMatchers(HttpMethod.GET,"/api/**").authenticated()
            .antMatchers(HttpMethod.POST,"/api/**").authenticated()
            .and()
            .logout();

    //other pages
    http

            .authorizeRequests()
            .antMatchers("/","/welcome","/registration","/resources/**").permitAll()
            .anyRequest().authenticated()
            .and()

            .formLogin()
            .loginPage("/login")
            .permitAll()
            .and()
            .logout()
            .permitAll();
http
        .headers()
        .frameOptions()
        .sameOrigin();

}
    @Bean
    public AuthenticationManager customAuthenticationManager() throws Exception {
        return authenticationManager();
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(bCryptPasswordEncoder());
    }

}