package spring_work.configs;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;


@Configuration
@EnableAuthorizationServer
public class OAuthConfig extends AuthorizationServerConfigurerAdapter  {

	private  AuthenticationManager authenticationManager;

	@Autowired
	@Qualifier("dataSource")
	DataSource dataSource;

	private  UserService userService;
	
//	 public OAuthConfig(AuthenticationManager authenticationManager, UserService userService) {
//	        this.authenticationManager = authenticationManager;
//	        this.userService = userService;
//	    }

	    @Override
	    public void configure(ClientDetailsServiceConfigurer configurer) throws Exception {
	        configurer.jdbc(dataSource).build(); 
	    }
	    

	    @Override
	    public void configure(final AuthorizationServerEndpointsConfigurer endpoints) {
	        endpoints
	                .accessTokenConverter(accessTokenConverter());
//	                .userDetailsService(userService)
//	                .authenticationManager(authenticationManager);
	    }

	    @Bean
	    JwtAccessTokenConverter accessTokenConverter() {
	        JwtAccessTokenConverter converter = new JwtAccessTokenConverter();
	        return converter;
	    }
	
}
