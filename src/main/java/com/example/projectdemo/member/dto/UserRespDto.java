package com.example.projectdemo.member.dto;

import com.example.projectdemo.member.entity.User;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Id;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserRespDto {

    private String id;
    private String name;
    private int age;
    private String phoneNumber;
    private String address;

    public UserRespDto (User user){
        this.id=user.getId();
        this.name=user.getName();
        this.age=user.getAge();
        this.phoneNumber=user.getPhoneNumber();
        this.address=user.getAddress();
    }

}
