package com.ma.jwttest.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SignReqDto {
    private Long id;
    private String account;
    private String password;
    private String nickname;
    private String name;
    private String email;
}
