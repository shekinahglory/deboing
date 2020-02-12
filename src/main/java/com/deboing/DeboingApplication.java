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
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;

import org.springframework.context.annotation.Bean;


import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.thymeleaf.templateresolver.ITemplateResolver;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static com.deboing.utils.UsersUtils.createBasicUser;

@SpringBootApplication
public class DeboingApplication implements CommandLineRunner {

	private static final Logger LOG = LoggerFactory.getLogger(DeboingApplication.class);

	@Value("${webmaster.username}")
	private String webmasterUsername;
	@Value("${webmaster.password}")
	private String webmasterPassword;
	@Value("${webmaster.email}")
	private String webmasterEmail;

	@Autowired
	private UserService userService;
	private RolesEnum rolesEnum;

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

		User basicuser = createBasicUser(webmasterUsername, webmasterPassword, webmasterEmail);
		LOG.debug("Creating user with username : " + basicuser.getUsername());
		User user =  userService.createUser(basicuser, PlansEnum.PRO, RolesEnum.ADMIN);
		LOG.info("User {} created", user.getUsername());
//		LOG.info("User {} created", user1.getUsername());

	}



}
