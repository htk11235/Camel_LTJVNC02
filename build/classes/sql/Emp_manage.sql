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
	sex nvarchar(1),
	birthday datetime,
	email nvarchar(50) not null unique,
	tel nvarchar(12),
	password_ nvarchar(50)
)
create table employees_positions (
	employee_Id int foreign key references employees(employee_Id)
		on delete cascade
		on update cascade,
	position_Id int foreign key references positions(position_Id)
		on delete cascade
		on update cascade,
	primary key(employee_Id,position_Id)
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
	status_ nvarchar(3),
)
go

insert into positions values
	('Nhân Viên'),
	('Quản Lý'),
	('Giám Đốc')
go
insert into departments values
	('Phòng Kế Toán'),
	('Phòng Kinh Doanh'),
	('Phong Tài Chính và Dân Sự')
go
insert into employees values
	('Đàm Phú Quốc','1','M','12/10/2002','damphuquoc@gmail.com','0777456902','1')
insert into employees_positions values 
	('1','1')
insert into timekeeping values
	('1','9/5/2022','Yes'),
	('1','10/5/2022','No')
go
insert into salaries values
	('1',10,'5','2022')


select employee_Name,position_Name
from positions p,employees e,employees_positions ep
where ep.employee_Id = e.employee_Id and p.position_Id = ep.position_Id

select * from positions order by position_Id asc