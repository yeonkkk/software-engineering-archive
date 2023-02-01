package com.codestates.homework;

import com.codestates.helper.RandomPasswordGenerator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.temporal.ChronoField;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class RandomPasswordGeneratorTest {
    @DisplayName("실습 3: 랜덤 패스워드 생성 테스트")
    @Test
    public void generateTest() {
        // TODO 여기에 테스트 케이스를 작성해주세요.

        // given
        int numberOfUpperCaseLetters = 3;
        int numberOfLowerCaseLetters = 3;
        int numberOfNumeric = 4;
        int numberOfSpecialChars = 2;
        int actualNumberOfUpperCase = 0;
        int actualNumberOfLowerCase = 0;
        int actualNumberOfNumeric = 0;
        int actualNumberOfSpecialChars = 0;

        // when
        String password = RandomPasswordGenerator.generate(numberOfUpperCaseLetters,
                                                            numberOfLowerCaseLetters,
                                                            numberOfNumeric,
                                                            numberOfSpecialChars);

        for (int i=0; i < password.length(); i++) {
            char cur = password.charAt(i);
            if(Character.isUpperCase(cur)) actualNumberOfUpperCase++;
            else if(Character.isLowerCase(cur)) actualNumberOfLowerCase++;
            else if(Character.isDigit(cur)) actualNumberOfNumeric++;
            else actualNumberOfSpecialChars++;
        }

        // then
        // 1. 전체 패스워드 길이 검증
        int expectedLength = numberOfLowerCaseLetters + numberOfLowerCaseLetters
                + numberOfNumeric + numberOfSpecialChars;
        int actualLength = password.length();

        Assertions.assertEquals(expectedLength, actualLength);

        // 2. 생성된 패스워드의 ‘알파벳 대문자’ 개수가 입력한 파라미터 숫자와 일치하는지 검증
        Assertions.assertEquals(numberOfUpperCaseLetters, actualNumberOfUpperCase);

        // 3. 생성된 패스워드의 ‘알파벳 소문자’ 개수가 입력한 파라미터 숫자와 일치하는지 검증
        Assertions.assertEquals(numberOfLowerCaseLetters, actualNumberOfLowerCase);

        // 4. 생성된 패스워드의 ‘0 이상인 숫자’의 개수가 입력한 파라미터 숫자와 일치하는지
        Assertions.assertEquals(numberOfNumeric, actualNumberOfNumeric);

        // 5. 생성된 임시 패스워드의 ‘특수문자’ 개수가 입력한 파라미터 숫자와 일치하는지 검증
        Assertions.assertEquals(numberOfSpecialChars, actualNumberOfSpecialChars);
    }
}
