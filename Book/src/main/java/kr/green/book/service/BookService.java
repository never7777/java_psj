package kr.green.book.service;

import java.util.ArrayList;

import org.springframework.web.multipart.MultipartFile;

import kr.green.book.pagination.Criteria;
import kr.green.book.vo.BookVO;

public interface BookService {

	void insertbook(BookVO book, MultipartFile file);

	ArrayList<BookVO> getBookList(Criteria cri);

	int getTotalCount();

	BookVO selectBook(String bo_isbn);

}
