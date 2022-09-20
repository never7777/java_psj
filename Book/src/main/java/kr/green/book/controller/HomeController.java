package kr.green.book.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.green.book.service.MemberService;

@Controller
public class HomeController {
	@Autowired
	MemberService memberService;
	
	@RequestMapping(value= "/")
	public ModelAndView openTilesView(ModelAndView mv){
	    mv.setViewName("/main/home");
	    mv.addObject("setHeader", "타일즈");
	    System.out.println(memberService.getEmail("user1"));
	    return mv;
	}
	
}
