package com.deboing.config;



import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;




@Configuration
//@EnableWebSecurity
public class SecurityConfig  {

    /** Public URLs. */
    private static final String[] PUBLIC_MATCHERS = {
            "/webjars/**",
            "/css/**",
            "/js/**",
            "/images/**",
            "/",
            "/about/**",
            "/contact/**",
            "/error/**/*"
    };

//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception{
//
//        http
//                .authorizeRequests()
//                .antMatchers(PUBLIC_MATCHERS).permitAll()
//                .anyRequest().authenticated()
//                .and()
//                .formLogin().loginPage("/login").defaultSuccessUrl("/payload")
//                .failureUrl("/login?error").permitAll()
//                .and()
//                .logout().permitAll();
//
//    }


//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception{
//        auth
//                .inMemoryAuthentication()
//                .withUser("user").password("password")
//                .roles("USER");
//    }




}
