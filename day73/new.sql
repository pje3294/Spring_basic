select * from all_tables;

select * from book;


-- 도서

create table book( 
	id int primary key,
	title varchar(50),
	writer varchar(30),
	publisher varchar(20),
	pdate date default sysdate
)

-- 회원
create table member( 
	id varchar(15) primary key,
	password varchar(15),
	name varchar(15),
	role varchar(15)
)


insert into book (id, title, writer,publisher) values (1,'가','나','다');
insert into book (id, title, writer,publisher) values (2,'라','마','사');

insert into member (id, password, name,role) values ('id','pw','이름','회원');

select * from book where title like '%라%';




