package spring_work.configs;

import org.springframework.security.crypto.password.PasswordEncoder;

public class NoCryptPasswordEncoder implements PasswordEncoder{

	@Override
	public String encode(CharSequence rawPwd) {
		return rawPwd.toString();
	}

	@Override
	public boolean matches(CharSequence rawPwd, String rawEncodedPwd) {
		return rawPwd.toString().equals(rawEncodedPwd);
	}

}
