create table member(
mno number(5) not null,
bwriter nvarchar2(10) not null, 
id nvarchar2(10) primary key,
-- board테이블에 bwriter와 FK로 관계설정 (타입 일치해야함)
pw nvarchar2(10) not null,
regidate date default sysdate not null
)
-- 시퀀스 객체는 이미 만들어져있는게 있으니 board_seq를 같이 사용.
drop table member -- member테이블 삭제용

-- 부모 더미데이터 입력
insert into member (mno, bwriter, id, pw)
values (board_seq.nextval, '김기원', 'kkw'，'1234')
insert into member (mno, bwriter, id, pw)
values (board_seq.nextval, '이현우', 'lee', '1234')
insert into member (mno, bwriter, id, pw)
values (board_seq.nextval, '오승환', 'oh', '1234')
insert into member (mno, bwriter, id, pw)
values (board_seq.nextval, '전민기', 'jmg', '1234')
insert into member (mno, bwriter, id, pw)
values (board_seq.nextval, '김보령', 'kim', '1234')

select * from member

select * from member order by mno asc

--select  count(*) from  member where  id = 'kjw' 회원가입 시 아이디 중복 확인문

delete from member

insert into member(mno, bwriter, id, pw, regidate) 
	values(board_seq.nextval, '김진우', 'kjw', '1234', sysdate)
--------------------------------------------------------------------------------------------------------------------------------
drop table board --기존에 board 테이블 삭제
drop sequence board_seq -- 자동번호 생성 제거

create table board(
bno number(5) primary key,
btitle nvarchar2(30) not null,
bcontent nvarchar2(1000) not null,
bwriter nvarchar2(10) not null,
bdate date not null
)

create sequence board_seq increment by 1 start with 1 nocycle nocache 

alter table board add constraint board_member_fk foreign key (bwriter) references member(id)
-- board 테이블은 member의 자식 테이블로 member에 mneme과 board에 bwtiter를 관계설정 (외래키)
delete from board -- 조건없이 delete를 실행하면 모든 데이터가 삭제됨 > 외래키 다시 지정

insert into BOARD (bno, btitle, bcontent, bwriter, bdate)
values (board_seq.nextval, '덥내용~', '무더운데 등교하시는냐고 고생 하셨습니다.', 'kkw', sysdate)
insert into BOARD (bno, btitle, bcontent, bwriter, bdate)
values (board_seq.nextval, '안녕하세요~', '무더운데 등교하시는냐고 고생 하셨습니다.', 'lee', sysdate)
insert into BOARD (bno, btitle, bcontent, bwriter, bdate)
values (board_seq.nextval, '감사합니다.~', '무더운데 등교하시는냐고 고생 하셨습니다.', 'oh', sysdate)
insert into BOARD (bno, btitle, bcontent, bwriter, bdate)
values (board_seq.nextval, '수고하셨내요~', '무더운데 등교하시는냐고 고생 하셨습니다.', 'kim', sysdate)
insert into BOARD (bno, btitle, bcontent, bwriter, bdate)
values (board_seq.nextval, '화이팅하세요~', '무더운데 등교하시는냐고 고생 하셨습니다.', 'jmg', sysdate)
insert into BOARD (bno, btitle, bcontent, bwriter, bdate)
values (board_seq.nextval, '방갑습니다.~', '무더운데 등교하시는냐고 고생 하셨습니다.', 'kim', sysdate)

select * from board