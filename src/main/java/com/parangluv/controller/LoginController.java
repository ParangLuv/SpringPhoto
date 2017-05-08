package com.parangluv.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.parangluv.domain.LoginDTO;
import com.parangluv.domain.UserVO;
import com.parangluv.interceptor.LoginInterceptor;
import com.parangluv.service.UserService;

@Controller
@RequestMapping("/login")
public class LoginController {

	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

	@Inject
	private UserService service;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public void loginGET(@ModelAttribute("dto") LoginDTO dto) {
		logger.info("loginGET ......");
	}

	@RequestMapping(value = "/loginPost", method = RequestMethod.POST)
	public void loginPOST(LoginDTO dto, HttpSession session, Model model) throws Exception {
		logger.info("loginPOST ......");
		UserVO vo = service.login(dto);

		if (vo == null) {
			logger.info("loginPOST return ......");
			return;
		}

		model.addAttribute("userVO", vo);
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String loginOutGET(HttpSession session) {
		logger.info("logOutGET ......");
		UserVO vo = (UserVO) session.getAttribute("login");

		if (vo != null) {
			logger.info(vo.toString());
			session.removeAttribute(LoginInterceptor.LOGIN);
			session.invalidate();
		}

		return "redirect:/sboard/list";
	}

}
