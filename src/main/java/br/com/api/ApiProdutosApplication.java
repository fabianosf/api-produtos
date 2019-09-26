package br.com.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

@SpringBootApplication
public class ApiProdutosApplication { 	 
	
	public static void main(String[] args) {
		SpringApplication.run(ApiProdutosApplication.class, args);
	}	 
	
	@Bean
	UrlBasedCorsConfigurationSource configurationSource() {
		CorsConfiguration corsConfiguration = new CorsConfiguration();
		
		corsConfiguration.addAllowedHeader("*");
		corsConfiguration.addAllowedMethod("*");
		corsConfiguration.addAllowedOrigin("*");
		//corsConfiguration.addExposedHeader("");
		
		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		source.registerCorsConfiguration("/**", corsConfiguration);
		
		return source;
	}
	
	

}















