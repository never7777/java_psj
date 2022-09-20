package kr.green.book.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.green.book.dao.MemberDAO;

@Service
public class MemberServiceImp implements MemberService{
	@Autowired
	MemberDAO memberDao;
	
	@Override
	public String getEmail(String us_id) {
		
		return memberDao.getEmail(us_id);
	}

}
