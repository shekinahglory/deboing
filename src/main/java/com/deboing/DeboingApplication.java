package com.deboing;

import org.h2.server.web.WebServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;

import org.springframework.context.annotation.Bean;


import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.thymeleaf.templateresolver.ITemplateResolver;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.deboing.backend.persistence.repositories")
public class DeboingApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeboingApplication.class, args);
	}


	@Bean
	public ServletRegistrationBean registrationBean(){
		ServletRegistrationBean registrationBean = new ServletRegistrationBean(new WebServlet());
		registrationBean.addUrlMappings("/console/*");
		return registrationBean;
	}

//	@Bean
//	public SpringTemplateEngine templateEngine(ITemplateResolver templateResolver, SpringSecurityDialect sec) {
//		final SpringTemplateEngine templateEngine = new SpringTemplateEngine();
//		templateEngine.setTemplateResolver(templateResolver);
//		templateEngine.addDialect(sec); // Enable use of "sec"
//		return templateEngine;
//	}

}
