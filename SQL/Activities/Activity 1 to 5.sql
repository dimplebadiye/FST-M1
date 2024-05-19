REM   Script: Activity 1 to 5
REM   Full stack testing training SQL

CREATE TABLE salesman ( 
    salesman_id int, 
    salesman_name varchar2(32), 
    salesman_city varchar2(32), 
    commission int 
);

INSERT ALL 
	INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
SELECT 1 FROM DUAL;

SELECT salesman_id, salesman_city FROM salesman;

SELECT * FROM salesman WHERE salesman_city='Paris';

SELECT salesman_id, commission FROM salesman WHERE salesman_name='Paul Adam';

ALTER TABLE salesman ADD grade int;

UPDATE salesman SET grade=100;

SELECT * FROM salesman;

UPDATE salesman SET grade = 200 where salesman_city = 'Rome';

UPDATE salesman SET grade = 300 where salesman_name = 'James Hoog';

INSERT INTO salesman VALUES(5004, 'James Hoog', 'New Mexico', 10, 100);

UPDATE salesman SET grade = 300 where salesman_name = 'James Hoog';

UPDATE salesman SET salesman_name = 'Pierre' where salesman_name = 'McLyon';
