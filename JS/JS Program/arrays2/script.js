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
//Map - It reaturn all values
console.log(newArr)
var newArr = arr.map(function (ele) {
	return ele * ele
})
//Fillter - It reaturn specific values
console.log(newArr)
var newArr = arr.filter(function (ele) {
    if (ele % 2 == 0)
        return ele * ele
})
console.log(newArr)
//Some - Check at least one element
var names = ["raj patel", "shekhar patel", "sudeep patel"];
var val=names.some(function (x)
{
    return x.endsWith("patel")
})
console.log(val);
//Every- Check all elements
var val = names.every(function (x) {
	return x.endsWith("patel")
})
console.log(val)


//Find- When ever the logic is true it return true - and it return first result
var values = [1,2,3,4,5,6] 
var x = values.find(function (val,index) {
    return val%2 == 0
})
console.log(x)
//FindIndex- When ever the logic is true it return true and index number
var values = [1,2,3,4,5,6]
var x =values.findIndex(function (val,index) {
    return val%2 == 0
})
console.log(x)

//Reduce - When you add like one by one form the array 
var prices = [2,5,6,7]
var tot = prices.reduce(function ( prev,curr ) { //curr - become elements and Prev - sum of prev+curr
    return prev + curr 
},0) // 0- become intial value
console.log(tot)

//ex- Real Example of addtoCard And removeFromCard
var prices = []
function Add_to_card(val){
    prices.push(val)
    var total = prices.reduce(function (prev,curr) {
        return prev + curr
    })
    return total
}
function remove_from_card(i){
    prices.slice(i,1)
    var total = prices.reduce(function (prev,curr) {
        return prev + curr
    })
    return total
}