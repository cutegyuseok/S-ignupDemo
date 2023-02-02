package com.example.projectdemo.member.dto;

import com.example.projectdemo.member.entity.User;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserReqDto {

    private String id;
    private String password;
    private String name;
    private int age;
    private String phoneNumber;
    private String address;

    public User toEntity(){
        return User.builder().
                id(id)
                .password(password)
                .name(name)
                .age(age)
                .phoneNumber(phoneNumber)
                .address(address)
                .build();
    }
}
