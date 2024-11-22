#include <stdio.h>
int main()
{
    // 1 - check the input is AM or PM
    //  int hour, minute;
    //  printf("Enter hour : "); scanf("%d",&hour);
    //  printf("Enter minute : "); scanf("%d",&minute);
    //  if (hour >=0 && hour < 12)
    //  {
    //      printf("%d:%d AM",hour,minute);
    //  } else {
    //      if (hour == 12)
    //      {
    //          printf("%d:%d PM",hour,minute);
    //      } else {
    //          // hour -= 12;
    //          hour = hour - 12;
    //          printf("%d:%d PM",hour,minute);
    //      }
    //  }

    // 2- Bouns Check program of a employee
    int yrOfEx, salary, bouns;
    float rating;
    printf("Enter Years of Experience : ");
    scanf("%d", &yrOfEx);
    printf("Enter Rating : ");
    scanf("%f", &rating);
    printf("Enter Salary : ");
    scanf("%d", &salary);
    if (yrOfEx > 5)
    {
        if (rating > 4)
        {
            bouns = salary * 0.20;
            salary += bouns;
        }
        if (rating >= 3 && rating <= 4)
        {
            bouns = salary * 0.10;
            salary += bouns;
        }
        if (rating < 3)
        {
            bouns = salary * 0.05;
            salary += bouns;
        }
        printf("Bouns = %d\n", bouns);
        printf("Salary = %d\n", salary);
    }
    else
    {
        if (rating > 4)
        {
            bouns = salary * 0.10;
            salary += bouns;
        }
        else
        {
            bouns = 0;
            salary += bouns;
        }
        printf("Bouns = %d\n", bouns);
        printf("Salary = %d\n", salary);
    }

    return 0;
}