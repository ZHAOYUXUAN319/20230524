package com.example.demo.repository;

import org.apache.catalina.User;
import org.apache.ibatis.annotations.Mapper;

import com.example.demo.dto.UserSearchRequest;

@Mapper
public interface UserMapper {
	User search(UserSearchRequest user);
}
