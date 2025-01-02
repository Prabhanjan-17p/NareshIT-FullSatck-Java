// Function to fetch user data and display their addresses
const fetchUserDetails = () => {
  fetch('userData.json')
    .then(response => response.json())
    .then(data => {
      const resultDiv = document.getElementById('result');
      resultDiv.innerHTML = ''; // Clear any previous content

      // Loop through users and append their address
      data.forEach(user => {
        const addressElement = document.createElement('address');
        addressElement.textContent = `${user.username}: ${user.address}`;
        resultDiv.appendChild(addressElement);
      });
    })
    .catch(error => {
      console.error('Error fetching data:', error);
    });
};

// Add event listener to the fetch button
document.getElementById('fetchButton').addEventListener('click', fetchUserDetails);