package com.codestates.helper.email;

import org.springframework.mail.MailException;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public interface EmailSendable {
    @Async
    void send(String message);
}
