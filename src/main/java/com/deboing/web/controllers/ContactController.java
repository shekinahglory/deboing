package com.deboing.web.controllers;


import com.deboing.backend.service.EmailService;
import com.deboing.web.domain.frontend.FeedBackPojo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ContactController {

    private static final Logger LOG = LoggerFactory.getLogger(ContactController.class);
    private static final String FEEDBACK_MODEL_KEY = "feedback" ;
    private static final String CONTACT_US_VIEW_NAME = "contact/contact";

    @Autowired
    private EmailService emailService;

    @RequestMapping(value = "/contact", method = RequestMethod.GET)
    public String getContanct(ModelMap modelMap){
        FeedBackPojo feedBackPojo = new FeedBackPojo();
        modelMap.addAttribute(ContactController.FEEDBACK_MODEL_KEY, feedBackPojo);
        return ContactController.CONTACT_US_VIEW_NAME;
    }

    @RequestMapping(value = "/contact", method = RequestMethod.POST)
    public String postContact(@ModelAttribute(FEEDBACK_MODEL_KEY) FeedBackPojo feedBackPojo){
        LOG.debug("Feedback POJO content: {}", feedBackPojo);
        emailService.sendFeedbackMail(feedBackPojo);
        return ContactController.CONTACT_US_VIEW_NAME;
    }
}
