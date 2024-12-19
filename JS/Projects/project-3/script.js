function bookSub() {
    var bookTitle = document.getElementById("bookTitle").value;
    var author = document.getElementById("author").value;
    var urlImg = document.getElementById("imgUrl").value;
    var booksContainer = document.querySelector(".booksContainer");

    if (bookTitle !== '' && author !== '' && urlImg !== '') {
        // Creating the card HTML
        var book = `
        <div class="bookBox">
            <div class="delete" onclick="deleteCard(this)">
                    <img src="./icons8-delete-48.png" alt="">
                </div>
            <h2>${bookTitle}</h2>
            <img src="${urlImg}" alt="Book Image">
            <p>Author - ${author}</p>
        </div>
        `;
        booksContainer.innerHTML += book;
    } else {
        alert("Please ensure all fields are filled out before submitting.");
    }
}

// Function to delete a specific card
function deleteCard(element) {
    element.parentElement.remove();
}
