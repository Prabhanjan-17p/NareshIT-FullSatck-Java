const userDatabase = {
  admin: { 
    username: 'admin', 
    password: 'admin123' 
  },
  john: { 
    username: 'john', 
    password: 'john456' 
  },
  jane: { 
    username: 'jane', 
    password: 'jane789' 
  }
};


const loginUser = (username, password) => {
  return new Promise((resolve, reject) => {
    setTimeout(() => {
      if (userDatabase[username] && userDatabase[username].password === password) {
        resolve('Login successful');
      } else {
        reject('Invalid username or password');
      }
    }, 2000); 
  });
};

// ex-1
loginUser('admin', 'admin123')
  .then((message) => {
    console.log(message); 
  })
  .catch((error) => {
    console.log(error); 
  });


// ex-2
loginUser('ravin', 'admin123')
  .then((message) => {
    console.log(message); 
  })
  .catch((error) => {
    console.log(error); 
  });
