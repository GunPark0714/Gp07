DROP TABLE IF EXISTS `member`;

CREATE TABLE `member` (
	`me_id`	varchar(15)	NOT NULL PRIMARY KEY,
	`me_fw`	varchar(20)	NULL,
	`Field`	varchar(13)	NULL,
	`me_addr`	varchar(50)	NULL,
	`me_addr_detail`	varchar(50)	NULL,
	`me_post`	char(5)	NULL,
	`me_point`	Int	NULL,
	`me_authority`	varchar(5)	NULL
);

DROP TABLE IF EXISTS `product`;

CREATE TABLE `product` (
	`pr_code`	char(6)	NOT NULL PRIMARY KEY,
	`pr_name`	varchar(20)	NULL,
	`pr_detail`	longtext	NULL,
	`pr_price`	int	NULL
);

DROP TABLE IF EXISTS `option`;

CREATE TABLE `option` (
	`op_num`	int	NOT NULL PRIMARY KEY AUTO_INCREMENT ,
	`op_name`	varchar(20)	NULL,
	`op_amount`	int	NULL,
	`pr_code2`	char(6)	NOT NULL
);

DROP TABLE IF EXISTS `address`;

CREATE TABLE `address` (
	`ad_num`	Int	NOT NULL PRIMARY KEY AUTO_INCREMENT,
	`ad_post`	char(5)	NULL,
	`ad_name`	varchar(15)	NULL,
	`ad_addr`	varchar(50)	NULL,
	`ad_addr_detail`	varchar(50)	NULL,
	`me_id2`	varchar(15)	NOT NULL
);

DROP TABLE IF EXISTS `file`;

CREATE TABLE `file` (
	`fr_num`	int	NOT NULL PRIMARY KEY AUTO_INCREMENT,
	`fr_name`	varchar(50)	NULL,
	`pr_code`	char(6)	NOT NULL
);

DROP TABLE IF EXISTS `point`;

CREATE TABLE `point` (
	`po_num`	int	NOT NULL PRIMARY KEY AUTO_INCREMENT,
	`po_content`	varchar(30)	NULL,
	`po_amount`	int	NULL,
	`po_me_id`	varchar(15)	NOT NULL
);

DROP TABLE IF EXISTS `order`;

CREATE TABLE `order` (
	`or_num`	int	NOT NULL PRIMARY KEY AUTO_INCREMENT,
	`or_total`	int	NULL,
	`or_price`	int	NULL,
	`or_use_point`	int	NULL,
	`or_save_point`	int	NULL,
	`or_status`	varchar(10)	NULL,
	`me_id`	varchar(15)	NOT NULL,
	`ad_num`	Int	NOT NULL
);

DROP TABLE IF EXISTS `order_list`;

CREATE TABLE `order_list` (
	`ol_num`	int	NOT NULL PRIMARY KEY AUTO_INCREMENT,
	`ol_amount`	int	NULL,
	`ol_price`	int	NULL,
	`or_num`	int	NOT NULL,
	`op_num`	int	NOT NULL
);

DROP TABLE IF EXISTS `basket`;

CREATE TABLE `basket` (
	`ba_num`	int	NOT NULL PRIMARY KEY AUTO_INCREMENT,
	`ba_amount`	int	NULL,
	`Field`	VARCHAR(255)	NULL,
	`or_num`	int	NOT NULL,
	`op_num`	int	NOT NULL
);

DROP TABLE IF EXISTS `review`;

CREATE TABLE `review` (
	`re_num`	int	NOT NULL PRIMARY KEY AUTO_INCREMENT,
	`re_content`	longtext	NULL,
	`re_thumb`	varchar(50)	NULL,
	`op_num`	int	NOT NULL,
	`me_id`	varchar(15)	NOT NULL
);



ALTER TABLE `point` ADD CONSTRAINT `PK_POINT` PRIMARY KEY (
	`po_num`
);

