//1- Month Day number
var mon = prompt("Enter The Month Number");
switch (mon) {
    case 1:
        console.log('31-January');
        break;
    case 2:
        console.log('28 or 29 -February');
        break;
    case 3:
        console.log('31-March');
        break;
    case 4:
        console.log('30-April');
        break;
    case 5:
        console.log('31-May');
        break;
    case 6:
        console.log('30-June');
        break;
    case 7:
        console.log('31-July');
        break;
    case 8:
        console.log('30-August');
        break;
    case 9:
        console.log('31-September');
        break;
    case 10:
        console.log('30-October');
        break;
    case 11:
        console.log('31-November');
        break;
    case 12:
        console.log('30-December');
        break;

    default:
        console.log('Invalid month');
        break;
}

//2- operators performed
var op =prompt("Which operator to use")
var n1=10,n2=2;
switch(op){
    case '+':
        console.log(n1+n2);
        break;
    case '-':
        console.log(n1-n2);
        break;
    case '*':
        console.log(n1*n2);
        break;
    case '/':
        console.log(n1/n2);
        break;
    default:
        console.log('Invalid operator');
        break;
}


//3- Condition check id and password
var id = prompt("Enter the id no : ");
var password

if (id == 1001 ) {
    password = prompt("Enter the password : ");
    if (password == 1010) {
        alert('Login successful')
    }else{
        alert('Password incorrect')
    }
} else {
    alert('ID incorrect')
    // console.log('id failed');
}