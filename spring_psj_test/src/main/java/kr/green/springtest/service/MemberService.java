package kr.green.springtest.service;

import kr.green.sprintest.vo.MemberVO;

public interface MemberService {

	public boolean signup(MemberVO member);

	public MemberVO login(MemberVO member);
}