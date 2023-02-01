package com.codestates.coffee;

import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.*;

public class CoffeePostDto {
    @NotBlank
    @Pattern(regexp = "^[a-zA-Z]+(\\s[a-zA-Z]+)*$",
            message = "연속된 공백을 사용할 수 없습니다.")
    private String engName;

    @NotBlank
    private String korName;

    @NotNull
    @Range(min=100, max=50000)
    private int price;

    public String getEngName() {
        return engName;
    }

    public void setEngName(String engName) {
        this.engName = engName;
    }

    public String getKorName() {
        return korName;
    }

    public void setKorName(String korName) {
        this.korName = korName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
