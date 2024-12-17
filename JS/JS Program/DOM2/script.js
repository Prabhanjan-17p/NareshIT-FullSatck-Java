// var myEle1 = document.getElementById('head')
// myEle1.textContent = 'Hello Every World'

function changhe() {
    var myEle1 = document.getElementById('head')
    myEle1.textContent = 'Hello Every World'
}

var elem=0
function incre() {
    var myEle2 = document.getElementById('incre')
    elem += 1
    if(elem >= 11){
        alert("Please Do not increase")
    }
    myEle2.textContent = `${elem}`
}