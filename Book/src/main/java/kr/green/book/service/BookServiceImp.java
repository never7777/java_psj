package kr.green.book.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.multipart.MultipartFile;

import kr.green.book.dao.BookDAO;
import kr.green.book.pagination.Criteria;
import kr.green.book.utils.UploadFileUtils;
import kr.green.book.vo.BookVO;

@Controller
public class BookServiceImp implements BookService{
	@Autowired
	BookDAO bookDao;
	String bookThumbnailUploadPath ="G:\\git\\book";

	@Override
	public void insertbook(BookVO book, MultipartFile file) {
		if(book == null || file == null ||file.getOriginalFilename().length() == 0)
			return; 
		try {
			
			String str = UploadFileUtils.uploadFile(bookThumbnailUploadPath, "bo"+book.getBo_ca_code(), file.getOriginalFilename(),file.getBytes());
			book.setBo_thum(str);
			System.out.println(str);
		}catch(Exception e) {
			e.printStackTrace();
		}
		bookDao.insertBook(book);
	}

	@Override
	public ArrayList<BookVO> getBookList(Criteria cri) {
		return bookDao.selectBook(cri);
	}

	@Override
	public int getTotalCount() {
		return bookDao.selectTotalCount();
	}
}
