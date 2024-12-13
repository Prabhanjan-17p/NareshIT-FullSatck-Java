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