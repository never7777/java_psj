<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
  *{padding: 0;margin: 0;}
  html,body { height:100% }
  ul,li{ list-style: none; }
  a:hover { text-decoration: none;}
  a:link { text-decoration:none; color: inherit;}
  a:visited { text-decoration: none; color: inherit;}

  
  /*왼쪽 입력영역*/
  .right-contanier{
    margin-left: 60px;
  }

  .right-input-box{
    display: flex;
  }
  .img{
    width: 280px; height: 400px;
    background-color: #efefef;
    border: solid 1px;
    text-align: center;
  }
  .flex-container2{
    display: flex;
  }

  .key{
    width: 120px;
    font-size: 16px;
    margin-left: 20px;
  }
  .book-type{
    width:90px; 
    height: 30px;
    margin: 4px;
    border: solid 1px #8f8f9d;
    border-radius: 2px;
    background-color: #ffff;

  }

  .spec-box{
    display: flex;
  }
  .value-input{
    width: 300px;
    height: 32px;
    margin: 4px;
  }
  .ditail-key{
    margin: 11px;
    font-size: 16px;
  }
  .ditail-value-input{
    width: 180px; height: 32px;
  }
  .ditail-info-key, .ditail-index-key{
    margin: 10px; width: 50px;
  }
  .textcontent{
    margin: 0 0 10px 0;
  }
</style>
</head>
<body>
<div class="right-contanier">
  <div class="side-title">
    <h2>도서 등록</h2>
  </div>
  <div>
    <div class="right-input-box">
      <div class="img">
        이미지공간
      </div>
      <div class="right-input">
        <div class="flex-container2">
          <div class=" key">종류</div>
          <div class="vlaue">
            <select class="book-type" name="" id="" >
              <option value="" selected>= 선택 =</option>
              <option value="">국내도서</option>
              <option value="">외국도서</option>
            </select>
            <select class="book-type" name="" id="">
              <option value="" selected>= 선택 =</option>
              <option value="">국내도서</option>
              <option value="">외국도서</option>
            </select>
            <select class="book-type" name="" id="">
              <option value="" selected>= 선택 =</option>
              <option value="">국내도서</option>
              <option value="">외국도서</option>
            </select>
          </div>
        </div>
        <div class="flex-container2">
          <div class="isbn key">ISBN</div>
          <div class="isbn vlaue">
            <input type="text" class="value-input" value="" placeholder="코드를 입력해주세요">
          </div>
        </div>
        <div class="flex-container2">
          <div class="title key">제목</div>
          <div class="title value">
            <input type="text" class="value-input" value="">
          </div>
        </div>
        <div class="flex-container2">
          <div class="title key">저자</div>
          <div class="title value">
            <input type="text" class="value-input" value="">
          </div>
        </div>
        <div class="flex-container2">
          <div class="title key">번역가</div>
          <div class="title value">
            <input type="text" class="value-input" value="">
          </div>
        </div>
        <div class="flex-container2">
          <div class="title key">출판사</div>
          <div class="title value">
            <input type="text" class="value-input" value="">
          </div>
        </div>
        <div class="flex-container2">
          <div class="title key">출판일</div>
          <div class="title value">
            <input type="text" class="value-input" value="">
          </div>
        </div>
        <div class="flex-container2">
          <div class="title key">정가</div>
          <div class="title value">
            <input type="text" class="value-input" value="">
          </div>
        </div>
        <div class="flex-container2">
          <div class="title key">판매가</div>
          <div class="title value">
            <input type="text" class="value-input" value="">
          </div>
        </div>
        <div class="flex-container2">
          <div class="title key">수량</div>
          <div class="title value">
            <input type="text" class="value-input" value="">
          </div>
        </div>
      </div>
    </div>
    <h4>제품상세</h4>
    <div class="spec-box">
      <div class="flex-container2">
        <div class="ditail-key">페이지</div>
        <div class="">
          <input type="text" class="ditail-value-input" value="308쪽">
        </div>
      </div>
      <div class="flex-container2">
        <div class="ditail-key">크기</div>
        <div class="">
          <input type="text" class="ditail-value-input" value="128*188mm (B6)">
        </div>
      </div>
      <div class="flex-container2">
        <div class="ditail-key">무게</div>
        <div class="">
          <input type="text" class="ditail-value-input" value="415g">
        </div>
      </div>
    </div>
    <div class="flex-container2 textcontent">
      <div class="ditail-info-key">책소개</div>
      <div class="">
        <textarea name="" id="" cols="70" rows="10"></textarea>
      </div>
    </div>
    <div class="flex-container2 textcontent" >
      <div class="ditail-index-key">목차</div>
      <div class="">
        <textarea name="" id="" cols="70" rows="10"></textarea>
      </div>
    </div>
  </div>
</div>

</body>
</html>