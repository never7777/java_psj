<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<div class="container">
	<script>
	/*
	- 서버에서 보낸 데이터를 스크립트에서 활용할 때 ''붙여서 문자열로 저장한 후 활용하는 것이 좋다.
		=> 서버에서 보낸 데이터에 값이 없는 경우, ''가 없으면(문자열 취급하지 않으면) 해당 위치에 코드가 비어 있개 되어서
			 에러가 발생되어 이후 코드가 실행되지 않음 
		=> 서버에서 보낸 데이터에 값이 없는 경우, ''가 있으면 해당 위치에 빈 문자열이 들어가게 되어 정상적인
			 결과는 아닐 수 있지만 에러가 발생하지 않아 이후 코드가 실행됨
		*/
	</script>
	${user}
</div>
