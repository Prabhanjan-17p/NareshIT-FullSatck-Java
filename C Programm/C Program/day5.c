#include<stdio.h>
#include<conio.h>

int main() {
    //1- calculate the total bill if greater than 100 unit , add per unit = 4.5 and less or equal to 100 then add per unit =3
    // int bill,perUnit,totbil,totUnit=75;
    // int newUnit = totUnit <= 100 && printf("total bill %d\n", totUnit*3);
    // newUnit == 0 && printf("total bill %.0f\n",((totUnit-(totUnit-100))*3)+(totUnit-100)*4.5); 

    //2 - WACP to take as input a number then display it, it is posetive , negetive , or zero
    // int num ;
    // printf("Enter any number : ");
    // scanf("%d",&num);
    // num > 0 && printf("%d it is a Posetive Number",num);
    // num < 0 && printf("%d is a Negative Number",num);
    // num == 0 && printf("%d is equal to 0",num);

    //3-WACP to calculate the salary of manger and HR adding their bouns Manger get 10% and HR get 5%
    // char name  ;
    // int basicSalary = 100, totSalary ;
    // printf("Enter the Name of employee(as Manger=M and HR=HR) : ");
    // scanf("%c",&name);
    // printf("Enter the Basic salary of as per your enter employee");
    // scanf("%d",&basicSalary);
    // name == 'M' && printf("The basic Salary = %d And Total salary (increase 10%% bouns) =%d",basicSalary,basicSalary+ (10*basicSalary/100));
    // name == 'H' && printf("The basic Salary = %d And Total salary (increase 5%% bouns) =%d",basicSalary,basicSalary+ (5*basicSalary/100));

    //4- WACP to calculate the N number of natural number withouth using loops and if else
    int num=10;
    int count=0;
    int sum = num*(num+1)/2;
    printf("The sum of natural number from 1 to %d is %d",num,sum);

}
