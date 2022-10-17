package kr.green.book.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import kr.green.book.service.BookService;
import kr.green.book.vo.BookVO;

@Controller	
public class BookController {

	@Autowired
	BookService bookService;
	
	@RequestMapping(value = "/select", method = RequestMethod.GET)
	public ModelAndView home (ModelAndView mv, String bo_isbn) {
		BookVO book = bookService.selectBook(bo_isbn);
		System.out.println(book);
		mv.addObject("b",book);
		mv.setViewName("book/select");
		return mv;
	}
}
