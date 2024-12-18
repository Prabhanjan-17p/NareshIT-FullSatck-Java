// var myEle1 = document.getElementById('head')
// myEle1.textContent = 'Hello Every World'

function changhe() {
    var myEle1 = document.getElementById('head')
    myEle1.textContent = 'Hello Every World'
}

var elem=0
var myEle2 = document.getElementById('incre')
var myEle3 = document.getElementById('evenOdd')
function incre() {
    // var myEle2 = document.getElementById('incre')
    elem += 1
    if(elem <= 11){
        // if(elem %2 == 0){
        //     myEle3.textContent = "Even"
        // }else{
        //     myEle3.textContent= "Odd"
        // }
        checkEvenOdd()
        myEle2.textContent = `${elem}`
    }else{
        alert("Please Do not increase")
    }
}
function decre() {
    // var myEle2 = document.getElementById('incre')
    if(elem >=1){
        elem--;
        // if(elem %2 == 0){
        //     myEle3.textContent = "Even"
        // }else{
        //     myEle3.textContent= "Odd"
        // }
        checkEvenOdd()
        myEle2.textContent = `${elem}`
    }else{
        alert("You do not have enough points to decrease")
    }
    // myEle2.textContent = `${elem}`
}
function reset() {
    // var myEle2 = document.getElementById('incre')
    elem =0 
    myEle3.textContent = "Even"
    myEle2.textContent = `${elem}`
}
function checkEvenOdd() {
    if(elem %2 == 0){
        myEle3.textContent = "Even"
    }else{
        myEle3.textContent= "Odd"
    }
}

function colorChe(){
    var cl = document.querySelectorAll('.box')
    // document.body.style.backgroundColor = 'black'
    // document.body.style.backgroundColor = "#"+Math.round(Math.random()*100000).toString(16)
    // cl.style.border = 'black'
    // document.body.classList.add('blly')
    // document.body.classList.remove('blly')
    document.body.classList.toggle('blly')
}