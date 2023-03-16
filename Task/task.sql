15/02/23
1.select idnumber,fullname,dept_id from users;

2.UPDATE `users` SET `fullname`='Rahman' WHERE idnumber=1;




3 select u.idnumber,u.fullname,d.name from user u,departemnt d where u.dept_id=d.dept_id;


4. show tables




5 SELECT TABLE_NAME as TABLES FROM information_schema.tables WHERE table_schema='rahman_038';



select DISTINCT TABLE_NAME,Column_Name from information_schema.Columns where Table_Schema ="madhubabukokku_22071";


SELECT DISTINCT TABLE_NAME,Column_Name,DATA_TYPE from  information_schema.Columns   WHERE TABLE_SCHEMA='rahman_038';


SELECT * FROM `users` find user particulra without using where clouse


SELECT name FROM `subject` WHERE name LIKE'%t%';


DELETE  FROM `wishlist` WHERE fid in(SELECT idnumber from users where exp<8);



SELECT concat('drop ','TABLES ',TABLE_NAME ,';') as TABLE_NAME  from information_schema.tables where TABLE_schema='rahman_038' and TABLE_NAME LIKE'%_wishlist%';