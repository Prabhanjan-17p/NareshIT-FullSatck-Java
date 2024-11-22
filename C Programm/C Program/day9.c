#include<stdio.h>
int main(){
    //1- Time of day classifer
    // int hour ;
    // printf("Enter hour(24-hour format): ");
    // start:
    // scanf("%d", &hour);
    // if (hour >=0 && hour <= 23){
    //     if (hour >0 &&  hour <= 12)
    //     {
    //         printf("Good Morning");
    //     }
    //     if (hour >= 13 && hour <= 18)
    //     {
    //         printf("Good Afternoon");
    //     }
    //     if (hour >= 19 && hour <= 22)
    //     {
    //         printf("Evening ");
    //     }
    //     if (hour >= 23 && hour <= 24)
    //     {
    //         printf("Good Night");
    //     }
    // } else {
    //     printf("Please Enter the hour in valid format (24-hour format): ");
    //     goto start;
    // }
    
    //2- Find the maximum number among 3 number 
    // int num1=12, num2=23,num3= 34;
    // if (num1> num2 && num1 > num3)
    // {
    //     printf("%d which is number1 id greater number",num1);
    // } else if (num2 > num3 )
    // {
    //     printf("%d which is number2 is greater number ",num2);
    // } else{
    //     printf("%d which is number3 is greater number ",num3);
    // }
    
    //3- Check the number is positive or negative or zero
    // int num=-12;
    // if (num > 0){
    //     printf("%d is positive",num);
    // }
    // if (num < 0){
    //     printf("%d is negative",num);
    // } if (num == 0){
    //     printf("%d is zero",num);
    // }

    //4-Check the character is Alphabet or digit or special character
    // char ch;
    // printf("Enter a character: ");
    // scanf("%c", &ch);
    // if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
    //     printf("Enter character is Alphabet");
    // }
    // if (ch >= '0' && ch <= '9')
    // {
    //     printf("Enter character is Digit");
    // }
    // if (ch == '@' )
    // {
    //     printf("Enter character is Special character");
    // }
    
    //5-validate the triangle using side
    int side1, side2, side3;
    printf("Enter side1 , side2 ,side3: ");
    scanf("%d %d %d",&side1,&side2,&side3);
    if (side1+side2 > side3 && side1+side3 > side2 && side2+side3 >side1)
    {
        printf("The triangle is valid");
    } else {
        printf("The triangle is not valid");
    }
    

    return 0;
}