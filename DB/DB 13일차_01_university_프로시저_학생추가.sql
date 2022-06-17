-- 학생이 추가 되면 해당 학생의 담당 교수님을 자동으로 배정하는 프로시저
-- 쿼리의 마지막을 ;대신 //로 사용하겠다는 의미 
-- Procedure를 정의할 때는 Delimiter를 사용하는 이유는 Procedure를 정의할 때 내부에 세미콜론을 사용하기 때문이다.
-- 세미콜론은 문장의 끝을 나타내므로 Delimiter를 설정하지 않으면 문장의 구분이 어렵다.
drop procedure if exists insert_student;
delimiter //
create procedure insert_student (
	in i_st_num char(10),
    in i_st_name varchar(10)
)
begin
	-- _departemen_code라는 변수를 선언
	declare _department_code char(3);
    -- 학생 정보 추가
    insert student(st_num, st_name)values(i_st_num, i_st_name);
	-- 확과 코드 추출
    -- substr(문자열, 시작번지, 개수) : 시작번지부터 개수개 만큼 문자열을 가져옴
    -- substr(문자열, 시작번지): 시작번지부터 끝까지 문자열 가져옴
    -- 시작번지는 1부터 
    set _department_code = substr(i_st_num,5,3);-- department 변수에 '160'문자열을 저장
    -- 학과 코드와 일치하는 교수님을 찾아 지도 교수에 교수 번호를 업데이트
    -- connat(문자열들) : 문자열들을 하나의 문자열로 이어붙임
	update student
		set
			st_pr_num = 
				(select pr_num from professor 
					where pr_num like concat('____', _department_code,'%') limit 1)
		where st_num = i_st_num;
 end//
 delimiter ;
