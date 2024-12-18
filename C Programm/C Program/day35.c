#include <stdio.h>
int main()
{
    // 1- Strore all prime number in array
    int n;
    printf("Enter the number of prime numbers to store: ");
    scanf("%d", &n);
    if (n <= 0)
    {
        printf("Invalid input. N should be greater than 0.\n");
        return 1;
    }
    int prime[n];
    int count = 0;
    int num = 2;
    while (count < n)
    {
        int isPrime = 1;
        for (int i = 2; i < num; i++)
        {
            if (num % i == 0)
            {
                isPrime = 0;
                break;
            }
        }
        if (isPrime)
        {
            prime[count] = num;
            count++;
        }
        num++;
    }
    printf("[");
    for (int i = 0; i < n; i++)
    {
        printf("%d", prime[i]);
        if (i < n - 1)
        {
            printf(", ");
        }
    }
    printf("]\n");

    // 2- Print all similar elements in 2 different arrays
    //  int n = 5;
    //  int arr1[] = {1, 21, 3, 4, 5};
    //  int arr2[] = {11, 2, 3, 41, 5};
    //  printf("Common elements between arr1 and arr2 are: ");
    //  for (int  i = 0; i < n; i++)
    //  {
    //      if (arr1[i] == arr2[i])
    //      {
    //          printf("%d ",arr1[i]);
    //      }
    //  }

    // 3- leader elements of an array
    //  int n = 7;
    //  int arr[] = {10,9,14,23,15,0,9};
    //  for (int  i = 0; i < n; i++)
    //  {
    //      int count =0;
    //      for (int  j = i; j < n; j++)
    //      {
    //          if (arr[i] < arr[j+1])
    //          {
    //              count++;
    //          }
    //      }
    //      if (count == 0)
    //      {
    //          printf("%d ",arr[i]);
    //      }
    //  }

    // 4- find pair of max and min
    //  int n = 4,min=0,max=0;
    //  // int arr[] = {1,2,3,4,5,6};
    //  int arr[] = {1,2,3,4};
    //  // int arr[] = {7,8,9,10,11,12};
    //  for (int i = 0; i < n/2; i++)
    //  {
    //      for (int j = i; j < n-i; j++)
    //      {
    //         if (j == i)
    //         {
    //          min = arr[j];
    //         }else{
    //          max = arr[j];
    //         }
    //      }
    //      printf("(%d, %d)\n",min,max);
    //  }

    return 0;
}