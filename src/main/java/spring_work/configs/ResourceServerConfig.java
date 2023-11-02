package spring_work.configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;

import spring_work.configs.components.CustomAccessDeniedHandler;
import spring_work.configs.components.CustomAuthenticationEntryPoint;


@Configuration
@EnableResourceServer
public class ResourceServerConfig  extends ResourceServerConfigurerAdapter {


	    @Override
	    public void configure(ResourceServerSecurityConfigurer resources) {
	        resources.resourceId("api");
	    }
	    
	    private String[] ENDPOINTS =new String[] { "/v1/**"};
	    
	    private String[] PUBLIC =new String[] { "/oauth/token"};
	    
	    private CustomAuthenticationEntryPoint customAuthenticationEntryPoint;
	    
	    @Override
		public void configure(HttpSecurity http) throws Exception {
	    	http.csrf().disable().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()
			.authorizeRequests().antMatchers(ENDPOINTS).authenticated()
			.antMatchers(PUBLIC).permitAll()
			.anyRequest().authenticated().and().exceptionHandling()
			.authenticationEntryPoint(customAuthenticationEntryPoint)
			.accessDeniedHandler(new CustomAccessDeniedHandler());
		}

}
