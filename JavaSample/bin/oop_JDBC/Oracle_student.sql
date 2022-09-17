select * from student;

create table student( 
   stu_no number(8),
   stu_name varchar2(12) not null,
   stu_dept varchar2(20) not null,
   stu_grade number(1) not null,
   stu_class char(3) not null,
   stu_gender char(1) not null,
   stu_height number(5,2), 
   stu_weight number(5,2) not null,
   constraint stu_no primary key(stu_no)
   );
   
insert into student values(20131027, '옥성우2', '컴퓨터정보', 2, 'A', 'F', 172.66, 63.55);
