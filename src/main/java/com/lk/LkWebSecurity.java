//package com.lk;
//
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//
///**
// * Created by luokai on 2017/11/17.
// */
//@Configuration
////@EnableAutoConfiguration
////@EnableGlobalMethodSecurity(prePostEnabled = true)
//@EnableWebSecurity
//public class LkWebSecurity extends WebSecurityConfigurerAdapter {
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        System.out.println("auth = [" + auth + "]");
//        System.out.println("LkWebSecurity.configure");
//
//        auth.userDetailsService(new UserDetailsService() {
//            @Override
//            public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
//                System.out.println("LkWebSecurity.loadUserByUsername    " + s);
//                UserDetails userDetails = new User(s, "pass", null);
//                return userDetails;
//            }
//        }).passwordEncoder(new BCryptPasswordEncoder());
//
//        super.configure(auth);
//    }
//
//    @Override
//    public void configure(WebSecurity web) throws Exception {
//        web.ignoring().antMatchers("/js/**", "/css/**", "/images/**", "/**/favicon.ico");
//    }
//
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        System.out.println("LkWebSecurity.configure");
////        http.antMatcher("/").authorizeRequests()
////                .and().antMatcher("anno").anonymous()
////                .and().formLogin().failureForwardUrl("/loginFailed.jsp");
////http.anonymous();
//
//        http.authorizeRequests()
//                .antMatchers("/lkservlet").anonymous()
//                .antMatchers("/aa").permitAll()
//                .antMatchers("/xx/**").permitAll()
//                .antMatchers("/bb").authenticated()
////                .and().formLogin().loginPage("/login").permitAll().defaultSuccessUrl("/", true)
//                .and().logout().logoutUrl("/logout")
//                .and().sessionManagement().maximumSessions(1).expiredUrl("/expired")
//                .and()
//                .and().exceptionHandling().accessDeniedPage("/accessDenied");
//        super.configure(http);
//    }
//}
