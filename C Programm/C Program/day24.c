#include <stdio.h>
int main()
{
    // 1-
    //  int num = 5;
    //  for(int i = 1 ; i <= num ; i++){
    //      for(int j = 1 ; j <= num ; j++){
    //          printf("* ");
    //      }
    //      printf("\n");
    //  }

    // 2-
    // int num = 4;
    // for (int  i = 1; i <= num; i++)
    // {
    //     for (int  j = 0; j <= num; j++)
    //     {
    //         printf("%d ", i);
    //     }
    //    printf("\n");
    // }

    // 3-
    // int num = 5;
    // for (int  i = 1; i < num; i++)
    // {
    //     for (int  j = 1; j <= num; j++)
    //     {
    //         printf("%d ",j);
    //     }
    //     printf("\n");
    // }

    // 4-
    // int num = 5;
    // for(int i = num ; i > 1; i--){
    //     for(int j=1 ; j <= num; j++){
    //         printf("%d ",i);
    //     }
    //     printf("\n");
    // }

    // 5-
    // int num = 5;
    // for (int i = 1; i < num; i++)
    // {
    //     for (int  j = num; j >= 1; j--)
    //     {
    //         printf("%d ",j);
    //     }
    //     printf("\n");
    // }

    // 6-
    //  int num =5;
    //  for (int i = 1; i <= num; i++)
    //  {
    //      for (int  j = 1; j <=  num; j++)
    //      {
    //          printf("%d ",j*i);
    //      }
    //      printf("\n");
    //  }

    // 7-
    // int num = 5;
    // for (int i = 1; i <= num; i++)
    // {
    //     if (i % 2 != 0)
    //     {
    //         for (int j = 1; j <= num; j++)
    //         {
    //             if (j % 2 == 0)
    //             {
    //                 printf("%d ", 1);
    //             }
    //             else
    //             {
    //                 printf("%d ", 0);
    //             }
    //         }
    //     } else {
    //         for (int j = 1; j <= num; j++)
    //         {
    //             if (j % 2 == 0)
    //             {
    //                 printf("%d ", 0);
    //             }
    //             else
    //             {
    //                 printf("%d ", 1);
    //             }
    //         }
    //     }
    //     printf("\n");
    // }

    //8- 
    // int num = 5,cou=1;
    // for (int  i = 1; i <= num; i++)
    // {
    //     for (int i = 1; i <= num; i++)
    //     {
    //         printf("%3d ",cou++);
    //     }
    //     printf("\n");
    // }

    //9-
    int num = 5;
    for (int  i = 1; i <= num; i++)
    {
        int k = i;
        for (int j = 1; j <= num; j++) 
        {
            printf("%d ", k++);
        }
        printf("\n");  
    }

    //10 -
    // int num =5;
    // for (int i = 1; i < num; i++)
    // {
    //     int m = 1;
    //     for (int j = 1; j <= num+1; j++)
    //     {
    //         if (j % 2 == 1)
    //         {
    //             printf("%d ", i);
                
    //         } else{
    //             printf("%d ", m);
    //             m++;
    //         }
    //     }
    //      printf("\n");
    // }
    
    int arr[10] = {1, 2, 3, 4, 5}; // Initial array
    int size = 5;                  // Current size of the array
    int index = 2; // Index where the new element will be inserted
    int value = 99; // Value to be inserted
    for (int i = size; i > index; i--) {
        arr[i] = arr[i - 1];
    }
    arr[index] = value;
    size++;
    printf("Array after insertion: ");
    for (int i = 0; i < size; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");


    return 0;
}