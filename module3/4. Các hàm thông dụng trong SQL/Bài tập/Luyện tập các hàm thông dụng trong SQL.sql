use quanlysinhvien;
select * from subject
where Credit >= all(select Credit from subject);
select sub.SubID,sub.SubName,m.Mark from subject as sub
join mark as m on m.SubID=sub.SubID
having Mark>=any(select max(Mark) from mark group by SubID ); 
select s.StudentID,s.StudentName,avg(mark),m.mark from student as s
join mark as m on m.StudentID=s.StudentID
group by s.StudentID
order by m.Mark desc;