#include<stdio.h>
int main(){
    int choice, num1, num2, result;
    char continueChoice;

    while (1) {
        printf("\n===== MENU =====\n");
        printf("1. Addition\n");
        printf("2. Subtraction\n");
        printf("3. Multiplication\n");
        printf("4. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                printf("Enter two numbers: ");
                scanf("%d %d", &num1, &num2);
                result = num1 + num2;
                printf("The sum is: %d\n", result);
                break;

            case 2:
                printf("Enter two numbers: ");
                scanf("%d %d", &num1, &num2);
                result = num1 - num2;
                printf("The difference is: %d\n", result);
                break;

            case 3:
                printf("Enter two numbers: ");
                scanf("%d %d", &num1, &num2);
                result = num1 * num2;
                printf("The product is: %d\n", result);
                break;

            case 4:
                printf("Exiting the program. Goodbye!\n");
                return 0;

            default:
                printf("Invalid choice. Please try again.\n");
                continue;
        }

        while (1) {
            printf("Do you want to continue? (y/n): ");
            scanf(" %c", &continueChoice);
            if (continueChoice == 'y' || continueChoice == 'Y') {
                break;
            } else if (continueChoice == 'n' || continueChoice == 'N') {
                printf("Thank You\n");
                return 0;
            } else {
                printf("Invalid input. Please enter 'y' or 'n'.\n");
            }
        }
    }
    return 0;
}

#include <stdio.h>
int main()
{
    int i=1,expo=4,res=1,base=2;
      while (i <= expo)
        {
            res = res * base;
            i++;
        }
    printf("The result is: %d\n", res);
    return 0;
}

// #include <stdio.h>
// int main()
// {
//     int num1, num2,power=0,last;
//     printf("Enter two numbers: ");
//     scanf("%d%d", &num1, &num2);

//     while (num1 <= num2)
//     {
//         int noOfDigit = 0;
//         int ss = num1;
//         int dig = num1;
//         while (dig != 0)
//         {
//             noOfDigit++;
//             dig = dig / 10;
//         }

//         power = 0;
//         while (ss != 0)
//         {
//             last = ss % 10;
//             int res = 1;
//             int i = 1;
//             while (i <= noOfDigit)
//             {
//                 res = res * last;
//                 i++;
//             }
//             power = res + power;
//             ss = ss / 10;
//         }
//          if (num1 == power) {
//             printf("%d is an Armstrong number\n", num1);
//         }
            
       
//         num1++;
//     }

//     return 0;
// }

