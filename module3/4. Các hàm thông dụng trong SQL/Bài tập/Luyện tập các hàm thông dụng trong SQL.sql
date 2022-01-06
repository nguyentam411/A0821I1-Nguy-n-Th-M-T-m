use quanlysinhvien;
-- Hiển thị tất cả các thông tin môn học (bảng subject) có credit lớn nhất. 
select * from subject
where Credit >= all(select Credit from subject);
-- Hiển thị các thông tin môn học có điểm thi lớn nhất.
select sub.SubID,sub.SubName,m.Mark from subject as sub
join mark as m on m.SubID=sub.SubID
having Mark>=any(select max(Mark) from mark group by SubID ); 
-- Hiển thị các thông tin sinh viên và điểm trung bình của mỗi sinh viên, xếp hạng theo thứ tự điểm giảm dần
select s.StudentID,s.StudentName,avg(mark),m.mark from student as s
join mark as m on m.StudentID=s.StudentID
group by s.StudentID
order by m.Mark desc;