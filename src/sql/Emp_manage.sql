Create Database Employee_Management
go
use Employee_Management
go
create table postions (
	postion_Id int primary key not null identity,
	postion_Name nvarchar(50) not null unique
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
	postion_Id int foreign key references postions(postion_Id)
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
	day_keeping datetime,
	status nvarchar(3),

)