document.addEventListener("DOMContentLoaded", () => {
    const textArea = document.getElementById("textArea");
    const charCounter = document.getElementById("charCounter");
    const maxChars = parseInt(textArea.getAttribute("maxlength"));
  
    textArea.addEventListener("input", () => {
      const currentLength = textArea.value.length;
      charCounter.textContent = `${currentLength} / ${maxChars}`;
      
      
      if (currentLength > maxChars * 0.8 && currentLength < maxChars) {
        // Add warning style
        textArea.classList.add("warning");
        textArea.classList.remove("limit");
        charCounter.classList.add("warning");
        charCounter.classList.remove("limit");
      } else if (currentLength === maxChars) {
        // Add limit style
        textArea.classList.add("limit");
        textArea.classList.remove("warning");
        charCounter.classList.add("limit");
        charCounter.classList.remove("warning");
      } else {
        // Remove any styles
        textArea.classList.remove("warning", "limit");
        charCounter.classList.remove("warning", "limit");
      }
    });
  });
  