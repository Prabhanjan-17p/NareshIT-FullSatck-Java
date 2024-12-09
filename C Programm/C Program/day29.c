#include <stdio.h>
int main()
{
    /*
    1-
        -> Read an integer value from the user to determine the size of an array.
        -> Dynamically allocate memory for the array based on the given size.
        -> Use a for loop to prompt the user to input elements and store them in the array.
        -> Use another for loop to print all the elements of the array, displaying each element along with its position.
    */
    // int array[100];
    // int arsize;
    // printf("Enter the array size ");
    // scanf("%d", &arsize);
    // printf("Enter %d array elements\n", arsize);
    // for (int i = 0; i < arsize; i++)
    // {
    //     printf("Element at index %d ", i);
    //     scanf("%d", &array[i]);
    // }
    // printf("The elements in the array are: ");
    // for (int i = 0; i < arsize; i++)
    // {
    //     printf("Element at index %d : %d\n", i, array[i]);
    // }

    /*
    2-
        -> Dynamically allocate memory for an array to store 10 integer values.
        -> Use a for loop to prompt the user to input 10 integer values and store them in the array.
        -> Use separate for loops to print all the elements located at even indices and odd indices of the array.
    // */
    // int array[100];
    // int arsize;
    // printf("Enter the array size ");
    // scanf("%d", &arsize);
    // printf("Enter %d array elements\n", arsize);
    // for (int i = 0; i < arsize; i++)
    // {
    //     printf("Element at index %d ", i);
    //     scanf("%d", &array[i]);
    // }
    // printf("Elements at even indices are :-\n");
    // for (int i = 0; i < arsize; i++)
    // {
    //     if (i % 2 == 0)
    //     {
    //         printf("Element at index %d : %d \n", i, array[i]);
    //     }
    // }
    // printf("Elements at odd indices are :-\n");
    // for (int i = 0; i < arsize; i++)
    // {
    //     if (i % 2 != 0)
    //     {
    //         printf("Element at index %d : %d \n", i, array[i]);
    //     }
    // }

    /*
        3.a-
        -> Reads an integer N from the user to define the size of a dynamically allocated array.
        -> Prompts the user to input N integer values into the array.
        -> Calculates and prints the sum of all elements in the array.
        3.b-
        -> Reads an integer N from the user to define the size of a dynamically allocated array.
        -> Prompts the user to input N integer values into the array.
        -> Calculates and prints the sum of all even numbers and the sum of all odd numbers in the array.
    */
//    int array[100];
//     int arsize,sum=0,sumOdd=0,sumEven=0;
//     printf("Enter the array size ");
//     scanf("%d", &arsize);
//     printf("Enter %d array elements\n", arsize);
//     for (int i = 0; i < arsize; i++)
//     {
//         printf("Element at index %d ", i);
//         scanf("%d", &array[i]);
//     }
//     //3.a
//     for (int i = 0; i < arsize; i++)
//     {
//         sum += array[i];
//     }
//     printf("The sum of all elements in the array is %d \n",sum);
//     //3.b
//     for (int i = 0; i < arsize; i++)
//     {
//         if (i % 2 == 0)
//         {
//             sumEven += array[i];
//         }
//     }
//     printf("The sum of all even numbers in the array is %d \n",sumEven);
//     for (int i = 0; i < arsize; i++)
//     {
//         if (i % 2 != 0)
//         {
//             sumOdd += array[i];
//         }
//     }
//     printf("The sum of all odd numbers in the array is %d \n",sumOdd);


    //4- Write a program in C to store N values in an array and display them in reverse order?
    // int as[50];
    // int N;
    // printf("Enter the size of an Array: ");
    // scanf("%d",&N);
    // printf("Enter %d elements in the array: \n",N);
    // for(int i=0; i<N; i++)
    // {
    //     printf("Element at index %d ", i);
    //     scanf("%d", &as[i]);
    // }
    // printf("The values stored in the array are: ");
    // for (int j = 0; j <N; j++)
    // {
    //     printf("%d ",as[j]);
    // }
    // printf("\n");
    // printf("The values stored in the array in reverse order are: ");
    // for (int  k = N-1; k >= 0; k--)
    // {
    //     printf("%d ",as[k]);
    // }
    

    //5-Write a program in C to copy the elements of one array into another array?
    int fArray[20];
    int SArray[20];
    int size;
    printf("Enter the size of the array: ");
    scanf("%d",&size);
    printf("Enter %d elements in the first array: \n",size);
    for(int i=0; i<size; i++)
    {
        printf("Element at index %d ", i);
        scanf("%d", &fArray[i]);
    }
    printf("The values stored in the first array are: ");
    for (int j = 0; j < size; j++){
        printf("%d ",fArray[j]);
    }
    printf("\n");
    printf("The elements copied into the second array are: ");
    for(int i=0; i<size; i++)
    {
        SArray[i] = fArray[i];
        printf("%d ",SArray[i]);
    }
    int *p = fArray;
    printf("Address of FArray using pointer is %d\n",p);
    int *p2 = SArray;
    printf("Address of FArray using pointer is %d\n",p2);
    
    return 0;
}