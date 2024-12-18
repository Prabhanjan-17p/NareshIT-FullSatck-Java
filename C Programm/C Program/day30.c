#include <stdio.h>
int main()
{
    // 1- Find the second largest element in a given array
    //  int arr[] = {110, 2, 30, 400, 50};
    //  int n = 5;
    //  for (int i = 0; i < n; i++)
    //  {
    //      for (int  j = 0; j < n-1; j++)
    //      {
    //          if (arr[j] > arr[j+1])
    //          {
    //             int temp = arr[j];
    //             arr[j] = arr[i];
    //             arr[i] = temp;
    //          }
    //      }
    //  }
    //  printf("\nSecond largest element is: %d\n", arr[n-2]);
    // or
    //  Find the second largest element
    // int largest = arr[n - 1];
    // int secondLargest = -1; // Initialize to an invalid value
    // for (int i = n - 2; i >= 0; i--) {
    //     if (arr[i] < largest) {
    //         secondLargest = arr[i];
    //         break;
    //     }
    // }
    // if (secondLargest != -1) {
    //     printf("\nSecond largest element is: %d\n", secondLargest);
    // } else {
    //     printf("\nNo second largest element found (all elements are equal).\n");
    // }

    // 2-Insert a element at the specified position
    // int arr[] = {10, 20, 30, 40, 50};
    // int n = 5;
    // int element = 25, position = 2;
    // for (int i = n; i >= position; i--)
    // {
    //     arr[i] = arr[i - 1]; //=> 5-50,4-40,3-30,2-' '
    // }
    // arr[position] = element; //=> 5-50,4-40,3-30,2-25,
    // printf("\nArray after inserting element at position %d: ", position);
    // for (int i = 0; i <= n; i++)
    // {
    //     printf("%d ", arr[i]);
    // }

    // 3- Delete a element in array
    // int arr[] = {10, 20, 30, 40, 50, 30, 20};
    // int n = 7;
    // int element = 20;
    // int count = 0;
    // for (int i = 0; i < n; i++)
    // {
    //     if (arr[i] != element)
    //     {
    //         arr[count++] = arr[i];
    //     }
    // }
    // n = count;
    // printf("\nArray after deleting element %d: ", element);
    // for (int i = 0; i < n; i++)
    // {
    //     printf("%d ", arr[i]);
    // }

    // 4- Print all prime numbers of an array
    // int arr[] = {11, 13, 30, 5, 50, 30};
    // int n = 6, count = 0;

    // printf("\nPrime numbers in the array: ");
    // for (int i = 0; i < n; i++)
    // {
    //     int k = 1;
    //     count = 0;
    //     while (k <= arr[i])
    //     {
    //         if (arr[i] % k == 0)
    //         {
    //             count++;
    //         }
    //         k++;
    //     }
    //     if (count == 2)
    //     {
    //         printf("%d ", arr[i]);
    //     }
    // }

    // 5- Find All unique numbers of the array
    int arr[] = {11, 13, 30, 5, 50, 30};
    int n = 6, uniqueCount = 0;
    printf("\nUnique numbers in the array: ");
    for (int i = 0; i < n; i++)
    {
        uniqueCount = 0;
        for (int j = 0; j < i; j++)
        {
            if (arr[i] == arr[j + 1])
            {
                uniqueCount++;
                break;
            }
        }
        if (uniqueCount == 0)
        {
            printf("%d ", arr[i]);
        }
    }

    return 0;
}