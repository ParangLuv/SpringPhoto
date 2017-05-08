package com.parangluv.persistence;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.parangluv.domain.LoginDTO;
import com.parangluv.domain.UserVO;

@Repository
public class UserDaoImpl implements UserDao{

	@Inject
	private SqlSession session;
	
	private static String namespace ="com.parangluv.mapper.UserMapper";	

	@Override
	public UserVO login(LoginDTO dto) throws Exception {
		return session.selectOne(namespace +".login", dto);
	}

	@Override
	public void insertUser(UserVO userVO) {
		session.insert(namespace + ".insertUser", userVO);
	}

	@Override
	public UserVO selectUserById(String userId) throws Exception {
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("userId", userId);
		return session.selectOne(namespace + ".selectUserById", paramMap);
	}

}
