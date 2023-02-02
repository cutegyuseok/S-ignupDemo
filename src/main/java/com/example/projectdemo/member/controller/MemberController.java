package com.example.projectdemo.member.controller;

import com.example.projectdemo.member.dto.UserReqDto;
import com.example.projectdemo.member.dto.UserRespDto;
import com.example.projectdemo.member.service.impl.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MemberController {

    private final UserServiceImpl userService;
    @PostMapping ("/signup")
    public UserRespDto signUp(UserReqDto dto){
        System.out.println(dto.toString());
        return userService.signup(dto);
    }
}
