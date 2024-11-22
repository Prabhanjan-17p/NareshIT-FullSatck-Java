#include <stdio.h>
int main()
{
    // 1- check department according to number
    //  int id ;
    //  printf("Department ID: ");
    //  scanf("%d",&id);
    //  char ch;
    //  if (id >= 11 && id <= 15)
    //  {
    //      ch = 's';
    //  } else if (id >= 16 && id <= 20){
    //      ch = 'd';
    //  } else if (id >= 21 && id <=23){
    //      ch = 'm';
    //  }
    //  switch (ch){
    //  case 's':
    //      printf("Software Department");
    //      break;
    //  case 'd':
    //      printf("Devloper Department");
    //      break;
    //  case 'm':
    //      printf("Mangement Department");
    //      break;

    // default:
    //     printf("Invalid ID");
    //     break;
    // }

    // 2- WACP to check the valid password or id
    //  int id, pass;
    //  printf("Enter your ID: ");
    //  scanf("%d", &id);
    //  char name[50];
    //  printf("Enter your ID Name: ");
    //  gets(name);
    //  switch (id == 1001)
    //  {
    //  case 1:
    //  printf("Enter your password: ");
    //  scanf("%d",&pass);
    //      switch (pass == 1010)
    //      {
    //      case 1:
    //          printf("Welcome to Software Department Name : %s",name);
    //          break;
    //      default:
    //          printf("Invalid Password");
    //          break;
    //      }
    //      break;
    //  default:
    //      printf("Invalid ID");
    //      break;
    //  }

    // 3- WACP to comapre the 2 person score and check the won person score is how much big to the loss person
    int ps1, ps2;
    char p1[20], p2[20];
    printf("Enter 1st person Name: ");
    scanf("%s", &p1);
    printf("Enter 1st person Score: ");
    scanf("%d", &ps1);
    printf("Enter 2nd person Name: ");
    scanf("%s", &p2);
    printf("Enter 2nd person Score: ");
    scanf("%d", &ps2);
    if (ps1 == ps2)
    {
        printf("it's a tie!\n");
        printf("Points difference: 0");
    }
    else
    {
        switch (ps1 > ps2)
        {
        case 1:
            printf("Winner: %s\n", p1);
            printf("Points difference: %d", ps1 - ps2);
            break;

        default:
            printf("Winner: %s\n", p2);
            printf("Points difference: %d", ps2 - ps1);
            break;
        }
    }

    // 4- WACP to find out the avg of 5 Subject
    //  int s1,s2,s3,s4,s5,tot;
    //  printf("Enter 5 subject number: ");
    //  scanf("%d %d %d %d %d",&s1,&s2,&s3,&s4,&s5);
    //  float avg;
    //  tot = s1+s2+s3+s4+s5;
    //  avg = (float)tot/5;
    //  int newAvg = (int)avg/10;
    //  switch (newAvg)
    //  {
    //  case 100: case 9:
    //      printf("Grade: A");
    //      break;
    //  case 8:
    //      printf("Grade: B");
    //      break;
    //  case 7:
    //      printf("Grade: C");
    //      break;
    //  case 6: case 5:
    //      printf("Grade: D");
    //      break;
    //  case 4:
    //      printf("Grade: E");
    //      break;
    //  case 3: case 2: case 1:
    //      printf("Grade: F");
    //      break;
    //  default:
    //      printf("Invalid input");
    //      break;
    //  }

    // 5- WACP a bank program that's the minimum amount is 2000 , d - deposited , w- withdwal
    // int bal = 2000, amt;
    // char ch ;
    // printf("Enter a operation (d-deposit, w-withdraw): ");
    // scanf("%c", &ch);
    // if (bal <= 0){
    //     printf("Amount can't be store");
    // }
    // else{
    //     switch (ch)
    //     {
    //     case 'd':
    //         printf("How many you want to deposit: ");
    //         scanf("%d", &amt);
    //         bal = bal + amt;
    //         printf("Your current balance is: %d\n", bal);
    //         break;
    //     case 'w':
    //         printf("How much you want to withdraw: ");
    //         scanf("%d", &amt);
    //         if (bal < amt){
    //             printf("Insufficient balance");
    //         }else{
    //             bal = bal - amt;
    //             printf("Your current balance is: %d\n", bal);
    //         }
    //         break;

    //     default:
    //         printf("Enter a valid option (d- deposit and w- withdraw): ");
    //         break;
    //     }
    // }

    // int nw ;
    // printf("Number : ");
    // scanf("%d", &nw);
    // if (nw == 13 || nw == 10)
    // {
    //     printf("Please enter %d",nw);
    // } else{
    //     printf("Invalid ID %c",nw);
    // }

    // ascii values of enter keys

    return 0;
}