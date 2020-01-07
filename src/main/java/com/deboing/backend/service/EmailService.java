package com.deboing.backend.service;

import com.deboing.web.domain.frontend.FeedBackPojo;
import org.springframework.mail.SimpleMailMessage;

/**
 * Contract for email service.
 * Created by shekinah on 05/01/2020
 */

public interface EmailService {
    /**
     * Sends an email with teh content in the Feedback Pojo.
     * @param feedBackPojo The feedback Pojo
     */

    public void sendFeedbackMail(FeedBackPojo feedBackPojo);

    /**
     * Sends an email with the content of the simple Mail message object.
     * @param simpleMailMessage The object containing the email content
     */

    public void sendGenericEmailMessage(SimpleMailMessage simpleMailMessage);


}
