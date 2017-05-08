CREATE TABLE photomng.user (
	user_id varchar(100) NOT null,
	user_name varchar(100) NOT NULL,
	user_email varchar(100) NOT NULL,
	user_phone varchar(100) NULL,
	user_pw varchar(100) NULL
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8
COLLATE=utf8_general_ci ;
