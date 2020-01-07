package com.deboing.config;


import com.deboing.backend.service.EmailService;
import com.deboing.backend.service.SmtpEmailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.mail.MailException;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;

@Configuration
@Profile("prod")
@PropertySource("file:///${user.home}/.deboing/application-prod.proterties")
public class ProductionConfig {


    @Bean
    public EmailService emailService(){
        return new SmtpEmailService();
    }



}
