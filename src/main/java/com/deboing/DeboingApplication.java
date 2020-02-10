package com.deboing;

import com.deboing.backend.persistence.domain.Role;
import com.deboing.backend.persistence.domain.User;
import com.deboing.backend.persistence.domain.UserRole;
import com.deboing.backend.service.UserService;
import com.deboing.enums.PlansEnum;
import com.deboing.enums.RolesEnum;
import org.apache.juli.logging.Log;
import org.h2.server.web.WebServlet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;

import org.springframework.context.annotation.Bean;


import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.thymeleaf.templateresolver.ITemplateResolver;

import java.util.HashSet;
import java.util.Set;

import static com.deboing.utils.UsersUtils.createBasicUser;

@SpringBootApplication
public class DeboingApplication implements CommandLineRunner {

	private static final Logger LOG = LoggerFactory.getLogger(DeboingApplication.class);

	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(DeboingApplication.class, args);
	}


	@Bean
	public ServletRegistrationBean registrationBean(){
		ServletRegistrationBean registrationBean = new ServletRegistrationBean(new WebServlet());
		registrationBean.addUrlMappings("/console/*");
		return registrationBean;
	}

	@Override
	public void run(String... args) throws Exception {
//		Set<UserRole> userRoles = new HashSet<>();
//		User basicuser = createBasicUser();
//		userRoles.add(new UserRole(basicuser, new Role(RolesEnum.BASIC)));
//		userRoles.add(new UserRole(basicuser, new Role(RolesEnum.PRO)));
//		LOG.debug("Creating user with username : " + basicuser.getUsername());
////		User user =  userService.createUser(basicuser, PlansEnum.BASIC, userRoles);
//		LOG.info("User {} created", user.getUsername());
	}

//	@Bean
//	public SpringTemplateEngine templateEngine(ITemplateResolver templateResolver, SpringSecurityDialect sec) {
//		final SpringTemplateEngine templateEngine = new SpringTemplateEngine();
//		templateEngine.setTemplateResolver(templateResolver);
//		templateEngine.addDialect(sec); // Enable use of "sec"
//		return templateEngine;
//	}

}
