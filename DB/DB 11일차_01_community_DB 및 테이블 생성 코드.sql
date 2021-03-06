drop database if exists community;
create database community; 
use community;

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
	`us_id`	varchar(20)	NOT NULL,
	`us_pw`	varchar(15)	NOT NULL,
	`us_name`	varchar(100) NOT NULL,
	`us_addr`	varchar(200) NOT NULL  default '',
	`us_phone`	char(13)	NOT NULL ,
	`us_authority`	int	NOT NULL default 1
);

DROP TABLE IF EXISTS `board`;

CREATE TABLE `board` (
	`bd_num`	int	NULL,
	`bd_ca_name`	varchar(10)	NOT NULL,
	`bd_title`	varchar(100)NOT NULL,
	`bd_contents`	longtext NOT NULL,
	`bd_us_id`	varchar(20)	NOT NULL,
	`bd_reg_date`	datetime NOT NULL default current_timestamp,
	`bd_up_date`	datetime	NULL,
	`bd_views`	int NOT NULL default 0,
	`bd_del`	int	NOT NULL default 0,
	`bd_depth`	int	NOT NULL default 1,
	`bd_ori_num`	int	NULL,
	`bd_secret`	int	NOT NULL default 0
);

DROP TABLE IF EXISTS `category`;

CREATE TABLE `category` (
	`ca_name`	varchar(10)	NOT NULL,
	`ca_r_authority`	int	NOT NULL default 0,
	`ca_w_authority`	int	NOT NULL default 0,
	`ca_secret_pos`	int	NOT NULL default 0
);

DROP TABLE IF EXISTS `file`;

CREATE TABLE `file` (
	`fi_num`	int	NOT NULL,
	`fi_ori_name`	varchar(100)	NOT NULL,
	`fi_name`	varchar(150)	NOT NULL,
	`fi_bd_num`	int	NOT NULL
);

DROP TABLE IF EXISTS `likes`;

CREATE TABLE `likes` (
	`li_num`	int	NOT NULL,
	`li_us_id`	varchar(20)	NOT NULL,
	`li_state`	int	NOT NULL,
	`li_target`	varchar(10)	NOT NULL default 'board',
    `li_target_num`	int	NOT NULL
);

DROP TABLE IF EXISTS `comment`;

CREATE TABLE `comment` (
	`co_num`	int	NOT NULL,
	`co_contents`	longtext	NOT NULL,
	`co_us_id`	varchar(20)	NOT NULL,
	`co_bd_num`	int	NOT NULL,
	`co_reg_date`	datetime	NOT NULL default now(),
	`co_secret`	int	NOT NULL default 0,
	`co_ori_num`	int NULL,
	`co_depth`	int	NOT NULL default 1,
	`co_del`	int	NOT NULL default 0
);

ALTER TABLE `user` ADD CONSTRAINT `PK_USER` PRIMARY KEY (
	`us_id`
);

ALTER TABLE `board` ADD CONSTRAINT `PK_BOARD` PRIMARY KEY (
	`bd_num`
);



ALTER TABLE `category` ADD CONSTRAINT `PK_CATEGORY` PRIMARY KEY (
	`ca_name`
);

ALTER TABLE `file` ADD CONSTRAINT `PK_FILE` PRIMARY KEY (
	`fi_num`
);



ALTER TABLE `likes` ADD CONSTRAINT `PK_LIKES` PRIMARY KEY (
	`li_num`
);

ALTER TABLE `comment` ADD CONSTRAINT `PK_COMMENT` PRIMARY KEY (
	`co_num`
);

-- ???????????? ????????? ??????????????? ????????? ????????? ?????????. 
-- bd_num??? auto_increment??? ???????????? ?????????
alter table board change bd_num bd_num int not null auto_increment;
alter table file change fi_num fi_num int not null auto_increment;
alter table likes change li_num li_num int not null auto_increment;
alter table comment change co_num co_num int not null auto_increment;



ALTER TABLE `board` ADD CONSTRAINT `FK_category_TO_board_1` FOREIGN KEY (
	`bd_ca_name`
)
REFERENCES `category` (
	`ca_name`
);

ALTER TABLE `board` ADD CONSTRAINT `FK_user_TO_board_1` FOREIGN KEY (
	`bd_us_id`
)
REFERENCES `user` (
	`us_id`
);

ALTER TABLE `board` ADD CONSTRAINT `FK_board_TO_board_1` FOREIGN KEY (
	`bd_ori_num`
)
REFERENCES `board` (
	`bd_num`
);

ALTER TABLE `file` ADD CONSTRAINT `FK_board_TO_file_1` FOREIGN KEY (
	`fi_bd_num`
)
REFERENCES `board` (
	`bd_num`
);

ALTER TABLE `likes` ADD CONSTRAINT `FK_user_TO_likes_1` FOREIGN KEY (
	`li_us_id`
)
REFERENCES `user` (
	`us_id`
);

ALTER TABLE `comment` ADD CONSTRAINT `FK_user_TO_comment_1` FOREIGN KEY (
	`co_us_id`
)
REFERENCES `user` (
	`us_id`
);

ALTER TABLE `comment` ADD CONSTRAINT `FK_board_TO_comment_1` FOREIGN KEY (
	`co_bd_num`
)
REFERENCES `board` (
	`bd_num`
);

