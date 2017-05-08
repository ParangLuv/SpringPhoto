package com.parangluv.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.parangluv.domain.UserVO;
import com.parangluv.persistence.UserDao;
import com.parangluv.service.UserService;

@Controller
public class JoinController {

	private static final Logger logger = LoggerFactory.getLogger(JoinController.class);
	
	@Inject
	private UserService service;
	
	@RequestMapping(value = "join", method = RequestMethod.GET)
	public String getJoin(){
		logger.info("join Get 실행");
		return "JoinForm";
	}
	
	@RequestMapping(value="join", method=RequestMethod.POST)
	public String postJoin(@ModelAttribute("user") UserVO userVO){
		userVO.setUserPhone(userVO.getUserPhone1(), userVO.getUserPhone2(), userVO.getUserPhone3());
		service.insertUser(userVO);
		logger.info("join POST 실행");
		return "JoinResult";
	}
	
}
