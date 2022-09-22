package kr.green.book.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import kr.green.book.service.MemberService;
import kr.green.book.vo.MemberVO;

@Controller
public class HomeController {
	@Autowired
	MemberService memberService;
	
	@RequestMapping(value= "/")
	public ModelAndView openTilesView(ModelAndView mv){
	    mv.setViewName("/main/home");
	    return mv;
	}
	@RequestMapping(value="/signup", method=RequestMethod.GET)
	public ModelAndView singupGet(ModelAndView mv) {
		mv.setViewName("/noheader/main/signup");
		return mv;
	}
	@RequestMapping(value="/signup", method=RequestMethod.POST)
	public ModelAndView singupPost(ModelAndView mv, MemberVO member) {
		if(memberService.signup(member)) {
			mv.setViewName("redirect:/");
		}else {
			mv.setViewName("redirect:/signup");
			System.out.println();
		}
		return mv;
	}
}
