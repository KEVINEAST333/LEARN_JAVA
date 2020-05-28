public class MySql {
//MySql 建表筛选练习
/*create table student (
            id int,
            name varchar(20)
);
    drop table student;
    create table class (id int primary key auto_increment,
    name varchar(20));
    create table student (
            id int primary key auto_increment,
            name varchar(20) default"无名氏",
    classId int , foreign key (classId) references class (id)
            );
    insert into class values (null,"电子信息07");
    insert into class values (null,"电子信息08");
    insert into class values (null,"电子信息09");
    insert into student values (null,null,1);
    insert into student values(null,"王鹏程",2);
    insert into student values (null,null,1);
    select * from student;
    desc student;
    delete from student where id = 1;
    insert into student values (1,"王东");
    insert into student values(null,"王军鹏");
    insert into student values(4,"武元昊");
    insert into student values(5,"陆远洋");
    insert into student values(6,"马晨龙");
    create table roster (name varchar(20));
    insert into roster select name from student;
    select * from roster;
    select count(name) from roster;
    create table emp (
            id int primary key auto_increment,
            name varchar(20),
    role varchar(20),
    salary decimal(7,2)
);*/
}
