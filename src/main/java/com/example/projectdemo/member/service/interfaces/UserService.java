package com.example.projectdemo.member.service.interfaces;

import com.example.projectdemo.member.dto.UserReqDto;
import com.example.projectdemo.member.dto.UserRespDto;

public interface UserService {

    UserRespDto signup(UserReqDto dto);

}
