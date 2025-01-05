let cartItems = JSON.parse(localStorage.getItem("cartItems"))
const mainDiv = document.getElementById("cartDiv")
const total = document.getElementById("total")

displayData(cartItems)
function displayData (data)
{
    mainDiv.textContent=''
    data.forEach((p) =>
    {
        const cartItemDiv = document.createElement('div');
        cartItemDiv.classList.add('cartItem')
        const cartItemImg = document.createElement('img');
        cartItemImg.src = p.thumbnail;
        cartItemImg.alt = p.title;
        const cartItemTitle = document.createElement('h2');
        cartItemTitle.textContent= p.title
        const cartItemPrice = document.createElement('p');
        cartItemPrice.textContent= "Price: ₹"+p.price
        const removeButton = document.createElement('button');
        removeButton.textContent = "Remove"
        removeButton.addEventListener('click',removeLogic)
        cartItemDiv.append(cartItemImg,cartItemTitle,cartItemPrice,removeButton)
        mainDiv.appendChild(cartItemDiv)
        calcTotal();
    })
}

function calcTotal ()
{
  total.textContent="₹"+ cartItems.reduce((prev,curr)=>prev+curr.price,0).toFixed(2) 
}
function removeLogic (ind)
{
    cartItems.splice(ind, 1)
    displayData(cartItems)
    calcTotal
}