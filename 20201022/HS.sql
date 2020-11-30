DROP TABLE DEPT;
CREATE TABLE DEPT
       (DEPTNO NUMBER(2) CONSTRAINT PK_DEPT PRIMARY KEY,
	DNAME VARCHAR2(14) ,
	LOC VARCHAR2(13) ) ;
DROP TABLE EMP;
CREATE TABLE EMP
       (EMPNO NUMBER(4) CONSTRAINT PK_EMP PRIMARY KEY,
	ENAME VARCHAR2(10),
	JOB VARCHAR2(9),
	MGR NUMBER(4),
	HIREDATE DATE,
	SAL NUMBER(7,2),
	COMM NUMBER(7,2),
	DEPTNO NUMBER(2) CONSTRAINT FK_DEPTNO REFERENCES DEPT);
INSERT INTO DEPT VALUES
	(10,'ACCOUNTING','NEW YORK');
INSERT INTO DEPT VALUES (20,'RESEARCH','DALLAS');
INSERT INTO DEPT VALUES
	(30,'SALES','CHICAGO');
INSERT INTO DEPT VALUES
	(40,'OPERATIONS','BOSTON');
INSERT INTO EMP VALUES
(7369,'SMITH','CLERK',7902,to_date('17-12-1980','dd-mm-yyyy'),800,NULL,20);
INSERT INTO EMP VALUES
(7499,'ALLEN','SALESMAN',7698,to_date('20-2-1981','dd-mm-yyyy'),1600,300,30);
INSERT INTO EMP VALUES
(7521,'WARD','SALESMAN',7698,to_date('22-2-1981','dd-mm-yyyy'),1250,500,30);
INSERT INTO EMP VALUES
(7566,'JONES','MANAGER',7839,to_date('2-4-1981','dd-mm-yyyy'),2975,NULL,20);
INSERT INTO EMP VALUES
(7654,'MARTIN','SALESMAN',7698,to_date('28-9-1981','dd-mm-yyyy'),1250,1400,30);
INSERT INTO EMP VALUES
(7698,'BLAKE','MANAGER',7839,to_date('1-5-1981','dd-mm-yyyy'),2850,NULL,30);
INSERT INTO EMP VALUES
(7782,'CLARK','MANAGER',7839,to_date('9-6-1981','dd-mm-yyyy'),2450,NULL,10);
INSERT INTO EMP VALUES
(7788,'SCOTT','ANALYST',7566,to_date('13-JUL-87')-85,3000,NULL,20);
INSERT INTO EMP VALUES
(7839,'KING','PRESIDENT',NULL,to_date('17-11-1981','dd-mm-yyyy'),5000,NULL,10);
INSERT INTO EMP VALUES
(7844,'TURNER','SALESMAN',7698,to_date('8-9-1981','dd-mm-yyyy'),1500,0,30);
INSERT INTO EMP VALUES
(7876,'ADAMS','CLERK',7788,to_date('13-JUL-87')-51,1100,NULL,20);
INSERT INTO EMP VALUES
(7900,'JAMES','CLERK',7698,to_date('3-12-1981','dd-mm-yyyy'),950,NULL,30);
INSERT INTO EMP VALUES
(7902,'FORD','ANALYST',7566,to_date('3-12-1981','dd-mm-yyyy'),3000,NULL,20);
INSERT INTO EMP VALUES
(7934,'MILLER','CLERK',7782,to_date('23-1-1982','dd-mm-yyyy'),1300,NULL,10);
DROP TABLE BONUS;
CREATE TABLE BONUS
	(
	ENAME VARCHAR2(10)	,
	JOB VARCHAR2(9)  ,
	SAL NUMBER,
	COMM NUMBER
	) ;
DROP TABLE SALGRADE;
CREATE TABLE SALGRADE
      ( GRADE NUMBER,
	LOSAL NUMBER,
	HISAL NUMBER );
INSERT INTO SALGRADE VALUES (1,700,1200);
INSERT INTO SALGRADE VALUES (2,1201,1400);
INSERT INTO SALGRADE VALUES (3,1401,2000);
INSERT INTO SALGRADE VALUES (4,2001,3000);
INSERT INTO SALGRADE VALUES (5,3001,9999);
COMMIT;

select * from emp;

select *
from emp
where empno = 7369;

select empno, ename, job   /*프로젝션*/
from emp;

select * 
from emp, dept where empno = 7369; /*자료가 오염됨(원하는 자료만 안나옴)*/

select * 
from emp e, dept d 
where e.deptno = d.deptno and empno = 7369;

select * from emp;
select * from dept;

Select e.* 
From emp e
JOIN dept d 
ON e.deptno = d.deptno;

select deptno from emp;
select distinct deptno from emp; 
--중복제거

select distinct e.deptno, d.dname
from emp e
join dept d on e.deptno = d.deptno;

select * from dept;
--중복제거하고 출력????

