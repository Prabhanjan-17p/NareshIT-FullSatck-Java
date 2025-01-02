// Simulating a database object with user data
const database = {
  1: {
    userId: 1,
    userName: 'admin',
    password: 'password123',
    phoneNumber: '123-456-7890'
  },
  2: { userId: 2, userName: 'john_doe', password: 'password456', phoneNumber: '987-654-3210' },
  3: { userId: 3, userName: 'jane_doe', password: 'password789', phoneNumber: '555-555-5555' }
};


const fetchUserData = (userId) => {
  return new Promise((resolve, reject) => {
    setTimeout(() => {
      if (database[userId]) {
        resolve(`User: ${database[userId].userName}`);
      } else {
        reject('User not found');
      }
    }, 2000);
  });
};

const userIdInput = 1; 

fetchUserData(userIdInput)
  .then((result) => {
    console.log(result); 
  })
  .catch((error) => {
    console.log(error);
  });
