package com.deboing.backend.service;

import com.deboing.web.domain.frontend.FeedBackPojo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;

public abstract class AbstractEmailService implements EmailService {

    @Value("${default.to.address}")
    private String defaultToAddress;
    /**
     * Creates a Simple Message from a Feedback Pojo.
     * @param feedBackPojo The Feedback pojo
     * @return
     */
    protected SimpleMailMessage simpleMailMessage(FeedBackPojo feedBackPojo){

        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(defaultToAddress);
        message.setFrom(feedBackPojo.getEmail());
        message.setSubject("Deboing app : Feedback received from " + feedBackPojo.getFirstName() + " " + feedBackPojo.getLastName() + "!");
        message.setText(feedBackPojo.getFeedBack());

        return message; //for now
    }

    @Override
    public void sendFeedbackMail(FeedBackPojo feedBackPojo) {
        sendGenericEmailMessage(simpleMailMessage(feedBackPojo));
    }
}
