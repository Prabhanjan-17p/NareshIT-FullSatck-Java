//1-Find even or odd numbers only using operator
// var num = 52123;
// var result=2 ;
// result =num%2==0;
// // console.log(Math.round(result));
// result != 0 && console.log(`${num} is even number`);
// result == 0 && console.log(`${num} is odd number`);


//2-check the maximum number among two numbers
// var num1 = 343, num2 = 56;
// // console.log(`The maximum number is ${Math.max(num1, num2)}`);
// var res = num1 > num2;
// res != 0 && console.log(`${num1} is big than ${num2}`);
// res == 0 && console.log(`${num2} is big than ${num1}`);



//3- Maximum among three numbers
// var num1 = 343, num2 = 56, num3 = 21;
// // console.log(`The maximum number is ${Math.max(Math.max(num1, num2), num3)}`);
// var res1 = num1 > num2;
// var res2 = num1 > num3;
// var res3 = num2 > num3;
// res1 != 0 && res2 != 0 && console.log(`${num1} is big than ${num2} ${num3}`);
// res1 == 0 && res2 != 0 && console.log(`${num2} is big than ${num1} ${num3}`);
// res1 == 0 && res2 == 0 && res3 != 0 && console.log(`${num3} is big than ${num1}  ${num2}`);

//4-  Maximum among three numbers using tarinary operations
// var num1 = 3423, num2 = 57, num3 = 221
// var max = (num1 > num2) ? ((num1 > num3) ? num1 : num3) : ((num2 > num3) ? num2 : num3);
// console.log(`The maximum number is ${max}`);

//5- check the number is odd or even using ternary operations
// var num = 2321;
// var res = (num % 2 == 0) ? "even" : "odd";
// console.log(`${num} is ${res} number`);

//6- shop keeper qns
// var bPrice = 3500,sPrice,prPrice,vatPrice,serCharge;
// prPrice = 27/100

// sPrice = bPrice*prPrice+bPrice; 
// console.log("Total selling price "+sPrice)
// var totProfit = sPrice- bPrice;
// console.log("Total Profit price "+totProfit)

// vatPrice = 12.7/100
// var totVAT = sPrice*vatPrice
// console.log("Total VAT price "+Math.round(totVAT))

// serCharge = 3.87/100
// var TotserCharge = sPrice*serCharge
// console.log("Total Service Charge price "+Math.round(TotserCharge))

//7- book store
// var price = 10000 , totPrice ;
// (price >=0 && price <= 1000) ? totPrice = price : (price >= 1001 && price <= 5000) ? totPrice = price*0.05  :  totPrice = price*0.10 
// var sum = price -totPrice ;
// console.log("Total price after discount "+ sum)

//8- bus station ticket price   
// var pepole =3 , ticketPrice = 300 , age,ff
// var totPrice = pepole*ticketPrice ;
// (age >=0 && age <= 59) ? ff = 0 : ff = totPrice*0.20 
// var totTicekCost = totPrice-ff;
// console.log("Total price after discount "+totTicekCost)