select count(*) as 사원수 from emp;
select ename as 사원명 from emp;
--별칭 설정하기 별칭은  as로 설정하는것이 좋다. 자바와의 연동때문에

select *
from 테이블
where 조건

select *
from emp
where job = 'SALESMAN';
--조건절 세일즈맨만 출력

select *
from emp
where comm >= 500;
--조건절 커미션 500이상 출력

SELECT *
from emp
ORDER BY empno 
DESC;

select *
from emp , dept 

join dept
on e.dname;

DROP TABLE student_info;

CREATE table student_info (
    name Varchar2(128) not null,
    phone Varchar2(128) not null,
    email varchar2 (128) not null,
    age number not null,
    fired CHAR(1) default 'N',
    department_id NUMBER NOT NULL,
    redence_id NUMBER NOT NULL
);

INSERT INTO student_info
       (name, phone, email, age, fired) 
VALUES ('정희석','3818','a@b.com',29,'N');

SELECT * FROM student_info;
-- SELECT는 열에 해당되는 부분을 선택

SELECT name, phone, email, age, fired
FROM student_info;

--모든 열을 선택 : *(셀렉력)
--일부 열만 선택 : 프로젝션

DROP TABLE department;

CREATE TABLE department (
    id NUMBER NOT NULL,
    name VARCHAR2(128) NOT NULL,
    location VARCHAR(128) NOT NULL
    );

SELECT * FROM department;

INSERT INTO department (name, location)
VALUES ('oracle', 'Seoul');
COMMIT;

SELECT name as 근무부서, location as 근무지
FROM department;

INSERT INTO department(id, name, location) VALUES (1, 'devps', 'pangyo');
INSERT INTO department(id, name, location) VALUES (2, 'design', 'Seoul');
INSERT INTO department(id, name, location) VALUES (3, 'depo', 'pangyo');
INSERT INTO department(id, name, location) VALUES (4, 'Sales', 'Seoul');
INSERT INTO department(id, name, location) VALUES (5, 'manege', 'pangyo');

INSERT INTO student_info(name, phone, email, age, department_id)
VALUES('주호민', '1234', 'ASDFASDF.com', 30, 1);
INSERT INTO student_info(name, phone, email, age, department_id)
VALUES('이번견', '1234', 'ssg.com', 35, 2);

SELECT * FROM department;
select * from student_info;
select * from student_info, department;
--카테시안??골이 발생하여 정보가 오염됨

select * 
from student_info si, department d
WHERE si.department_id = d.id;

SELECT *
FROM student_info si
JOIN department d
ON si.department_id = d.id;

FROM table1 t1
FROM table2 t2 on t1.id = t2.t1_id;



DROP TABLE student_info;
DROP TABLE department;
DROP TABLE residence;

CREATE table student_info (
    name Varchar2(128) not null,
    phone Varchar2(128) not null,
    email varchar2 (128) not null,
    age number not null,
    fired CHAR(1) default 'N',
    department_id NUMBER NOT NULL,
    residence_id NUMBER NOT NULL
);

CREATE TABLE department (
    id NUMBER NOT NULL,
    name VARCHAR2(128) NOT NULL,
    location VARCHAR(128) NOT NULL
    );

CREATE TABLE residence (
r_id NUMBER NOT NULL,
r_name VARCHAR2 (128) NOT NULL,
r_nation VARCHAR2 (128) NOT NULL
);

INSERT INTO student_info(name, phone, email, age, department_id, residence_id)
VALUES('주호민', '1234', 'ASDFASDF.com', 30, 1, 1);
INSERT INTO student_info(name, phone, email, age, department_id, residence_id)
VALUES('이병건', '1234', 'ssg.com', 35, 2, 2);
INSERT INTO student_info(name, phone, email, age, department_id, residence_id)
VALUES('정희석', '2663', 'ssg.com', 29, 3, 3);

INSERT INTO department(id, name, location) VALUES (1, 'devps', 'pangyo');
INSERT INTO department(id, name, location) VALUES (2, 'design', 'Seoul');
INSERT INTO department(id, name, location) VALUES (3, 'depo', 'pangyo');
INSERT INTO department(id, name, location) VALUES (4, 'Sales', 'Seoul');
INSERT INTO department(id, name, location) VALUES (5, 'manege', 'pangyo');

INSERT INTO residence(r_id, r_name, r_nation) VALUES (1, 'Seoul', 'Korea');
INSERT INTO residence(r_id, r_name, r_nation) VALUES (2, 'Seoul', 'Korea');
INSERT INTO residence(r_id, r_name, r_nation) VALUES (3, 'Seoul', 'Korea');

SELECT * FROM student_info;
SELECT * FROM department;
SELECT * FROM residence;

SELECT *
FROM student_info si
JOIN department d
on si.department_id = d.id
JOIN residence r
on si.residence_id = r.r_id;

