#include<stdio.h>
int main(){
    //Area of Square and Reactangle
    int sideOfSquare =5;
    int length =4, breadth =5;
    int AreaOfSqure = sideOfSquare*sideOfSquare;
    printf("Area of Square: %d\n", AreaOfSqure);
    int AreaOfRectangle = length*breadth;
    printf("Area of Rectangle: %d\n", AreaOfRectangle);


    // 2- WAP to find the next Multiple of 10
    // int Num = 56;
    // int NextMultiple = (Num/10 + 1)*10;
    // printf("The next Multiple of %d is %d",Num,NextMultiple);

    // 3- WAP to find the previous Multiple of 10
    // int Num = 44;
    // int previousMultiple = (Num/10)*10;
    // printf("The previous Multiple of %d is %d",Num,previousMultiple);

    //4- Multiple of 10 if greater than or equal to 5 then find the next Multiple of Given number
    // int num = 56;
    // int Lastdigit = num%10;
    // int currentNumber = num/10;
    // int res = (currentNumber*10) + (Lastdigit >= 5)*10;
    // printf("%d",res);
    // printf("%d",Lastdigit);

    //5 - 3 Digits reversed
    // int num = 786;
    // int actualNumber = num;
    // int result = num % 10*10;
    // num = num/10;
    // result = result+num%10;
    // num = num/10;
    // result = result*10+num;
    // printf("The actual Number is %d and the reversed number is %d",actualNumber,result);

    //6-Take 3 digit from user and add the 1st and 3rd digit
    // int num1,num2,num3,result=0;
    // printf("Enter 3 digit number: ");
    // scanf("%d %d %d",&num1,&num2,&num3);
    // result = num1 + num3;
    // printf("After Adding 1st and 3rd digit: %d + %d= %d",num1,num3,result);
}