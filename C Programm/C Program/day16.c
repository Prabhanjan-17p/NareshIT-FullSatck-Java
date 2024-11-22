#include<stdio.h>
void main(){
    //1- WACP for resturant menu using switch statement
    // int op,amt=0;
    // printf("\nWelcome to our Restaurant!\n");
    // printf("Our menu is as follows:\n");
    // xyz:
    // printf("1. Pizza : $10\n2. Burger : $7\n3. Pasta : $8\n4. Salad : $5\n5. Exit\n");
    // printf("Enter your choice : ");
    // scanf("%d",&op);
    // switch(op){
    //     case 1:
    //         amt =10;
    //         printf("You selected. Pizza price: %d\n",amt);
    //         break;
    //     case 2:
    //         amt =7;
    //         printf("You selected. Burger price: %d\n",amt);
    //         break;
    //     case 3:
    //         amt =8;
    //         printf("You selected. Pasta price: %d\n",amt);
    //         break;
    //     case 4:
    //         amt =5;
    //         printf("You selected. Salad price: %d\n",amt);
    //         break;
    //     case 5:
    //         return;
    //     default:
    //         printf("Invalid choice. Please try again.\n");
    //         return 0;
    // }
    // goto xyz;

    //2- WACP to calculate the bank calculation
    int op,amt=1000,dp,wt;
    printf("\nWelcome to the Bank!\n");
    printf("Our bank offers the following services:\n");
    nee:
    printf("1. Balance Enquiry\n2. Deposit\n3. Withdraw\n4. Exit\n");
    printf("Enter your choice : ");
    scanf("%d",&op);
    switch (op)
    {
    case 1:
        printf("Your current balance is: %d\n",amt);
        break;
    case 2:
        printf("Enter the amount to deposit: ");
        scanf("%d",&dp);
        amt = amt+dp;
        printf("Deposite successful! Yur new balance is: %d\n",amt);
        break;
    case 3:
        printf("Enter the amount to withdraw: ");
        scanf("%d",&wt);
        if (amt > wt)
        {
           amt = amt-wt;
            printf("Withdrawal successful! Your new balance is: %d\n",amt);
        } else {
            printf("Insufficient balance! Your current balance is: %d\n",amt);
        }
        break;
    case 4:
        return;
    
    default:
        printf("Invalid choice. Please try again.\n");
        break;
    }

    goto nee;
    // return 0;
}