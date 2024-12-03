#include <stdio.h>
int main()
{
    // 1-
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
    int num = 6, k = 0, n1 = 1, n2 = 1,k2 = 0;
    for (int i = 1; i <= num; i++)
    {
        k = 0;
        for (int k2=0, j = 0; j < i; j++)
        {
            if (j <= 2)
            {
                n1 = k2;
                printf("%3d", k2++);
            }
            else
            {
                n1 = k;
                printf("%3d", k);
                // k = n1 + n2 + k;
            }
            k = k+n1;
        }
        // k = k + 1;
        printf("\n");
    }

    return 0;
}