#include <stdio.h>
int main()
{
    // 1-
    //  int n = 5;
    //  for (int i = 1; i <= n; i++)
    //  {
    //      for (int  j = 1; j <= n-i; j++){
    //          printf("%3c",' ');
    //      }
    //      for (int  j = 1; j <= i*2-1; j++)
    //      {
    //          printf("%3c",'*');
    //      }
    //      printf("\n");
    //  }

    // 2-
    //  int n = 5;
    //  for (int i = 1; i <= n; i++)
    //  {
    //      int h = i*2-1;
    //      for (int  j = 1; j <= n-i; j++){
    //          printf("%3c",' ');
    //      }
    //      for (int  j = 1; j <= i*2-1; j++, h--)
    //      {
    //          printf("%3d",h);
    //      }
    //      printf("\n");
    //  }

    // 3-
    // int num = 5;
    // for (int i = 1; i <= num; i++)
    // {
    //     int s = num-i;
    //     for (int j = 1; j <= s ; j++)
    //     {
    //         printf("%2c",' ');
    //     }
    //     for (int  k = i; k >= 1; k--)
    //     {
    //         printf("%2d",k);
    //     }
    //     for (int  k = 2; k <= i; k++)
    //     {
    //         printf("%2d",k);
    //     }

    //     printf("\n");
    // }

    // 4-
    // int n = 5,n2=n;
    // for (int i = 1; i <= n; i++, n2--)
    // {
    //     for (int j = 1; j <= i; j++)
    //     {
    //         printf("%3c", ' ');
    //     }
    //     for (int  j = 1; j <= n2*2-1; j++)
    //     {
    //         printf("%3c", '*');
    //     }
    //     printf("\n");
    // }

    // 5-
    // int n = 5, n2 = n, n3 = 0;
    // for (int i = 1; i <= n; i++, n2--)
    // {
    //     for (int j = 1; j <= n - i; j++)
    //     {
    //         printf("%3c", ' ');
    //     }
    //     for (int j = 1; j <= i * 2 - 1; j++)
    //     {
    //         printf("%3c", '*');
    //     }
    //     printf("\n");
    // }
    // for (int i = n-1; i >= 1; i--)
    // {
    //     for (int j = 1; j <= n-i; j++)
    //     {
    //         printf("%3c", ' ');
    //     }
    //     for (int j = 1; j <= i * 2 - 1; j++)
    //     {
    //         printf("%3c", '*');
    //     }
    //     printf("\n");
    // }

    //6-
    int n = 5;
    for (int i = 1; i <= n; i++)
    {
        for (int j = 1; j <= i; j++)
        {
            printf("%3d", j);
        }
        printf("\n");
    }
        for (int i = n-1; i >= 1; i--)
    {
        for (int j = 1; j <= i; j++)
        {
            printf("%3d", j);
        }
        printf("\n");
    }
    

    return 0;
}