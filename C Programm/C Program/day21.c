#include <stdio.h>
#include <math.h>
int main()
{
    // 1- Range Factor of prime numbers
    // int re1, re2, i = 1, res, count = 0;
    // printf("Enter two numbers: ");
    // scanf("%d%d", &re1, &re2);
    // while (re1 <= re2) // 2- 20
    // {
    //     i = 1;
    //     count = 0;
    //     res = re1;
    //     while (i <= res)
    //     {
    //         if (res % i == 0)
    //         {
    //             count++;
    //         }
    //         i++;
    //     }
    //     if (count >= 3);
    //     else
    //         printf("%d ", res);
    //     re1++;
    // }

    // 2- Check the Number is Armstrong number or not
    //  int num1, num2,res=0;
    //  long last;
    //  printf("Enter two numbers: ");
    //  scanf("%d%d", &num1, &num2);

    // int noOfDigit;
    // // int noOfDigit = log10(num1)+1; // Number of digits

    // while (num1 <= num2){
    //     int ss = num1;
    //     int dig = num1;
    //     int cc=0;
    //     // noOfDigit = (int) log10(num1)+1;
    //     while (dig !=0 )
    //     {
    //         cc++;
    //         dig = dig/10;
    //     }
    //     printf("Number %d digits", cc);

    //     res = 0;
    //     while (ss != 0)
    //     {
    //         last= ss % 10;
    //         // res = res + (int) pow(last,noOfDigit);
    //         res = res + (int) pow(last,cc);
    //         ss = ss/10;
    //     }
    //     if(num1 == res) printf("%d is an Armstrong number\n",num1);
    //     num1++;
    // }

    // 3- Check the number is Strong number or not in given range
    // int num1, num2, i = 1, res = 0, fact = 1;
    // printf("Enter two numbers: ");
    // scanf("%d%d", &num1, &num2);
    // while (num1 <= num2)
    // {
    //     int ss = num1;
    //     i = 1;   // resart number
    //     res = 0; // resart number
    //     while (ss != 0)
    //     {
    //         int last = ss % 10;
    //         fact = 1; // resart number
    //         i = 1;    // resart number
    //         while (i <= last)
    //         {
    //             fact = i * fact;
    //             i++;
    //         }
    //         res = res + fact;
    //         ss = ss / 10;
    //     }
    //     if (num1 == res)
    //         printf("%d is a Strong number\n", num1);
    //     num1++;
    // }

    // int num =151223;
    // int res = (int) log10(num)+1;
    // printf("Number of digits: %d\n", res);

    // int i=1;
    // // while (i <= 5)
    // while (1)
    // {
    //     printf(": program\n");
    //     // printf("%d: program\n", i);
    //     // i++;
    // }

    // for (int  i = 0; i < 3; i++)
    // for (int  i = 0; i < 5; i++);
    // printf("Hello World!\n");

    // while (1)
    // while (0);
    // printf("hello\n");

    int dig = 123;
    int cc = 0;
    // while (dig != 0)
    // {
    //     cc++;
    //     dig = dig / 10;
    // }
    // printf("Number %d digits", cc);

    // int i = 1, base, expo, res = 1;
    // while (i <= cc)
    // {
    //     res = res * base;
    //     i++;
    // }
   
    // int i=1,base,expo,res=1;
    // // printf("Enter base and exponent: ");
    // // scanf("%d%d", &base, &expo);
    // while(i <= expo){
    //     res = res * base;
    //     // 2^5 = 2*2*2*2*2
    //     i++;
    // }
    // printf("Result: %d\n", res);

    //  printf("%d",2<<3); // 2 * 2^3
    // printf("%d",2 * (2*2*2)); // 2 * 2^3

    // int sum = 540;
    // float  per = (sum / 600.0) * 100 ;
    // printf("Perimeter: %f\n", per);
    // int pp = (int)(per / 10);
    // printf("Percentage: %d%%\n", pp);
    // int n = 9;
    // for (int i = 1; i <= n; i++)
    // {
    //     int s = n - i +1;
    //     for (int  j = 1; j <= s; j++)
    //     {
    //         printf("*");
    //     }
    //     printf("\n");
        
    // }
    // int n = 9;
    // for (int i = 1; i <= n; i++)
    // {
    //     for (int  j = 1; j <= n; j++)
    //     {
    //         if (i >= j)
    //         {
    //         printf("%d ",j);
    //         }
    //     }
    //     printf("\n"); 
    // }
    int n = 5;
    for (int i = 1; i <= n*2-1; i++)
    {
        if (i <= n)
        {
        for (int  j = 1; j <= n; j++)
        {
            if (i >= j)
            {
            printf("*");
            }
        }
        } else{
            int z = 2*n-i;
            for(int j = 1; j <= z; j++){
                printf("*");
            }
        }
        printf("\n"); 
    }
    

    return 0;
}