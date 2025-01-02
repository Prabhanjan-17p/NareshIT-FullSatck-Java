document.addEventListener("DOMContentLoaded", () => {
  const status = document.getElementById("status");
  const startButton = document.getElementById("startButton");
  const cancelButton = document.getElementById("cancelButton");

  let apiTimeout1, apiTimeout2;

  const startAPICalls = () => {
    startButton.disabled = true;
    cancelButton.disabled = false;

    const fetchUserData = () => {
      status.textContent = "Status: Fetching user data...";
      apiTimeout1 = setTimeout(() => {
        fetchUserPosts();
      }, 2000); // 2 seconds delay
    };

    const fetchUserPosts = () => {
      status.textContent = "Status: Fetching user posts...";
      apiTimeout2 = setTimeout(() => {
        completeProcess();
      }, 3000); // 3 seconds delay
    };

    // Complete the API call process
    const completeProcess = () => {
      status.textContent = "Status: API calls completed successfully!";
      startButton.disabled = false;
      cancelButton.disabled = true;
    };

    fetchUserData(); // Start the process
  };

  const cancelProcess = () => {
    clearTimeout(apiTimeout1);
    clearTimeout(apiTimeout2);
    status.textContent = "Status: Process canceled!";
    startButton.disabled = false;
    cancelButton.disabled = true;
  };

  startButton.addEventListener("click", startAPICalls);
  cancelButton.addEventListener("click", cancelProcess);
});
