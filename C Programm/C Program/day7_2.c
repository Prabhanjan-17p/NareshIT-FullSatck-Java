// All the MCQ questions
#include<stdio.h>
int main(){
    //1
    // int x = 15; int y = 2;
    // int z = x / y + x % y;  // z = 7+1 = 8
    // printf("z = %d\n", z);

    //2
    //  int a = 10; int b = 15; 
    //  int c = a++ + b--; // c = 10+15= 25
    //  printf("a = %d, b = %d, c = %d\n", a, b, c); // a= 11 b = 14 because of post increment

    //3
    // int a = 5; 
    // a += 3 * 2; // a = a+3*2 = 5+6=11
    // printf("a = %d", a);

    //4
    //  int x = 3; int y = 2; 
    //  int z = x++ * (x + y) - y--; // z = x++ * (x++ + y--) - y-- = 3*(4+2)-2= 18-2= 16 because of () preference first then value increase and add out side not increase 
    //  printf("z = %d\n", z);

    //5
    // int a = 5, b = 10, c = 15; 
    // int result = !(a <= b) && !(b != c) && !(c >= a); // res = !(a <=b)== ! true == false, res = 0
    // printf(“result = %d\n”, result);

    //6
    // int a = 10, b = 20, c = 10; 
    // int result = (a > b) || (b == c) && (c != a); // res = false || false && false == false == 0
    // printf(“result = %d\n”, result);

    //7=
    // int x = 3; int y = 2;
    // int z = x++ * (x + y) - --y ;// z = 3 * (3+2) - 1 = 17
    // printf("z = %d\n", z);

    //8
    // int x = 10; int y = 5; 
    // int z = x - --y; // z = 10 -4 =6
    // printf("x = %d, y = %d, z = %d\n", x, y, z); 

    //9
    // int a = 1, b = 2, c = 3;
    // int result = a++ + ++b + c-- - --c + ++a + b-- + a - --b; 
    // int result2 = 3 + 1 + 1 - 1 + 3+ 1 + 3 - 1; 
    // printf("result = %d\n", result);

    //10
     int a = 5; int b = 10; int c = 15; 
     int result = a++ * ++b - --c; //res = 5 * 11 - 14; 
     printf("result = %d\n", result);
    return 0;
}