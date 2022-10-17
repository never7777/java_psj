<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
 *{padding: 0; margin: 0; }
  ul,ol,li{ list-style: none; }

  html, body{width: 100%;}
  /*표*/
  table, tb{
    margin:auto;
  }
  .list-box{
    width: 900px;
    margin:auto;
  }
  .checkbox-sell{
    width: 15px;
  }
  .checkbox{
    position:relative;
    margin: 8px;
  }
  .cover{
    width:167px; height:239px;
  }
  .information{
    width:430px; height:160px;
  }
  .book-title{
   font-weight: bold;
  }
  .btn-list{
    width:80px; height:160px;
  }
  .btn-baskit, .btn-buy-now, .btn-locker{
    display: block;
    background-color: #007bff;
    border: none;
    border-radius: 5px;
    color: white;
    font-size:12px;
    text-align:center;
    width: 63px;
    padding: 9px 0 8px 0;
    margin-top: 15px ;
  }
  .btn-baskit:hover, .btn-buy-now:hover, .btn-locker:hover{
    color: white;
    background-color: #0070e8;
    text-decoration: none;
  }
  .b{
    border: solid 1px;
    width: 900px; height:100px;
  }
  .b td{
    border: solid 1px;
    font-size: 20px;
  }
  .order-button{
    margin-top: 20px;
    width: 900px; height:50px;
    background-color: #007bff;
    border: none;
    border-radius: 5px;
    color: white;
  }
  .order-button:hover{
    background-color: #0070e8;
  }
</style>
</head>
<body>
<div class="list-box">
  <table class="a">
    <tbody>
      <tr>
        <td class="checkbox-sell">
          <input type="checkbox" class="checkbox" name="" id="">
        </td>
        <td class="cover">
          <img src="img/bookSample1.jpg" alt="" width="150px" height="220px">
        </td>
        <td class="information">
          <ui class="information-list">
            <li class="book-title">타이탄의 도구들</li>
            <li>김훈 | 문학동네 | 2022년8월 </li>
            <li>15000원</li>
            <li>별점</li>
          </ui>
        </td>
        <td class="btn-list">
          <a href="" class="btn-baskit">장바구니</a>
          <a href="" class="btn-buy-now">바로구매</a>
          <a href="" class="btn-locker">보관함</a>
        </td>
      </tr>
    </tbody>
  </table>
</div>
<div class="list-box">
  <table class="b">
    <tr>
      <td>총 상품금액</td>
      <td>총 결재 예상금액</td>
    </tr>
    <tr>
      <td>25000</td>
      <td>25000</td>
    </tr>
  </table>
  <button class="order-button">선택한 상품 주문하기</button>
</div>
</body>
</html>