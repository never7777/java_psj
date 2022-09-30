package kr.green.book.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import kr.green.book.vo.CategoryVO;

public interface CategoryDAO {
	
	ArrayList<CategoryVO> getLargeCategoryList();
	
	ArrayList<CategoryVO> getMediumCategoryList();

	void insetLargeCategory(@Param("c")CategoryVO category);

	void insetMediumCategory(@Param("c")CategoryVO category);

	void insetSmallCategory(@Param("c")CategoryVO category);


}
