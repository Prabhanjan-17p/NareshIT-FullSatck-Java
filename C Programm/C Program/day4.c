#include<stdio.h>
#include<conio.h>
int main(){
    //1- WAP to display the selling price ,profit along with vat and service charges 
    // int costTV=3500,sellingPrice=0,vat=0,serviceCharge=0,profit =0;
    // sellingPrice = costTV +  (27*costTV)/100;
    // profit = sellingPrice - costTV;
    // vat = 12.7*sellingPrice/100;
    // serviceCharge = 3.87*sellingPrice/100;
    // printf("A TV cost is %d \n selling price is %d \n the total profit is %d \n the VAT is %d \n And the service charge is %d ", costTV,sellingPrice,profit,vat,serviceCharge);

    //2- WACP to calculate the book price if buy less than 1000 no discount , if buy more than 1000-5000 then 5% discount  , if buy more than 5000 then 10% discount
    // int purchaseAmount ;
    // int discount =0;
    // printf("Enter the number of Passenger= ");
    // scanf("%d",&purchaseAmount);
    // purchaseAmount >= 1000 && purchaseAmount <=5000 && printf("Total Amount include 5%% = %d",5*purchaseAmount/100);
    // purchaseAmount > 5000 && printf("Total Amount include 10%% = %d", 10*purchaseAmount/100);
    // purchaseAmount < 1000 && printf("Total Amount = %d",purchaseAmount);

    // 3- WACp to calculate the bus seet price , if a man or ledy age is more than 60 to 100 then the discount is 20% of total cost
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
    
}