package com.codestates.order.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
public class Order {
    private long memberId;
    private long coffeeId;
}
