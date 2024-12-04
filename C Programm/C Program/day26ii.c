#include <stdio.h>
int main()
{
    // 1-
    /*
    * 
    * * 
    * * * 
    * * * * 
    * * * * * 
    */
    //  int num = 5;
    //  for (int i = 1; i <= num; i++)
    //  {
    //      for (int j = 1; j <= i; j++)
    //      {
    //          printf("* ");
    //      }
    //      printf("\n");
    //  }

    // 2-
    /*
    1 
    1  2
    1     3
    1        4
    1  2  3  4  5
    // */
    // int num = 5, k = 1;
    // for (int i = 1; i <= num; i++, k++)
    // {
    //     for (int j = 1; j <= i; j++)
    //     {
    //         if (j == 1 || k == num)
    //         {
    //             printf("%2d ", j);
    //         }
    //         else if (k == j)
    //         {
    //             printf("%2d ", k);
    //         }
    //         else{
    //             printf("   ");
    //         }
    //     }
    //     printf("\n");
    // }

    // 3-
    /*
    1
    3  5
    5  7  9
    7  9 11 13
    9 11 13 15 17
    */
    // int num = 5, k = 1, k2;
    // for (int i = 1; i <= num; i++)
    // {
    //     for (int k2 = k, j = 1; j <= i; j++)
    //     {
    //         printf("%3d", k2);
    //         k2 += 2;
    //     }
    //     k = k + 2;
    //     printf("\n");
    // }

    // 4-
    /*
     1  
     1   2
     3   4   5
     6   7   8   9
    10  11  12  13  14
    // */
    //  int num = 5, k = 0;
    //  for (int i = 1; i <= num; i++)
    //  {
    //      for (int j = 1; j <= i; j++,k++)
    //      {
    //          if (i == 1)
    //          {
    //              printf("%2d  ",i);
    //          }
    //          else{
    //              printf("%2d  ",k);
    //          }
    //      }
    //      printf("\n");
    //  }

    // 5-
    /*  1
        2  6
        3  7 10
        4  8 11 13
        5  9 12 14 15
//   */
    //  int num = 5, k = 1, k2;
    //  for (int i = 1; i <= num; i++)
    //  {
    //      for (int k2 = k, j = 1; j <= i; j++)
    //      {
    //          printf("%3d", k2);
    //          k2 += 5-j;
    //      }
    //      k = k + 1;
    //      printf("\n");
    //  }

    // // 6-
//   0
//   0  1
//   0  1  1
//   0  1  1  2
//   0  1  1  2  3
//   0  1  1  2  3  5
    //  int num = 7; 
    // for (int i = 1; i <= num; i++) {
    //     int n1 = 0, n2 = 1, next; 
    //     for (int j = 1; j <= i; j++) {
    //         if (j == 1) {
    //             printf("%3d", n1); 
    //         } else if (j == 2) {
    //             printf("%3d", n2); 
    //         } else {
    //             next = n1 + n2; 
    //             printf("%3d", next);
    //             n1 = n2;       
    //             n2 = next;
    //         }
    //     }
    //     printf("\n"); 
    // }

    return 0;
}