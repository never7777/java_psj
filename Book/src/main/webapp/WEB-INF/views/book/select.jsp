<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.4.1.js"></script>
<style>
 *{padding: 0; margin: 0; }
  ul,ol,li{ list-style: none; }
  a{text-decoration: none;}

  html, body{width: 100%; 
  display: flex;
    justify-content: center;
  }

  .container-top-level{
    width: 800px;
  }
  .title{
    font-size: 26px;
    font-weight: bold;
  }
  .sub-information{
    border-bottom: solid 2px #d5d5d5; 
  }

  .flex-container{
    display: flex;
  }
  .corver{
    width: 380px;
    height: 500px;
  }
  .flex-container2{
    display: flex;
    margin-top: 10px;
  }
  .information{
    width: 300px;
  }
  .empty{
    height: 150px;
  }
  .key{
    width: 100px;
  }
  .sale-prcie-value{
    font-size: 26px;
  }
  .top-btn, .down-btn{
    width: 20px; height: 13px;
    background-color: #f8f8f8;
    border: solid 1px #cdcdcd;
  }
  
  .down-btn{
    border-top:none;
    height: 12px;
  }
  .top-btn, .down-btn:hover{
   cursor: pointer;
  }
  
  
  .input-ea{
    width: 26px;
    height: 26px;
    border: solid 1px #cdcdcd;
    border-right: none;
  }
  .ea-value{
    display: flex;
  }
  .button-box{
    display: flex;
    justify-content: center;
    margin-top: 20px;
  }
  .btn-baskit, .btn-buy-now, .btn-locker{
    display: block; 
    background-color: #007bff;
    border: none;
    border-radius: 5px;
    color: white;
    font-size:15px;
    text-align:center;
    width: 82px;
    padding: 9px 0 8px 0;
    margin: 0 6px 0 6px;
  }
  .btn-baskit:hover, .btn-buy-now:hover, .btn-locker:hover{
    color: white;
    background-color: #0070e8;
    text-decoration: none;
  }
  .cantainer-2{
    display: flex;
    border-top: solid 2px #d5d5d5;
  }
  .coulm{
    width: 150px;
  }
  .content{
    /*책소개 컬럼 혼자 따로 놀아서 공간 줌*/
    width: 800px;
  }
</style>
</head>
<body>
<div class="container-top-level">
  <div class="box">
    <div class="box-1">
      <div class="title">${b.bo_title}</div>
      <div class="sub-information">
      ${b.bo_author} (지은이) 
      <c:if test="b.bo_translator != null">
      	${b.bo_translator} (옮긴이) 
      </c:if>
      ${b.bo_publisher} 
      ${b.bo_date_str} </div>
    </div>
  </div>
  <div class="flex-container">
    <div class="corver">
      <img id ="corver-preview" width="380px" height="500px" src="<c:url value="${b.bo_thum_url}"></c:url>">
    </div>
    <div class="information">
      <div class="empty">
      </div>
      <div class="flex-container2">
        <div class="prcie key">정가</div>
        <div class="prcie-value">${b.bo_price}</div>
      </div>
      <div class="flex-container2">
        <div class="prcie key">할인가</div>
        <div class="sale-prcie-value">${b.bo_sale_price}</div>
      </div>
      <div class="flex-container2">
        <div class="prcie key">별점</div>
        <div class="prcie-value">OOOOO</div>
      </div>
      <div class="flex-container2">
        <div class="ea key">수량</div>
        <div class="ea-value">
          <input type="text" class="input-ea" value="1">
          <div>
            <div class="top-btn" id="top-btn"></div>
            <div class="down-btn" id="down-btn"></div>
          </div>
        </div>
      </div>
      <div class="button-box" >
          <a href="" class="btn-baskit">장바구니</a>
          <a href="<c:url value="/order"></c:url>" class="btn-buy-now">바로구매</a>
          <a href="" class="btn-locker">보관함</a>
      </div>
    </div>
  </div>
  <div>
    <div class="cantainer-2">
      <div class="spec coulm">
        기본정보 
      </div>  
      <div class="spec content">
        ${b.bo_detail_page}쪽
        ${b.bo_detail_size}mm
        ${b.bo_detail_weight}g
        ISBN : 
        ${b.bo_isbn}
      </div>
    </div>
    <div class="cantainer-2">
      <div class="info coulm">
        책소개  
      </div>  
      <div class="info content">
       <p>${b.bo_intro} </p>
      </div>
    </div>
    <div class="cantainer-2">
      <div class="index coulm">
        목차
      </div>  
      <div class="index content" >
      	  ${b.bo_index}
      </div>
    </div>  
  </div>
</div>
<script type="text/javascript">

//수량변경
$(function(){
  $('.top-btn').click(function(){
    var ea = parseInt($('.input-ea').val())
    $('.input-ea').val(ea + 1)
  }) 
  $('.down-btn').click(function(){
    var ea = parseInt($('.input-ea').val())
    $('.input-ea').val(ea - 1)
  })
});


</script>

</body>
</html>