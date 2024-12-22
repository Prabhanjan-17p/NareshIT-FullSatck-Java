let item = 0;
const tasksContainer = document.getElementById('listTodos');
const countTodos = document.getElementById('countTodos');

function add() {
    const inputText = document.getElementById('textInpu').value.trim(); // Trim whitespace
    if (inputText === "") {
        alert("Please enter a task!");
        return;
    }

    item++;
    const taskHTML = `
        <div class="con1">
            <div class="right" onclick="toggleTaskStatus(this)"></div>
            <label class="lbl">${inputText}</label>
            <img src="./img/icons8-cross-100 (1).png" alt="Delete" onclick="deleteTask(this)">
        </div>
    `;

    tasksContainer.insertAdjacentHTML('beforeend', taskHTML); // Add task to the container
    countTodos.textContent = item; // Update counter
    document.getElementById('textInpu').value = ""; // Clear input field
}


function deleteTask(element) {
    const taskElement = element.parentElement;
    const taskStatus = taskElement.querySelector(".right").getAttribute("data-status");

    // Adjust item count based on task status
    if (taskStatus !== "completed") {
        item--;
    }

    taskElement.remove(); // Remove the task element
//     element.parentElement.remove(); // Remove the task element
    countTodos.textContent = item; // Update counter
}

function clearAllTasks() {
    tasksContainer.innerHTML = ""; // Clear all tasks from the container
    item = 0; // Reset the counter
    countTodos.textContent = item; // Update counter
}

function toggleTaskStatus(element) {
    const label = element.nextElementSibling; // Get the associated label
    if (element.innerHTML === "") {
        // Mark as completed
        element.innerHTML = '<img src="./img/RIGHT.svg" alt="Check">';
        label.style.textDecoration = "line-through";
        label.style.opacity = "0.5";
        item--; // Decrease count for active items
        countTodos.textContent = item; // Update counter
        element.setAttribute("data-status", "completed"); // Mark as completed
    } else {
        // Mark as not completed
        item++; // Increase count for active items
        countTodos.textContent = item; // Update counter
        element.innerHTML = "";
        label.style.textDecoration = "none";
        label.style.opacity = "1";
        element.setAttribute("data-status", "active"); // Mark as active
    }
}



var moon = document.getElementById('img3');
var sun = document.getElementById('img4');
var moonBack = document.getElementById('img2');
var sunBack = document.getElementById('img1');
var mm = document.getElementById('mm');
var inBackColor = document.getElementById('rr');
var inputBackColor = document.getElementById('textInpu');
// var  = document.getElementsByClassName('inputText');

function changeToSun() {
    sun.style.display = 'block'; // Show sun
    sunBack.style.display = 'block'; // Show sunBack
    moon.style.display = 'none'; // Hide moon
    moonBack.style.display = 'none'; // Hide moonBack
    mm.style.backgroundColor = 'white'; 
    inBackColor.style.backgroundColor = 'white'; 
    inputBackColor.style.backgroundColor = 'white'; 
    inputBackColor.style.color = 'black';  
}


function changeToMoon() {
    moon.style.display = 'block'; // Show moon
    moonBack.style.display = 'block'; // Show moonBack
    sun.style.display = 'none'; // Hide sun
    sunBack.style.display = 'none'; // Hide sunBack
    mm.style.backgroundColor = 'hsl(235, 21%, 11%)'; 
    inBackColor.style.backgroundColor = ' hsl(235, 24%, 19%)';  
    inputBackColor.style.backgroundColor = ' hsl(235, 24%, 19%)'; 
    inputBackColor.style.color = 'white';  
}

