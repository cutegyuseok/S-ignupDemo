package com.example.projectdemo.member.repository;

import com.example.projectdemo.member.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {
}
