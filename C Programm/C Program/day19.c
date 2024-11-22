#include<stdio.h>
#include<math.h>
int main(){
    //1- Find the power of the number and user enter the base and exponent
    // int ba,ex,res=1,i=1;
    // printf("Enter the base: ");
    // scanf("%d",&ba);
    // printf("Enter the exponent: ");
    // scanf("%d",&ex);
    // if (ex > 0)
    // {
    //     //method-1
    //     // res = pow(ba,ex);
    //     // printf("%d^%d = %d",ba,ex,res);

    //     //method-2
    //     while (i <= ex)
    //     {
    //         res = res * ba;
    //         i++;
    //     }
    //     printf("%d^%d = %d",ba,ex,res);
    // } else{
    //     printf("Invalid input...please enter positive number");
    // }
    
    //2- find the factorial number 
    // int num , res=1,i=1;
    // printf("\nEnter the number: ");
    // scanf("%d",&num);
    // if (num > 0){
    //     while (i <= num){
    //         res = res * i;
    //         i++;
    //     }
    //     printf("factorial Number of %d = %d\n",num,res);
    // }else{
    //     printf("Invalid input...please enter positive number");
    // }

    //3- Check the number is palindrom or not
    // int num,i=1,res;
    // printf("\nEnter the number: ");
    // scanf("%d",&num);
    // int or = num;
    // if ( num > 0)
    // {
    //     while (num !=0 )
    //     {
    //         int last = num % 10;
    //         res = res * 10 + last;
    //         num = num /10;
    //     }
    //     if (res == or)
    //     {
    //         printf("%d is palindrome Number",or);
    //     } else{
    //         printf("%d not is palindrome Number",or);
    //     }
        
    // } else {
    //     printf("Invalid input...please enter positive number");
    // }
    
    //4- enter number is prime or not
    // int num , i=1, res,count=0;
    // printf("\nEnter the number: ");
    // scanf("%d",&num);
    // if (num >0)
    // {
    //     while(i <= num){
    //         if (num % i == 0)
    //         {
    //             count++;
    //         }
    //         i++;
    //     }
    //     if (count >= 3)
    //     {
    //         printf("%d is not a prime number",num);
    //     } else{
    //         printf("%d is not a prime number",num);
    //     }
        
    // } else{
    //     printf("Invalid input...please enter positive number");
    // }
    
    //5- Convert the number into there word format
    // int num , i=1, res=0;
    // printf("\nEnter the number: ");
    // scanf("%d",&num);
    // if (num > 0){
    //     // res = num;
    //     while(num !=0 ){
    //         int last = num % 10;
    //         res = res*10 + last;
    //         num = num /10;
    //     }
    //     while (res != 0)
    //     {
    //         int las = res % 10;
    //         switch(las){
    //             case 1: printf("One "); break;
    //             case 2: printf("Two "); break;
    //             case 3: printf("Three "); break;
    //             case 4: printf("Four "); break;
    //             case 5: printf("Five "); break;
    //             case 6: printf("Six "); break;
    //             case 7: printf("Seven "); break;
    //             case 8: printf("Eight "); break;
    //             case 9: printf("Nine "); break;
    //             default : printf("Zero "); break;
    //         }
    //         res = res / 10;
    //     }
        
    // } else {
    //     printf("Invalid input...please enter positive number");
    // }

    //6- Find the maximum digit of given number 
    // int num,i,max=0;
    // printf("\nEnter the number: ");
    // scanf("%d",&num);
    // while (num !=0)
    // {
    //     int last = num%10;
    //     if (max < last){
    //         max = last;
    //     }
    //     num = num / 10;
    // }
    // printf("Maximum digit in the given number is: %d",max);
    
    //7- find out the number is automorphic
    // int num1,num2,num3,max,i;
    // printf("\nEnter the first number: ");
    // scanf("%d",&num1);
    // printf("\nEnter the second number: ");
    // scanf("%d",&num2);
    // printf("\nEnter the thrid number: ");
    // scanf("%d",&num3);
    // int sq1 = num1*num1;
    // int sq2 = num2*num2;
    // int sq3 = num2*num2;
    // int lastsq1 = sq1 % 10;
    // int lastsq2 = sq2 % 10;
    // int lastsq3 = sq2 % 10;
    // if((lastsq1 == lastsq2) && (lastsq1 == lastsq2)){
    //     printf("\nThe number is automorphic");
    // } else{
    //     printf("\nThe number is not automorphic");
    // }

    //8- check the number is spy or not
    int num,i=1,sum,pro=1;
    printf("\nEnter the number: ");
    scanf("%d",&num);
    int sp = num;
    while (num !=0)
    {
        int last = num%10;
        sum = sum + last;
        pro = pro * last;
        num = num / 10;
    }
    if (pro == sum)
    {
       printf("\nThe number %d is SPY number",sp);
    } else{
        printf("\nThe number %d is SPY number",sp);
    }
    
    
    return 0;
}