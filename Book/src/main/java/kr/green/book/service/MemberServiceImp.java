package kr.green.book.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.green.book.dao.MemberDAO;
import kr.green.book.vo.MemberVO;

@Service
public class MemberServiceImp implements MemberService{
	@Autowired
	MemberDAO memberDao;
	
	@Override
	public boolean signup(MemberVO member) {
		if(member == null)
			return false;
			
		if(member.getMe_id() == null || member.getMe_pw() == null ||
			 member.getMe_name() == null || member.getMe_email() == null || 
			 member.getMe_phone() == null || member.getMe_extend_years() == null)
			return false;
		
		MemberVO dbMember = memberDao.selectMember(member.getMe_id());
			
		if(dbMember != null)
			return false;
		
		memberDao.insertMember(member);
		return true;
	}

}
