// #include<stdio.h>
// int main()
// {
//     //1using 3rd variable
//     // int a=5, b=10,temp=0;
//     // temp = a;
//     // a = b ;
//     // b = temp;
//     // printf("a=%d, b=%d,",a,b);

//     // 2-Without using 3rd variable
//     int a =100 , b= 10;
//     a = a-b;
//     b = a+b;
//     a = b-a;
//     // printf("a=%i, b=%d",a,b);
//     // printf("a=%i",a,b);
//     int i=50 ;
//     // i = i+i*i++;
//     printf("i=%d %d %d",i,i<<2,i>>2);
//     // printf("%d",printf("%d",i));

//     //3- write c program to addiction of 2 numbers without using + operator
//     // int a = 10 , b = 125,sum;
//     //  sum = a - (-b);
//     // printf("Sum=%d",sum);

//     // 4-write a c program to make sum of the given digit
//     // int num = 12,b=0;
//     // b=num%10;
//     // printf("%d\n",b);
//     // num=num/10;
//     // printf("%d\n",num);
//     // b=b+num;
//     // printf("Sum=%d",b);

// }

#include <stdio.h>
int main(){
    // 1- WACP to claculate the number of days according to the number of month
    int month;
        printf("result ");
    // printf("result =\n");
    scanf("%d", &month);
    if (month >= 1 && month <= 12)
    {
    }
    else
    {
        printf("Invalid input! Please enter a month between 1 and 12.");
    }

    return 0;
}