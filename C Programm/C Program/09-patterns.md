Pattern Questions

Print these patterns using loops:

```text

1.  *****
    *****
    *****
    *****
    *****
  int num = 5;
    for (int i = 0; i < num; i++)
    {
        for (int j = 0; j <=num ; j++)
        {  
            printf("*"); 
        }
        printf("\n");
    }


2.  *
    **
    ***
    ****
    *****
 int num = 5;
    for (int i = 0; i < num; i++)
    {
        for (int j = 0; j <=num ; j++)
        {
            if (i>=j)
            {
                printf("* ");
            }
        }
        printf("\n");
    }

3.  *****
    ****
    ***
    **
    *

     int n = 9;
    for (int i = 1; i <= n; i++)
    {
        int s = n - i +1;
        for (int  j = 1; j <= s; j++)
        {
            printf("*");
        }
        printf("\n");
        
    }


4.  1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5

     int n = 9;
    for (int i = 1; i <= n; i++)
    {
        for (int  j = 1; j <= n; j++)
        {
            if (i >= j)
            {
            printf("%d ",j);
            }
        }
        printf("\n"); 
    }


5.  *
    **
    ***
    ****
    *****
    ****
    ***
    **
    *
 int n = 5;
    for (int i = 1; i <= n*2-1; i++)
    {
        if (i <= n)
        {
        for (int  j = 1; j <= n; j++)
        {
            if (i >= j)
            {
            printf("*");
            }
        }
        } else{
            int z = 2*n-i;
            for(int j = 1; j <= z; j++){
                printf("*");
            }
        }
        printf("\n"); 
    }

6.       *
        **
       ***
      ****
     *****
  
    int num = 5;
    for (int i = 1; i <= num; i++)
    {
        int s = num-i;
        for (int j = 1; j <= s ; j++)
        {  
            printf(" "); 
        } 
        for (int  k = 1; k <= i; k++)
        {
            printf("*"); 
        }
        
        printf("\n");
    }

7.   *****
      ****
       ***
        **
         *
int num = 5;
    for (int i = 1; i <= num; i++)
    {
        for (int j = 1; j <= num ; j++)
        {  
            if (j >= i)
            {
               printf("*"); 
            }
            else{
                printf(" ");
            }
        }
        printf("\n");
    }

8.      *
       ***
      *****
     *******
    *********
 int num = 5;
    for (int i = 1; i <= num; i++)
    {
        int s = num-i;
        for (int j = 1; j <= s ; j++)
        {  
            printf(" "); 
        } 
        for (int  k = 1; k <= i; k++)
        {
            printf("*"); 
        }
        for (int  k = 2; k <= i; k++)
        {
            printf("*"); 
        }
        
        printf("\n");
    }

9.  *********
     *******
      *****
       ***
        *
 int num = 5;
    for (int i = 1; i <= num; i++)
    {
        int s = num*2-i;
        for (int j = 1; j <= s ; j++)
        {  
            if (i<=j)
            {
                printf("*");
            }else{
            printf(" ");} 
        } 
        
        printf("\n");
    }


10.      *
        * *
       * * *
      * * * *
     * * * * *
 int num = 5;
    for (int i = 1; i <= num; i++)
    {
        int s = num-i;
        for (int j = 1; j <= s ; j++)
        {  
            printf(" ");
        } 
        for (int j = 1; j <= i; j++)
        {
            printf("* ");
        }
        printf("\n");
    }

11.  * * * * *
      * * * *
       * * *
        * *
         *
int num = 5;
    for (int i = 1; i <= num; i++)
    {
        int s = num;
        for (int j = 1; j <= s ; j++)
        {  
            if (i<=j)
            {
                printf("* ");
            }else{
            printf(" ");} 
        } 
        
        printf("\n");
    }  

12.  * * * * *
      * * * *
       * * *
        * *
         *
         *
        * *
       * * *
      * * * *
     * * * * *
  int num = 5;
    for (int i = 1; i <= num * 2; i++)
    {
        // int s = num-i;
        if (i <= 5)
        {
            for (int m = 1; m <= num; m++)
            {
                if (i <= m)
                {
                    printf("* ");
                }
                else
                {
                    printf(" ");
                }
            }
        }
        else
        {
             // Lower part of the pattern
            int k = i - num;
            for (int s = 1; s <= num-k; s++) {
                printf(" ");
            }
            for (int m = 1; m <= k; m++) {
                printf("* ");
            }
        }
        printf("\n");
    }

13.      *
        * *
       *   *
      *     *
     *********
int n = 5;
    for (int i = 1; i <= n; i++) {
        // Print spaces
        for (int j = 1; j <= n - i; j++) {
            printf(" ");
        }
        // Print stars
        for (int j = 1; j <= 2 * i - 1; j++) {
            if (i == n || j == 1 || j == 2 * i - 1) {
                printf("*");
            } else {
                printf(" ");
            }
        }
        printf("\n");
    }

14.  *********
      *     *
       *   *
        * *
         *
int n = 5;
    for (int i = n; i >= 1; i--) {
        // Print spaces
        for (int j = 1; j < n-i; j++) {
            printf(" ");
        }
        // Print stars
        for (int j = 1; j <= 2 * i - 1; j++) {
            if (i == n || j == 1 || j == 2 * i - 1) {
                printf("*");
            } else {
                printf(" ");
            }
        }
        printf("\n");
    }

15.      *
        * *
       *   *
      *     *
     *       *
      *     *
       *   *
        * *
         *
    int num = 5;
    for (int i = 1; i <= num * 2 - 1; i++)
    {
        if (i <= 5)
        {
            for (int j = 1; j <= num - i; j++)
            {
                printf(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++)
            {
                if (j == 1 || j == 2 * i - 1)
                {
                    printf("*");
                }
                else
                {
                    printf(" ");
                }
            }
        }
        else
        {
            int bottomRow = i - num; // Map row to bottom part
            for (int j = 1; j <= bottomRow; j++)
            {
                printf(" ");
            }
            for (int j = 1; j <= 2 * (num - bottomRow) - 1; j++)
            {
                if (j == 1 || j == 2 * (num - bottomRow) - 1)
                {
                    printf("*");
                }
                else
                {
                    printf(" ");
                }
            }
        }
        printf("\n");
    }

16.           1
            1   1
          1   2   1
        1   3   3   1
      1   4   6   4   1


17.      1
        212
       32123
      4321234
       32123
        212
         1


18.   **********
      ****  ****
      ***    ***
      **      **
      *        *
      *        *
      **      **
      ***    ***
      ****  ****
      **********


19.    *        *
       **      **
       ***    ***
       ****  ****
       **********
       ****  ****
       ***    ***
       **      **
       *        *


20.    ****
       *  *
       *  *
       *  *
       ****

21.    1
       2  3
       4  5  6
       7  8  9  10
       11 12 13 14 15

22.    1
       0 1
       1 0 1
       0 1 0 1
       1 0 1 0 1

23.        *      *
         *   *  *   *
       *      *      *

24.    *        *
       **      **
       * *    * *
       *  *  *  *
       *   **   *
       *   **   *
       *  *  *  *
       * *    * *
       **      **
       *        *

25.       *****
         *   *
        *   *
       *   *
      *****

26.   1 1 1 1 1 1
      2 2 2 2 2
      3 3 3 3
      4 4 4
      5 5
      6

27.   1 2 3 4  17 18 19 20
        5 6 7  14 15 16
          8 9  12 13
            10 11

28.      *
        * *
       * * *
      * * * *
     * * * * *
      * * * *
       * * *
        * *
         *

29.      
       *        *
       **      **
       ***    ***
       ****  ****
       **********
       ****  ****
       ***    ***
       **      **
       *        *

30.         1
          2 1 2
        3 2 1 2 3
      4 3 2 1 2 3 4
    5 4 3 2 1 2 3 4 5


31.      4 4 4 4 4 4 4  
         4 3 3 3 3 3 4   
         4 3 2 2 2 3 4   
         4 3 2 1 2 3 4   
         4 3 2 2 2 3 4   
         4 3 3 3 3 3 4   
         4 4 4 4 4 4 4   

32.    E
       D E
       C D E
       B C D E
       A B C D E

33.    a
       B c
       D e F
       g H i J
       k L m N o
     
34.    E D C B A
       D C B A
       C B A
       B A
       A
       
35.    1      1
       12    21
       123  321
       12344321
```
