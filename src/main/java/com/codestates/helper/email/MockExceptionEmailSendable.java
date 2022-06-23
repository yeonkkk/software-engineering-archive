package com.codestates.helper.email;

import org.springframework.mail.MailException;
import org.springframework.mail.MailSendException;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;

public class MockExceptionEmailSendable implements EmailSendable {
    @Override
    public void send(String message) {
        try {
            Thread.sleep(5000L);
            throw new MailSendException("error while send email");
        } catch (InterruptedException e) {

        } catch (MailSendException e) {
            throw e;
        }
    }
}
