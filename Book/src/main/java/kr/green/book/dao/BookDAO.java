package kr.green.book.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import kr.green.book.pagination.Criteria;
import kr.green.book.vo.BookVO;

public interface BookDAO {

	void insertBook(@Param("bo")BookVO book);

	ArrayList<BookVO> selectBook(@Param("cri") Criteria cri);

	int selectTotalCount();

	BookVO selectBookIsbn(String bo_isbn);

}
