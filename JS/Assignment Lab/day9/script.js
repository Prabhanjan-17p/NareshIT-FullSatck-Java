//1- // Function to handle the click event
// function clickDiv() {
//     console.log("Div is clicked");
// }

// // Select the div element and add the click event listener
// const divElement = document.getElementById('clickableDiv');
// divElement.addEventListener('click', clickDiv);

//2-// Function to handle the keydown event
  function keyDown(event) {
    if (event.key === "Enter") {
      console.log("Enter key pressed");
    }
  }

  // Select the input element and add the keydown event listener
  const inputElement = document.getElementById('inputField');
  inputElement.addEventListener('keydown', keyDown);
