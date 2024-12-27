#include <stdio.h>
// 1--------------
int rev(int n, int n2)
{
    return n + n2;
}
// 2--------------
int stringLength(char str[])
{
    int cc = 0;
    for (int i = 0; str[i] != '\0'; i++)
    {
        cc++;
    }
    return cc;
}

// 3--------------
int check(int n){

    if (n <= 1)
        return 0;
    for (int i = 2; i <= n / 2; i++)
        if (n % i == 0)
            return 0;
    return 1;
}
//4--------------
    int add(int a, int b){
        return a + b;
    }
//5--------------
int arraySum(int arr[], int n){
    int sum = 0;
    for(int i = 0; i < n; i++){
        sum += arr[i];
    }
    return sum;
}


int main()
{
    /*
    1-Function to Calculate the Sum of Two Integers
    Write a C program with a function int add(int a, int b) that takes two integers as arguments and returns their sum.
    */
    // int num1 = 123, num2 = 123;
    // int reversed = rev(num1,num2);
    // printf("Sum of two integers is %d ", reversed);

    /*
    2-Function to Find the Length of a String
    Write a C program with a function int stringLength(char str[]) that takes a string as an argument and returns its length.
    */
    //    char str[] = "abcdefghijklmnopqrstuvwxy";
    //    int len = stringLength(str);
    //    printf("Length of the string is %d ", len);

    /*
    3-Function to Check if a Number is Prime
    Write a C program with a function int isPrime(int num) that takes an integer as an argument and returns 1 if the number is prime, and 0 otherwise.
    */
    // int num = 17;
    // int pp = check(num);
    // if (pp)
    // {
    //     printf("%d is prime",num);
    // }else{
    //     printf("%d is not prime", num);
    // }


    /*
    4-Function to Calculate the Sum of Two Integers
    Write a C program with a function int add(int a, int b) that takes two integers as arguments and returns their sum.
    */
    // int num1 = 123, num2 = 123;
    // int Sum = add(num1,num2);
    // printf("Sum of two integers is %d ", Sum);

    /*
    5-Function to Find the Length of a String
    Write a C program with a function int stringLength(char str[]) that takes a string as an argument and returns its length.
    */
    int arr[] = {4, 6, 8, 2}, size = 4;
    int sum = arraySum(arr,size);
    printf("Sum of array elements is %d ", sum);

    return 0;
}