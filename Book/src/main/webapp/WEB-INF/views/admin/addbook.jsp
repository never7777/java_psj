<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
* {
	padding: 0;
	margin: 0;
}

html, body {
	height: 100%
}

ul, li {
	list-style: none;
}

a:hover {
	text-decoration: none;
}

a:link {
	text-decoration: none;
	color: inherit;
}

a:visited {
	text-decoration: none;
	color: inherit;
}

/*왼쪽 입력영역*/
.right-contanier {
	margin-left: 60px;
}

.right-input-box {
	display: flex;
}

.img {
	width: 280px;
	height: 400px;
	background-color: #efefef;
	border: solid 1px;
	text-align: center;
	font-size: 30px;
	line-height: 400px;
	cursor: pointer;
}

[name=file] {
	display: none;
}

#preview {
	display: none;
	width: 280px;
	height: 400px;
	cursor: pointer;
}

.flex-container2 {
	display: flex;
}

.key {
	width: 120px;
	font-size: 16px;
	margin-left: 20px;
}

.book-type {
	width: 90px;
	height: 30px;
	margin: 4px;
	border: solid 1px #8f8f9d;
	border-radius: 2px;
	background-color: #ffff;
}

.spec-box {
	display: flex;
}

.value-input {
	width: 300px;
	height: 32px;
	margin: 4px;
}

.ditail-key {
	margin: 11px;
	font-size: 16px;
}

.ditail-value-input {
	width: 180px;
	height: 32px;
}

.ditail-info-key, .ditail-index-key {
	margin: 10px;
	width: 50px;
}

.textcontent {
	margin: 0 0 10px 0;
}

.add-btn {
	width: 100px;
	hight: 50px;
}
</style>
</head>
<body>
	<div class="right-contanier">
		<div class="side-title" enctype="multipart/form-data">
			<h2>도서 등록</h2>
		</div>
		<form>
			<div class="right-input-box">
				<div class="img">+</div>
				<input type="file" name="file"> <img id="preview">
				<div class="right-input">
					<div class="flex-container2">
						<div class=" key">종류</div>
						<div class="vlaue">
							<select class="book-type" name="" id="">
								<option value="" selected>= 선택 =</option>
								<c:forEach items="${largeList}" var="la">
									<option value="${la.la_code} ">${la.la_name}</option>
								</c:forEach>
							</select> <select class="book-type" name="" id="">
								<option value="" selected>= 선택 =</option>
								<c:forEach items="${mediumList}" var="me">
									<option value="${me.me_code}">${me.me_name}</option>
								</c:forEach>
							</select> <select class="book-type" name="" id="">
								<option value="" selected>= 선택 =</option>
								<c:forEach items="${smallList}" var="sm">
									<option value="${sm.sm_code}">${sm.sm_name}</option>
								</c:forEach>
							</select>
						</div>
					</div>
					<div class="flex-container2">
						<div class="isbn key">ISBN</div>
						<div class="isbn vlaue">
							<input type="text" class="value-input" name="bo_isbn" value="" placeholder="">
						</div>
					</div>
					<div class="flex-container2">
						<div class="title key">제목</div>
						<div class="title value">
							<input type="text" class="value-input" name="bo_title" value="" placeholder="">
						</div>
					</div>
					<div class="flex-container2">
						<div class="title key">저자</div>
						<div class="title value">
							<input type="text" class="value-input" name="bo_author" value="" placeholder="">
						</div>
					</div>
					<div class="flex-container2">
						<div class="title key">번역가</div>
						<div class="title value">
							<input type="text" class="value-input" name="bo_translator" value="">
						</div>
					</div>
					<div class="flex-container2">
						<div class="title key">출판사</div>
						<div class="title value">
							<input type="text" class="value-input" name="bo_publisher" value="">
						</div>
					</div>
					<div class="flex-container2">
						<div class="title key">출판일</div>
						<div class="title value">
							<input type="text" class="value-input" name="bo_date" value="">
						</div>
					</div>
					<div class="flex-container2">
						<div class="title key">정가</div>
						<div class="title value">
							<input type="text" class="value-input" name="bo_price" value="">
						</div>
					</div>
					<div class="flex-container2">
						<div class="title key">판매가</div>
						<div class="title value">
							<input type="text" class="value-input" name="bo_sale_price" value="">
						</div>
					</div>
					<div class="flex-container2">
						<div class="title key">수량</div>
						<div class="title value">
							<input type="text" class="value-input" name="bo_ea" value="">
						</div>
					</div>
				</div>
			</div>
			<h4>제품상세</h4>
			<div class="spec-box">
				<div class="flex-container2">
					<div class="ditail-key">페이지</div>
					<div class="">
						<input type="text" class="ditail-value-input" name="bo_detail_page" value=""
							placeholder=" ex) 300p">
					</div>
				</div>
				<div class="flex-container2">
					<div class="ditail-key">크기</div>
					<div class="">
						<input type="text" class="ditail-value-input" name="bo_detail_size" value=""
							placeholder=" ex) 128*188mm (B6)">
					</div>
				</div>
				<div class="flex-container2">
					<div class="ditail-key">무게</div>
					<div class="">
						<input type="text" class="ditail-value-input" name="bo_detail_weight" value=""
							placeholder=" ex) 415g">
					</div>
				</div>
			</div>
			<div class="flex-container2 textcontent">
				<div class="ditail-info-key">책소개</div>
				<div class="bo_intro">
					<textarea name="" id="" cols="70" rows="10"></textarea>
				</div>
			</div>
			<div class="flex-container2 textcontent">
				<div class="ditail-index-key">목차</div>
				<div class="">
					<textarea name="bo_index" id="" cols="70" rows="10"></textarea>
				</div>
			</div>
			<button class="add-btn">등록</button>
		</form>
	</div>
	<script type="text/javascript">
		$(function() {
			$('.img, #preview').click(function() {
				$('[name=file]').click();
			})

			$('[name=file]').on('change', function(event) {
				if (event.target.files.length == 0) {
					$('.img').show();
					$('#preview').hide();
				} else {
					$('.img').hide();
					$('#preview').show();
				}
				var file = event.target.files[0];
				var reader = new FileReader();
				reader.onload = function(e) {
					$('#preview').attr('src', e.target.result);
				}
				reader.readAsDataURL(file);
			});
		})
/*		
	function ajaxPost(async, dataObj, url, success){
	$.ajax({
	  async:async,
	  type:'POST',
	  data:JSON.stringify(dataObj),
	  url:"<%=request.getContextPath()%>"+url,
	  dataType:"json",
	  contentType:"application/json; charset=UTF-8",
	  success : function(data){
		  success(data);
	  }
  });
}
*/
	</script>

</body>
</html>