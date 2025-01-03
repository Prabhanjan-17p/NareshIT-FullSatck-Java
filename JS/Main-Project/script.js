const mainDiv = document.getElementById("mainDiv");
const fetchData = async () => {
    try {
        const res = await fetch("https://dummyjson.com/products");
        const data = await res.json()
        displayData(data.products)
    }
    catch (e) {
        console.log("error is :" + e)
    }
}
fetchData()
function displayData(prod) {
    prod.forEach((p) => {
        
        const productDiv = document.createElement('div')
        productDiv.classList.add('product')
        const productimage = document.createElement("img")
        productimage.src = p.thumbnail;
        productimage.alt = p.title
        const productTitle = document.createElement("h2")
        productTitle.textContent = p.title
        const productLink = document.createElement('a');
        productLink.href = `./product.html?pid=${p.id}` // it will stored in url linked
        productLink.appendChild(productTitle)
        const productPrice = document.createElement("p")
        productPrice.textContent = "Price: ₹" + p.price
        const productButton = document.createElement("button")
        productButton.textContent = "Add to cart"
        productDiv.append(productimage, productLink, productPrice, productButton)
        mainDiv.append(productDiv)

    })

}