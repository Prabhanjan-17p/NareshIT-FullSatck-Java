var arr = [5, 8, 7, -1, 0, 7]
// iterate/print all elements of the array
// standard for
for (var i = 0; i < arr.length; i++)
{
    console.log(arr[i])
}
/* for..of */
for (var ele of arr)
{
    console.log(ele)
}
/* for..in */
for (var i in arr)
{
    console.log(i)
}


function sqaureNumber (num)
{
    console.log(num*num)
}
var newArr = [1, 2, 3, 4, 5];
newArr.forEach(sqaureNumber)
// for (var i of newArr)
// {
//     sqaureNumber(i)
// }

/* take an array and print cube of each number in the array*/
var arr = [1, 3, 5, 7, 9];

arr.forEach(function (num) {
	console.log(num ** 3)
})
// [1,3,5,7,9].forEach(function(num){ console.log(num**3) })
/* write a forEach to print first character of given array*/
var names=["raj","vani","batul","pragti","shekhar"]
names.forEach(function (x)
{
    console.log(x.charAt(0))
})
var arr = [5, 4, 3, 2, 1]
arr.forEach(function (x, y) {
	console.log(x + " " + y)
})
/* square a number and return the value */
var newArr = arr.forEach(function (ele)
{
    return ele * ele;
})
console.log(newArr)
var newArr = arr.map(function (ele) {
	return ele * ele
})
console.log(newArr)
var newArr = arr.filter(function (ele) {
    if (ele % 2 == 0)
        return ele * ele
})
console.log(newArr)

var names = ["raj patel", "shekhar patel", "sudeep patel"];
var val=names.some(function (x)
{
    return x.endsWith("patel")
})
console.log(val);
var val = names.every(function (x) {
	return x.endsWith("patel")
})
console.log(val)