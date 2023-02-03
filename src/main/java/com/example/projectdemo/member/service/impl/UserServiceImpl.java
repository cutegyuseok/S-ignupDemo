package com.example.projectdemo.member.service.impl;

import com.example.projectdemo.member.dto.UserReqDto;
import com.example.projectdemo.member.dto.UserRespDto;
import com.example.projectdemo.member.entity.User;
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
            if (ur.existsById(dto.getId())) {
                return null;
            } else {
                try {
                    User user = ur.save(dto.toEntity());
                    return new UserRespDto(user);
                }catch (Exception e){
                    e.printStackTrace();
                    return null;
                }
            }
    }
}
