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
function add(a,b){
    return a+b;
}
var z=add(5,3)
console.log(z)




function mul (a, b,...c)
{
    console.log(c)
    return a * b;
}
let z1 = mul(5, 6,1,2);
console.log(z1)

function friends (a, ...b)
{
	console.log(a, b.length)
	let q = [a,...b] //["sita","gita", "vani", "rani"]
	console.log(q.length)
}

friends("sita", "gita", "vani", "rani")




//spread operator is used by three dots









function fun12 (a,b,...c)
{
    let d= [...c,6]
    console.log(a+b,c,d.length)
}
fun12(1, 2, 3, 4, 5)
// how to add two arrays
function addarrays (a1, a2)
{
    let c = [...a1, ...a2];
    console.log(c)
}
addarrays(["5","6"],["7","8"])

function addNumbers (...a)
{
    console.log(a)
  return a[0] + a[1] + a[2];
}

const numbers = ["r","a","m"];
console.log(addNumbers(...numbers)); 

function takeOranges (a,b,...c)
{
	console.log(c)
	;["o3", "o4", "o5", "o6"]
	let k = [c, 2] //[["o3","o4","o5","o6"],2]
	let p = [...c, 2] //["o3","o4","o5","o6",2]
	console.log(k,p)
}
takeOranges("o1","o2","o3","o4","o5","o6")

function newFun() {
	console.log("hii")
}
console.log(newFun)

var h = function ()
{
  console.log("hii")  
} 
console.log(h)


//callbacks
function easy (s)
{
    s()
    console.log("Js is easy")
}
function simple ()
{
    console.log("Js is simple")
}
easy(simple)


function one ()
{
    console.log("one")
}
function two() {
	console.log("two")
}
function both(a,b) {
    console.log(a, b);
    a()
    b()
}
both(one,two)