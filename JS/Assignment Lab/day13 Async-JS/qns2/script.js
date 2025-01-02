document.addEventListener("DOMContentLoaded", () => {
    const taskInput = document.getElementById("task");
    const delayInput = document.getElementById("delay");
    const setReminderButton = document.getElementById("setReminderButton");
    const cancelReminderButton = document.getElementById("cancelReminderButton");
    const statusMessage = document.getElementById("statusMessage");
  
    let reminderTimeout;
  
    // Function to set a reminder
    const setReminder = () => {
      const task = taskInput.value.trim();
      const delay = parseInt(delayInput.value.trim()) * 1000;
  
      if (!task) {
        statusMessage.textContent = "Please enter a task.";
        return;
      }
  
      if (!delay || delay <= 0) {
        statusMessage.textContent = "Please enter a valid delay in seconds.";
        return;
      }
  
      statusMessage.textContent = `Reminder set for task: "${task}" in ${delay / 1000} seconds.`;
      setReminderButton.disabled = true;
      cancelReminderButton.disabled = false;
  
      // Set timeout for the reminder
      reminderTimeout = setTimeout(() => {
        alert(`Reminder: ${task}`);
        statusMessage.textContent = "No reminders set.";
        setReminderButton.disabled = false;
        cancelReminderButton.disabled = true;
      }, delay);
    };
  
    // Function to cancel the reminder
    const cancelReminder = () => {
      clearTimeout(reminderTimeout);
      statusMessage.textContent = "Reminder canceled.";
      setReminderButton.disabled = false;
      cancelReminderButton.disabled = true;
    };
  
    // Event listeners
    setReminderButton.addEventListener("click", setReminder);
    cancelReminderButton.addEventListener("click", cancelReminder);
  });
  