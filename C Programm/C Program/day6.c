#include<stdio.h>
#include<math.h>

int main(){
    //Set A
    //1- N number of natural number
    // int n = 10;
    // int naturalas = n*(n+1)/2;
    // printf("Sum of first %d natural numbers is %d\n", n, naturalas);

    //2- convert days into yrear and month and days formatted
    // int noOfDays= 500;
    // int year = noOfDays/365;
    // int month = noOfDays%365/30;
    // int days = noOfDays%365%30;
    // printf("%d years %d months %d days", year,month,days);

    //3- WACP bigest among 3 number
    // int num1= 30,num2=20,num3=40;
    // num1 > num2 && num1 > num3 && printf("Number %d is big number", num1);
    // num2 >num1 && num2 > num3 && printf("Number %d is big number", num2);
    // num3 >num1 && num3 > num2 && printf("Number %d is big number", num3);
    
    //4- WACP to find the square of a area and area of reactangular
    // int area = 5;
    // int square = area*area;
    // int length = 4, breadth =5;
    // int rectangleArea = length*breadth;
    // printf("The area of square %d\n The Rectangular of area %d", square, rectangleArea);

    //5-Find out the compound time
    // int principal = 1500, rate = 4, time = 3;
    // float numberOfTimePeriod =  1+rate/100.0;
    // double compoundtime = principal * pow((numberOfTimePeriod), time) - principal;
    // printf("Compound time: %.2lf", compoundtime);

    // Set - C
    //1- WACP to find out the number is positive , nagitive and zero 
    // int num = -4;
    // num > 0 && printf("The number %d is positive",num);
    // num < 0 && printf("The number %d is positive",num);
    // num == 0 && printf("The number %d is positive",num);

    //2-WACP to find out the total discount if buy more than 1000-5000  then get 5% of disscount and more than 5000 then get 10% disscount 
    // int purchaseAmount ;
    // printf("Enter the number of Passenger= ");
    // scanf("%d",&purchaseAmount);
    // purchaseAmount >= 1000 && purchaseAmount <=5000 && printf("Total Amount include 5%% = %d",5*purchaseAmount/100);
    // purchaseAmount > 5000 && printf("Total Amount include 10%% = %d", 10*purchaseAmount/100);
    // purchaseAmount < 1000 && printf("Total Amount = %d",purchaseAmount);

    //3-WACP to calculate the simple interest 
    // int principal, rate, time;
    // printf("Enter the principal amount: ");
    // scanf("%d", &principal);
    // printf("Enter the rate of time per annum: ");
    // scanf("%d", &rate);
    // printf("Enter the time in years: ");
    // scanf("%d", &time);
    // int si = (principal*rate*time)100;
    // printf("Simple Interest is %d ",si);

    //4- WACP to find the previous and next multiple 
    // int num = 26;
    // int num2 = num %10;
    // int mul = num/10*10;
    // num2 >= 5 && printf("Next Multiple %d ", mul+10);
    // num2 < 5 && printf("Privious Multiple %d ", mul);

    //5- WACp to calculate the bus seet price , if a man or ledy age is more than 60 to 100 then the discount is 20% of total cost
    int seatPrice = 300;
    int numberOfPassenger;
    int age ;
    float discount =0.0;
    printf("Enter the number of Passenger= ");
    scanf("%d",&numberOfPassenger);
    printf("Enter the Passenger age = ");
    scanf("%d",&age);
    int totalCost = seatPrice*numberOfPassenger;
    printf("Total cost before discount =%d",totalCost);
    age >= 60 && age <= 100 && printf("\nTotal cost after discount = %d ",(totalCost)-(20*totalCost/100)) && printf("\nDisount amount is=%d",20*totalCost/100);
    age < 60 && printf("\nTotal after cost =%d ",totalCost) && printf("\nDisount amount is=%.1f",discount);

    return 0;
}