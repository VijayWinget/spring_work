package spring_work.configs;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		return User.builder().username("admin").password("$2a$10$oWttTf3COTGuWxDOO0HZJ.z.ZqZ3aave5iNxH4Lwm3TeD36zh.WZe").roles("USER")
				.build();
	}

}
