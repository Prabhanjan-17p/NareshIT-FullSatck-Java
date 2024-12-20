#include <stdio.h>
int main()
{
    // 1-Write a C program to find the number(s) occurring an odd number of times in a given array.
    // int arr[100];
    // int n;
    // printf("Enter the number of elements in the array: ");
    // scanf("%d", &n);
    // if (n <= 0)
    // {
    //     printf("Invalid input! Array Size must be greater than zero.\n");
    //     return 1;
    // }
    // printf("Enter the elements of the array: ");
    // for (int i = 0; i < n; i++)
    // {
    //     scanf("%d", &arr[i]);
    // }

    // if (n == 0) {
    //     printf("No elements in the array.\n");
    //     return;
    // }
    // int hash[1000] = {0};  // Hash table to store counts (Size can be adjusted as needed)
    // int i;
    // // Count occurrences of each element
    // for (i = 0; i < n; i++) {
    //     hash[arr[i]]++;
    // }
    // printf("The elements occurring odd number of times are: ");
    // int found = 0;
    // for (i = 0; i < 1000; i++) {
    //     if (hash[i] % 2 != 0) {
    //         printf("%d ", i);
    //         found = 1;
    //     }
    // }
    // if (!found) {
    //     printf("None");
    // }
    // printf("\n");

    // 2-Write a C program to rearrange the elements of a given array by moving all zeros to the front while maintaining the relative order of non-zero elements.
    //  int arr[100];
    //  int n;
    //  printf("Enter the number of elements in the array: ");
    //  scanf("%d", &n);
    //  if (n <= 0) {
    //      printf("Invalid input! Array size must be greater than zero.\n");
    //      return 1;
    //  }
    //  printf("Enter the elements of the array: ");
    //  for (int i = 0; i < n; i++) {
    //      scanf("%d", &arr[i]);
    //  }
    //  int result[n];
    //  int index = n - 1;
    //  for (int i = n - 1; i >= 0; i--) {
    //      if (arr[i] != 0) {
    //          result[index--] = arr[i];
    //      }
    //  }
    //  while (index >= 0) {
    //      result[index--] = 0;
    //  }
    //  printf("Rearranged array: [");
    //  for (int i = 0; i < n; i++) {
    //      printf("%d", result[i]);
    //      if (i < n - 1) {
    //          printf(", ");
    //      }
    //  }
    //  printf("]\n");

    // 3-Write a C program to print the element(s) that occur the maximum number of times in a given array.
    // int n;
    // printf("Enter the number of elements in the array: ");
    // scanf("%d", &n);
    // if (n <= 0)
    // {
    //     printf("Invalid input! Array size must be greater than zero.\n");
    //     return 1;
    // }
    // int arr[n];
    // printf("Enter the elements of the array:\n");
    // for (int i = 0; i < n; i++)
    // {
    //     scanf("%d", &arr[i]);
    // }
    // if (n == 0)
    // {
    //     printf("No elements in the array.\n");
    //     return;
    // }
    // int frequency[1000] = {0}; // Frequency array to count occurrences
    // int maxFrequency = 0;
    // // Calculate frequency of each element
    // for (int i = 0; i < n; i++)
    // {
    //     frequency[arr[i]]++;
    //     if (frequency[arr[i]] > maxFrequency)
    //     {
    //         maxFrequency = frequency[arr[i]];
    //     }
    // }
    // printf("Element(s) with maximum occurrences:\n");
    // for (int i = 0; i < 1000; i++)
    // {
    //     if (frequency[i] == maxFrequency)
    //     {
    //         printf("Element %d occurred %d times.\n", i, maxFrequency);
    //     }
    // }

    /*
    4--
        Write a C program to check if a given matrix is a magic matrix or not.

        A matrix is called a magic matrix if :-
        ----------------------------------------
        -> The sum of each row,
        -> The sum of each column,
        -> The sum of the principal diagonal, and
        -> The sum of the secondary diagonal are all the same.

    */
    int n;
    printf("Enter the size of the square matrix (n x n): ");
    scanf("%d", &n);
    if (n <= 0)
    {
        printf("Invalid matrix size.\n");
        return 1;
    }
    int matrix[100][100];           
    int magicSum = 0;               
    int diag1Sum = 0, diag2Sum = 0; 
    int sumRow, sumCol;
    printf("Enter the elements of the %d x %d matrix:\n", n, n);
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            scanf("%d", &matrix[i][j]);
        }
    }
    // Calculate the reference sum using the first row
    for (int j = 0; j < n; j++)
    {
        magicSum += matrix[0][j];
    }
    // Check all rows, columns, and calculate diagonals
    for (int i = 0; i < n; i++)
    {
        sumRow = 0;
        sumCol = 0;
        for (int j = 0; j < n; j++)
        {
            sumRow += matrix[i][j]; // Row sum
            sumCol += matrix[j][i]; // Column sum
        }
        // If row or column sum doesn't match magicSum, it's not a magic matrix
        if (sumRow != magicSum || sumCol != magicSum)
        {
            printf("The given matrix is not a magic matrix.\n");
            return 0;
        }
        // Update the sums of the diagonals
        diag1Sum += matrix[i][i];
        diag2Sum += matrix[i][n - i - 1];
    }
    // Check if diagonal sums match magicSum
    if (diag1Sum != magicSum || diag2Sum != magicSum)
    {
        printf("The given matrix is not a magic matrix.\n");
    }
    else
    {
        printf("The given matrix is a magic matrix.\n");
    }

    return 0;
}