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

    // int n = 5;
    // for (int i = 1; i <= n; i++) {
    //     // Print spaces
    //     for (int j = 1; j <= n - i; j++) {
    //         printf(" ");
    //     }
    //     // Print stars
    //     for (int j = 1; j <= 2 * i - 1; j++) {
    //         if (i == n || j == 1 || j == 2 * i - 1) {
    //             printf("*");
    //         } else {
    //             printf(" ");
    //         }
    //     }
    //     printf("\n");
    // }

    int n = 5;
    for (int i = n; i >= 1; i--) {
        // Print spaces
        for (int j = 1; j < n-i; j++) {
            printf(" ");
        }
        // Print stars
        for (int j = 1; j <= 2 * i - 1; j++) {
            if (i == n || j == 1 || j == 2 * i - 1) {
                printf("*");
            } else {
                printf(" ");
            }
        }
        printf("\n");
    }

    // int num = 5;
    // for (int i = 1; i <= num * 2 - 1; i++)
    // {
    //     if (i <= 5)
    //     {
    //         for (int j = 1; j <= num - i; j++)
    //         {
    //             printf(" ");
    //         }
    //         for (int j = 1; j <= 2 * i - 1; j++)
    //         {
    //             if (j == 1 || j == 2 * i - 1)
    //             {
    //                 printf("*");
    //             }
    //             else
    //             {
    //                 printf(" ");
    //             }
    //         }
    //     }
    //     else
    //     {
    //         int bottomRow = i - num; // Map row to bottom part
    //         for (int j = 1; j <= bottomRow; j++)
    //         {
    //             printf(" ");
    //         }
    //         for (int j = 1; j <= 2 * (num - bottomRow) - 1; j++)
    //         {
    //             if (j == 1 || j == 2 * (num - bottomRow) - 1)
    //             {
    //                 printf("*");
    //             }
    //             else
    //             {
    //                 printf(" ");
    //             }
    //         }
    //     }
    //     printf("\n");
    // }
    // int n = 5;
    // for (int i = 0; i < n; i++) {
    //     // Print spaces for alignment
    //     for (int j = 1; j <= n - i - 1; j++) {
    //         printf("  "); // Two spaces for alignment
    //     }

    //     // Print numbers in Pascal's Triangle
    //     int num = 1; // The first value in each row is always 1
    //     for (int j = 0; j <= i; j++) {
    //         printf("%4d", num); // Print the number with proper spacing
    //         num = num * (i - j) / (j + 1); // Calculate the next number
    //     }

    //     printf("\n");
    // }

    
    // int num = 5;
    // for (int  i = 1; i <= num*2-1; i++)
    // {
    //     if ( i <= 5)
    //     {
    //         for (int j = 1; j <= i; j++)
    //         {
    //             printf("*");
    //         }
    //     } 
    //     else{
    //         for (int m = 4; m <= 1; m--)
    //         {
    //             printf("*");
    //         }
    //     }
    //      printf("\n");
    // }
    


    return 0;
}