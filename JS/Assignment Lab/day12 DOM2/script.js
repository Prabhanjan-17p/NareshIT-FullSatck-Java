document.addEventListener("DOMContentLoaded", () => {
    const form = document.getElementById("validationForm");
    const nameInput = document.getElementById("name");
    const emailInput = document.getElementById("email");
    const passwordInput = document.getElementById("password");
  
    form.addEventListener("submit", (e) => {
      let isValid = true;
  
      // Validate name
      if (!validateName(nameInput.value)) {
        displayError(nameInput, "Name is required and must be at least 3 characters.");
        isValid = false;
      } else {
        clearError(nameInput);
      }
  
      // Validate email
      if (!validateEmail(emailInput.value)) {
        displayError(emailInput, "Please enter a valid email address.");
        isValid = false;
      } else {
        clearError(emailInput);
      }
  
      // Validate password
      if (!validatePassword(passwordInput.value)) {
        displayError(passwordInput, "Password must be at least 6 characters.");
        isValid = false;
      } else {
        clearError(passwordInput);
      }
  
      if (!isValid) {
        e.preventDefault(); // Prevent form submission if any input is invalid
      }
    });
  
    function validateName(name) {
      return name.trim().length >= 3;
    }
  
    function validateEmail(email) {
      const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
      return emailRegex.test(email);
    }
  
    function validatePassword(password) {
      return password.length >= 6;
    }
  
    function displayError(input, message) {
      const formGroup = input.parentElement;
      const errorMessage = formGroup.querySelector(".error-message");
      errorMessage.textContent = message;
      errorMessage.style.visibility = "visible";
      input.style.borderColor = "red";
    }
  
    function clearError(input) {
      const formGroup = input.parentElement;
      const errorMessage = formGroup.querySelector(".error-message");
      errorMessage.textContent = "";
      errorMessage.style.visibility = "hidden";
      input.style.borderColor = "#ccc";
    }
  });
  