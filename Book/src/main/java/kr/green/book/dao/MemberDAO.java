package kr.green.book.dao;

import org.apache.ibatis.annotations.Param;

public interface MemberDAO {
	public String getEmail(@Param("id")String us_id);
}
