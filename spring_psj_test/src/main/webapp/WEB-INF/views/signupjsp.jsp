<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form method="post">
	<h1>회원가입</h1>
	 <div class="form-group">
	  <label for="usr">아이디:</label>
	  <input type="text" class="form-control" id="me_id" name="me_id">
	</div>
	<div class="form-group">
	  <label for="pwd">비밀번호:</label>
	  <input type="password" class="form-control" id="me_pw" name="me_pw">
	</div> 
	<div class="form-group">
	  <label for="pwd">비밀번호 확인:</label>
	  <input type="password" class="form-control" id="me_pw2" name="me_pw2">
	</div> 
	<div class="form-group">
	  <label for="pwd">이메일:</label>
	  <input type="password" class="form-control" id="me_email" name="me_email">
	</div> 
	<div class="form-group">
	  <label for="pwd">생일:</label>
	  <input type="password" class="form-control" id="me_birth" name="me_me_birth">
	</div>
	<div class="form-check-inline">
	  <label class="form-check-label">
	    <input type="radio" class="form-check-input" name="me_gender" value="M">남성
	  </label>
	</div>
	<div class="form-check-inline">
	  <label class="form-check-label">
	    <input type="radio" class="form-check-input" name="me_gender" value="F">여성
	  </label>
	</div>
</form>



</body>
</html>