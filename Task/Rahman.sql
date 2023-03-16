create database Rahman_038;
use Rahman_038;
create table employee(emp_id int,emp_name varchar(45),emp_registration Date,emp_phonenumber varchar(45));
INSERT INTO `employee`(`emp_id`, `emp_name`, `emp_registration`, `emp_phonenumber`) VALUES (1,"Rahul","2023-02-12",9988774455);
INSERT INTO `employee`(`emp_id`, `emp_name`, `emp_registration`, `emp_phonenumber`) VALUES (2,"Rahul","2023-02-10",8877994455);
INSERT INTO `employee`(`emp_id`, `emp_name`, `emp_registration`, `emp_phonenumber`) VALUES (3,"Rahul","2023-02-13",7744558899);
SELECT `emp_id`, `emp_name`, `emp_registration`, `emp_phonenumber`, DATE_FORMAT(emp_registration,'%m/%d/%Y') AS niceDate FROM `Employee`;


SELECT GROUP_CONCAT(emp_id),GROUP_CONCAT(emp_name),GROUP_CONCAT(emp_registration),GROUP_CONCAT(emp_phonenumber) 
FROM Employee;


SELECT emp_registration,Day(emp_registration)as day,Month(emp_registration)as Month,year(emp_registration)as Year FROM `employee` WHERE 1;


