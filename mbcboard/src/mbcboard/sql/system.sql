-- 한줄씩 블럭설정 후 alt + c 실행
create user boardtest identified by boardtest 
grant resource, connect to boardtest 
alter user boardtest default tablespace users 
alter user boardtest temporary tablespace temp 

drop user boardtest
