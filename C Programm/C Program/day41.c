#include <stdio.h>

int main()
{
    // Find and print all prime numbers between 2 and 100
    // int num ;
    // printf("Enter a number to find the sum prime number ");
    // scanf("%d",&num);
    // int in = 0;
    // int arr[100] = {0};
    // for (int i = 2; i <= num; i++)
    // {
    //     int isPrime = 1;
    //     for (int j = 2; j < i; j++)
    //     {
    //         if (i % j == 0)
    //         {
    //             isPrime = 0;
    //             break;
    //         }
    //     }

    //     if (isPrime)
    //     {
    //         arr[in++] = i;
    //     }
    // }
    // printf("Prime pairs whose sum is %d:\n",num);
    // for (int i = 0; i < in; i++)
    // {
    //     for (int j = i; j < in; j++)
    //     {
    //         if (arr[i] + arr[j] == num)
    //         {
    //             printf("%d + %d = %d\n", arr[i], arr[j],num);
    //         }
    //     }
    // }

    // 2- Write a C Program to swap first digit and last digit of number ?
    // int num;
    // printf("Enter a number to swap 1st and last number ");
    // scanf("%d",&num);
    // int cou = 0;
    // int temp = num;
    // while (temp != 0)
    // {
    //     temp = temp / 10;
    //     cou++;
    // }
    // int arr[cou];
    // int ii = 0;
    // temp = num;
    // while (temp != 0)
    // {
    //     arr[ii++] = temp % 10;
    //     temp = temp / 10;
    // }
    // temp = arr[0];
    // arr[0] = arr[cou-1];
    // arr[cou-1] = temp;
    // for (int i = cou-1; i >= 0; i--)
    // {
    //     printf("%d", arr[i]);
    // }

    // 3- Write a C Program to find LCM of two numbers?
     int num1, num2, max, lcm;
     printf("Enter two numbers: ");
     scanf("%d %d", &num1, &num2);
     max = (num1 > num2) ? num1 : num2;
     while (1) {
         if (max % num1 == 0 && max % num2 == 0) {
                lcm = max; // The first number divisible by both num1 and num2
                break;
         }
         max++;
     }
     printf("The LCM of %d and %d is: %d\n", num1, num2, lcm);

    // if ( 12 % 5 == 0)
    // {
    //     printf("Hi");
    // }
    // else
    // {
    //     printf("Bye");
    // }

    return 0;
}
