package com.infinity.app.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@Configuration
@EnableResourceServer
public class ResourceServerConfig{// extends ResourceServerConfigurerAdapter{

	/*@Value("${key}")
	private String publicKey;
	
	@Bean
	public TokenStore tokenStore() {
		return new JwtTokenStore(jConverter());
	}
	
	@Bean
	public JwtAccessTokenConverter jConverter() {
		var converter= new JwtAccessTokenConverter();
		converter.setVerifierKey(publicKey);
		return converter;
	}
	
	@Override
    public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
        resources.tokenStore(tokenStore());
    }*/
	
}
