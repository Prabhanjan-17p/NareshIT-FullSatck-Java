#include<stdio.h>
#include<math.h>
int main(){
    //1- Check the number is automorphic
    int num,dno=0,i;
    printf("Enter a number: ");
    scanf("%d",&num);
    int nn = num;
    // while (num != 0)
    // {
    //     dno++;
    //     num = num/10;
    // }

    // dno = (int) (log(num) / log(10)+ 1);
    dno = (int) (log10(num) + 1);//Number of digits count

    int res = nn*nn;
    if (dno == 1 && nn == res%10)
    {
        printf("No is automorphic");
    } else if (dno == 2 && nn == res%100){
        printf("No is automorphic");
    } else{
        printf("Not automorphic");
    }
    printf("%d\n",dno);

    //2- Multiplication of digit 
    // int num,res=0,i=1,res1=1;
    // printf("Enter a number: ");
    // scanf("%d",&num);
    // if (num < 0) num = -num;
    // printf("Multiplication of digit:[");
    // while (num!= 0){
    //     int last = num%10;
    //     res = res * 10 + last;
    //     num = num / 10;
    // }
    // while (res != 0){   
    //     int last = res%10;
    //     printf("%d x ",last);
    //     res1 = res1 * last;
    //     res = res / 10;
    // }
    // printf("] %d\n",res1);

    //3- Check prime or not
    // int num,i=1,res,count=0;
    // printf("Enter a number: ");
    // scanf("%d",&num);
    // while (i <= num)
    // {
    //     if (num % i == 0)
    //     {
    //         count++;
    //     }
    //     if (count >= 3)
    //     {
    //         printf("Not a prime number");
    //         return;
    //     }
    //     i++;
    // }
    // printf("No is prime number");

    //4- Check the number is perfect number or not
    // int num , i=1, res=0;
    // printf("Enter a number: ");
    // scanf("%d",&num);
    // while (i <= num)
    // {
    //     if (num % i == 0)
    //     {
    //         res = res+i;
    //     }
    //     i++;  
    // }
    // res = res - num;
    // printf( res == num ? "A perfect number " :"Not a perfect number");

    //5- Check the number is Disarium or not
    // int num, i=1, res=0,res1 = 0,j=1;
    // printf("Enter a number: ");
    // scanf("%d",&num);
    // int neNum = num;
    // while (num !=0)
    // {
    //     int last = num % 10;
    //     res = res * 10 + last;
    //     num = num / 10;
    // }
    // while (res != 0)
    // {
    //     int last = res % 10;
    //     res1 = res1 + pow(last, j);
    //     j++;
    //     res = res /10;
        
    // }
    // printf(res1 == neNum ? "Disarium Number" : "Not Disarium Number");
    
    
    
    return 0;
}