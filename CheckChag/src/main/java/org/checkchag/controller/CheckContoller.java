package org.checkchag.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class CheckContoller {
	//컨트롤러는 URL을 분기시켜주는 작업을 해준다. 
	//service를 이용해서 작업을 처리해주고 화면을 이동시켜주는 역할을 한다.
	
	private static final Logger logger = LoggerFactory.getLogger(CheckContoller.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	
	//register GET방식으로 접속을 하게되면 회원가입을할수있는 화면이 나와야한다.
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {

		logger.info("registerGET view registerForm");
		return "register";
	}
	
}