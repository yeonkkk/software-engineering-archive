package com.codestates.event;


import com.codestates.helper.EmailSender;
import com.codestates.member.service.MemberService;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;

@EnableAsync
@Configuration
@Component
public class EventHandler {

    private MemberService memberService;
    private EmailSender emailSender;

    public EventHandler(MemberService memberService, EmailSender emailSender) {
        this.memberService = memberService;
        this.emailSender = emailSender;
    }

    @Async
    @EventListener
    public void emailEvent(SendMailEvent event) throws Exception {
        try {
            emailSender.sendEmail("any email message");
        } catch (Exception e) {
            memberService.deleteMember(event.getMember().getMemberId());
        }
    }
}
