// simple functions
// a function print HelloWorld
function display ()
{
    console.log("Hello World")
}
display()
// write a function to print your name in console and call it
// function to add two values and print the result in console
var a = 10, b = 20;
function add ()
{
    console.log(a + b);
}
add(); //30
add(); //30
/* similarly implement sub,mul and division operation */
function add2 (a,b)
{
    console.log(a+b)
}
add2(5,6) //11
add2(2, 3) //5
function add3 (a, b)
{
    return a + b;
}
var k=add3(2,5)
console.log(k) //7
// write a function which takes a string and return its no.of characters
function strlen (s)
{
    return s.length
}
var res = strlen("javascript");
console.log(res)
//write a function which takes side of square and returns area of the square
//write a function which accepts firstname,middlename,lastname and returns full name
//eg: fun("david","john","Henry") --> david john Henry
function fun (fn, mn, ln)
{
    return fn+" "+mn+" "+ln
}
var fullName = fun("david", "john", "Henry");
console.log(fullName);
//write a function which accepts firstname,middlename,lastname and returns shortName like
//eg: fun("david","john","Henry") --> DJH




function mnemonicGenerator (fn, mn, ln)
{
    var word = fn.charAt(0) + mn.charAt(0) + ln.charAt(0);
    return word.toUpperCase();
}
var fullName = mnemonicGenerator("david", "john", "Henry")
console.log(fullName)
function mnemonicGenerator2 (myName)
{
    var words = myName.split(' ')
    var word = words[0].charAt(0) + words[1].charAt(0) + words[2].charAt(0)
	return word.toUpperCase()
}
var fullName = mnemonicGenerator2("david john Henry")
console.log(fullName)


//default values
function sum3 (a, b=2)
{
    console.log(a+b)
}
sum3(5, 6)
sum3(5)
// write a function taxiFare which accepts no_of_km and fare_per_km as arguments and returns total fare. Incase fare_per_km is not passed, default fare is ₹25