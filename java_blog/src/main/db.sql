drop database if exists java16_blogdemo ;
create database java16_blogdemo;
use java16_blogdemo;
create table user (
    userId int primary key auto_increment,
    name varchar(50) unique,
    password varchar(50)
    );
create table article(
    articleId int primary key auto_increment,
    title varchar(255),
    userId int,
    content text,
    foreign key (userId) references user(userId)
);
