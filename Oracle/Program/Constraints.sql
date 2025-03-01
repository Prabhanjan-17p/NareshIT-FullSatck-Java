------------------------------------------------- CONSTRAINTS -----------------------------------------------------------

// 1 - UNIQUE
========================= 
// 1.1- Column Level
    --> Create Table 
SQL> CREATE TABLE USER1 (USERID VARCHAR2(20) UNIQUE, PASSWORD VARCHAR2(10) UNIQUE);

Testing
-------------
SQL> INSERT INTO USER1 VALUES ('s@gmail.com',123);   // Allowed
SQL> INSERT INTO USER1 VALUES ('s@gmail.com',123);   // Not Allowed
SQL> INSERT INTO USER1 VALUES ('s@gmail.com',1234);  // Not Allowed
SQL> INSERT INTO USER1 VALUES ('a@gmail.com',1234);  // Allowed
SQL> INSERT INTO USER1 VALUES (null,null);           // Allowed
SQL> INSERT INTO USER1 VALUES (null,null);           // Allowed
SQL> INSERT INTO USER1 VALUES ('n@gmail.com',999);   // Allowed

Output
-----------------
SQL> SELECT * FROM USER1;
USERID               PASSWORD
-------------------- ----------
s@gmail.com          123
a@gmail.com          1234


n@gmail.com          999

// 1.2 - Table Level
    --> Create Table
SQL> CREATE TABLE MATCH_DATA (TEAM1 VARCHAR(10),TEAM2 VARCHAR2(10),UNIQUE(TEAM1,TEAM2));

Testing
---------
SQL> INSERT INTO MATCH_DATA VALUES ('IND','AUS');       // Allowed
SQL> INSERT INTO MATCH_DATA VALUES ('IND','AUS');       // Not Allowed
SQL> INSERT INTO MATCH_DATA VALUES ('IND','SA');        // Allowed
SQL> INSERT INTO MATCH_DATA VALUES ('USA','SA');        // Allowed
SQL> INSERT INTO MATCH_DATA VALUES ('USA','IND');       // Allowed
SQL> INSERT INTO MATCH_DATA VALUES ('USA','IND');       // Not Allowed
SQL> INSERT INTO MATCH_DATA VALUES ('USA','SA');        // Not Allowed
SQL> INSERT INTO MATCH_DATA VALUES ('SA','SA');         // Allowed
SQL> INSERT INTO MATCH_DATA VALUES ('SA','IND');        // Allowed
SQL> INSERT INTO MATCH_DATA VALUES ('SA','IND');        // Not Allowed
SQL> INSERT INTO MATCH_DATA VALUES (NULL,NULL);         // Allowed
SQL> INSERT INTO MATCH_DATA VALUES (NULL,NULL);         // Allowed
SQL> INSERT INTO MATCH_DATA VALUES ('AST','IND');       // Allowed

Output
--------------
SQL> SELECT * FROM MATCH_DATA;

TEAM1      TEAM2
---------- ----------
IND        AUS
IND        SA
USA        SA
USA        IND
SA         SA
SA         IND


AST        IND

--------------------------------------------------------------------------------------------------------------------------

// 2 - NOT NULL
======================
// 2.1- Column Level
    --> Create Table 
SQL> CREATE TABLE TEST1(SLNO NUMBER(5) NOT NULL,SNAME VARCHAR2(10) NOT NULL);

Testing
----------
SQL> INSERT INTO TEST1 VALUES(1,'KANHA');        // Allowed
SQL> INSERT INTO TEST1 VALUES(1,'HERO');         // Allowed
SQL> INSERT INTO TEST1 VALUES(2,'NOOB');         // Allowed
SQL> INSERT INTO TEST1 VALUES(2,NULL);           // Not Allowed
SQL> INSERT INTO TEST1 VALUES(NULL,NULL);        // Not Allowed
SQL> INSERT INTO TEST1 VALUES(NULL,'ACC');       // Not Allowed

Output
----------
SQL> SELECT * FROM TEST1;

      SLNO SNAME
---------- ----------
         1 KANHA
         1 HERO
         2 NOOB


