<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
      *{padding: 0; margin: 0;}
      ul,ol,li{ list-style: none; }
      a{ text-decoration: none; }

      .brand{
        background-image: url(<%=request.getContextPath()%>/resources/img/logo.png);
        width: 285px; height: 141px;
        margin: auto;
        display: block;
        background-size: 100% 100%;
        
      }
      .form-group{
        width: 400px;
      }
      .btn{
        width: 400px; margin-top: 18px;
      }
      .box {
        display: flex;
        justify-content: center ;
        align-items: center;
      }   
      .postcoide{
        width: 300px; 
        display: inline;
        border-top-right-radius: 0px;
        border-bottom-right-radius:0px ;
      }
      .btn-postcoide{
        
        width: 100px; height: 38px;
        background-color: #007bff;
        border-color: #007bff;
        color: white;
        border-radius: 5px;
        border:0px;
        border-top-left-radius: 0px;
        border-bottom-left-radius:0px ;
      }
      .postcode-box, .extend-years{
       margin-bottom: 26px;
      }
    </style>
  </head>
<body>
<form action="<%=request.getContextPath()%>/signup" method="post">
  <div class="logo-group">
    <a class="brand" href="<c:url value="/"></c:url>"></a> 
  </div>
  <div class="box">
    <div class="box1">
      <div class="form-group">
      
        <label for="me_id">아이디</label>
        <input type="text" class="form-control" id="me_id" name="me_id">
      </div>
      <div class="form-group">
        <label for="me_pw">비밀번호</label>
        <input type="password" class="form-control" id="me_pw" name="me_pw">
      </div>
      <div class="form-group">
        <label for="me_pw2">비밀번호 재입력</label>
        <input type="password" class="form-control" id="me_pw2" name="me_pw2">
      </div>
      <div class="form-group">
        <label for="me_name">이름</label>
        <input type="text" class="form-control" id="me_name" name="me_name">
      </div>
      <div class="form-group">
        <label for="me_email">e-mail</label>
        <input type="text" class="form-control" id="me_email" name="me_email">
      </div>
      <div class="form-group">
        <label for="me_phone">휴대전화</label>
        <input type="text" class="form-control" id="me_phone" name="me_phone">
      </div>


      <div>개인정보 유효기간</div>
      <div class="extend-years">
        <div class="form-check-inline">
          <label class="form-check-label">
            <input type="radio" class="form-check-input" name="me_extend_years" value="1">1년
          </label>
        </div>
        <div class="form-check-inline">
          <label class="form-check-label">
            <input type="radio" class="form-check-input" name="me_extend_years" value="3">3년
          </label>
        </div>
        <div class="form-check-inline">
          <label class="form-check-label">
            <input type="radio" class="form-check-input" name="me_extend_years" value="5">5년
          </label>
        </div>
        <div class="form-check-inline">
          <label class="form-check-label">
            <input type="radio" class="form-check-input" name="me_extend_years" value="탈퇴시삭제">탈퇴 시까지
          </label>
        </div>
      </div>

      <div>추가정보 입력</div>
      <div>주소</div>
      <div class="postcode-box">
        <input type="text" class="form-control postcoide" id="sample6_postcode" placeholder="우편번호" name="me_post_code">
        <input type="button" class="btn-postcoide" onclick="sample6_execDaumPostcode()" value="찾기"><br>
      </div>  
        <input type="text" class="form-control" id="sample6_address" placeholder="주소" name="me_addr"><br>
        <input type="text" class="form-control" id="sample6_detailAddress" placeholder="상세주소" name="me_addr_ditail">
      <div>
       <button type="submit" class="btn btn-outline-primary">회원가입</button>
      </div>
    </div>
  </div>
 	</form>
</body>
</html>