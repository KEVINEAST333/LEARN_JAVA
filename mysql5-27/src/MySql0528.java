public class MySql0528 {
    //sql语句练习多表联合查询.
   /* use java0528;
    show tables;
-- 笛卡尔积
    select student.id,student.name,score.student_id,score.score from student,score ;
-- 进行筛选
    select student.id,student.name,score.student_id,score.score from student,score where student.id = score.student_id;
-- 增加中间表
    select student.id,student.name,course.id,course.name,score.student_id,score.score
    from student,score,course where student.id = score.student_id and course.id = score.course_id;
-- 精简去掉重复的列
    select student.name,course.name,score.score
    from student,score,course where student.id = score.student_id and course.id = score.course_id;
-- 再进行筛选查找出具体人
    select student.name,course.name,score.score
    from student,score,course where student.id = score.student_id and course.id = score.course_id
    and student.name like"许_";
-- 计算一下许仙的总成绩
    select student.name,sum(score.score)
    from student,score,course where student.id = score.student_id and course.id = score.course_id
    and student.name like"许_";
-- 计算一下许仙的平均成绩
    select student.name,avg(score.score)
    from student,score,course where student.id = score.student_id and course.id = score.course_id
    and student.name like"许仙";*/
}
