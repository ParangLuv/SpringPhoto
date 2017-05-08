package com.parangluv.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.parangluv.domain.LoginDTO;
import com.parangluv.domain.UserVO;
import com.parangluv.persistence.UserDao;

@Service
public class UserServiceImpl implements UserService{
	
	@Inject
	private UserDao dao;
	
	@Override
	public void insertUser(UserVO userVO){
		dao.insertUser(userVO);
	}

	@Override
	public UserVO selectUserById(String userId) throws Exception {
		return dao.selectUserById(userId);
	}

	@Override
	public UserVO login(LoginDTO dto) throws Exception {
		return dao.login(dto);
	}
	
	

}
