// // #include <stdio.h>

// // int main() {
// //     int i, j;

// //     // Print the first row
// //     for (j = 7; j <= 9; j++) {
// //         printf("%d\t", j);
// //     }
// //     printf("\n");

// //     // Print the second row
// //     printf("%d\t", 6); // First element of the second row
// //     printf("%d\t", 1); // Second element of the second row
// //     printf("%d\t", 2); // Third element of the second row
// //     printf("\n");

// //     // Print the third row
// //     for (j = 5; j >= 3; j--) {
// //         printf("%d\t", j);
// //     }
// //     printf("\n");

// //     return 0;
// // }

// // #include <stdio.h>

// // int main() {
// //     int n = 3; // Size of the square matrix
// //     int start = 1, end = n * n; // Start and end numbers for the pattern

// //     // Loop through the rows
// //     for (int i = 0; i < n; i++) {
// //         if (i == 0) {
// //             // First row (left to right)
// //             for (int j = 0; j < n; j++) {
// //                 printf("%d\t", end - (n - j - 1));
// //             }
// //         } else if (i == n - 1) {
// //             // Last row (right to left)
// //             for (int j = 0; j < n; j++) {
// //                 printf("%d\t", start + (n - j - 1));
// //             }
// //         } else {
// //             // Middle rows
// //             printf("%d\t", end - n);       // First element of the middle row
// //             printf("%d\t", start);        // Middle element
// //             printf("%d\t", start + 1);    // Last element of the middle row
// //         }
// //         printf("\n");
// //     }

// //     return 0;
// // }



// #include <stdio.h>

// int main() {
//     // int n = 3; // Size of the matrix (3x3)
//     // int num = 7; // Starting number

//     // for (int i = 0; i < n; i++) {
//     //     for (int j = 0; j < n; j++) {
//     //         printf("%d\t", num);
//     //         num = (num == 10) ? 1 : num + 1; // Reset to 1 after 10, otherwise increment
//     //     }
//     //     printf("\n"); // Newline after each row
//     // }






//     // int n;
//     // int arr[n];
//     // printf("Enter the size of the array: ");
//     // scanf("%d", &n);
//     // printf("Enter %d elements: ", n);
//     // for (int i = 0; i < n; i++)
//     // {
//     //     printf("Enter element %d: ", i );
//     //     scanf("%d", &arr[i]);
//     // }
//     // printf("\n My array Values: ");
//     // for (int i = 0; i < n; i++)
//     // {
//     //    printf("%d ", arr[i]);
//     // }



//     int arr[] = {20,18,58,27,3,4};
//     int n = 6;

//     printf("Unsorted array: ");
//     for (int i = 0; i < n; i++)
//     {
//         printf("%d ", arr[i]);
//     } //20,18,58,27,3,4
    
//     for (int i = 0; i < n; i++) //1
//     {
//         //18,20,3,4,27,58
//         for (int j = 0; j < n - 1; j++) //5
//         {
//             if (arr[j]  > arr[j + 1])
//             {
//                 int temp = arr[j];
//                 arr[j] = arr[j + 1];
//                 arr[j + 1] = temp;
//             }
//         } //i=1 => 18,20,3,4,27,58
//     }
//     printf("\nSorted array in ascending order is: ");
//     for (int k = 0; k < n; k++)
//     {
//         printf("%d ", arr[k]);
//     }
  

//     return 0;
// }


#include<stdio.h>
int main(){
    // int n = 3;
    // int arr[]={1,2,3};
    // for (int  i = 0; i < n; i++)
    // {
    //     printf("%d ", arr[i]);
    // }


     int arr[] = {10, 20, 30, 40, 50};
     int n = 5;
     int element = 25, position = 2;
     for (int i = n; i >= position; i--)
     {
        arr[i] = arr[i-1]; //=> 5-50,4-40,3-30,2-' '
     }
     arr[position] = element;//=> 5-50,4-40,3-30,2-25,
     printf("\nArray after inserting element at position %d: ", position);
     for (int i = 0; i <= n; i++)
     {
         printf("%d ", arr[i]);
     }
    
    return 0;
}