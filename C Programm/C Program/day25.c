#include<stdio.h>
int main(){
    // 1-
    // int num = 5,k=1;
    // for (int i = 1; i <= num; i++)
    // {
    //    for (int j = 1; j <= num; j++)
    //    {
    //     if (i%2 == 1)
    //     {
    //         printf("%4d ", k++);
    //     } else{
    //         printf("%4d ", --k);
    //     }
    //    }
    //    k = k + 5;
    //    printf("\n");
    // }
    

    // // 2-
    // int num = 5,k=1;
    // for (int i = 1; i <= num; i++)
    // {
    //     k=i;
    //    for (int j = 1; j < num; j++)
    //    {
    //     printf("%4d ", k);
    //     k = k+5;
    //    }
    //    printf("\n");
    // }

    // 3-
    // int num = 5; char ch = 'A';
    // for (int i = 1; i <= num; i++)
    // {
    //     for (int  j = 1; j < num; j++)
    //     {
    //        printf("%c ", ch++);
    //     }
    //     printf("\n");
    // }
    

    // // //4-
    // int num = 5;
    // char ch = '@';
    // for (int i = 1; i < num; i++)
    // {
    //     ch = '@';
    //     ch = ch+i;
    //     for (int j = 1; j < num; j++)
    //     {
    //         printf("%c ", ch++);
    //     }
    //     printf("\n");
    // }

    // 5- Fibonacci number calculate
    // int num ;
    // int a = 0, b = 1, c;
    // printf("Enter num: ");
    // scanf("%d",&num);
    // c = a+b;
    // printf("%d %d ",a,b);
    // for (int i = 3; i <= num; i++)
    // {
    //     printf("%d ",c);
    //     a = b;
    //     b = c;
    //     c = a+b;
    // }

    // 6-
    // int num = 3;
    // int tar = 7;
    // for (int i = 1; i <= num; i++)
    // {
    //     for (int j = 1; j <= num; j++)
    //     {
    //         printf("%4d", tar);
    //         tar = (tar == 10) ? 1: tar+1;
    //     }
    //     printf("\n");
    // }

    //7-
    // 7   8   9
    // 6   1   2
    // 5   4   3
   

    // int num =3;
    // int co = 7;
    // for (int i = 1; i <= num; i++)
    // {
    //     for (int  j = 1; j <= num; j++)
    //     {
    //         printf("%3d", co);
    //         co = (co == 10) ? 1: co+1;
    //     }
    //     printf("\n");
    // }
    

    // int num = 5;
    // for (int i = 1; i <= num; i++)
    // {
    //     for (int j = 1; j <= num; j++)
    //     {
    //         if (i+j >= 6){
    //             printf("*   ");
    //         } else{
    //             printf("  ");
    //         }
    //     }
    //     printf("\n");
    // }
    
    

     int n = 3; // Size of the matrix (3x3)
    int num = 7; // Starting number

    for (int i = 0; i < n; i++) {
        if (i % 2 == 0) {
            // Fill left-to-right for even-index rows
            for (int j = 0; j < n; j++) {
                printf("%d\t", num);
                num++;
                if (num > 10) num = 1; // Reset to 1 after 10
            }
        } else {
            // Fill right-to-left for odd-index rows
            int temp = num + (n - 1); // Calculate the starting number for this row
            for (int j = 0; j < n; j++) {
                printf("%d\t", temp);
                temp--;
                if (temp < 1) temp = 10; // Reset to 10 if below 1
            }
            num += n; // Update num for the next row
            if (num > 10) num = num % 10; // Ensure num wraps correctly
        }
        printf("\n"); // Newline after each row
    }
    
    
    
    return 0;
}