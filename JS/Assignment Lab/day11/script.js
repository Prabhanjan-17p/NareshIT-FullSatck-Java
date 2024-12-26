const incre = document.getElementById("incre")
const decre = document.getElementById("decre")
const val = document.getElementById("value")
let poi = 0;
incre.addEventListener("click",function(){
    poi++;
    val.textContent = poi;
})
decre.addEventListener("click",function(){
    poi--;
    val.textContent = poi;
})