// 2.2 - Table Level
    --> Create Table
ANS --> In here Table Level are not allowed to write 
SQL> CREATE TABLE TEST2(SLNO NUMBER(5) ,SNAME VARCHAR2(10) ,NOT NULL(SLNO,SNAME));
CREATE TABLE TEST2(SLNO NUMBER(5) ,SNAME VARCHAR2(10) ,NOT NULL(SLNO,SNAME))
                                                       *
ERROR at line 1:
ORA-00904: : invalid identifier

--------------------------------------------------------------------------------------------------------------------------


// 3 - CHECK
======================
// 3.1- Column Level
    --> Create Table 
SQL> CREATE TABLE APL_FORM (
  2    REGNO NUMBER(4) UNIQUE NOT NULL,
  3    NAME VARCHAR2(10) NOT NULL,
  4    ENTRY_FEE NUMBER(6,2) NOT NULL CHECK (ENTRY_FEE = 500),
  5    AGE NUMBER(2) NOT NULL CHECK (AGE BETWEEN 18 AND 30),
  6    LOC VARCHAR2(10) NOT NULL CHECK (LOC IN ('HYD', 'ODISHA', 'DELHI', 'MUB'))
  7  );

Testing
------------
SQL> INSERT INTO APL_FORM VALUES (101, 'SMITH', 500, 25, 'HYD');       // Allowed
SQL> INSERT INTO APL_FORM VALUES (101, 'SMITH', 501, 25, 'HYD');       // Not Allowed
SQL> INSERT INTO APL_FORM VALUES (101, 'SMITH', 500, 55, 'HYD');       // Not Allowed
SQL> INSERT INTO APL_FORM VALUES (101, 'SMITH', 500, 25, 'CHINA');     // Not Allowed
SQL> INSERT INTO APL_FORM VALUES (101, 'SMITH', 500, 25, 'HYD');       // Not Allowed
SQL> INSERT INTO APL_FORM VALUES (102, 'SMITH', 500, 25, 'HYD');       // Allowed
SQL> INSERT INTO APL_FORM VALUES (103, 'KANHA', 500, 25, 'ODISHA');    // Allowed
SQL> INSERT INTO APL_FORM VALUES (103, 'KANHA', 500, 19, 'ODISHA');    // Not Allowed
INSERT INTO APL_FORM VALUES (103, 'KANHA', 500, 19, 'ODISHA')

Output
----------
SQL> SELECT * FROM APL_FORM;

     REGNO NAME        ENTRY_FEE        AGE LOC
---------- ---------- ---------- ---------- ----------
       101 SMITH             500         25 HYD
       102 SMITH             500         25 HYD
       103 KANHA             500         25 ODISHA


// 3.2 - Table Level
    --> Create Table
SQL> CREATE TABLE TEST2 (NAME VARCHAR2(10), SALARY NUMBER(8,2), CHECK(NAME = LOWER(NAME) AND SALARY > 15000 ));

Testing
-----------
SQL> INSERT INTO TEST2 VALUES ('SMITH',15000);       // Not Allowed
SQL> INSERT INTO TEST2 VALUES ('smith',15000);       // Not Allowed
SQL> INSERT INTO TEST2 VALUES ('smith',15001);       // Allowed

Output
-----------
SQL> SELECT * FROM TEST2;

NAME           SALARY
---------- ----------
smith           15001


-----------------------------------------------------------------------------------------------------------------------------


// 4 - PRIMARY KEY
======================
// 4.1- Column Level
    --> Create Table 
SQL> CREATE TABLE TEST5 (USERID VARCHAR2(10) PRIMARY KEY, UNAME VARCHAR2(10), MOBNO NUMBER(10) UNIQUE NOT NULL);

