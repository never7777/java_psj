package kr.green.springtest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImp implements MemberService{

	@Autowired
  MemberService memberService;
  
  @Override
  public String getEmail(String id) {
      return null;
  }
}
