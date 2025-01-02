document.addEventListener("DOMContentLoaded", () => {
  const progressBar = document.getElementById("progress");
  const progressText = document.getElementById("progressText");
  const startButton = document.getElementById("startButton");
  const cancelButton = document.getElementById("cancelButton");

  let progress = 0; // Initial progress
  let uploadTimeout;

  // Function to start the upload process
  const startUpload = () => {
    startButton.disabled = true;
    cancelButton.disabled = false;
    progress = 0;

    const upload = () => {
      if (progress < 100) {
        progress += 20; // Increment progress by 20% every second
        progressBar.style.width = `${progress}%`;
        progressText.textContent = `${progress}%`;
        uploadTimeout = setTimeout(upload, 1000); // Continue upload process
      } else {
        progressText.textContent = "Upload Complete!";
        startButton.disabled = false;
        cancelButton.disabled = true;
      }
    };

    upload();
  };

  // Function to cancel the upload process
  const cancelUpload = () => {
    clearTimeout(uploadTimeout);
    progressBar.style.width = "0%";
    progressText.textContent = "Upload Cancelled";
    startButton.disabled = false;
    cancelButton.disabled = true;
  };

  // Event listeners for buttons
  startButton.addEventListener("click", startUpload);
  cancelButton.addEventListener("click", cancelUpload);
});
