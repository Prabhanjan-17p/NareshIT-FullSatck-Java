#include <stdio.h>
int main()
{
    // 1- read a number from the user and show the multiplication table
    // int num, i = 1;
    // char ch ;
    // printf("Enter a number: ");
    // //  scanf("%d", &num);
    // if (scanf("%d%c", &num,&ch) !=2  || ch != '\n')
    // {
    //    printf("Invalid input! Please enter a positive integer.\n");
    //    return 1;
    // } else{
    //      while (i <= 10)
    //     {
    //         printf("%d x %d = %d", num, i, num * i);
    //         printf("\n");
    //         i++;
    //     }

    // }

    // 2- Sum of odd and even numbers
    // int n, i = 1;
    // char ch;
    // printf("Enter a number: ");
    // // scanf("%d", &n);
    // int sum_odd = 0, sum_even = 0;
    // if(scanf("%d%c", &n,&ch) !=2  || ch != '\n')
    // {
    //    printf("Invalid input! Please enter a positive integer.\n");
    // }
    // else
    // {
    //      while (i <= n)
    //     {
    //         if (i % 2 == 0)
    //         {
    //             // printf("Even sum %d+",i);
    //             sum_even += i;
    //         }
    //         else
    //         {
    //             // printf("%d+",i);
    //             sum_odd += i;
    //         }
    //         i++;
    //     }
    //     printf("\bEven sum = %d\n", sum_even);
    //     printf("\bOdd sum = %d", sum_odd);
    // }

    // 3- REverse of the number
    // int n, re = 0;
    // char ch;
    // printf("Enter a number: ");
    // // scanf("%d", &n);
    // if (scanf("%d%c", &re, &ch) != 2 || ch != '\n')
    // {
    //     printf("Invalid input! Please enter a positive integer.\n");
    //     return 1;
    // }
    // else
    // {
    //     while (n != 0)
    //     {
    //         int ss = n % 10;
    //         re = re * 10 + ss;
    //         n = n / 10;
    //     }
    //     printf("Reversed no =  %d", re);
    // }
    
    //4- count the number of digits
    // int num , count = 0;
    // char ch;
    // printf("Enter a number: ");
    // if (scanf("%d%c",&num,&ch) !=2 || ch != '\n')
    // {
    //     printf("Invalid input! Please enter valid number.\n");
    // } else {
    //     while ( num != 0)
    //     {
    //         count++;
    //         num = num / 10;
    //     }
    //     printf("Number of digits: %d", count);
    // }
    
    // 5- Enter number 12345678 output --> 12 34 56 78 
    // int num,res,count=1;
    // printf("Enter a number: ");
    // scanf("%d", &num);
    // while (num != 0) {
    //     int digit = num % 10;
    //     res = res * 10 + digit;
    //     num = num / 10;
    // }
    // while (res != 0) {
    //     int di = res % 10;
    //     printf("%d", di);
    //     if (count % 2 == 0)
    //     {
    //         printf("  ");
    //     }
    //     count++;
    //     res = res / 10;

    // }



    int n ; char ch;
    printf("Number of digits:");
    // scanf("%d",&n);
    // if (scanf("%d%c",&n,&ch) !=2 || ch != '\n')
    if (scanf("%d%c",&n,&ch) !=2 || ch != '\n')
    {
        printf("Invalid");
    } else{
        printf("Number is %d", n);
    }
    
    
    return 0;
}