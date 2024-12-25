// const min = document.getElementById('min');
// const sec = document.getElementById('sec');
// let secCount = 60;
// let minCount = 5;

// function countdown() {
//     secCount--;
//     if(secCount <=0){
//         secCount = 59;
//         minCount--;
//     }
//     min.textContent = minCount;     
//     sec.textContent = secCount;
//     console.log(secCount);
// }
// function stopTime(){
//     clearInterval(countdown);
//     console.log("Time's up!");
//     min.textContent = "00";
//     sec.textContent = "00";
// }
// setInterval(countdown, 1000)
// setTimeout(stopTime,5000);




const min = document.getElementById('min');
const sec = document.getElementById('sec');
let secCount;
let minCount;
let intervalId = null;

function countdown() {
    // minCount = 1;
    secCount--;
    if (secCount < 0) {
        secCount = 59;
        minCount--;
    }
    if (minCount < 0) {
        stopTime();
        return;
    }
    min.textContent = minCount.toString().padStart(2, '0');
    sec.textContent = secCount.toString().padStart(2, '0');
}

function stopTime() {
    clearInterval(intervalId);
    // console.log("Time's up!");
    min.textContent = "00";
    sec.textContent = "00";
}

function startTimer() {
    if (!intervalId) {
        intervalId = setInterval(countdown, 1000);
    }
}

function pauseTimer() {
    clearInterval(intervalId);
    intervalId = null;
}

function resetTimer() {
    clearInterval(intervalId);
    intervalId = null;
    secCount = 0;
    minCount = 0;
    min.textContent = "00";
    sec.textContent = "00";
}

// Event listeners for the buttons
document.querySelector(".box3 button:nth-child(1)").addEventListener('click', pauseTimer); // Pause
document.querySelector(".box3 button:nth-child(2)").addEventListener('click', startTimer); // Start
document.querySelector(".box3 button:nth-child(3)").addEventListener('click', resetTimer); // Reset


//5min 
function start5() {
    minCount = 4;
    secCount = 60;
    countdown();
    if (!intervalId) {
        intervalId = setInterval(countdown, 1000);
    }
}
//10min 
function start10() {
    minCount = 9;
    secCount = 60;
    countdown();
    if (!intervalId) {
        intervalId = setInterval(countdown, 1000);
    }
}
//30min 
function start30() {
    minCount = 29;
    secCount = 60;
    countdown();
    if (!intervalId) {
        intervalId = setInterval(countdown, 1000);
    }
}
//Custome
// cstm open
const cstm = document.getElementById("custm");
const popCstm = document.querySelector(".popCustm");
var chc = 1
function openCstm() {
    const colorCstm4 = document.getElementById("colorCstm4");
    const colorCstm3 = document.getElementById("colorCstm3");
    const colorCstm2 = document.getElementById("colorCstm2");
    const colorCstm1 = document.getElementById("colorCstm1");
    if (chc) {
        chc = 0;
        colorCstm4.style.color ='black';
        colorCstm3.style.color ='rgb(164, 161, 161)';
        colorCstm2.style.color ='rgb(164, 135, 135)';
        colorCstm1.style.color ='rgb(164 , 135, 135)';
        popCstm.style.left = '420px';
    } else {
        colorCstm4.style.color ='#686663';
        colorCstm3.style.color ='#686663';
        colorCstm2.style.color ='#686663';
        colorCstm1.style.color ='#686663';
        popCstm.style.left = '-620px';
        chc = 1;
    }
}


//

const popCstm1 = document.querySelector(".popCustm");
const addTime = document.getElementById("qwe");
var nwTime=0
function addTime2() {

    const cstmMin = document.getElementById("cstmMin").value;
    nwTime = parseInt(cstmMin) ;
    console.log(nwTime)
    popCstm1.style.left = '-620px';
    document.getElementById("cstmMin").textContent= "0";

    minCount = nwTime-1;
    secCount = 60;
    countdown();
    if (!intervalId) {
        intervalId = setInterval(countdown, 1000);
    }
}

//go time
const home = document.getElementById("home");
const mainCC = document.getElementById("allConHere");
function goTime(){
    home.style.left = '-900px'
    document.body.style.backgroundPositionX = '110%'
    document.body.style.backgroundSize = 'auto 80%'

    mainCC.style.marginTop = '-65vh';
    colorCstm3.style.color ='black'
    colorCstm1.style.color ='#686663'
}


colorCstm1.addEventListener("click",() =>{
    home.style.left = '114px'
    document.body.style.backgroundPositionX = '98%'
    document.body.style.backgroundSize = 'auto 100%'

    mainCC.style.marginTop = '65vh';
    colorCstm3.style.color ='#686663'
    colorCstm1.style.color ='black'
})
colorCstm3.addEventListener("click",() =>{
    home.style.left = '-900px'
    document.body.style.backgroundPositionX = '110%'
    document.body.style.backgroundSize = 'auto 80%'

    mainCC.style.marginTop = '-65vh';
    colorCstm3.style.color ='black'
    colorCstm1.style.color ='#686663'
});