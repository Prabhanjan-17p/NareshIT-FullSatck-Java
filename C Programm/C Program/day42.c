#include<stdio.h>
int main(){
    //1-Write a C Program to test whether a number is magic number of not ? 
    int num = 17292;
    int sum =0;
    int temp = num;
    while (temp != 0)
    {
        int last = temp%10;
        sum += last;
        temp = temp/10;
    }
   temp = sum;
    int rev = 0;
    while (temp !=0)
    {
        int last = temp%10;
        rev = rev*10+last;
        temp = temp/10;
    }
    if (sum * rev == num)
    {
        printf("The NUmber is magic number -- Product of %d * %d = %d",sum,rev,num);
    }else{
        printf("The number is not mAgic number");
    }
    
 
    return 0;
}