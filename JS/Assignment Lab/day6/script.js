//1- Multiplication table
function Multiplication(n) {
    var fact = 1
    for (var i = 1; i <= 10; i++) {
        fact = n * i;
        console.log(n + " x " + i + " = " + fact);
    }
}
Multiplication(5)

//2-read a number calculation sum of even and odd numbers
function sumEvenOdd(n) {
    var evenSum=0,oddSum=0
    for(var i =1;i <= n; i++) {
        if(i % 2 == 0) {
            evenSum = i + evenSum
        } else {
            oddSum = i + oddSum
        }
    }
    console.log("Sum of even numbers: " + evenSum)
    console.log("Sum of odd numbers: " + oddSum)
}
sumEvenOdd(10)

//3- Input number why many digits
function countDigits(n) {
    var count = 0;
    while (n != 0) {
        n = Math.floor(n / 10);
        count++;
    }
    return count;
}
var n = 123456789
console.log(`Number of digits in ${n}: ` + countDigits(n));

//4- reverse the number
function reverseNumber(n) {
    var reversed = 0;
    while (n != 0) {
        reversed = reversed * 10 + n % 10;
        n = Math.floor(n / 10);
    }
    return reversed;
}
var num = 123456789
console.log(`Reversed number: ${reverseNumber(num)}`);

//5- Factorial number
function Factorial(n){
    // if(n == 0 || n == 1) {
    //     return 1;
    // } else {
    //     return n * Factorial(n - 1);
    // }
    var a = 1
    for(var i=1; i<=n; i++) {
        a *= i
    }
    console.log(`Factorial: ${n} = ${a}`);
}
Factorial(5)