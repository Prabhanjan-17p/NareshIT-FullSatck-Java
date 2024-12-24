//1- Store 10 elements in the array
// var arr = [];
// for (let i = 0; i <= 9; i++) {
//     //user insert into array
//     arr[i] = parseInt(prompt("Enter number:"))
// }
// console.log(arr);


//2- Sort the array using selection sort
// var arr = [2,1,6,1,9,4,5]
// function selectionSort(arr) {
//     for (let i = 0; i < arr.length - 1; i++) {
//         let minIndex = i;
//         for (let j = i + 1; j < arr.length; j++) {
//             if (arr[j] < arr[minIndex]) {
//                 minIndex = j;
//             }
//         }
//         if (minIndex!== i) {
//             [arr[i], arr[minIndex]] = [arr[minIndex], arr[i]];
//         }
//     }
//     return arr;
// }
// console.log(selectionSort(arr))
// // 2-style 
// function selectionSort(arr){
//     for (let i = 0; i < arr.length; i++) {
//         //Find the maximum item in the remaining array and swap with correct index
//         let lastIndex = arr.length-i-1;
//         let maxIndex = getMaxIndex(arr,0,lastIndex);
//         swapArray(arr,maxIndex,lastIndex);
//     }
// }
// function swapArray(arr,first,second){
//     let temp = arr[first];
//     arr[first] = arr[second];
//     arr[second] = temp;
// }

// function getMaxIndex(arr, start ,end){
//     let max = start;
//     for (let i = start ; i <= end ; i++) {
//         if (arr[max] < arr[i]){
//             max = i;
//         }
//     }
//     return max;
// }
// selectionSort(arr);
// console.log(arr)

//3- sort array using predifine function
// var arr = [2,1,6,1,9,4,5]
// arr.sort(); // ascending
// console.log(arr);
// arr.reverse(); // descending
// console.log(arr);

//4- Separate Strings and Number using Foreach function
// var arr = ["ss",1,6,1,'hg',4,5];
// var strings = [];
// var numbers = [];
// arr.forEach(function(item) {
//     if (typeof item === "string") {
//         strings.push(item);
//     } else if (typeof item === "number") {
//         numbers.push(item);
//     }
// });
// console.log("Strings: ", strings);
// console.log("Numbers: ", numbers);

//5- Separate the odd and even numbers using foreach function
// var arr = [2,1,6,1,9,4,5];
// var even = [];
// var odd = [];
// arr.forEach(function(i){
//     if(i % 2 == 0){
//         even.push(i);
//     }else{
//         odd.push(i);
//     }
// })
// console.log("Odd: ", odd);
// console.log("Even: ", even);

//6-Store 10 elements in the array
// var arr = [];
// for (let i = 0; i <= 9; i++) {
//     //user insert into array
//     arr[i] = parseInt(prompt("Enter number:"))
// }
// console.log(arr);

//7 - Sum of all elements
// var arr = [2,1,6,1,9,4,5];
// var sum =0
// for (const i of arr) {
//     sum = sum+i
// }
// console.log(sum)

//8- Convert array name are upper case
// var arr = ["ja","sa","ss"];
// arr.forEach(function(item, index, array) {
//     array[index] = item.toUpperCase();
// });
// console.log(arr);

//9- Remove null and undefined values from the array
function removeNullAndUndefined(arr) {
    return arr.filter(item => item !== null && item !== undefined);
}
const arrayWithNulls = [1, null, 2, undefined, 3, null, 4, undefined, 5];
const cleanedArray = removeNullAndUndefined(arrayWithNulls);
console.log('Original Array:', arrayWithNulls);
console.log('Cleaned Array:', cleanedArray);

//10 -
function calculateAverage(arr) {
    const sum = arr.reduce((acc, num) => acc + num, 0);
    const average = sum / arr.length;
    return average;
}
const nums = [10, 20, 30, 40, 50];
const average = calculateAverage(nums);
console.log('Average:', average);

//11- 
function flattenArray(arr) {
    return arr.flat(Infinity); // Use flat() with Infinity to fully flatten the array
}
const nestedArray = [1, [2, [3, [4, 5]]]];
const flattenedArray = flattenArray(nestedArray);
console.log('Flattened Array:', flattenedArray);
