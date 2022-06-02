-- 1970년 이후에 출생한 사람의 아이디와 이름을 조회
select userName, userID from usertbl where birthYear>=1970;

-- 회원의 키가 180~182인 사람의 이름과 키를 조회 
-- between 이상 이하할때만 가능. 이상 미만X, 이하 초과 X 
select userName, height from usertbl where height between 180 and 182;
select userName, height from usertbl where height >=180 and height<=182;

-- 지역이 경남이거나 충남이거나 경북인 사람의 이름과 주소를 조회
select userName, addr from usertbl where addr in('경남','충남','경북');
select userName, addr from usertbl where addr = '경남' or addr = '충남'or addr = '경북';

-- 성이 김씨인 회원의 이름과 키를 조회
select userName, height from usertbl where userName like '김%';

-- 1970년대 출생한 회원의 아이디와 이름을 조회
select userID, userName from usertbl where birthyear like '197_';
select userID, userName from usertbl where birthyear >= 1970 and birthyear < 1980;
select userID, userName from usertbl where birthyear between 1970 and 1979;

-- 2013년에 가입한 회원의 모든 정보를 조회 -- 숫자에 ''을 붙여도 인식됨.=> 숫자를 문자로 취급해도 spl 작동됨
select * from usertbl where mDate like '2013%';
select * from usertbl where mDate like '2013-__-__';
select * from usertbl where mDate like '2013______';

-- KHD 회원의 구매한 제품을 조회
select prodName from buytbl where userID ='KHD'; 

-- 회원의 키가 180~182인 회원중 경북에 사는 회원 정보를 조회
select * from usertbl where height between 180 and 182 and addr = '경북';

-- 회원의 키가  180미만이거나 182 초과인 회원 정보를 조회
select * from usertbl where height < 180 or height > 182;
select * from usertbl where !(height between 180 and 182);

-- 회원의 키가 180 미만이거 나 182 초과인 회원 중 경남에 사는 회원 정보를 조회
select * from usertbl where (height < 180 or height > 182) and addr = '경남';

-- 김용만 회원보다 큰 회원 정보를 조회 (안쪽 쿼리에 속성이 하나만 들어가야함. )
select * from usertbl where height > (select height from usertbl where userName = '김용만');
-- 경기 지역에 사는 회원 중 가장 큰 회원보다 큰 회원 정보를 조회 
select * from usertbl where height > All(select height from usertbl where addr = '경기');
-- 경기 지역에 사는 회원 중 가장 작은 회원보다 큰 회원 정보를 조회
select * from usertbl where height > any(select height from usertbl where addr = '경기');
-- KHD 회원이 구매한 제품과 동일한 제품을 구매한 회원 정보를 조회
select * from  buytbl where prodName = any(select prodName from buytbl where userID ='KHD'); 
select * from  buytbl where prodName in(select prodName from buytbl where userID ='KHD');-- =any 는 in으로 바꿔쓸수 있음 
-- KHD 회원이 구매한 제품과 동일한 제품을 구매한 회원 아이디만 조회
select userID from  buytbl where userID != 'KHD' and prodName = any(select prodName from buytbl where userID ='KHD'); 

-- 구매 목록을 userID와 prodName 순으로 정렬하여 조회
select * from buytbl order by userID asc, prodName asc;

-- 회원들이 구매한 제품 목록을 조회(중복제거)
select distinct prodName from buytbl;

