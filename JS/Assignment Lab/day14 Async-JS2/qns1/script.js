document.addEventListener("DOMContentLoaded", () => {
    const status = document.getElementById("status");
    const startButton = document.getElementById("startButton");
    const cancelButton = document.getElementById("cancelButton");

    let preparationTimeout;

    // Function to simulate sandwich preparation
    const startPreparation = () => {
        startButton.disabled = true;
        cancelButton.disabled = false;

        const gatherIngredients = () => {
            status.textContent = "Status: Gathering ingredients...";
            preparationTimeout = setTimeout(() => {
                toastBread();
            }, 2000); // 2 seconds delay
        };

        const toastBread = () => {
            status.textContent = "Status: Toasting bread...";
            preparationTimeout = setTimeout(() => {
                assembleSandwich();
            }, 3000); // 3 seconds delay
        };

        const assembleSandwich = () => {
            status.textContent = "Status: Assembling sandwich...";
            preparationTimeout = setTimeout(() => {
                serveSandwich();
            }, 2000); // 2 seconds delay
        };

        const serveSandwich = () => {
            status.textContent = "Status: Sandwich served! Enjoy your meal!";
            startButton.disabled = false;
            cancelButton.disabled = true;
        };

        gatherIngredients(); // Start the process
    };

    // Function to cancel the preparation process
    const cancelPreparation = () => {
        clearTimeout(preparationTimeout);
        status.textContent = "Status: Preparation canceled!";
        startButton.disabled = false;
        cancelButton.disabled = true;
    };

    // Event listeners for buttons
    startButton.addEventListener("click", startPreparation);
    cancelButton.addEventListener("click", cancelPreparation);
});
