// Fetch data from userData.json and display it
fetch('userData.json')
    .then(response => response.json())
    .then(data => {
        const resultDiv = document.getElementById('result');
        resultDiv.innerHTML = ''; // Clear the content before appending

        data.forEach(user => {
            const userName = document.createElement('p');
            userName.textContent = user.username;
            resultDiv.appendChild(userName);
        });
    })
    .catch(error => {
        console.error('Error fetching data:', error);
    });