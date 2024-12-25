// function fun ()
// {
//     console.log("hello world")
// }
// setTimeout(fun, 0);
// for (let i = 0; i < 10000; i++)
// {
//     console.log("bye")
// }
let c = 0;
function fun() {
    c++;
    let dt = new Date()
    document.getElementById('count').textContent = dt.toLocaleTimeString()
    console.log("hello world")
}
let inter = setInterval(fun, 1000)

function blast() {
    document.body.innerHTML = ''
}
let timer = setTimeout(blast, 10000);
let isStop = false
document.getElementById('btn').addEventListener('click', function () {
    if (isStop) {
        isStop = false;
        setInterval(fun, 1000)
    }
    else {
        isStop = true;
        clearTimeout(timer)
        clearInterval(inter)
    }

})