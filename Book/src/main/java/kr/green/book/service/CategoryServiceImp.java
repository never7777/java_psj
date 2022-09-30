package kr.green.book.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.green.book.dao.CategoryDAO;
import kr.green.book.vo.CategoryVO;

@Service
public class CategoryServiceImp implements CategoryService{

	@Autowired
	CategoryDAO categoryDao;

	@Override
	public boolean insertCategory(CategoryVO category) {
		System.out.println(category);
		if(category == null)
			return false;
		if(category.getLa_name() != null  && category.getLa_name().length() != 0)
			categoryDao.insetLargeCategory(category);
		if(category.getLa_code() != 0 && 
				category.getMe_name() != null && 
				category.getMe_name().length() != 0)
			categoryDao.insetMediumCategory(category);
		if(category.getMe_code() != 0 && 
				category.getSm_name() != null && 
				category.getSm_name().length() != 0)
			categoryDao.insetSmallCategory(category);
		return true;
	}

	@Override
	public ArrayList<CategoryVO> getLargeCategoryList() {
		return categoryDao.getLargeCategoryList();
	}

	@Override
	public ArrayList<CategoryVO> getMediumCategoryList() {
		return categoryDao.getMediumCategoryList();
	}
}