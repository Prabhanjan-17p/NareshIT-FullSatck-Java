document.addEventListener("DOMContentLoaded", () => {
  const questionElement = document.getElementById("question");
  const feedbackElement = document.getElementById("feedback");
  const cancelButton = document.getElementById("cancelButton");
  const options = document.querySelectorAll(".option");

  let feedbackTimeout;

  // Function to handle the user's answer
  const handleAnswer = (event) => {
    const answer = event.target.dataset.answer;

    // Disable options and enable cancel button
    options.forEach(option => option.disabled = true);
    cancelButton.disabled = false;

    // Set feedback after a delay
    feedbackTimeout = setTimeout(() => {
      feedbackElement.textContent = answer === "correct" ? "Correct! 🎉" : "Incorrect. 😔";
      feedbackElement.style.color = answer === "correct" ? "green" : "red";

      // Enable options and disable cancel button
      options.forEach(option => option.disabled = false);
      cancelButton.disabled = true;
    }, 2000);
  };

  // Function to cancel feedback
  const cancelFeedback = () => {
    clearTimeout(feedbackTimeout);
    feedbackElement.textContent = "Feedback canceled!";
    feedbackElement.style.color = "orange";

    // Enable options and disable cancel button
    options.forEach(option => option.disabled = false);
    cancelButton.disabled = true;
  };

  // Add event listeners to options
  options.forEach(option => {
    option.addEventListener("click", handleAnswer);
  });

  // Add event listener to cancel button
  cancelButton.addEventListener("click", cancelFeedback);
});
