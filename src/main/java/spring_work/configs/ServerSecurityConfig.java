package spring_work.configs;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.client.RestTemplate;

import spring_work.configs.components.CustomAccessDeniedHandler;
import spring_work.configs.components.CustomAuthenticationEntryPoint;


@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true, jsr250Enabled = true,proxyTargetClass = true)
public class ServerSecurityConfig extends WebSecurityConfigurerAdapter {
	
	private CustomAuthenticationEntryPoint customAuthenticationEntryPoint;

	private UserService userDetailsService;

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new NoCryptPasswordEncoder();
	}

//	public ServerSecurityConfig(CustomAuthenticationEntryPoint customAuthenticationEntryPoint,
//			@Qualifier("userService") UserService userDetailsService) {
//		this.customAuthenticationEntryPoint = customAuthenticationEntryPoint;
//		this.userDetailsService = userDetailsService;
//	}
//
//	@Bean
//	public DaoAuthenticationProvider authenticationProvider() {
//		DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
//		provider.setUserDetailsService(userDetailsService);
//		return provider;
//	}
//
//	@Bean
//	@Override
//	public AuthenticationManager authenticationManagerBean() throws Exception {
//		return super.authenticationManagerBean();
//	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()
		.authorizeRequests().antMatchers("/v1/**").authenticated()
		.antMatchers("/oauth/token").permitAll()
		.anyRequest().authenticated().and().exceptionHandling()
		.authenticationEntryPoint(customAuthenticationEntryPoint)
		.accessDeniedHandler(new CustomAccessDeniedHandler());
	}

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
}
