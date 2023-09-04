CREATE TABLE `member` (
  `me_id` varchar(30) NOT NULL,
  `me_pw` varchar(255) NOT NULL,
  `me_email` varchar(45) NOT NULL,
	PRIMARY KEY (`me_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;