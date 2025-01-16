-----------------------------------------------------(Topic - 1)-----------------------------------------------------------------

First Connect to the main system 
    - SQL > Enter username = system/(password)
        or
    - SQL > Enter username = system
            Enter password = (password)

========================================================
Create a new user
1- First Connect to main system
    - SQL > Enter username = system/(password);
2- Create user (username) identified by (password)
    - SQL > Create user MYDB identified by MYDB;


==========================================================
Connect to new user
(if you direct Connect to a new user , it will gives you error => (First you have set the permission))
1- First Connect to main system
    - SQL > Enter username = system/(password);
2- Grant DBA to (UserName)
    - SQL > Grant DBA to MYDB;
3- Connect to new User
    - SQL > conn
            Enter user-name: MYDB/MYDB

===============================================================
How to change a password
1- First Connect to main system
    - SQL > Enter username = system/(password);
2- Then Connect to user 
    - SQL > conn
            Enter user-name: MYDB/MYDB
3- Command for change the password
    - SQL > PASSWORD;
            Changing password for MYDB
            Old password:
            New password:
            Retype new password:
            Password changed
4- Check the password change or not
    - SQL > CONN
            Enter user-name: MYDB/123
            Connected.

==================================================================
If you forget the password then how to change the password 
1- First Connect to main system
    - SQL > Enter username = system/(password);
2- Then Connect to user 
    - SQL > conn
            Enter user-name: MYDB/MYDB
3- For forget password Command
    - SQL > Alter user (UserName) identified by (New Password)
    - SQL > Alter user MYDB identified by MYDB
4- Check the password change or not
    - SQL > CONN
            Enter user-name: MYDB/MYDB
            Connected.

===================================================================
How to view all user in oracle
1- First Connect to main system
    - SQL > Enter username = system/(password);
2- Then view all user
    - SQL > select username from all_users;

==================================================================
How to Drop a User in oracle
1- First Connect to main system
    - SQL > Enter username = system/(password);
2- Then Drop a user 
    - SQL > Drop user (UserName) casecade;
    - SQL > Drop user MYDB casecade;

===================================================================
How to clear your screen 
1- SQL > CL SCR;

===================================================================
How to exit or dissconnect from oracle 
1- SQL > EXIT;