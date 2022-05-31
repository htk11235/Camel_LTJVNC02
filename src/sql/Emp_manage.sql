Create Database Employee_Management
go
use Employee_Management
go
create table positions (
	position_Id int primary key not null identity,
	position_Name nvarchar(50) not null unique
)
go
create table departments (
	department_Id int primary key not null identity,
	department_Name nvarchar(50) not null unique
)
go
create table employees (
	employee_Id int primary key not null identity,
	employee_Name nvarchar(50) not null,
	department_Id int foreign key references departments(department_Id)
		on delete cascade
		on update cascade,
	position_Id int foreign key references positions(position_Id)
	on delete cascade
		on update cascade,
	sex nvarchar(1),
	birthday datetime,
	email nvarchar(50) not null unique,
	tel nvarchar(12),
	password nvarchar(50)
)
go
create table salaries(
	salary_Id int primary key not null identity,
	employee_Id int foreign key references employees(employee_Id)
		on delete cascade
		on update cascade,
	coefficient_salary int default 3,
	bonus float default 0,
	year int,
	month int
)
go
create table timekeeping(
	timekeeping_Id int primary key not null identity,
	employee_Id int foreign key references employees(employee_Id)
		on delete cascade
		on update cascade,
	day_keeping date,
	status_ nvarchar(3),
)
go
CREATE or alter TRIGGER addEmployInTimekeeping
ON employees
AFTER  insert,delete,update
AS
begin
	if not exists (select * from deleted)
		--insert
		begin
			DECLARE @cnt INT = 0;
			WHILE @cnt < 3650
			BEGIN
				insert into timekeeping values
				((select employee_Id from inserted),(select FORMAT( GETDATE()+365*5-@cnt,'yyyy-MM-dd')),'No')
				SET @cnt = @cnt + 1;
			END;
		end;
	else
		if not exists (select * from inserted)
			--delete
			begin
					delete from timekeeping 
					where employee_Id=(select employee_Id from deleted)
			end;
		else 
			begin 
				--update
				BEGIN
					delete from timekeeping 
					where employee_Id=(select employee_Id from deleted)
				END;
				DECLARE @x INT = 0;
			WHILE @x < 3650
			BEGIN
				insert into timekeeping values
				((select employee_Id from inserted),(select FORMAT( GETDATE()+365*5-@x,'yyyy-MM-dd')),'No')
				SET @x = @x + 1;
			END;
			end;
end
go
CREATE or alter TRIGGER addEmployInSalary
ON employees
AFTER  insert,delete
AS
begin
	if not exists (select * from deleted)
		--insert
		begin
			DECLARE @z INT = 0;
			DECLARE @t INT = 0;
			WHILE @z < 10
			BEGIN
				WHILE @t < 12
				BEGIN
					insert into salaries values
						((select employee_Id from inserted),3,0,(select FORMAT( GETDATE(),'yyyy'))-5+@z,@t+1)
					set @t=@t+1
				END;
				set @z=@z+1
			END;
		end;
	else
		if not exists (select * from inserted)
			--delete
			begin
				delete from salaries 
				where employee_Id = (select employee_Id from deleted)
			end;
		--else
		--	--update
		--	begin
		--		delete from salaries 
		--		where employee_Id = (select employee_Id from deleted)
		--		DECLARE @i INT = 0;
		--		DECLARE @j INT = 0;
		--		WHILE @i < 10
		--			BEGIN
		--				WHILE @j < 12
		--				BEGIN
		--					insert into salaries values
		--						((select employee_Id from inserted),3,0,(select FORMAT( GETDATE(),'yyyy'))-5+@i,@j+1)
		--						set @j=@j+1
		--				END;
		--				set @i=@i+1
		--			END;
		--	end;
end
GO
insert into positions values
	('Staff'),
	('Manager'),
	('President')
go
insert into departments values
	('Font-end'),
	('Back-end'),
	('Marketing'),
	('Design')
go
insert into employees values
	('Sub acc','1','3','F','12/10/2002','1','000','1')

