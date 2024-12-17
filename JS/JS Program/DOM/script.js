console.log(document)
//Phase 1- DOM Selction
        // i- document.getElementsByTagName('tag');
        // ii- document.getElementsClassName('tag');
        // iii- document.getElementsById('tag');
        // iv-  document.querySelector('#IDfir');
        // v- document.querySelectorAll('.all');

//i
var myData = document.getElementsByTagName('h1')
console.log(myData[0])
console.log(myData)
//ii
var myData2 = document.getElementsByClassName('fir')
console.log(myData2[0])
//iii
var myData3 = document.getElementById('IDfir')
console.log(myData3)
//iv
var myData5 = document.querySelector('#IDfir')
console.log(myData5)
//v
var myData6 = document.querySelectorAll('.all')
console.log(myData6)

//Task
var myData4 = document.getElementsByTagName('p')
console.log(myData4[0])



//Phase 2- DOM Manipulation
        // i- textContent

//i-
var myData7 = document.querySelector('.all')
console.log(myData7.textContent)
myData7.textContent = "Hellocvdjc"
console.log(myData7.textContent)