ALTER TABLE `comment` ADD CONSTRAINT `FK_comment_TO_comment_1` FOREIGN KEY (
	`co_ori_num`
)
REFERENCES `comment` (
	`co_num`
);

select * from user;

-- ?????????????????? ???????????? ?????? ????????? : admin123 ?????? : admin123, ?????? : ?????????, ?????? : 000-0000-0000
insert into user(us_id, us_pw, us_name, us_phone, us_authority) 
			values('admin123','admin123','?????????','000-0000-0000',10);
            
insert into user(us_id, us_pw, us_name, us_phone, us_authority)
	values ('abcd1234','abcd1234','?????????','020-1234-5678',1),
	('qwer1234','qwer1234','?????????','030-1234-5678',1);
    

-- ???????????? ????????? ????????? ????????????, ??????, ??????????????? ???????????? ????????? 
-- ??????????????? ?????? ???????????? ????????? ??? ??????, ??????????????? ?????? ??? ??????
-- ????????? ???????????? ????????? ??? ??????, ???????????? ?????? ??? ?????? 
-- ??????????????? ???????????? ????????? ??? ??????, ?????? ????????? ?????? ??? ??????, ???????????? ????????? ??? ??????      
insert into category (ca_name,ca_w_authority, ca_r_authority,ca_secret_pos)
	values ('????????????',10,1,0),('??????',1,0,0),('????????????',1,1,1);


-- abcd1234 ????????? ?????? ???????????? ??????: ???????????????  ?????? : ????????? ???????????????. ?????? ?????? ????????????
-- ?????????????????? ??????????????? ??????: ???????????? 1 ??????: ??????????????????????????? ?????? ????????????.
-- qwer1234????????? ?????? ???????????? ??????: ??????????????? ??????: ????????? ????????? ?????? ?????? ???????????? ????????????.
insert into board(bd_ca_name,bd_title, bd_contents, bd_us_id, bd_secret)
	values('??????', '???????????????', '????????? ???????????????.', 'abcd1234', 0),
	('????????????', '????????????1', '?????????????????????.', 'admin123', 0),
	('????????????', '???????????????', '????????? ????????? ?????????.', 'qwer1234', 1);
update board set bd_ori_num = bd_num where bd_ori_num is null;

insert into board(bd_ca_name,bd_title, bd_contents, bd_us_id, bd_secret,bd_ori_num)
	select '??????', '???????????????1', '????????? ???????????????1.', 'abcd1234', 0, ifnull(max(bd_num),0)+1
		from board;
        
        
-- admin123???????????? 3??? ???????????? ????????? ??????. ?????? : ???????????? ????????? ???????????????. ?????? : ??????????????? ???????????????.
-- (bd_depth=>2)
insert into board(bd_ca_name, bd_title, bd_contents, bd_us_id, bd_secret, bd_ori_num, bd_depth)
	select '????????????', '???????????? ????????? ???????????????.', '??????????????? ???????????????','admin123', 0,
		bd_ori_num,bd_depth+1 from board
        where bd_num=3;
        
-- qwer1234????????? 5??? ???????????? ????????? ??????. ?????? : ????????? ?????????.?????? : ??????????????? ???????????? ????????????.
insert into board(bd_ca_name, bd_title, bd_contents, bd_us_id, bd_secret, bd_ori_num, bd_depth)
	select '????????????', '????????? ?????????', '???????????? ???????????? ????????????.','qwer1234', 0,
		bd_ori_num, bd_depth+1 from board
        where bd_num=5;

-- 3??? ???????????? ?????? ?????? ??? ????????? ??????=> ????????? ??????
update board set bd_views = bd_views+1
where bd_num = 3 ;

-- ??????/???????????? ??????=> ?????? ?????????/????????? ???????????? ?????? ??????/???????????? ??????=> ??????, ?????? ?????? => ??????(??????)

 -- 1??? ???????????? qwer1234 ????????? ???????????? ??? ????????? (???????????? ????????????, ?????? ????????? ??????????????? ??????)
 select * from likes;
 insert into likes (li_us_id, li_state, li_target, li_target_num)
 values ('qwer1234',1,'board',1);
 
 -- qwer1234????????? 1??? ???????????? ????????? ?????? ??? ?????? ????????? ???????????? ??? ?????????
update likes set li_state = 0
	where li_us_id ='qwer1234' and li_target_num = 1 and li_target ='board' ;
 
delete from likes 
	where li_us_id ='qwer1234' and li_target_num = 1 and li_target ='board';
    
-- ??????, , ???????????????2, ???????????????
-- ??????????????? 2??? ?????? ?????? ???????????? ??????. ??????????????? ????????? ??? ?????????????????? ???????????? ????????? ????????? ??????
-- ??????????????? : a.txt, uuid_a.txt
-- ??????????????? : b.txt, uuid_b.txt
-- ???????????? ??????  => insert 

insert into board(bd_ca_name, bd_us_id, bd_title, bd_contents, bd_us_idm, bd_secret, bd_ori_num) 
	select '??????', 'abcd123','???????????????2','???????????????', 0, ifnull(max(bd_num),0)+1 from borad;

-- ???????????? ??????  => insert 
insert into file(fi_ori_name, fi_name, fi_bd_num) 
	values ('a.txt', 'uuid_a.txt',7), ('b.txt', 'uuid_b.txt',7)
