 SET SQL_SAFE_UPDATES = 0;
 create database College;
 Use College;
 create table Dept (dept_id INT primary key, dept_name varchar(50) unique);
 create table students(student_id int auto_increment primary key, student_name varchar(100) not null, email varchar(100) unique, dept_id INT,foreign key (dept_id) references Dept(dept_id));
 alter table students add marks int;
 insert into Dept (dept_id,dept_name) values (1,'Inft'),(2,'Comps'),(3,'Etrx'),(4,'AIDS');
 insert into students (student_id,student_name,email,dept_id,marks) values (1,'Shrav','shrav@gmail.com',1,90),(2,'Praj','praj@gmail,com',2,80),(3,'Soham','Soham@gmail.com',3,60),(4,'Om', 'Om@gmail.com',4,75),(5,'Rachana','Rachana@gmail.com',1,50);
 select*from dept;
 select*from students;
 
--  distinct 
 select distinct dept_id from students;
 
 -- where, and/or
 select*from students where dept_id=1;
 select*from students where dept_id=1 and marks>70;
 select*from students where dept_id=3 or dept_id=2;
 
 -- order by
 select student_name, marks from students order by marks desc;
 select student_name, dept_id from students order by dept_id asc;
 
 -- update, delete, insert into
 update students set marks=87 where student_id='1';
 delete from students where student_name='Om';
 insert into students (student_name,email,dept_id,marks) values ('Om','om@gmail.com',1,78);
 select*from students limit 2;
 
 -- like and wildcards
 select*from students where student_name like 's%';
 
 -- in, between, aliases
 select*from students where marks in (60,80);
 select*from students where marks between 60 and 80;
 select student_name as Name, marks as Final_grades from students;
 
--  joins 

select student_name,email,dept_name from students inner join Dept on students.dept_id=dept.dept_id;
select student_name,email,dept_name from students left join Dept on students.dept_id=dept.dept_id;
select student_name,email,dept_name from students right join Dept on students.dept_id=dept.dept_id;

--  union, alternative query for full join
select student_name,email,dept_name from students left join Dept on students.dept_id=dept.dept_id 
union
select student_name,email,dept_name from students right join Dept on students.dept_id=dept.dept_id;

-- check and default
alter table students add age int default 21,add check (age>=20);

-- index 
create index name_index on students(student_name);
show index from students;

-- order by and group by
select dept_id, student_name from students order by dept_id asc;
select dept_id, count(*) as students_count from students group by dept_id;

create table professors (prof_id int primary key auto_increment, prof_name varchar(50), sub varchar(50), dept_id int, foreign key (dept_id) references Dept(dept_id));
insert into professors (prof_name,sub,dept_id) values ('Mr. Sabnis', null, 2),('Mrs.Nehate','AT', 1); 
select*from professors;

-- views
create view students_IT_department as select*from students where dept_id=1;
select*from students_IT_department;
create view students_and_departments as select s.student_name, d.dept_name from students s right join Dept d on s.dept_id=d.dept_id;
select*from students_and_departments;

-- null values
select*from professors where sub is not null;
select*from professors where sub is null;

-- insert into
create table IT_professors (prof_id int primary key, prof_name varchar(50), sub varchar(50));
insert into IT_professors (prof_id, prof_name, sub ) select prof_id,prof_name,sub from professors where dept_id=1;
select*from IT_professors;

-- create table as select
create table comps_professors as select* from professors where dept_id=2;

-- having function
select dept_id,avg(marks) from students group by dept_id having avg(marks)>70;

-- null functions
alter table students add column bonus_marks int;
update students set bonus_marks=10 where student_name='Shrav' or student_name='Praj';
select * from students;
select student_name,(marks+ifnull(bonus_marks,0)) from students;

-- alter
alter table IT_professors add column salary int;
alter table IT_professors modify column salary bigint default 0;
alter table IT_professors drop column salary;

-- prepared stmt
prepare statement1 from 'select*from students where dept_id=?';
set @dept=1;
execute statement1 using @dept;
deallocate prepare statement1;

-- stored procedure

DELIMITER $$
create procedure getMarks(IN id int)
begin
	select student_id,student_name,marks from students where student_id=id;
end $$
DELIMITER ;

-- calling stored procedure
call getMarks(1);