/* write a while logic to print all the letters of a given string */
function printChar (str)
{
    var i = 0
		while (i < str.length) {
			console.log(str.charAt(i))
            i++;
		}
}
printChar("prasad")
/* use the while loop and print n multiplication table */

/* use do while to print even numbers upto 20 */
// var evenPrint = function ()
// {
//     var n = 0;
//     do
//     {
//         if (n % 2 == 0)
//         {
//            console.log(n)
//         }
//         n+=2;
//     }
//     while(n<=20)
// }
// evenPrint()

function series1 (n)
{
    var num = 1, i = 1;
    while (num <= 15)
    {
        console.log(num)
        num = num + i + 1;  
        i++;
    }
}
series1(15)

/* use for loop to print characters of given name in reverse order 
input: prasad, output: d a s a r p
*/
function printReverse (str)
{
    for (var i = str.length - 1; i >= 0; i--) {
			console.log(str.charAt(i))
		}
}
printReverse("prasad")


// use for loop to print odd number from 1 to 20 in reverse order
// use for loop to print elements of following array
// standard for
var arr=[5,6,7,8]
for (var i = 0; i < arr.length;i++)
{
    console.log(arr[i])
}
/* for..of */
for (var i of arr)
{
    console.log(i)
}
for (var i in arr) {
	console.log(arr[i])
}
var friends = ["chandler", "rachel", "monica", "ross", "pheobe", "joey"];
/* print first character of every element in the given array. use for, for..of,for..in */