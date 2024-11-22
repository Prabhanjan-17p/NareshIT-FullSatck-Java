// #include<stdio.h>
// int main(){
    //1- WACP to gives 2 range and prints the range between them
    // int n1 , n2;
    // printf("Enter 2 numbers: ");
    // scanf("%d %d",&n1,&n2);
    // if (n1<=n2) {
    // while (n1 <= n2){
    //     printf("%d", n1);
    //     if (n1 != n2) printf(","); 
    //     n1++;
    // }
    // } else printf("Invalid range");

    //2- REverse print the given range
    // int n1 , n2;
    // printf("Enter 2 numbers: ");
    // scanf("%d %d",&n1,&n2);
    // if (n1>=n2) {
    // while (n1 >= n2){
    //     printf("%d ", n1);
    //     n1--;
    // }
    // } else printf("Invalid range");

    //3- WACP to read a choice from the user and execute them
    // int op;
    // char ch;
    // // done:
    // printf("Menu:\n");
    // printf("1. Print lowercase letters from 'a' to 'z'\n");
    // printf("2. Print lowercase letters from 'z' to 'a'\n");
    // printf("3. Print uppercase letters from 'A' to 'Z'\n");
    // printf("4. Print uppercase letters from 'Z' to 'A'\n");
    // printf("5. Exit\n");
    // // printf("Enter your choice: ");
    // scanf("%d", &op);
    // switch (op) {
    // case 1:
    //     ch = 'a';
    //     while ( ch >= 'a' && ch <= 'z')
    //     {
    //         printf("%c ", ch);
    //         ch = ch +1;
    //     }
    //     break;
    // case 2:
    //    ch = 'z';
    //     while ( ch >= 'a' && ch <= 'z')
    //     {
    //         printf("%c ", ch);
    //         ch = ch - 1;
    //     }
    //     break;
    // case 3:
    //      ch = 'A';
    //     while ( ch >= 'A' && ch <= 'Z')
    //     {
    //         printf("%c ", ch);
    //         ch = ch + 1;
    //     }
    //     break;
    // case 4:
    //     ch = 'Z';
    //     while ( ch >= 'A' && ch <= 'Z')
    //     {
    //         printf("%c ", ch);
    //         ch = ch - 1;
    //     }
    //     break;
    // case 5:
    //     printf("Exiting the program.");
    //     return 0;
    
    // default:
    //     printf("Exiting the program.");
    //     break;
    // }
    // goto done;

    //4- WACP to print all the characters from A to z with ascii values
    // char ch='A';
    // // int num;
    // while (ch >='A' && ch <='z')
    // {
    //     printf("%d-%c\n", ch, ch);
    //     // printf("%c ", ch);
    //     ch = ch + 1;
    // }
    

//     return 0;
// }

#include<stdio.h>
#include <string.h>
int main(){
    //1-finding the maximum and minimum of the given number
    // int num;
    // printf("Enter a number: ");
    // scanf("%d", &num);
    // int max = 1, min = num;
    // while (num!= 0)
    // {
    //     int digit = num % 10;
    //     if (digit > max) {max = digit;}
    //     if (digit < min) {min = digit;}
    //     num = num / 10;
    // }
    // printf("Maximum: %d\nMinimum: %d", max, min);

    // 2- REverse of the given number ex - 100 out is 001
    // int num ;
    // printf("Enter a number: ");
    // scanf("%d", &num);
    // int reverse = 0;
    // while (num!= 0){
    //     int dig = num % 10;
    //     reverse = reverse * 10 + dig;
    //     num = num / 10;
    // }
    // printf("Reversed: %d", reverse);


    // char ch[20];
    // int i = 0;
    // char reverse[20];
    // printf("Enter the number: ");
    // scanf("%s", ch);
    // int length = strlen(ch);
    // // printf("%c", ch[length-1-1]); //
    // while (i < length) 
    // {
    //     reverse[i] = ch[length - i - 1];
    //     i++;
    // }
    // printf("Reversed: %s\n", reverse);
    

    //3- WACP to convert number into charecter ex- 102 output- one zero two 
    // int num ;
    // printf("Enter a number: ");
    // scanf("%d", &num);
    // int reverse=0;
    // while (num!= 0){
    //     int dig = num % 10;
    //     reverse = reverse * 10 + dig;
    //     num = num / 10;
    // }
    // while (reverse !=0)
    // {
    //     int lastD = reverse %10;
    //     switch (lastD)
    //     {
    //     case 1:
    //         printf("one ");
    //         break;
        
    //     case 2:
    //         printf("two ");
    //         break;
        
    //     case 3:
    //         printf("three ");
    //         break;
        
    //     case 4:
    //         printf("four ");
    //         break;
        
    //     case 5:
    //         printf("five ");
    //         break;
        
    //     case 6:
    //         printf("six ");
    //         break;
        
    //     case 7:
    //         printf("seven ");
    //         break;
        
    //     case 8:
    //         printf("eight ");
    //         break;
        
    //     case 9:
    //         printf("nine ");
    //         break;
        
    //     default:
    //         printf("zero ");
    //         break;
    //     }
    //     reverse = reverse / 10;
    // }
    



    return 0;
}