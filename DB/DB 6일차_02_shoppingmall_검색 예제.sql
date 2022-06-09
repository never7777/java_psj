-- 관리자 정보를 등록하는 쿼리를 작성. 단, 주소는 null, 생일도 null
select * from user;

insert into user (us_id, us_pw, us_authority) values ('admin','admin','ADMIN');

-- 관리자가 다음 제품을 등록
-- 코드 : ABC001  분류 : 상의, 제품명 : 셔츠, 상세 : 셔츠입니다., 가격 : 10000
-- 코드 xs ,  수량 : 10,
-- 코드 s ,  수량 : 10,
-- 코드 m ,  수량 : 10,
-- 코드 l ,  수량 : 10,
-- 코드 xl ,  수량 : 10,

select * from product; 
insert into  product(pr_code, pr_type, pr_title, pr_detail, pr_price) values('ABC001','상의','셔츠', '셔츠입니다',10000 );


select * from `option`; 
insert into `option`(op_size, op_amount, op_pr_code) values
('xs',10,'ABC001'),
('s',10,'ABC001'),
('m',10,'ABC001'),
('l',10,'ABC001'),
('xl',10,'ABC001');
-- alter table user
	-- change us_authority us_authority varchar(5) not null default 'USER';

-- id가 abc123, 비번 abc123, 주소가 청주시, 생일  2000-01-01인 회원이 회원가입을 했다.
select *from user;
insert into user (us_id, us_pw, us_address, us_birth) 
values ('abc123','abc123','청주시','2000-01-01');


-- abc123회원이 ABC001 제품 xl를 구매했을 때 필요한 쿼리문을 작성
-- 구매시 입력한 주소는 청주시
-- insert 
select * from buy;
insert into buy(bu_us_id, bu_op_num, bu_address)
	select 'abc123', op_num, '청주시' from `option`
		where op_pr_code = 'ABC001' and op_size = 'xl';
--  update 재고량 
update `option`set op_amount =  op_amount - 1
	where op_pr_code = 'ABC001' and op_size = 'xl';
    
select * from user;

-- 관리자가 다음 제품을 등록
-- 코드 : DEF001  분류 : 신발, 제품명 : 신상운동화 , 상세 : 신상운동화입니다., 가격 : 20000
-- 크기 220 ,  수량 : 10,
-- 크기 230 ,  수량 : 10,
-- 크기 240 ,  수량 : 10,
-- 크기 250 ,  수량 : 10,
-- 크기 260 ,  수량 : 10,

select * from `option`;
insert into product (pr_code, pr_type, pr_title, pr_detail, pr_price) values 
('DEF001', '신발', '신상운동화', '신상운동화입니다.', 20000);

insert into `option` (op_pr_code, op_size,op_amount) values 
('DEF001', 220, 10),
('DEF001', 230, 10),
('DEF001', 240, 10),
('DEF001', 250, 10),
('DEF001', 260, 10);

-- abc123회원이 DEF001 제품을 220과 260을 구매했다
-- 구매시 주소는 청주시. 
select * from buy;

insert into buy(bu_us_id, bu_op_num, bu_address)
	select 'abc123', op_num, '청주시' from `option`
		where op_pr_code = 'DEF001' and (op_size = 220 or op_size = 260);
-- insert into buy(bu_us_id, bu_op_num, bu_address)
-- select 'abc123', op_num, '청주시' from `option`
-- where op_pr_code = 'DEF001' and op_size in (220, 260);


--  update 재고량 
update `option`set op_amount =  op_amount - 1
	where op_pr_code = 'DEF001' and op_size in('220','260');

-- abc123 회원의 누적 구매액을 조회
select bu_us_id, sum(pr_price) as 누적금액 from buy
	join `option` on op_num = bu_op_num	
	join product on pr_code = op_pr_code
	where bu_us_id = 'abc123';
    
select bu_us_id, sum(pr_price) as 누적금액 
	from (select *from buy where bu_us_id = 'abc123') as tmp
	join `option` on op_num = bu_op_num	
	join product on pr_code = op_pr_code;
    
	
-- 관리자가 다음 제품을 등록
-- 코드 : ABC002  분류 : 상의, 제품명 : 니트 , 상세 : 니트입니다., 가격 : 20000
-- 크기 l ,  수량 : 10,

select * from `option`;
insert into product (pr_code, pr_type, pr_title, pr_detail, pr_price) values 
('ABC002', '상의', '니트', '니트입니다.', 30000);

insert into `option` (op_pr_code, op_size,op_amount) values 
('ABC002', 'l', 10);
    

-- 각 제품별 구매 횟수를 조회(동일 회원 구매도 포함)
select op_pr_code as 제품,  count(bu_num)as 구매쵯수 from buy
	join `option` on bu_op_num = op_num
    group by pr_code;

-- 모든 제품에 대해 각 제품별, 옵션별 구매 횟수를 조회(동일 회원 구매도 포함)
select * from `option`;
select * from `buy`;

select op_pr_code as 제품코드, op_size as 옵션, count(bu_num) as 구매횟수 from buy
	right join `option` on bu_op_num = op_num
	group by op_num;

-- 제품코드가 ABC001인 제품 정보를 조회(제품코드, 제품명, 제품상세, 제품분류, 가격, 구매 가능한 사이즈)

select pr_code, pr_title, pr_detail, pr_type, pr_price, op_size from product
	join `option` on pr_code = op_pr_code 
	where pr_code = 'ABC001' and op_amount>0;

-- abc123 회원이 구매한 제품 목록(제품명)을 조회(중복x) 
-- 제품 코드가 다른데 타이틀(제품명)이 같으면 디스팅트는 합치므로(중복을 제거) 그룹바이를 코드로 지정하는것이 좀 더 정확함. 
select pr_title from buy
	join `option` on bu_op_num = op_num
	join product on op_pr_code =  pr_code
    where bu_us_id = 'abc123'
	group by pr_code;

-- 2000년생 회원들의 구매 제품 목록을 조회 (제품코드)

select op_pr_code as '제품코드' from user
	join  buy on us_id = bu_us_id
	join `option` on bu_op_num= op_num
	where us_birth like '2000%' 
	group by op_pr_code;


select op_pr_code from buy 
	join `option` on bu_op_num= op_num
    join  user on us_id = bu_us_id
    where us_birth like '2000%' 
	group by op_pr_code;
    
select distinct op_pr_code from buy 
	join `option` on bu_op_num= op_num
    join  user on us_id = bu_us_id
    where us_birth between '2000-01-01' and '2000-12-31'; 
