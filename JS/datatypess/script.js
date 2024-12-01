console.log(Math.ceil(Math.random()*10000));
// Write a program to print ludo dice 1-6
console.log((Math.round(Math.random()*5)+1)); // in case of round 
console.log((Math.ceil(Math.random()*5)+1)); // in case of ceil 


var  num= 23.41233;
console.log(num.toFixed(2)); // 23.41
console.log(num.toPrecision(2)); // 23
console.log(num.toPrecision('5')); // 23.412



// binary , hexa , decimal Conversion
var a = 13;
console.log(a.toString(2)); // 1101 --> binary
console.log(a.toString(8)); // 15 --> octal decimal
console.log(a.toString(16)); // d --> hexa decimal

// Convart a value into a number 
console.log(5+Number('5')); // 10
console.log(5 + + ('5')); // 10
console.log(5 - '5'); // 0
console.log(5 - -'5'); // 10
console.log(5+Number("kanha")) // NaN

//String
// There is no diffrence between single quotation and double quotation. 
var nn1 = "Kanha"
var nn2 = 'kanha'
console.log(typeof nn1 , typeof nn2)
// var qut = "Hello bacho "Namaste"" --> it gives you error
// var qut = 'Hello bacho 'Namaste'' --> it gives you error 
var qut1 = "Hello bacho 'Namaste'" 
var qut2 = 'Hello bacho "Namaste"' 
var qut3 = `Hello bacho Namaste`  // --> Backticks are used to take dynamic values like
//And it is called " Template Literal "
var nt = 45 , qnt = 5;
var tot = `total $${nt*qnt}`
console.log(tot)


//Write a code to find a+b whole square formula result by inputting  a,b values and print result using template litral
var aa = 2;
var bb = 3;
console.log(`Square = ${aa**2+ bb**2+2*aa*bb}`)

//javascript hero , freecodecamp