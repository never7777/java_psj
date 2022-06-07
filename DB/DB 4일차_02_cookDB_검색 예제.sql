-- 각 회원의 구매한 총 개수
-- sum(속성명) : 속성명에 있는 값을 누적합
-- sum(속성명)이 order by 와 같이 사용되면 그룹화한 속성을 기준으로 누적합
 select userId, sum(amount) as 구매량 from buytbl group by userID;

-- 각 회원이 구매한 횟수를 조회
select userID, count(userID) as 구매수 from buytbl group by userID;

-- 각 제품을 산 회원들의 수
select * from buytbl;
select prodName, count(distinct userID) from buytbl group by prodName;

-- 각 구매별 구매금액을 조회(가격 * 수량)
select *, price* amount as 구매금액 from buytbl;

-- 회원별 구매 총금액을 조회 
select userID,sum(price* amount) as 총구매금액 from buytbl group by userID;

-- 회원별 구매 총 금액이 500원 이상인 구매 내역을 조회
select userID, sum(price* amount) as 총구매금액 
	from buytbl 
	group by userID 
	having sum(price* amount)>=500;
select userID, sum(price* amount) as 총구매금액 
	from buytbl 
	group by userID 
	having 총구매금액>=500;
    
-- 가장 많이 구매한 회원의 아이디를 조회
select userID,sum(price* amount) as 총구매금액 from buytbl 
	group by userID
	order by 총구매금액 desc
	limit 1;
-- 	경남에 사는 회원의 수를 조회 

select addr, count(userID) from usertbl where addr = '경남';

-- 각 지역에ㅔ 사는 회원의 수를 조회
select addr, count(userID) as 회원수 from usertbl group by addr; 


-- 경남지역 사는 회원이 구매한 제품 목록 조회 
select distinct prodName from buytbl 
	where userID = any(select userID from usertbl where addr ='경남');
select distinct prodName from buytbl 
	where userID in(select userID from usertbl where addr ='경남');    
