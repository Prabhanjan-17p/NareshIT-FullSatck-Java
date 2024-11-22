#include<stdio.h>
int main(){
    //1- Find the big number among the 3 numbers using terinary operators
    // int a=10, b=223, c=33;
    // int largest = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
    // printf("Big num is %d",largest);

    //2- WACP to find out the sum of mark and percentage of student and pass or fail
    // int sub1=66, sub2=60, sub3=60, sub4=10, sub5=60;
    // int totalMarks = sub1 + sub2 + sub3 + sub4 + sub5;
    // float average = totalMarks / 5;
    // printf("Total Mark = %d\nTotal Percentage = %.2f\n",totalMarks,average);
    // if (sub1 <= 30 || sub2 <= 30 || sub3 <= 30 || sub4 <= 30 || sub5 <= 30){
    //     printf("Result : Student failed\n");
    // } else{
    //     printf("Result : Student passed\n");
    // }

    // int x = 15; int y = 2;
    // int z = x / y + x % y; 
    // printf("z = %d\n", z);

int num1, num2, num3;
    printf("Enter 3 number \n");
    printf("Enter 3 number \n");
    printf("Enter 3 number \n");

    scanf("%d %d %d", &num1, &num2, &num3);
    printf("%d= num1  %d= num2 %d= num3", num1, num2, num3);
    return 0;
}