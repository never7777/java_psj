/*학생들의 총점을 이용하여 학점을 출력하는 프로시저를 작성해보세요
90 ~ 100 : A
80 ~ 89	: B
70 ~ 79	: C
60 ~ 69	: D
0 ~ 59	: E
*/
select *from course;


delimiter //
drop procedure if exists print_score;
create procedure print_score(
)
begin
	select *,
    case
		 when co_total between 90 and 100 then 'A'
         when co_total between 80 and 89 then 'B'
         when co_total between 70 and 79 then 'C'
         when co_total between 60 and 69 then 'D'
         when co_total between 0 and 59 then 'F'
         end as '학점'
       from course ;
end//
delimiter ;


delimiter //
drop procedure if exists print_score;
create procedure print_score(
)
begin
	select *,
    case
		 when co_total >=90 then 'A'
         when co_total >=80 then 'B'
         when co_total >=70 then 'C'
         when co_total >=60 then 'D'
		 else 'F'
         end as '학점'
       from course ;
end//
delimiter ;
call print_score();
