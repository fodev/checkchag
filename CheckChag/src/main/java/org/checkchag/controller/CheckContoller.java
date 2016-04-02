package org.checkchag.controller;

import java.util.List;

import javax.inject.Inject;

import org.checkchag.domain.MemberVO;
import org.checkchag.service.MemberServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import net.sf.json.JSONArray;

@Controller
@RequestMapping("/check")
public class CheckContoller {
	//컨트롤러는 URL을 분기시켜주는 작업을 해준다. 
	//service를 이용해서 작업을 처리해주고 화면을 이동시켜주는 역할을 한다.
	
	private static final Logger logger = LoggerFactory.getLogger(CheckContoller.class);
	

	@Inject
	private MemberServiceImpl service;
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	
	//register GET방식으로 접속을 하게되면 회원가입을할수있는 화면이 나와야한다.
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public void registerGET() throws Exception {
		logger.info("registerGET view registerForm");

	}
	
	//MemberVO라고 적으면 파라미터수집을 자동으로 한다.
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String registerPOST(MemberVO vo, RedirectAttributes rttr) {
		logger.info("registerPOST"+vo);
		try {
			service.register(vo);
			rttr.addFlashAttribute("msg", "success");
			logger.info("dfadf");
		} catch (Exception e) {
			rttr.addFlashAttribute("msg", "fail");
		}finally{
			return "redirect:/check/list";
		}
	}
	
	
	@RequestMapping(value="/list")
	public void listGET(Model model) throws Exception{
		JSONArray jsonObject = JSONArray.fromObject(service.getList()); 
		logger.info("listGET");
		model.addAttribute("list", jsonObject);
	}
	
	//Ajax처리를 위한 Json
	@RequestMapping(value="/listJSON")
	public   @ResponseBody  List<MemberVO> listJSON(Model model) throws Exception{
		return service.getList();
	}
}





