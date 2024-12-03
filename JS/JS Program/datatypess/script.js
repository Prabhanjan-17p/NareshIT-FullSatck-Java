var a = 36,b=27;
console.log(Math.sqrt(a), Math.cbrt(b));
console.log(Math.abs(-10))
console.log(Math.max(5, 6, 1, 5, 6, 9, 23))
console.log(Math.min(5, 6))
console.log(Math.floor(4.8))
console.log(Math.ceil(4.1))
console.log(Math.round(4.5))
console.log(Math.pow(3,4),3**4)


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

// alert(`Square = ${aa**2+ bb**2}`);




var str = "I love javascript   "
console.log(str[0]) //I
console.log(str.length) //17
//length returns total number of characters
console.log(str.charAt(15)) //p
console.log(str.indexOf('a'))//8
//indeOf returns indexof first occurance
console.log(str.lastIndexOf('a')); //10
console.log(str.startsWith("I l")) //True
console.log(str.endsWith("script")) //True
console.log(str.trim()) //Trim will removes spaces from last and first of the given string
console.log(str.replace('a',"k"))
// it replaces for only one time
console.log(str.toUpperCase())
//It converts given string into uppercase
console.log(str.toLowerCase())
// it converts given string into lowercase
str="I Love JS"
console.log(str.split(''))
//split is used to split the characters based on delimiter
console.log(str.slice(2,5))
//slice is used to get sub string of specific index to specific index
console.log(str.slice(-1))// last value




// check from the given whether they are belongs to agarwals or not
var n = "pranav agarwal"
console.log(n.endsWith("agarwal"))
// check whether a person's middle is mayen or not
var n1 = "John Mayen patrick"
console.log(n1.split(' ')[1] == "Mayen")
//how to check an input value empty or not
//inp.trim()==""