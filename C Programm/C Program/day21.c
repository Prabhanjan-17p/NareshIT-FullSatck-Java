#include <stdio.h>
#include <math.h>
int main()
{
    // 1- Range Factor of prime numbers
    int re1, re2, i = 1, res, count = 0;
    printf("Enter two numbers: ");
    scanf("%d%d", &re1, &re2);
    while (re1 <= re2) // 2- 20
    {
        i = 1;
        count = 0;
        res = re1;
        while (i <= res)
        {
            if (res % i == 0)
            {
                count++;
            }
            i++;
        }
        if (count >= 3);
        else
            printf("%d ", res);
        re1++;
    }

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
    while (dig != 0)
    {
        cc++;
        dig = dig / 10;
    }
    printf("Number %d digits", cc);

    int i = 1, base, expo, res = 1;
    while (i <= cc)
    {
        res = res * base;
        i++;
    }

    // int i=1,base,expo,res=1;
    // // printf("Enter base and exponent: ");
    // // scanf("%d%d", &base, &expo);
    // while(i <= expo){
    //     res = res * base;
    //     // 2^5 = 2*2*2*2*2
    //     i++;
    // }
    // printf("Result: %d\n", res);

    return 0;
}