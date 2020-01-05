package com.deboing.web.i18n;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
public class I18NServices {


    @Autowired
    private MessageSource messageSource;

    /**
     * Returns a message for the given message id and the default locale in the session context
     * @param messageId They key to the messages resource file
     */

    public String getMessage(String messageId){
        Locale locale= LocaleContextHolder.getLocale();
        return getMessage(messageId, locale);
    }

    public String getMessage(String messageId, Locale locale){

        return messageSource.getMessage(messageId,null, locale);
    }


}
