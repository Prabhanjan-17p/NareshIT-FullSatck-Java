#include<stdio.h>
int main(){
    //1- 3x3 matrix
    // int matrix1[3][3] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    // int n;
    // int arr[n][n];
    // printf("Enter matrix Sizes:");
    // scanf("%d", &n);
    // for (int i = 0; i < n; i++)
    // {
    //     for (int j = 0; j < n; j++)
    //     {
    //         printf("Element [%d],[%d]",i, j);
    //         scanf("%d", &arr[i][j]);
    //     }
    // }
    // printf("\nThe matrix is :-\n");
    // for (int i = 0; i < n; i++)
    // {
    //     for (int j = 0; j < n; j++)
    //     {
    //         printf("%d ",arr[i][j]);
    //     }
    //     printf("\n");
    // }

    //2- Adding 2 square matrix
    // int n;
    // int arr[n][n];
    // int arr2[n][n];
    // printf("Enter matrix Sizes ");
    // scanf("%d",&n);
    // printf("\nEnter 1- matrix element \n");
    // for (int i = 0; i < n; i++)
    // {
    //     for (int j = 0; j < n; j++)
    //     {
    //         printf("Element [%d],[%d]",i, j);
    //         scanf("%d", &arr[i][j]);
    //     }
    // }
    // printf("Enter 2 - matrix element \n");
    // for (int i = 0; i < n; i++)
    // {
    //     for (int j = 0; j < n; j++)
    //     {
    //         printf("Element [%d],[%d]",i, j);
    //         scanf("%d", &arr2[i][j]);
    //     }
    // }
    // printf("\nThe sum of the matrices is :-\n");
    // for (int i = 0; i < n; i++)
    // {
    //     for (int j = 0; j < n; j++)
    //     {
    //         printf("%d ",arr[i][j]+arr2[i][j]);
    //     }
    //     printf("\n");
    // }

    //3- transpose matrix 
    // int n ;
    // int arr[n][n];
    // printf("Enter the size of the matrix ");
    // scanf("%d",&n);
    // for (int  i = 0; i < n; i++)
    // {
    //     for (int  j = 0; j < n; j++)
    //     {
    //         printf("Element - [%d],[%d] ",i,j);
    //         scanf("%d",&arr[i][j]);
    //     }
    // }
    // printf("\nThe transpose of the matrix is :-\n");
    // for (int i = 0; i < n; i++)
    // {
    //     for (int j = 0; j < n; j++)
    //     {
    //         printf("%d ",arr[j][i]);
    //     }
    //     printf("\n");
    // }

    //4- sum of diagonal of the matrix
    // int n ;
    // int arr[n][n];
    // printf("Enter the size of the matrix ");
    // scanf("%d",&n);
    // for (int  i = 0; i < n; i++){
    //     for (int  j = 0; j < n; j++){
    //         printf("Element - [%d],[%d] ",i,j);
    //         scanf("%d",&arr[i][j]);
    //     }
    // } 
    // int sum = 0;
    // printf("Principal diagonal elements are :-\n");
    // for(int i=0 ; i<n;i++){
    //     printf("%d ",arr[i][i]);
    //     sum = sum+arr[i][i];
    // }
    // printf("Sum of the principal diagonal element is %d",sum);

    //5-Find the sum of horizontal diagonal elements
    int n ;
    int arr[n][n];
    printf("Enter the size of the matrix ");
    scanf("%d",&n);
    for (int  i = 0; i < n; i++){
        for (int  j = 0; j < n; j++){
            printf("Element - [%d],[%d] ",i,j);
            scanf("%d",&arr[i][j]);
        }
    }
    int sum = 0;
    for(int i=0 ; i<n;i++){
        printf("%d ",arr[i][n-i-1]);
        sum = sum+arr[i][n-i-1];
    }
    printf("Sum of the principal horizontal diagonal is %d",sum);
    
    
    
    return 0;
}