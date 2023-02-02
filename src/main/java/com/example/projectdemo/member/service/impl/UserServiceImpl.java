package com.example.projectdemo.member.service.impl;

import com.example.projectdemo.member.dto.UserReqDto;
import com.example.projectdemo.member.dto.UserRespDto;
import com.example.projectdemo.member.repository.UserRepository;
import com.example.projectdemo.member.service.interfaces.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository ur;
    @Override
    public UserRespDto signup(UserReqDto dto) {
        try {
            if (ur.existsById(dto.getId())) {
                return null;
            } else {
                return new UserRespDto(ur.save(dto.toEntity()));
            }
        }catch (Exception e){
            return null;
        }
    }
}
