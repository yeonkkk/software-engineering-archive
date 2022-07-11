package com.codestates.event;

import com.codestates.member.entity.Member;
import org.springframework.context.ApplicationEvent;

public class SendMailEvent extends ApplicationEvent {

    private final Member member;

    public SendMailEvent(Object source, Member member) {
        super(source);
        this.member = member;
    }

    public Member getMember() {
        return member;
    }
}
