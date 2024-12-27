const btn = document.getElementById('btn');
const mainDiv = document.getElementById('myQuote')
btn.addEventListener('click', fetchData)
function fetchData ()
{
    fetch("https://dummyjson.com/quotes/random")
        .then(function (res) { return res.json() })
        .then(function(data){displayData(data)})
        .catch(function (err) { console.log(err) })
  
}
function displayData (data)
{
    mainDiv.textContent=''
    const myquote = document.createElement('h1')
    myquote.textContent = data.quote
    const mydata = document.createElement("h2")
    mydata.textContent = data.author;
    mainDiv.append(myquote, mydata);
}
document.getElementById('btn2').addEventListener('click', getWeather)
function getWeather ()
{
    mainDiv.textContent=''
    const input= document.getElementById('inp')
    fetch(`https://api.openweathermap.org/data/2.5/weather?q=${input.value}&appid=4d8fb5b93d4af21d66a2948710284366&units=metric`)
        .then(function (res) { return res.json() })
        .then(function (data)
        {
            console.log(data)
            const p = document.createElement('p')
            p.textContent = data.main.temp + " C"
            mainDiv.appendChild(p)
        })
        .catch(function (err) { console.log(err) })
    
}