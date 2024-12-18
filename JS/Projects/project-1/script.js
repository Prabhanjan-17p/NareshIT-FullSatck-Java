
var elem=0
var myEle2 = document.getElementById('incre')
var myEle3 = document.getElementById('evenOdd')
function incre() {
    elem += 1
    if(elem <= 11){
        checkEvenOdd()
        myEle2.textContent = `${elem}`
    }else{
        alert("Please Do not increase")
    }
}
function decre() {
    if(elem >=1){
        elem--;
        checkEvenOdd()
        myEle2.textContent = `${elem}`
    }else{
        alert("You do not have enough points to decrease")
    }
}
function reset() {
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
    document.body.classList.toggle('blly')
}