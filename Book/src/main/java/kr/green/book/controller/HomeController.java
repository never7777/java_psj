package kr.green.book.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import kr.green.book.service.CategoryService;
import kr.green.book.service.MemberService;
import kr.green.book.vo.CategoryVO;
import kr.green.book.vo.MemberVO;

@Controller
public class HomeController {
	@Autowired
	MemberService memberService;
	
	@Autowired
	CategoryService categoryService;
	
	
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
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public ModelAndView loginGet(ModelAndView mv) {
		mv.setViewName("/main/login");
		return mv;
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public ModelAndView loginPost(ModelAndView mv, MemberVO member) {
		
		MemberVO user = memberService.login(member);
		System.out.println(user);
		if(member != null) 
			mv.setViewName("redirect:/");
		else 
			mv.setViewName("redirect:/login");
		mv.addObject("user",user);
		
		return mv;
	}
	@RequestMapping(value="/logout", method=RequestMethod.GET)
	public ModelAndView logout(ModelAndView mv, HttpSession session) {
		session.removeAttribute("user");
		mv.setViewName("redirect:/");
		return mv;
	}
	
	/*관리자 페이지로 이동*/
	@RequestMapping(value="/admin", method=RequestMethod.GET)
	public ModelAndView adminGet(ModelAndView mv) {
		mv.setViewName("/adminheader/admin/home");
		return mv;
	}
	
	/*관리자 페이지 -> 도서 등록 jsp 연결만함*/
	@RequestMapping(value="/admin/addbook", method=RequestMethod.GET)
	public ModelAndView adminAddBookGet(ModelAndView mv) {
		mv.setViewName("/adminheader/admin/addbook");
		return mv;
	}
	/*관리자 페이지 -> 카테고리 등록*/
	@RequestMapping(value="/admin/addcategory", method=RequestMethod.GET)
	public ModelAndView adminAddCategoryGet(ModelAndView mv) {
		ArrayList<CategoryVO> largeList = categoryService.getLargeCategoryList();
		ArrayList<CategoryVO> mediumList = categoryService.getMediumCategoryList();
		mv.addObject("largeList",largeList);
		mv.addObject("mediumList",mediumList);
		mv.setViewName("/adminheader/admin/addcategory");
		return mv;  
 	} 
	/*관리자 페이지 카테고리 등록 기능*/
	@RequestMapping(value="/admin/addcategory", method=RequestMethod.POST)
	public ModelAndView adminAddCategoryPOST(ModelAndView mv, CategoryVO category) {
		System.out.println(category);
		boolean res = categoryService.insertCategory(category);
		mv.setViewName("redirect:/admin/addcategory");
		return mv;
	} 
}
	
	