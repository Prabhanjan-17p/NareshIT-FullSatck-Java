const params = new URLSearchParams(window.location.search)
const pid = params.get('pid');
console.log(pid)
const fetchData = () =>
{
    fetch(`https://dummyjson.com/products/${pid}`)
        .then((res) => res.json())
        .then((data) => displayData(data))
    .catch((res)=>console.log(res))
}
fetchData()
function displayData (pro)
{
    const ldiv = document.createElement('div')
    const pimg = document.createElement("img")
    pimg.src = pro.thumbnail;
    pimg.alt = pro.title;
    ldiv.appendChild(pimg)
    const rdiv = document.createElement("div");
    const pname = document.createElement("h2")
    pname.textContent = pro.title;
    const pdesc = document.createElement("p")
    pdesc.textContent = pro.description;
    const prating = document.createElement('p');
    prating.textContent= pro.rating+"/5.0"
    const pprice = document.createElement("p")
    pprice.textContent = "Price: ₹" + pro.price;
    const pbutton = document.createElement("button")
    pbutton.textContent = "Add to cart"
    rdiv.append(pname, pdesc, prating, pprice, pbutton);
    document.getElementById("productDiv").append(ldiv,rdiv)
}