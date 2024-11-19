package com.example.gametalk.exception.authentication;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum AuthenticationErrorCode {
    EMAIL_DUPLICATED(HttpStatus.BAD_REQUEST, "이메일이 일치하지 않습니다."),
    PASSWORD_INCORRECT(HttpStatus.BAD_REQUEST, "비밀번호가 일치하지 않습니다.");


    private final HttpStatus httpStatus;
    private final String message;
}