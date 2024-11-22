#include<stdio.h>
#include<conio.h>
int main(){
    //1-Check input number is even or odd "without" using "ternary operator" and "control flow statement"
    // int num =15;
    // int res = num%2==0;
    // //exapmle1
    // res != 0 && printf("%d is even number",num);
    // res == 0 && printf("%d is odd number",num);
    // printf("%d",res);
    //example2
    // char *ans[] ={"even", "odd"};
    // printf("%s\n",ans[res]);

    //2- maximum number among 2 number without using "ternary operator" and "control flow statement"
    // int num1 = 110, num2 = 20;
    // int max = num1 > num2;
    // max != 0 && printf("%d is gretaer than %d",num1,num2);
    // max == 0 && printf("%d is smaller than %d",num1,num2);

    //3-maximum number among 3 number without using "ternary operator" and "control flow statement"
    // int num1 = 10 , num2 =200,num3 = 1342;
    // int max = num1 > num2 && num1 > num3;
    // max!= 0 && printf("%d is the largest number among %d, %d and %d",num1,num1,num2,num3);
    // max = num2 > num1 && num2 > num3;
    // max!= 0 && printf("%d is the largest number among %d, %d and %d",num2,num1,num2,num3);
    // max = num3 > num1 && num3 > num2;
    // max != 0 && printf("%d is the largest number among %d, %d and %d",num3,num1,num2,num3);
    
    // 4 -- wacp take 5 marks and show to number of pass and number of fail , pass mark is >= 35
    int sub1 = 98, sub2 = 42, sub3 = 55, sub4 = 34, sub5 = 99;
    int passMark = 35;
    int countFail =0, countPass = 0;
    int Pass = (sub1 >= passMark);
    Pass == 0 && countFail++;
    Pass !=0 && countPass++;
    Pass = (sub2 >= passMark);
    Pass == 0 && countFail++;
    Pass !=0 && countPass++;
    Pass = (sub3 >= passMark);
    Pass == 0 && countFail++;
    Pass !=0 && countPass++;
    Pass = (sub4 >= passMark);
    Pass == 0 && countFail++;
    Pass !=0 && countPass++;
    Pass = (sub5 >= passMark);
    Pass == 0 && countFail++;
    Pass !=0 && countPass++;
    printf("%d is pass and %d is fail",countPass,countFail);

    //5-Take Day and return the number of days in (Day:Month:Year) format
    // int inputdays = 200;
    // int days = 0 ,year = 0,month = 0;
    // int res = inputdays >= 365;
    // res !=0 && year++;
    // inputdays = inputdays - (res*365);
    // month = inputdays/30;
    // days = inputdays - (month*30);
    // printf("%d Year %d Month  and %d days",year,month,days);

    // //6-Take Number of second and convert into (Hour:Minute:Second) format
    // int inputSec = 3665;
    // int hour =0, minute =0,sec=0;
    // int res = inputSec >= 3600;
    // res!=0 && hour++;
    // inputSec = inputSec - (res*3600);
    // minute = inputSec/60;
    // sec = inputSec- (minute*60);
    // printf("%d hour %d minute and %d second ", hour,minute,sec);
    //example 2 
    // hour = inputSec/60;
    // minute = inputSec/60/60%60;
    // sec = inputSec/60/60/60%60;
    // printf("%d hour %d minute and %d second ", hour,minute,sec);



}