package com.parangluv.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board/*")
public class PhotoController {
	
	@Inject
	PhotoService service;
	

}
