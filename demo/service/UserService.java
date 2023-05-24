package com.example.demo.service;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.UserSearchRequest;
import com.example.demo.repository.UserMapper;

@Service
public class UserService {
	@Autowired
	private UserMapper userMapper;
/**
 * ユーザ情報検索
 * 
 */
	public User search(UserSearchRequest userSearchRequest) {
		return userMapper.search(userSearchRequest);
		
	}
}