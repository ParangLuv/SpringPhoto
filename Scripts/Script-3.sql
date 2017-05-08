create table `user`(
	user_id varchar(40) not null,
	user_pw varchar(40) not null,
	user_name varchar(20) not null,
	user_email varchar(100) not null,
	user_phone varchar(12) not null,
	primary key (user_id)
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8
COLLATE=utf8_general_ci ;

create table `photo`(
	photo_id bigint(20) unsigned not null AUTO_INCREMENT,
	photo_name varchar(255) not null,
	photo_file blob,
	primary key(photo_id)
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8
COLLATE=utf8_general_ci ;