Testing
--------------
SQL> INSERT INTO TEST5 VALUES ('s@gmail','SMITH',1234567890);       // Allowed
SQL> INSERT INTO TEST5 VALUES ('s@gmail','SMITH',1234567890);       // Not Allowed
SQL> INSERT INTO TEST5 VALUES ('s@gmail','SMITH',1234000000);       // Not Allowed
SQL> INSERT INTO TEST5 VALUES ('a@gmail','SMITH',1234000000);       // Allowed
SQL> INSERT INTO TEST5 VALUES ('a@gmail','SMITH',1234000011);       // Not Allowed
SQL> INSERT INTO TEST5 VALUES ('d@gmail','SMITH',1212129999);       // Allowed
SQL> INSERT INTO TEST5 VALUES ( NULL,'SMITH',1212129999);           // Not Allowed
SQL> INSERT INTO TEST5 VALUES ('d@gmail','SMITH', NULL);            // Not Allowed

Output
----------------
SQL> SELECT * FROM TEST5;

USERID     UNAME           MOBNO
---------- ---------- ----------
s@gmail    SMITH      1234567890
a@gmail    SMITH      1234000000
d@gmail    SMITH      1212129999



// 4.2 - Table Level (Composite Primary Key)
    --> Create Table
SQL> CREATE TABLE BRANCH (BCODE NUMBER(4), BNAME VARCHAR2(10), BLOC VARCHAR2(10), PRIMARY KEY(BCODE , BNAME));

Testing
---------
SQL> INSERT INTO BRANCH VALUES (1021 , 'SBI' , 'AMERPET');       // Allowed
SQL> INSERT INTO BRANCH VALUES (1021 , 'SBI' , 'AMERPET');       // Not Allowed
SQL> INSERT INTO BRANCH VALUES (1021 , 'SBI' , 'MADHAPUR');      // Not Allowed
SQL> INSERT INTO BRANCH VALUES (1022 , 'SBI' , 'MADHAPUR');      // Allowed
SQL> INSERT INTO BRANCH VALUES (1021 , 'HDFC' , 'AMERPET');      // Allowed
SQL> INSERT INTO BRANCH VALUES (1022 , 'HDFC' , 'MADHAPUR');     // Allowed

Output
-------
SQL> SELECT * FROM BRANCH;

     BCODE BNAME      BLOC
---------- ---------- ----------
      1021 SBI        AMERPET
      1022 SBI        MADHAPUR
      1021 HDFC       AMERPET
      1022 HDFC       MADHAPUR

----------------------------------------------------------------------------------------------------------------------------




// 5 - FOREIGN KEY
======================
// 5.1- Column Level
    --> Create Table
SQL> CREATE TABLE COLLEGE(C_CODE NUMBER(4) PRIMARY KEY, COLLEGE_NAME VARCHAR2(10));d.

SQL> INSERT INTO COLLEGE VALUES (1021,'CBIT');
SQL> INSERT INTO COLLEGE VALUES (1022,'VBIT');

SQL> CREATE TABLE STUDENT1(SID NUMBER(3),SNAME VARCHAR2(10),C_CODE NUMBER(4) REFERENCES COLLEGE(C_CODE));

Testing
----------
SQL> INSERT INTO STUDENT1 VALUES (101,'SMITH',1021);       // Allowed
SQL> INSERT INTO STUDENT1 VALUES (102,'ALLEN',1021);       // Allowed
SQL> INSERT INTO STUDENT1 VALUES (103,'WARD',1022);        // Allowed
SQL> INSERT INTO STUDENT1 VALUES (104,'JONES',NULL);       // Allowed
SQL> INSERT INTO STUDENT1 VALUES (103,'WARD',1023);        // NOT-Allowed(What ever value in PRIMARY key that will be add here)

SQL> UPDATE STUDENT1 SET C_CODE = 1023 WHERE C_CODE IS NULL;  // NOT-Allowed(What ever value in PRIMARY key that will be add here)
SQL> UPDATE STUDENT1 SET C_CODE = 1021 WHERE C_CODE IS NULL;       // Allowed
SQL> UPDATE STUDENT1 SET C_CODE = 1022 WHERE C_CODE IS NULL;       // Allowed

SQL> SELECT * FROM STUDENT1;

       SID SNAME          C_CODE
---------- ---------- ----------
       101 SMITH            1021
       102 ALLEN            1021
       103 WARD             1022
       104 JONES            1021 