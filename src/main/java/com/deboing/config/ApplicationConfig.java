package com.deboing.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories(basePackages = "com.deboing.backend.persistence.repositories")
@EntityScan(basePackages = "com.deboing.backend.persistence.domain")
@PropertySource("file:///${user.home}/.deboing/application-common.properties")
@EnableTransactionManagement
public class ApplicationConfig {
}
