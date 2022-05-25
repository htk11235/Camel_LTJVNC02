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
	coefficient_salary int,
	month_ int,
	year_ int	
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
AFTER  insert,delete
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
				DECLARE @i INT = 0;
				WHILE @i < 3650
				BEGIN
					delete from timekeeping 
					where employee_Id=(select employee_Id from deleted) and day_keeping=(select FORMAT( GETDATE()+365*5-@i,'yyyy-MM-dd'))
					SET @i = @i + 1;
				END;
			end;		
end
GO
delete from positions
DBCC CHECKIDENT ('positions', RESEED, 1)
insert into positions values
	('Staff'),
	('Manager'),
	('President')
go
delete from departments
DBCC CHECKIDENT ('departments', RESEED, 1)
insert into departments values
	('Font-end'),
	('Back-end'),
	('Marketing'),
	('Design')
go
delete from employees
DBCC CHECKIDENT ('employees', RESEED, 1)
insert into employees values
	('Dam Phu Quoc','1','1','M','12/10/2002','damphuquoc@gmail.com','0777456902','1'),
	('Le Anh Quoc','2','1','M','12/10/2002','pearuk@gmail.com','0901960923','1'),
	('Huynh Thi Khoa','2','1','F','12/10/2002','httk@gmail.com','0376806330','1'),
	('Sub acc','1','3','F','12/10/2002','1','000','2')
go


go
delete from salaries
DBCC CHECKIDENT ('salaries', RESEED, 1)
insert into salaries values
	('1',10,'5','2022')

