#include <stdio.h>
int main()
{
    // 1- Cricket Program
    //  int totaRun, totalIn, totalNotOut;
    //  printf("Enter Total Run: ");
    //  scanf("%d", &totaRun);
    //  printf("Enter Total Innings: ");
    //  scanf("%d", &totalIn);
    //  printf("Enter Total Not out: ");
    //  scanf("%d", &totalNotOut);
    //  if ( totalNotOut >= 0)
    //  {
    //      float average = (float)totaRun / (float)totalIn - (float)totalNotOut;
    //      printf("Average: %.2f\n", average);
    //  }
    //  else
    //  {
    //      printf("Total not out should be greater than total innings.\n");
    //  }

    // 2- Revers of 3 Number
    //  int num;
    //  printf("Enter 3 digit Number: ");
    //  scanf("%d", &num);
    //  int org = num;
    //  int reverseNum = num%10;
    //  num = num/10;
    //  reverseNum = reverseNum*10 + num%10;
    //  num = num/10;
    //  reverseNum = reverseNum*10 + num;
    //  printf("The Reverse Number of %d is %d",org,reverseNum);

    // 3- Discount of shopping mall

    float totAmt, dis;
    char ch;
    printf("Enter the total amount of shopping: ");
    scanf("%f", &totAmt);
    printf("Enter the type of user (g , v , r): ");
next:
    scanf(" %c", &ch);
    if (ch == 'g')
    {
        if (totAmt <= 100)
        {
            dis = 0;
            totAmt -= dis;
        }
        else if (totAmt >= 101 && totAmt <= 500)
        {
            dis = totAmt * 0.05;
            totAmt -= dis;
        }
        else if (totAmt >= 501)
        {
            dis = totAmt * 0.10;
            totAmt -= dis;
        }
        // printf("Guest");
    }
    else if (ch == 'r')
    {
        if (totAmt <= 200)
        {
            dis = totAmt * 0.05;
            totAmt -= dis;
        }
        else if (totAmt >= 201 && totAmt <= 500)
        {
            dis = totAmt * 0.10;
            totAmt -= dis;
        }
        else if (totAmt >= 501)
        {
            dis = totAmt * 0.15;
            totAmt -= dis;
        }
        // printf("Regular");
    }
    else if (ch == 'v')
    {
        if (totAmt <= 200)
        {
            dis = totAmt * 0.10;
            totAmt -= dis;
        }
        else if (totAmt >= 201 && totAmt <= 500)
        {
            dis = totAmt * 0.20;
            totAmt -= dis;
        }
        else if (totAmt >= 501)
        {
            dis = totAmt * 0.25;
            totAmt -= dis;
        }
        // printf("vip");
    }
    else
    {
        printf("Enter a valid user (g , v , r)");
        goto next;
    }

    printf("Total Bill = %.2f", totAmt);
    
    return 0;
}