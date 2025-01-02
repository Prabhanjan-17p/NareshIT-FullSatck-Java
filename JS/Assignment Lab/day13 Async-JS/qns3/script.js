document.addEventListener("DOMContentLoaded", () => {
  const redLight = document.getElementById("redLight");
  const yellowLight = document.getElementById("yellowLight");
  const greenLight = document.getElementById("greenLight");
  const startButton = document.getElementById("startButton");
  const stopButton = document.getElementById("stopButton");

  let currentTimeout;
  let stopSimulation = false;

  const turnOffLights = () => {
    redLight.classList.remove("active");
    yellowLight.classList.remove("active");
    greenLight.classList.remove("active");
  };

  const startTrafficLight = () => {
    stopSimulation = false;
    startButton.disabled = true;
    stopButton.disabled = false;

    const cycle = () => {
      if (stopSimulation) return;

      turnOffLights();
      redLight.classList.add("active");
      currentTimeout = setTimeout(() => {
        turnOffLights();
        yellowLight.classList.add("active");
        currentTimeout = setTimeout(() => {
          turnOffLights();
          greenLight.classList.add("active");
          currentTimeout = setTimeout(cycle, 4000); // Repeat the cycle
        }, 2000); // Yellow light duration
      }, 3000); // Red light duration
    };

    cycle();
  };

  const stopTrafficLight = () => {
    stopSimulation = true;
    clearTimeout(currentTimeout);
    turnOffLights();
    startButton.disabled = false;
    stopButton.disabled = true;
  };

  // Event listeners
  startButton.addEventListener("click", startTrafficLight);
  stopButton.addEventListener("click", stopTrafficLight);
});
