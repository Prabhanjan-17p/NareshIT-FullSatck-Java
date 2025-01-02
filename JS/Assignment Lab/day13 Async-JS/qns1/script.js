document.addEventListener("DOMContentLoaded", () => {
    const startButton = document.getElementById("startButton");
    const cancelButton = document.getElementById("cancelButton");
    const statusMessage = document.getElementById("statusMessage");

    let coffeeTimeout;

    // Function to serve coffee
    const serveCoffee = () => {
        statusMessage.textContent = "Your coffee is ready! ☕ Enjoy!";
        startButton.disabled = false;
        cancelButton.disabled = true;
    };

    // Function to start coffee preparation
    const prepareCoffee = () => {
        statusMessage.textContent = "Preparing your coffee... Please wait.";
        startButton.disabled = true;
        cancelButton.disabled = false;

        // Simulate coffee preparation with a 3-second delay
        coffeeTimeout = setTimeout(serveCoffee, 3000);
    };

    // Function to cancel coffee preparation
    const cancelCoffee = () => {
        clearTimeout(coffeeTimeout);
        statusMessage.textContent = "Coffee preparation canceled.";
        startButton.disabled = false;
        cancelButton.disabled = true;
    };

    // Event listeners
    startButton.addEventListener("click", prepareCoffee);
    cancelButton.addEventListener("click", cancelCoffee);
});
