<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>  
<html>  
<head>
<style>
			/*로고*/
      .img-group{
        display: inline-block
      }
      .home{
      	background-image: url(<%=request.getContextPath()%>/resources/img/logo.png);
        width: 150px; height:70px; display:blook;
        margin-right: 30px; margin-top:10px; 
        background-size: 100% 100%
      }
      /*검색바*/
      .input-group{
        width: 400px; margin-top: 35px; 
      }
      .sort{
        display: flex;
        justify-content:center;
        height: 100px;
      }
      /*상단 우측 (로그인/ 회원가입)*/
      li{
        list-style: none;
        display: inline;
        color : black;
        font-size: 11px;
      }
      a:hover{
        text-decoration: none;
      }
      i{
        color:#007bff;
      }
      .right-box{
        width: 130px; height: 80px;
        position: static;
      }
      .login-signup{
        display: block;
        position: relative;
        left: 5px 
      }
      .shopping-icon{
        display: block;
        position: relative;
        left: 60px;  top: -8px;
      }
    </style>
  </head>
<body>
<!--로고-->
<div class="sort">
  <div class="img-group">
    <a class="navbar-brand home" href="<c:url value="/"></c:url>"></a>
  </div>
	<!--검색바-->  
  <div class="search-group">
    <div class="input-group">
      <input type="text" class="form-control" placeholder="Search">
      <div class="input-group-append">
        <button class="btn btn-primary" type="submit">검색</button>
      </div>
    </div>
  </div>

	<!--상단 오른쪽 박스--> 
  <div class="right-box">
    <div class="login-signup">
      <ul>
	      <c:if test="${user == null}">
	        <a href="<c:url value="/signup"></c:url>">
	          <li>회원가입</li>
	        </a>
	        <a href="<c:url value="/login"></c:url>">
	          <li>로그인</li>
	        </a>
        </c:if>
      </ul>
    </div>
    <!-- 장바구니 아이콘 -->
    <div class="shopping-icon">
      <i class="fa-sharp fa-solid fa-cart-shopping fa-3x"></i>
    </div>
  </div>
</div>
  
<nav class="navbar navbar-expand-sm bg-primary navbar-dark">
  <ul class="navbar-nav">
    <li class="nav-item active">
      <a class="nav-link" href="#" data-toggle="dropdown">국내도서</a>
      <div class="dropdown-menu">
        <a class="dropdown-item" href="#">Link 1</a>
        <a class="dropdown-item" href="#">Link 2</a>
        <a class="dropdown-item" href="#">Link 3</a>
      </div>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="#" data-toggle="dropdown">외국도서</a>
      <div class="dropdown-menu">
        <a class="dropdown-item" href="#">Link 1</a>
        <a class="dropdown-item" href="#">Link 2</a>
        <a class="dropdown-item" href="#">Link 3</a>
      </div>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="#" data-toggle="dropdown">ebook</a>
      <div class="dropdown-menu">
        <a class="dropdown-item" href="#">Link 1</a>
        <a class="dropdown-item" href="#">Link 2</a>
        <a class="dropdown-item" href="#">Link 3</a>
      </div>
    </li>
    <li class="nav-item">
      <a class="nav-link disabled" href="#">Disabled</a>
    </li>
  </ul>
</nav>

	




</body>
</html>