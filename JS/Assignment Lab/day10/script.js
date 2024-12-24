//QNS-1
// const btn = document.getElementById('btn');

// btn.addEventListener('click', colorChanged);
// function colorChanged(){
//     //method-1
//     // const colors = ['red', 'green', 'blue', 'yellow', 'purple', 'orange'];
//     // const randomColor = colors[Math.floor(Math.random() * colors.length)];
//     // document.body.style.backgroundColor = randomColor;
//     // btn.innerText = `Change background color to ${randomColor}`;
//     // btn.style.backgroundColor = randomColor;
//     // btn.style.color = 'white';

//     //method-2
//     document.body.style.backgroundColor = `rgb( ${Math.random()*100},  ${Math.random()*100}, ${Math.random()*100})`;
// }


//QNS-2
// const input = document.getElementById('inText');
// const para = document.getElementById('para');
// input.addEventListener('input', () =>{
//     para.innerText = input.value;
// } )


//QNS-3
// const img = document.getElementById('img');
// function voer(){
//     var arr = ['./img/img1.jpg','./img/img3.jpg','./img/img3.jpg','./img/img4.jpg','./img/img5.jpg',]
//     img.src = arr[`${Math.round(Math.random()*5)+1}`];
//     img.alt = `${(Math.random()*5)+1}`;
    
// }


//QNS-4
// const text = document.getElementById('h2');
// function cText(){
//     text.style.color = `rgb( ${Math.random()*100},  ${Math.random()*100}, ${Math.random()*100})`;
//     text.style.fontSize = `${Math.random()*50+20}px`;
// }

//QNS-5
// window.getSelection().toString()

const text = document.getElementById('text');
text.addEventListener('copy',(e) =>{
    e.preventDefault();
    var tt = 'The text cannot be copied'
    e.clipboardData.setData('text/plain',tt);
})