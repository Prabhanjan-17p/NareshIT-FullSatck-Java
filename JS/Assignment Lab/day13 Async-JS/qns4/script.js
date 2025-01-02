document.addEventListener("DOMContentLoaded", () => {
  const timerDisplay = document.getElementById("timerDisplay");
  const startButton = document.getElementById("startButton");
  const cancelButton = document.getElementById("cancelButton");

  let countdownValue = 10; // Starting countdown value
  let countdownTimeout;

  // Function to start the countdown
  const startCountdown = () => {
    startButton.disabled = true;
    cancelButton.disabled = false;

    const countdown = () => {
      if (countdownValue > 0) {
        timerDisplay.textContent = countdownValue;
        countdownValue--;
        countdownTimeout = setTimeout(countdown, 1000); // Call recursively every second
      } else {
        timerDisplay.textContent = "Time's up!";
        startButton.disabled = false;
        cancelButton.disabled = true;
      }
    };

    countdown();
  };

  // Function to cancel the countdown
  const cancelCountdown = () => {
    clearTimeout(countdownTimeout);
    timerDisplay.textContent = "Cancelled";
    startButton.disabled = false;
    cancelButton.disabled = true;
    countdownValue = 10; // Reset countdown value
  };

  // Event listeners
  startButton.addEventListener("click", startCountdown);
  cancelButton.addEventListener("click", cancelCountdown);
});
