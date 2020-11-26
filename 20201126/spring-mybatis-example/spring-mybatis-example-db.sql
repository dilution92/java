drop table users;

CREATE TABLE users (
    id number primary key,
    email varchar2(128) not null unique,
    password varchar2(128) not null,
    joinedDate timestamp not null
);

CREATE SEQUENCE user_id_pk_seq;

select user_id_pk_seq.nextval from dual;


SELECT
    *
FROM users;