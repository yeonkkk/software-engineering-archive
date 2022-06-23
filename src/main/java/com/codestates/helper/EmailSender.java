package com.codestates.helper;

import com.codestates.helper.email.EmailSendable;
import org.springframework.stereotype.Service;

@Service
public class EmailSender {
    private final EmailSendable emailSendable;

    public EmailSender(EmailSendable emailSendable) {
        this.emailSendable = emailSendable;
    }

    public void sendEmail(String message) {
        emailSendable.send(message);
    }
}
