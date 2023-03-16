
SELECT do.name, d.dname FROM `department` d, doctor as do WHERE d.dept_id=do.departmentid;


SELECT * FROM `doctor` WHERE pass '1%';

SELECT * FROM `doctor` WHERE emailid LIKE '%gmail.com';


SELECT name FROM `doctor`WHERE salary < (SELECT avg(salary) from doctor);

SELECT name,dob FROM doctor WHERE CAST(RIGHT(dob, 4) AS INT) > 1978;

SELECT name FROM `doctor` WHERE relative is null or relative="";

SELECT name FROM `doctor` WHERE patientcount=0;
