#include <stdio.h>
int main()
{
    //1-
    // int n = 5, n2 = 0, n3 = 1;
    // for (int i = 1; i <= n; i++, n3++)
    // {
    //     n2 = 1;
    //     for (int k = 1; k <= n; k++)
    //     {
    //         if (n2 == 3 && k == 3)
    //         {
    //             printf("* ");
    //         }
    //         else if (n3 == 3)
    //         {
    //             printf("* ");
    //         }
    //         else
    //         {
    //             printf("  ");
    //         }
    //         n2++;
    //     }
    //     printf("\n");
    // }

    //2-
    // int n = 5;
    // for (int  i = 1; i <= n; i++)
    // {
    //    for (int  j = 1; j <= n; j++)
    //    {
    //         if (i == 1 || i == n || j == 1 || j == n)
    //         {
    //             printf("* ");
    //         }
    //         else
    //         {
    //             printf("  ");
    //         }
    //    }
    //    printf("\n");
    // }


    //3-
    // int n= 5,k=1;
    // for (int i = 1; i <= n; i++,k++)
    // {
    //     for (int j = 1; j <= n; j++)
    //     {
    //         if (j== 3 || k == 3  || i == 1 && j != 2 || j == 1 && i!=4 || j == 5 && i !=2 || i ==5 && j !=4)
    //         {
    //             printf("*  ");
    //         } else {
    //             printf("   ");
    //         }
            
    //     }
    //     printf("\n");
        
    // }
    
    

    //4-
    int n = 5;
    for (int i = 1; i <= n; i++)
    {
        for (int j = 1; j <= n; j++)
        {
            if (j == i || j == n-i+1)
            {
                printf("# ");
            }
            else
            {
                printf("  ");
            }
        }
        printf("\n");
    }
    // 4-
    // int n = 5;
    // for (int i = 1; i <= n; i++)
    // {
    //     if (i % 2 != 0)
    //     {
    //         for (int j = 1; j <= n; j++)
    //         {
    //             if (j == n/2+1 && i !=3)
    //             {
    //                 printf("0 ");
    //             }
    //             else if (i == 3 && j !=3 )
    //             {
    //                 printf("0 ");
    //             }
    //             else if (j % 2 == 0)
    //             {
    //                 printf("0 ");
    //             } else if  (j % 2 != 0)
    //             {
    //                  printf("# ");
    //             }
                
    //         }
    //     } else {
    //          for (int j = 1; j <= n; j++)
    //         {
    //             if (j % 2 != 0)
    //             {
    //                 printf("0 ");
    //             } else{
    //                 printf("# ");
    //             }
    //         }
    //     }
    //     printf("\n");
    // }

     // 5-
    //  int n= 5;
    //  for (int i = 1; i <= n; i++)
    //  {
    //      int s = n - i +1;
    //      for (int  j = 1; j <= s-1; j++)
    //      {
    //          printf("0 ");
    //      }
    //      for (int k = 1; k <= i; k++)
    //      {
    //          printf("1 ");
    //      }
    //      printf("\n");
    //  }


    

    return 0;
}