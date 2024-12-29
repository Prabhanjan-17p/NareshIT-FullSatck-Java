const mainDiv = document.getElementById('main');
function fetchData() {
    fetch("https://fakestoreapi.com/products")
     .then((res) => res.json())
     .then((data) => displayData(data))
     .catch((error) => console.log(error));
}
fetchData();
function displayData(product) {
    // console.log(product)
    product.forEach((p) => {
        // console.log(p.title)
        // const pDiv = document.createElement("div");
        // pDiv.classList.add("product");
        // const pTitle = document.createElement("h2");
        // pTitle.textContent = p.title;
        // const pPrice = document.createElement("p");
        // pPrice.textContent ="Price: ₹"+ p.price;
        // const pImg = document.createElement("img");
        // pImg.src = p.image;
        // pImg.alt = p.title;
        // const pButton = document.createElement("button");
        // pButton.textContent = "Add to Cart";
        // pDiv.append(pImg,pTitle,pPrice,pButton);
        // mainDiv.appendChild(pDiv);
        
        var pro = `<div class="product">
                <div class="img">
                    <img src="${p.image}" alt="${p.title}">
                </div>
                <div class="prc">
                    <p>"Price: ₹"+ ${p.price}</p>
                    <button>Add to Cart</button>
                </div>
                <div class="head">
                    <h2>${p.title}</h2>
                </div>
            </div>`
            mainDiv.append(pro);
        
    });
}