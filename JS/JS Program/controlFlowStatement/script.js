// simple
// Write a function that prints/alerts success when username passed is javascript
//input: fun("javascript")
//success
function display1 (str)
{
    if (str === "javascript")
    {
        console.log("success")
    }
}
display1("javascript")
// WAP to check and print the given number is even or odd
//DRY- Don't Repeat Yourself
function evenOdd (num)
{
    if (num % 2 == 0)
        return "even"
    else
        return "odd"
}
console.log(evenOdd(25))

//WAF that accepts fullname and returns true if the last name is "patel", else it returns false

// WAF that accepts a number and check whether its sum of digits is less than or greter than product of digits
//eg:12  , sum =1+2=3
//product =1*2=2, if number is 23

function sumOrProduct (num)
{
    //product of the sum
    while (num !=0 ){
        var ld = num % 10;
        var fd = (num / 10).toFixed();
        console.log(+fd+ld,+fd*ld)
    }

    //reverse
    var fd =0
    while (num !=0 ){
        var ld = num % 10;
        var fd = fd*10 + ld;
        num = fd / 10;
    }
    

}
sumOrProduct(2233)


// write a function to check whether given number is positive or negitive
function posOrNeg (num)
{
    if (num > 0)
        console.log("positive")
    else if (num < 0)
        console.log("negitive");
    else
        console.log("equals to Zero")
}
posOrNeg(0) // function call 

//WAF to which prints the color based on number ranging from  VIBGYOR
function colorPrint (num)
{
    switch (num) {
			case 1:
				console.log("Violet")
				break
			case 2:
				console.log("Indigo")
				break
			case 3:
				console.log("Blue")
				break
			case 4:
				console.log("Green")
				break
			case 5:
				console.log("Yellow")
				break
			case 6:
				console.log("Orange")
				break
        case 7:
            console.log("Red")
            break;
        default:
            console.log("please mention input from 1 to 7");
		}
}
colorPrint(2)



//Addition of 2  number 
let sum =0
let x=12,xx= 12
function summ(x1,x2){
    sum = x1 + x2
    return sum;
}
console.log(summ(12,12)) // function with return value

function summ(x1,x2){
    sum = x1 + x2
    console.log("Sum = "+sum) 
}
summ(12,12) // function with not return value


function asd() {
    x1=12,x2=23
    sum = x1 + x2
}