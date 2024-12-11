#include <stdio.h>
int main()
{
    // 1-Write a program in C to rotate an array by N positions ?
    //  int n, position;
    //  printf("Enter the size of the array: ");
    //  scanf("%d", &n);
    //  int arr[n];
    //  int result[n];
    //  printf("Enter %d elements: ", n);
    //  for (int i = 0; i < n; i++) {
    //      scanf("%d", &arr[i]);
    //  }
    //  printf("Enter the position: ");
    //  scanf("%d", &position);
    //  printf("Enter the rotation %d: ", position);
    //  int temp = 0;
    //  for (int i = position; i < n; i++) {
    //      result[temp++] = arr[i];
    //  }
    //  for (int i = 0; i < position; i++) {
    //      result[temp++] = arr[i];
    //  }
    //  for (int i = 0; i < n; i++) {
    //      arr[i] = result[i];
    //  }
    //  printf("\nAfter rotating the array from the %dth position, the array is: ", position);
    //  for (int i = 0; i < n; i++) {
    //      printf("%d ", arr[i]);
    //  }

    // 2-Find the missing elements of the array
    //  int arr[] = {1,3,2,6,9,8};
    //  int n= 6,temp=0;
    //  for (int i = 0; i < n; i++)
    //  {
    //      for (int k = 0; k < n-1; k++)
    //      {
    //          temp = 0;
    //          if (arr[k] > arr[k+1])
    //          {
    //              temp = arr[k];
    //              arr[k] = arr[k+1];
    //              arr[k+1] = temp;
    //          }
    //      }
    //  }
    //  // printf("\n Big elements OF an array : %d",arr[n-1]);
    //  printf("\n Missing elements are : ");
    //  for (int i = 0; i < n-1; i++){
    //      if(arr[i+1] - arr[i] > 1){
    //          for(int k = arr[i]+1; k < arr[i+1]; k++){
    //              printf("%d ", k);
    //          }
    //      }
    //  }

    /*
    3-You are given a large integer represented as an integer array digits, where each digits[i] represents the i-th digit of the integer. The digits are ordered from most significant to least significant (left to right). The large integer does not contain any leading zeros.
    Write a program to increment the large integer by one and return the resulting array of digits ?
    */
    // int arr[] = {1,2,3};
    // int n = 3;

    // int carry = 1;
    // for (int i = n - 1; i >= 0; i--)
    // {
    //     int sum = arr[i] + carry;
    //     arr[i] = sum % 10;
    //     carry = sum / 10;
    // }
    // if (carry) // in case of carry =1
    // {
    //     printf("[ %d", carry);
    //     for (int i = 0; i < n; i++)
    //     {
    //         printf(", %d", arr[i]);
    //     }
    //     printf(" ]\n");
    // }
    // else // in case of carry = 0
    // {
    //     printf("[ ");
    //     for (int i = 0; i < n; i++)
    //     {
    //         printf("%d", arr[i]);
    //         if (i != n - 1)
    //         {
    //             printf(", ");
    //         }
    //     }
    //     printf(" ]\n");
    // }

    // 4-Write a program in C to count the frequency of each element in an array ?
     int arr[] = {1, 2, 3, 2, 1, 4, 5, 3, 2};
     int size = 9,count=0;
     int freq[size];

     for (int i = 0; i < size; i++)
     {
         for (int k = 0; k < size-1; k++)
         {
             int temp = 0;
             if (arr[k] > arr[k+1])
             {
                 temp = arr[k];
                 arr[k] = arr[k+1];
                 arr[k+1] = temp;
             }
         }
     }
     printf("Last dimension %d\n",arr[size-1]);
     for (int i = 0; i < size; i++)
     {
        printf(" %d",arr[i]);
     }

     printf("\n");
    for (int i = 0; i < size; i++)
    {
        count =1;
        for (int j = i+1; j < size; j++)
        {
            if (arr[i] == arr[j])
            {
                count++;
            }else{
                break;
            }
        }
        // printf("%d occurs %d time\n",arr[i],count); // it print all elements and occurences
        printf("%d occurs %d time%s\n", arr[i], count, count > 1 ? "s" : "");

        i += count;
    }



    return 0;
}