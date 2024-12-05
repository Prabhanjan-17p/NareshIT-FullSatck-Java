/* 
This is External
JS- multi line
Comment
*/
// var a = 25;
// console.log("The value is " + (a + 1));
/* try to take two variables and print its sum in console */
// var x = 10, y = 20;
// var c = x + y;
// console.log(a)
// alert("The sum is " + c);
// confirm("Are you sure?")



// function test(){
//     var a = 12;
//     console.log(a);
// }
// test();



/* LET vs VAR */

// if(true){
//     var d1 = 0;
//     var l1 = 0;
// }
// console.log("Outside the 'VAR' Block = "+d1);
// console.log("Outside the 'LET' Block = "+l1);

// function test2(){
//     if(true){
//         var d2 = 123;
//         let l2 = 123;
//     } 
//     console.log("Inside the 'VAR' function = "+d2);
//     // console.log("Inside the 'LET' function = "+l2); // Error
// }
// test2()
// console.log("Outside the 'VAR' function = "+d2); // Error --> outside the function
// console.log("Outside the 'LET' function = "+l2); // Error --> outside the function


var noKmP=30, noKm=100,totKm=0;
function name(a,b=25) {
    totKm = noKm*noKmP;
    return totKm;
}
var e =name(noKm)
console.log(e);
// var f = "sgfs"