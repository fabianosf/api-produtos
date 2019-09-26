package br.com.api.config;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.PathSelectors.regex;


@Configuration
@EnableSwagger2
public class SwaggerConfig {

	//metodo que retorna o tipo docket
	//
	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("br.com.api")) //classes java
				.paths(regex("/api.*")) // caminho para acessar nosso endpoint
				.build()
				.apiInfo(metaInfo());				
	}
	
	//Criei um metodo que mostra as informacoes de quem criou
	private ApiInfo metaInfo() {
		ApiInfo apiInfo = new ApiInfo(
				"Produtos API REST",
				"API REST de cadastro de produtos",
				"1.0", "Terms of Service",
				new Contact("Fabiano Freitas", "http://www.fabianosf.com.br","fabiano.freitas@gmail.com"),
				"Apache License Version 2.0", "https://www.apache.org", new ArrayList<VendorExtension>());
		return apiInfo;
				
	}
	
	
				
	
}
