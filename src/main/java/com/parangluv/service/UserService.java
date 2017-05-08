package com.parangluv.service;

import com.parangluv.domain.LoginDTO;
import com.parangluv.domain.UserVO;

public interface UserService {

	public void insertUser(UserVO userVO);

	public UserVO selectUserById(String userId) throws Exception;
	
	public UserVO login(LoginDTO dto) throws Exception;
	
}
