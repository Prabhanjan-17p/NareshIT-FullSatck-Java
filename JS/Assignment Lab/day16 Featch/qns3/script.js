// Function to fetch user data and display it in the table
const fetchUserDetails = () => {
  fetch('userData.json')
    .then(response => response.json())
    .then(data => {
      const tbody = document.querySelector('#usertable tbody');
      tbody.innerHTML = ''; // Clear all prev data

      data.forEach(user => {
        const row = document.createElement('tr');

        row.innerHTML = `
                        <td>${user.id}</td>
                        <td>${user.username}</td>
                        <td>${user.email}</td>
                        <td>${user.phone}</td>
                        <td>${user.address}</td>
                    `;

        tbody.appendChild(row);
      });
    })
    .catch(error => {
      console.error('Error fetching data:', error);
    });
};

// Add event listener to the fetch button
document.getElementById('fetchButton').addEventListener('click', fetchUserDetails);