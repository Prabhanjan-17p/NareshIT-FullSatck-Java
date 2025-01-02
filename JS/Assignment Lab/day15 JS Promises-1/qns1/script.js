// Step 1: Place order
const placeOrder = () => {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            console.log("Order placed successfully.");
            resolve(); // Resolve when the order is placed
        }, 3000); // Simulate a 3-second delay
    });
};

// Step 2: Prepare food
const prepareFood = () => {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            console.log("Food is being prepared.");
            resolve(); // Resolve when food preparation is done
        }, 3000); // Simulate a 3-second delay
    });
};

// Step 3: Deliver order
const deliverOrder = () => {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            console.log("Order delivered to the customer.");
            resolve(); // Resolve when the order is delivered
        }, 3000); // Simulate a 3-second delay
    });
};

// Chain the promises to ensure sequential execution
placeOrder()
    .then(() => prepareFood())
    .then(() => deliverOrder())
    .catch((error) => console.error("Error:", error));
