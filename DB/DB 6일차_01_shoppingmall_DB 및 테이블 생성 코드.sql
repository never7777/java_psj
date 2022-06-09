drop database if exists shoppingmall;
create database if not exists shoppingmall;
use shoppingmall;

drop table if exists `user`;
CREATE TABLE if not exists `user` (
	`us_id`	varchar(20)	NOT NULL,
	`us_pw`	varchar(16)	NULL,
	`us_birth`	date	NULL,
	`us_address`	varchar(100)	NULL,
	`us_authority`	varchar(5)	NULL
);
drop table if exists `product`;
CREATE TABLE if not exists`product` (
	`pr_code`	char(6)	NOT NULL,
	`pr_title`	varchar(30)	NULL,
	`pr_detail`	longtext	NULL,
	`pr_price`	int	NULL,
	`pr_type`	varchar(10)	NULL
);
drop table if exists `option`;
CREATE TABLE if not exists `option` (
	`op_num`	int	NOT NULL auto_increment,
	`op_size`	varchar(10)	NULL,
	`op_amount`	int	NULL,
	`op_pr_code`	char(6)	NOT NULL,
    primary key(op_num)
);

drop table if exists `buy`;
CREATE TABLE if not exists `buy` (
	`bu_num`	int	NOT NULL auto_increment,
	`bu_address`	varchar(100)	NULL,
	`bu_us_id`	varchar(20)	NOT NULL,
	`bu_op_num`	int	NOT NULL,
    primary key(bu_num)
);


ALTER TABLE `user` ADD CONSTRAINT `PK_USER` PRIMARY KEY (
	`us_id`
);


ALTER TABLE `product` ADD CONSTRAINT `PK_PRODUCT` PRIMARY KEY (
	`pr_code`
);



ALTER TABLE `option` ADD CONSTRAINT `FK_product_TO_option_1` FOREIGN KEY (
	`op_pr_code`
)
REFERENCES `product` (
	`pr_code`
);

ALTER TABLE `buy` ADD CONSTRAINT `FK_user_TO_buy_1` FOREIGN KEY (
	`bu_us_id`
)
REFERENCES `user` (
	`us_id`
);


ALTER TABLE `buy` ADD CONSTRAINT `FK_option_TO_buy_1` FOREIGN KEY (
	`bu_op_num`
)
REFERENCES `option` (
	`op_num`
);

