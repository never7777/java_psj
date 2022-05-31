drop database if exists score;
create database if not exists score;
use score;

drop table if exists 학생;
create table if not exists 학생 (
	학생번호 int auto_increment, -- AuTO_increMENT
	학년 	int 	not null default 1,
	반 	int 	not null default 1,
	번호 	int 	not null default 1,
	이름 char(6),
	primary key(학생번호)
);

drop table if exists 성적;
create table if not exists 성적 (
	성적번호 int,
    학년 int default 1,
    학기 int default 1,
    과목명 char (6),
    primary key (성적번호)
);
    
drop table if exists 보유;
create table if not exists 보유 (
	보유번호 int,
    기말 int default 0,
	수행 int default 0,
	중간 int default 0,
    학생번호 int,
    성적번호 int,
    primary key (보유번호),
	-- foreign key(학생번호) reference 학생(학생번호),
    -- foreign key(성적번호) reference 성적(성적번호),
    check(기말 >=0&& 기말<=100),
    check(중간 >=0&& 기말<=100),
    check(수행 >=0&& 기말<=100)
);
-- auto_increment는 기본키로 지정된 속성에 설정하는 키워드기 때문에, 테이블을 생성후 alter를 이용하여 변경
alter table 학생 
	change 학생번호 학생번호 int auto_increment;
alter table 성적 
	change 성적번호 성적번호 int auto_increment;
alter table 보유 
	change 보유번호 보유번호 int auto_increment;
    
-- 외래키로 지정된 기본키의 옵션을 수정할 수 없기 때문에 각 기본키를 auto_increment로 설정 후 외래키 지정
alter table 보유
	add foreign key(학생번호) references 학생(학생번호);
alter table 보유
	add foreign key(성적번호) references 학생(성적번호);
