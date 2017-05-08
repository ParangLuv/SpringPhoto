create table tbl_member(
	userid varchar(50) not null,
	userpw varchar(50) not null,
	username varchar(50) not null,
	email varchar(100),
	regdate timestamp default now(),
	updatedate timestamp default now(),
	primary key(userid)
);

select * from tbl_member;

update tbl_member
set username = #{username}, email = #{email}, updatedate = now()
where userid = #{userid};

update tbl_member
set username = '정창희', email = 'test@naver.com', updatedate = now()
where userid = 'user02';