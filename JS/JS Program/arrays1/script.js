// var a = confirm("are you sure?")
// alert(a)
// var x = [1, 2, 4, 5, 7, 8]
// console.log(x[0])
// console.log(x[25])
// console.log(x[-20])
//write a for loop using for ..of  to print array elements
// console.table(x)
// for (var z of x) {
// 	console.log(z)
// }
// arrays contain lot of inbuilt methods
// length -length returns no.of elements in the given array
var arr = [2, 6, 5, 7, 4]
console.log(arr.length);
// arr.length = 0;
// console.log(arr);
// arr[12] = 53;
// console.log(arr);
// push,pop --- push is used to insert an element at the end of the array and pop is used to remove an element at the end of the array
arr.push(47,58,46,71,23)
console.log(arr)
arr.pop()
console.log(arr)
//unshift,shift --  unshift is used to insert an element at the starting of the array. shift is used to remove the first element of the array
arr.unshift(1, 3, 4, 5);
console.log(arr)
arr.shift()
console.log(arr)
//splice - splice is used to delete or add any elements in the array
//array.splice(starting-index,deleteCount,insert values);
var arr = [5, 1, 3, 4, 6, 7, 9];
arr.splice(2)
console.log(arr)
arr = [5, 1, 3, 4, 6, 7, 9];
arr.splice(2,3)
console.log(arr);
arr = [5, 1, 3, 4, 6, 7, 9];
arr.splice(2,0,858,654,"prasad")
console.log(arr)
var friends= ["penny","chandler","monica","pheobe","ross","stuart"];
//  1. remove stuart and add rachel
friends.pop();
friends.push("rachel");
//  2. remove penny and add joey
friends.shift();
friends.unshift("joey")
// 3. between ross and rachel, add justin
friends.splice(5,0,"justin")
console.log(friends)

//includes
console.log(friends.includes("prasad"))

console.log(friends.concat(["prasad", "raj"]));
var arr=[1,5,4,1,3,2]
console.log(arr.lastIndexOf(1))
arr.reverse();
console.log(arr)
var str = "javascript"
var newVal= str.split('').reverse().join('')
console.log(newVal)

// input: js is very easy
// output: sj si yrev ysae
var str = "js is very easy"
var newArr = str.split(' ');
var arr2=[]
for (var i of newArr)
{
   arr2.push(i.split('').reverse().join(''))
}
console.log(arr2.join(' '))
























// var x = [2,34,5,7]
// console.log(x)
// console.log(typeof x)
// console.log( x[1])
// console.log( x[98])


// //For Of Loop
// for(var i of x) {
//     console.log(i)
// }

// var e = prompt("Please enter")
// alert(e)


var ff = ["kanha", "ridhi", "manish", "hari", "balu"]
ff.pop()
ff.push("as")
console.log(ff)


ff.shift("as")
ff.unshift("hhh")
console.log(ff)

ff.splice(5,0,"jhgfd")
console.log(ff)

//includes - It checks the elements is there or not(true or false)
var ch = ff.includes("kanha") // it check the all elements
console.log(ch)
var ch1 = ff.includes("ridhi",1) // check for spcific index 
console.log(ch1)


//Concat -- It can add a new array 
var ch3 =ff.concat(["prasda","raj"])
console.log(ch3)
console.log(ff.concat(["prasda","raj"]))


//indexOf
var arr2 = [1,2,3,1,3,5,1,45,6]
console.log(arr2.indexOf(1)) // it return the element 1 where the element can start
console.log(arr2.lastIndexOf(1)) // it return the element 1 where the element can end

//Reversed 
arr2.reverse()
console.log(arr2)
    //reverse a String
    var str = "javascript"
    var newSTR = str.split('').reverse().join('')
    console.log(newSTR)



//
var str3 = "js is awesome"
var newww
var arr3=[]
newww = str3.split(' ')
for (const ee of newww) {
    arr3.push(ee.split('').reverse().join(''))
    // console.log(ee)
}
console.log(arr3.join(' '))
















function gg(num) {
    console.log(num*num)
}
//for Each
var rer = [1,2,3,4,5]
rer.forEach(gg)
// Take an array and convert to cube of the number  using " For each " Loop
let yy = [1,2,3,4,5]
function cube(num) {
    console.log(num*num*num)//
    console.log(num**num) // ** -- Power Function
}
yy.forEach(cube)
















// Enhanced ForEach
// let yy = [1,2,3,4,5]
// yy.forEach(function (nn){
//     console.log(nn**nn)
// })


//write a forEach function to print first character of given array 
// var name12 = ["kanha","atul","rati","badata"]
// var tn=[]
// name12.forEach(function (n1){
//     console.log(n1.charAt(0))
//     tn.push(n1.charAt(0))
// })
// console.log(tn)



// forEach - it does not return anything it's work like void function
var name12 = [5,4,3,2,1]
var tn = name12.map(function (n1){
    return n1*n1
})
console.log(tn) // it return "Undefine"


// map - is used to return something but same as forEach and map will return all the value
var name12 = [5,4,3,2,1]
var tn = name12.map(function (n1){
    return n1*n1
})
console.log(tn)
// var name12 = [5,4,3,2,1]
// var tn = name12.map(function (n1){
//     if (n1 % 2 == 0) {
//         return n1*n1
//     }
// })
// console.log(tn) //[undefined, 16, undefined, 4, undefined]


//Filter - It return those value you want but it same work as "map"
var name123 = [5,4,3,2,1]
var tn1 = name123.filter(function (n1){
    if (n1 % 2 == 0) {
        return n1*n1
    }
})
console.log(tn1) //[4, 2]


//Some - It return true or false if your value is not equal to array of values
var vv = ["kanha amanya","jsbdgt hari","dsgcs gfsw"]
var tn12 = name123.some(function (n1){
    return n1.endsWith("amanya")
})
console.log(tn12) 


//Every - It return true or false if your value is not equal to array of values
var vv = ["kanha amanya","jsbdgt hari","dsgcs gfsw"]
var tn12 = name123.every(function (n1){
    return n1.endsWith("amanya")
})
console.log(tn12) 