#include<stdio.h>
int main(){
    //1-WACP to find the person is eligible for voting or not only use if statement
    // char name[20];
    // printf("Enter your name: ");
    // scanf("%s",&name);
    // int age;
    // printf("Enter your age: ");
    // scanf("%d",&age);
    // if (age >=18)   {
    //     printf("%s You are eligible for vote",name);
    // }
    // if (age < 18)   {
    //     printf("Soory %s you are not eligible for vote",name);
    // }

    //2-WACP to find the person is eligible for voting or not,  use if-else statement
    // char name[20];
    // printf("Enter your name: ");
    // scanf("%s",&name);
    // int age;
    // printf("Enter your age: ");
    // scanf("%d",&age);
    // if (age >=18)   {
    //     printf("%s You are eligible for vote",name);
    // } else {
    //     printf("Soory %s you are not eligible for vote",name);
    // }

    //3-WACP to find out the maximum between 2 number, only use if statement
    // int num1,num2;
    // printf("Enter 2 numbers: ");
    // scanf("%d %d ",&num1,&num2);
    // if (num1 > num2){
    //     printf("%d is greater than %d",num1,num2);
    // }
    // if (num2 > num1){
    //     printf("%d is greater than %d",num2,num1);
    // }
    

    //4-WACP to find out the maximum between 2 number, use if-else statement
    // int num1,num2;
    // printf("Enter 2 numbers: ");
    // scanf("%d %d",&num1,&num2);
    // if (num1>num2)   {
    //     printf("%d is greater than %d",num1,num2);
    // } else {
    //     printf("%d is greater than %d",num2,num1);
    // }

    //5-WACP to read a character from user and convert them into upper case and lower case using if statement only
    // char c;
    // printf("Enter a character: ");
    // scanf("%c",&c);
    // if (c >= 'a' && c <= 'z'){
    //     c = c - 32;
    //     printf("The converted character is: %c",c);
    //     goto end;
    // }
    // if (c >= 'A' && c <= 'Z'){
    //     c = c + 32;
    //     printf("The converted character is: %c",c);
    // }
    // end:

    //6-WACP to read a character from user and convert them into upper case and lower case using if-else statement
    // char c;
    // printf("Enter a character: ");
    // scanf("%c",&c);
    // if (c >= 97 && c <= 122){
    //     c = c - 32;
    //     printf("The converted character is: %c",c);
    // } else {
    //     c = c + 32;
    //     printf("The converted character is: %c",c);
    // }

    //7- WACP to check a character is vowel or consonant using if statement only
    // char c;
    // printf("Enter a character: ");
    // scanf("%c",&c);
    // if (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U'){
    //     printf("vowel");
    //     return 0;
    // }
    // if (((c >= 'a' && c <= 'z') && (c != 'a' || c !='e' || c != 'i' || c != 'o' || c != 'u'))
    // || ((c >= 'A' && c <= 'Z') && (c != 'A' || c !='E' || c != 'I' || c != 'O' || c != 'U'))){
    //     printf("consonant");
    // }
    
    //8- WACP to check a character is vowel or consonant using if-else statement
    // char c;
    // printf("Enter a character: ");
    // scanf("%c",&c);
    // if (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U'){
    //     printf("vowel");
    //     return 0;
    // } else{
    //     printf("consonant");
    // }

    //9- WACP to find out the character is lowercase or uppercase using if statement only
    char c; 
    printf("Enter a character: ");
    scanf("%c",&c);
    if (c >= 'a' && c <= 'z'){
        printf("The character is lowercase");
    }
    if (c >= 'A' && c <= 'Z'){
        printf("The character is uppercase");
    }
    
    //10- WACP to find out the character is lowercase or uppercase using if-else statement 
    // char c;
    // printf("Enter a character: ");
    // scanf("%c",&c);
    // if (c >= 'a' && c <= 'z'){
    //     printf("The character is lowercase");
    // } else {
    //     printf("The character is uppercase");
    // }
    
    return 0;
}