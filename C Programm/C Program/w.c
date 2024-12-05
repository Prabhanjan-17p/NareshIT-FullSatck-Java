#include <stdio.h>
    int main()
    {
        int n = 5, i = 1;
        for (int i = 1; i <= n; i++)

        {
            for (int j = n - 1; j >= i; j--)
            {
                printf("%3s", "");
            }
            for (int k = 1; k <= i; k++)
            {
                printf("%3d", i);
            }
            printf("\n");
        }
        return 0;
    }