package com.octoSports.checkTeam.security;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;


@Configuration
@AllArgsConstructor
@EnableWebSecurity
public class WebSecurityConfigEnabled {

	//RequestMatcher para CSRF
	private final RequestMatcherConfig csrfRequestMatcher;

	/**
	 * Configuraciones de seguridad
	 *
	 * @param http
	 * @throws Exception
	 *
	 */

	@Bean
	protected SecurityFilterChain configure(HttpSecurity http) throws Exception {
		http.headers((header) ->
				header
						.contentTypeOptions(withDefaults())
						.xssProtection(withDefaults())
						.cacheControl(withDefaults())
						.httpStrictTransportSecurity(withDefaults())
						.frameOptions(withDefaults())
		);
		http.csrf((csfr) -> csfr.requireCsrfProtectionMatcher(csrfRequestMatcher));

		return http.build();
	}

}
