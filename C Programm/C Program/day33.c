#include <stdio.h>
int main()
{
    // 1-Write a program in C to find the sum of the rows and columns of a square matrix ?
    //  int n;
    //  printf("Enter the size of the square matrix: ");
    //  scanf("%d", &n);
    //    if (n < 1) {
    //      printf("Invalid input! Size of the matrix should be a positive integer.\n");
    //      return 1;
    //  }

    // int arr[n][n];
    // printf("Input elements in the %dx%d matrix:\n", n, n);
    // for (int i = 0; i < n; i++) {
    //     for (int j = 0; j < n; j++) {
    //         printf("Enter element [%d][%d]: ", i, j);
    //         scanf("%d", &arr[i][j]);
    //     }
    // }
    // printf("\nThe matrix is:\n");
    // for (int i = 0; i < n; i++) {
    //     for (int j = 0; j < n; j++) {
    //         printf("%3d ", arr[i][j]);
    //     }
    //     printf("\n");
    // }

    //  // Calculate and display the sum of rows
    // printf("\nThe sum of rows is:\n");
    // for (int i = 0; i < n; i++) {
    //     int row_sum = 0;
    //     for (int j = 0; j < n; j++) {
    //         row_sum += arr[i][j];
    //     }
    //     printf("Row %d: %d\n", i + 1, row_sum);
    // }

    // // Calculate and display the sum of columns
    // printf("\nThe sum of columns is:\n");
    // for (int j = 0; j < n; j++) {
    //     int col_sum = 0;
    //     for (int i = 0; i < n; i++) {
    //         col_sum += arr[i][j];
    //     }
    //     printf("Column %d: %d\n", j + 1, col_sum);
    // }

    // Write a program in C to accept two matrices and check whether they are equal.
    //  int n1, m1, n2, m2;
    //  printf("Enter the size of the first matrix (rows and columns): ");
    //  scanf("%d %d", &n1, &m1);
    //  printf("Enter the size of the second matrix (rows and columns): ");
    //  scanf("%d %d", &n2, &m2);
    //  if (n1 <= 0 || m1 <= 0 || n2 <= 0 || m2 <= 0) {
    //      printf("Invalid input! Matrix dimensions must be positive integers.\n");
    //      return 1;
    //  }
    //  if (n1 != n2 || m1 != m2) {
    //      printf("Matrices with different dimensions cannot be compared. Please ensure both matrices have the same dimensions.\n");
    //      return 1;
    //  }

    // int arr[n1][m1];
    // printf("Input elements in the %dx%d matrix:\n", n1, m1);
    // for (int i = 0; i < n1; i++) {
    //     for (int j = 0; j < m1; j++) {
    //         printf("Enter element [%d][%d]: ", i, j);
    //         scanf("%d", &arr[i][j]);
    //     }
    // }
    // int arr2[n2][m2];
    // printf("Input elements in the %dx%d matrix:\n", n2, m2);
    // for (int i = 0; i < n2; i++) {
    //     for (int j = 0; j < m2; j++) {
    //         printf("Enter element [%d][%d]: ", i, j);
    //         scanf("%d", &arr2[i][j]);
    //     }
    // }
    // for (int i = 0; i < n1; i++)
    // {
    //     for (int j = 0; j < m1; j++)
    //     {
    //         if (arr2[i][j] != arr[i][j])
    //         {
    //             printf("Two matrices are not equal.");
    //             return 0;
    //         }
    //     }
    // }
    // printf("Two matrices are equal.");

    // 3-Write a C program to find the maximum element of each row in a 2D array?
    int n, m;
    printf("Enter the number of rows and columns of the matrix : ");
    scanf("%d %d", &n, &m);
    int arr[n][m];
    printf("Enter the elements of the matrix : \n");
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < m; j++)
        {
            scanf("%d", &arr[i][j]);
        }
    }

    for (int i = 0; i < n; i++)
    {
        int max = arr[i][0];
        for (int j = 0; j < m; j++)
        {
            if (arr[i][j] > max)
                max = arr[i][j];
        }
        printf("Maximum element of row %d : %d \n",i+1, max);
    }
    

    return 0;
}