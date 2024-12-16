// Que 1 : Write a 'JavaScript' program to read age of person and check the person is eligible for vote or not using if-else.
// var age = prompt("Enter Your age")
// if(age >= 18){
//     alert("Eligible for vote")
//     console.log("Eligible for vote");
// }else{
//     alert("Not eligible for vote")
//     console.log("Not eligible for vote");
// }

//Que 2 : Write a 'JavaScript' program to find maximum between two numbers using if-else.
// var n1 = prompt("Enter first number")
// var n2 = prompt("Enter second number")
// if(n1 > n2){
//     alert("N1 is Bigger than N2")
// }else{
//     alert("N2 is Bigger than N1")
// }

//Que 3 : Write a 'JavaScript' program to find maximum between three numbers.
// var n1 = prompt("Enter first number")
// var n2 = prompt("Enter second number")
// var n3 = prompt("Enter third number")
// if(n1 > n2 && n1 > n3){
//     alert("N1 is Bigger than N2,N3")
// }else if(n2 > n3){
//     alert("N2 is Bigger than N1,N3")
// }else{
//     alert("N3 is Bigger than N1,N2")
// }

//Que 4 : Write a 'JavaScript' program to find maximum between three numbers.
// var n1 = prompt("Enter first number")
// if(n1 > 0){
//     alert("N1 is Posetive")
// }else if(n1 ==0){
//     alert("Nis zero")
// }else{
//     alert("N1 is nagetive number")
// }

//Que 5 :  Write a 'JavaScript' program to check whether a year is leap year or not.
// var year = prompt("Enter year")
// if ((year % 4 === 0 && year % 100 !== 0) || year % 400 === 0) {
//     return `${year} is a leap year.`;
// } else {
//     return `${year} is not a leap year.`;
// }

// Que 6 : Write a 'JavaScript' program to check whether the string is uppercase or lowercase alphabet.
// var n = prompt("Enter any alphabet")
// if (n >= 'A' && n <= 'Z') {
//     console.log( `${n} is a Upper case.`);
// } else {
//     console.log(`${n} is Lower case.`);
// }

// Que 7 : Write a 'JavaScript' program to check whether the string is uppercase or lowercase alphabet.
const costPrice = parseFloat(prompt("Enter the cost price of the TV:"));
const sellingPriceWithTaxes = parseFloat(prompt("Enter the selling price of the TV (including VAT and tax):"));

const vatPercent = 5;
const taxPercent = 10;

const vatAmount = (vatPercent / 100) * sellingPriceWithTaxes;
const taxAmount = (taxPercent / 100) * sellingPriceWithTaxes;

const netSellingPrice = sellingPriceWithTaxes - vatAmount - taxAmount;
const resultAmount = netSellingPrice - costPrice;

if (resultAmount > 0) {
    console.log(`You made a profit of ${resultAmount.toFixed(2)}`);
} else if (resultAmount < 0) {
    console.log(`You incurred a loss of ${Math.abs(resultAmount).toFixed(2)}`);
} else {
    console.log("There is no profit or loss.");
}
