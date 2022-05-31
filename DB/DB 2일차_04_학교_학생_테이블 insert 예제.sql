-- 학교 데이터베이스 생성하는 쿼리문을 작성하세요.
-- create schema 학교;
-- create database 학교;
create database if not exists 학교;
-- 학교 데이터베이스를 삭제
-- drop database if exists 학교; 

use 학교;

create table if not exists 학생(
	학생번호 	int 	not null auto_increment,
    이름		char(6) not null,
    primary key(학생번호)
);
-- insert into 학생 values (2,'임꺽정');
-- insert into 학생 values('이순신',3); -- 순서가 잘못되어 에러 발생
-- insert into 학생 (학생번호, 이름) values(4, '유관순');
-- insert into 학생 (이름, 학생번호) values ('세종대왕', 5);
-- insert into 학생 (이름) values ('고길동'); -- 학생 번호가 없지만 auto_increment를 통해 다음 숫자가 자동으로 입력됨
-- insert into 학생 (학생번호) values (7); -- 에러 발생 이름이 없어서 NULL이 들어가야하는데 이름은 NOT NULL로 설정했기 때문에 추가할 수 없어서 에러 발생
 
SELECT * FROM 학교.학생;