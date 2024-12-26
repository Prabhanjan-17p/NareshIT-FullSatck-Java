#include<stdio.h>
int main(){
    //1-Write a C program to remove all spaces from a given string ?
    // char str[] = "Hello Wor ld";
    // int j=0;
    // printf("String after removing spaces: %s\n", str);
    // for (int i = 0; str[i] != '\0'; i++)
    // {
    //    if (str[i] != 32)
    //    {
    //       str[j++] = str[i];
    //    }
    // }
    // str[j] = '\0';
    // printf("String after removing spaces: %s\n", str);


    //2-Write a C program to convert all characters to uppercase from a given starting index to an ending index. If the index is invalid, print an error message ?
    // char str[] = "I am a student";
    // int j=0,s=4,e=13;
    // for (int i = 0; str[i] != '\0'; i++)
    // {
    //     if (i >= s && i <= e)
    //     {
    //        if (str[i] >= 97 && str[i] <= 123)
    //        {
    //             str[i] = str[i]-32;
    //        }
    //     }
    // }
    // printf("Result String is %s",str);



    //3- Write a C program to capitalize the first letter of each word in a given string ?
    // char str[] = "java programming is fun";
    // // char str[] = "i am a student of Nareshit";
    // int j=0;
    // for (int i = 0; str[i] != '\0'; i++)
    // {
    //     if (i==0)
    //     {
    //         str[i] = str[i]-32;
    //     }
        
    //     if (str[i] == 32)
    //     {
    //         if (str[i+1] >= 97 && str[i+1] <= 123)
    //         {
    //             str[i+1] = str[i+1]-32;
    //         }
    //     }
    // }
    // printf("Result String is : %s",str);


    //4-Write a C program to remove a specified character from a given string ?
    char str[] = "Programming";
    // char str[] = "Bookstore";
    char j='g';
    int n=0;
    for (int i = 0; str[i] != '\0'; i++)
    {
        if (str[i] != j)
        {
            str[n++] = str[i];
        }
    }
    str[n] = '\0';
    printf("Result String is : %s",str);
    
    
    return 0;
}