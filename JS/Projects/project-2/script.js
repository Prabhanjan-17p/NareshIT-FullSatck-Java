var toggleBtn = document.querySelector('#toggle'); 
var hrr = document.querySelectorAll('.hrr');       
var inputText = document.querySelectorAll('input'); 
var box = document.querySelector('.box'); 
var box2 = document.querySelector('#leftBox'); 
var nav = document.querySelector('.nvaa'); 
var labels = document.querySelectorAll('label'); 
var headings = document.querySelectorAll('h2');
var paragraphs = document.querySelectorAll('p');
var cou = 0

function tog() {
    document.body.classList.toggle('blly'); 

    if (toggleBtn.checked) {
        // Change border, hr background, and input text color
        hrr.forEach(element => element.style.backgroundColor = 'white');
        inputText.forEach(element => element.style.color = 'white');
        box.style.borderColor = 'white';
        box2.style.borderColor = 'white';
        nav.style.borderColor = 'white';

        // Change label, headings, and paragraph text color
        labels.forEach(element => element.style.color = 'white');
        headings.forEach(element => element.style.color = 'white');
        paragraphs.forEach(element => element.style.color = 'white');
    } else {
        // Revert to light mode colors
        hrr.forEach(element => element.style.backgroundColor = 'black');
        inputText.forEach(element => element.style.color = 'black');
        box.style.borderColor = 'black';
        box2.style.borderColor = 'black';
        nav.style.borderColor = 'black';

        // Revert label, headings, and paragraph text color
        labels.forEach(element => element.style.color = 'black');
        headings.forEach(element => element.style.color = 'black');
        paragraphs.forEach(element => element.style.color = 'black');

    }
    if(cou == 1){
        par1.style.color ='black';
        par2.style.color ='black';
        par3.style.color ='black';
        h1h.style.color ='black';
        h2h.style.color ='black';
        h3h.style.color ='black';
    }
}

var inputText1 = document.getElementById('intext');
var inputText2 = document.getElementById('inp2');
var inputText3 = document.getElementById('inp3');
var par1 = document.getElementById('pc1');
var par2 = document.getElementById('pc2');
var par3 = document.getElementById('pc3');
var h1h = document.getElementById('h211');
var h2h = document.getElementById('h212');
var h3h = document.getElementById('h213');

function SubBTN() {
    if (inputText1.value === '' || inputText2.value === '' || inputText3.value === '') {
        alert('Please fill all fields');
        return;
    }else{
        par1.innerHTML = inputText1.value;
        par2.innerHTML = inputText2.value;
        par3.innerHTML = inputText3.value;
        box2.style.display = 'flex';
    }
}
function ResBTN(){
    inputText1.value = '';
    inputText2.value = '';
    inputText3.value = '';
}
function chColor() {
    var c1 = "#" + Math.round(Math.random() * 10000000).toString(16);
    var c2 = "#" + Math.round(Math.random() * 10000000).toString(16);
    box2.style.background = `linear-gradient(${c1},${c2})`
    par1.style.color ='black';
    par2.style.color ='black';
    par3.style.color ='black';
    h1h.style.color ='black';
    h2h.style.color ='black';
    h3h.style.color ='black';
}
function reColor(){
    par1.style.color ='black';
    par2.style.color ='black';
    par3.style.color ='black';
    h1h.style.color ='black';
    h2h.style.color ='black';
    h3h.style.color ='black';
    box2.style.background = 'white';
    cou = 1
}