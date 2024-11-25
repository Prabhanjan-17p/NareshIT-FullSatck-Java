#include <stdio.h>
int main()
{
    // int num = 5;
    // for (int i = 0; i < num; i++)
    // {
    //     for (int m = 0; m <=num ; m++)
    //     {
    //         if (i>=m)
    //         {
    //             printf("* ");
    //         }
    //     }
    //     printf("\n");
    // }

    // int num = 5;
    // for (int i = 0; i < num; i++)
    // {
    //     for (int m = 0; m <=num ; m++)
    //     {
    //         printf("*");
    //     }
    //     printf("\n");
    // }

    // int num = 5;
    // for (int i = 1; i <= num; i++)
    // {
    //     int s = num-i;
    //     for (int m = 1; m <= s ; m++)
    //     {
    //         printf(" ");
    //     }
    //     for (int  k = 1; k <= i; k++)
    //     {
    //         printf("*");
    //     }

    //     printf("\n");
    // }

    // int num = 5;
    // for (int i = 1; i <= num; i++)
    // {
    //     for (int m = 1; m <= num ; m++)
    //     {
    //         if (m >= i)
    //         {
    //            printf("*");
    //         }
    //         else{
    //             printf(" ");
    //         }
    //     }
    //     printf("\n");
    // }

    // int num = 5;
    // for (int i = 1; i <= num; i++)
    // {
    //     int s = num-i;
    //     for (int m = 1; m <= s ; m++)
    //     {
    //         printf(" ");
    //     }
    //     for (int  k = 1; k <= i; k++)
    //     {
    //         printf("*");
    //     }
    //     for (int  k = 2; k <= i; k++)
    //     {
    //         printf("*");
    //     }

    //     printf("\n");
    // }
    // int num = 5;
    // for (int i = 1; i <= num; i++)
    // {
    //     int s = num;
    //     for (int m = 1; m <= s ; m++)
    //     {
    //         if (i<=m)
    //         {
    //             printf("* ");
    //         }else{
    //         printf(" ");}
    //     }

    //     printf("\n");
    // }

    // int num = 5;
    // for (int i = 1; i <= num; i++)
    // {
    //     int s = num-i;
    //     for (int m = 1; m <= s ; m++)
    //     {
    //         printf(" ");
    //     }
    //     for (int m = 1; m <= i; m++)
    //     {
    //         printf("* ");
    //     }
    //     printf("\n");
    // }

    // int num = 5;
    // for (int i = 1; i <= num * 2; i++)
    // {
    //     // int s = num-i;
    //     if (i <= 5)
    //     {
    //         for (int m = 1; m <= num; m++)
    //         {
    //             if (i <= m)
    //             {
    //                 printf("* ");
    //             }
    //             else
    //             {
    //                 printf(" ");
    //             }
    //         }
    //     }
    //     else
    //     {
    //          // Lower part of the pattern
    //         int k = i - num;
    //         for (int s = 1; s <= num-k; s++) {
    //             printf(" ");
    //         }
    //         for (int m = 1; m <= k; m++) {
    //             printf("* ");
    //         }
    //     }
    //     printf("\n");
    // }

    int num = 5;
    for (int i = 1; i <= num; i++)
    {
        int s = num-i;
        for (int m = 1; m <= s ; m++)
        {
            printf(" ");
        }
        for (int m = 1; m <= i; m++)
        {
            printf("* ");
        }
        printf("\n");
    }
    
    return 0;
}