#include <stdio.h>
int main()
{
    // 1- Find Array element
    // int arr[50];
    // int n, el;
    // printf("Enter the size of the array: ");
    // scanf("%d", &n);
    // printf("Enter %d elements: ", n);
    // for (int i = 0; i < n; i++)
    // {
    //     scanf("%d", &arr[i]);
    // }
    // printf("\n");
    // printf("Enter the element to search: ");
    // scanf("%d", &el);
    // for (int i = 0; i < n; i++)
    // {
    //     if (el == arr[i])
    //     {
    //         printf("Element %d found at index %d\n", el, i);
    //         return 0;
    //     }
    // }
    // printf("Element %d not found at Array", el);

    // 2-sort in  bubbling order
    // int arr[] = {61, 12, 23, 56};
    // int n = 4;
    // printf("Unsorted array: ");
    // for (int i = 0; i < n; i++)
    // {
    //     printf("%d ", arr[i]);
    // }
    
    // for (int i = 0; i < n; i++)
    // {
    //     for (int j = 0; j < n - 1; j++)
    //     {
    //         if (arr[j] > arr[j + 1])
    //         {
    //             int temp = arr[j];
    //             arr[j] = arr[j + 1];
    //             arr[j + 1] = temp;
    //         }
    //     }
    // }
    // printf("\nSorted array in ascending order is: ");
    // for (int k = 0; k < n; k++)
    // {
    //     printf("%d ", arr[k]);
    // }
    

    //3- target pair found
    int arr[] = {0, 0, 9, 9};
    int target = 9;
    int n = 4;
    for (int i = 0; i < n ; i++){
        for (int j = i + 1; j < n; j++){
            if (arr[i] + arr[j] == target){
                printf("Target pair found at index (%d , %d)\n", i, j);
            }
        }
    }

    //4-find minimum and maximum of an array
    // int arr[] = {120, 20, 30, 40, -10};
    // int n = 5;
    // int min = arr[0];
    // int max = arr[0];
    // for (int i = 0; i < n; i++)
    // {
    //     if (min > arr[i])
    //     {
    //         min = arr[i];
    //     } else if (max < arr[i])
    //     {
    //         max = arr[i];
    //     }
    // }
    // printf("Minimum value is: %d\n", min);
    // printf("Maximum value is: %d\n", max);
    

    //5-find even and odd array and store them in different array
    // int arr1[] = {25,42,47,56,33};
    // int n = 5;
    // int evenCount = 0,oddCount = 0;
    // for (int  j = 0; j < n; j++)
    // {
    //     if (arr1[j] % 2 == 0)
    //     {
    //         evenCount++;
    //     } else{
    //         oddCount++;
    //     }
    // }
    // int nn = evenCount;
    // int nn2 = oddCount;
    // printf("even count id %d\n", evenCount);
    // printf("odd count id %d\n", oddCount);
    // int arr2[evenCount],arr3[oddCount];
    // for (int i = 0; i < n; i++)
    // {
    //     if (arr1[i] % 2 == 0)
    //     {
    //         arr2[evenCount - 1] = arr1[i];
    //         evenCount--;
    //     }
    //     else if (arr1[i] % 2 != 0){
    //         arr3[oddCount - 1] = arr1[i];
    //         oddCount--;
    //     }
    // }
    // printf("even array [ ");
    // for (int i = 0; i < nn; i++)
    // {
    //     printf("%d ",arr2[i]);
    // }
    // printf("]\n");
    // printf("odd array [ ");
    // for (int i = 0; i < nn2; i++)
    // {
    //     printf("%d ",arr3[i]);
    // }
    // printf("]\n");

 

    return 0;
}