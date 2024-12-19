var intAMT = 2000
var deposit
var withAMT

function bankSystem() {
    alert("1. Create Account\n2. Deposit Amount\n3. Withdraw Amount\n4. Check Balance\n5. Exit");
    var op = parseInt (prompt("Enter your choice : "));
    if(op >= 1 && op <= 5){
        switch(op){
            case 1:
                createAccount();
                bankSystem();
                // break;
            case 2:
                depositAmount();
                bankSystem();
                // break;
            case 3:
                withdrawAmount();
                bankSystem();
                // break;
            case 4:
                checkBalance();
                bankSystem();
                // break;
            case 5:
                alert("Thank you for using our banking system!");
                break;
        }
    }else{
        alert("Please enter valid choice(1-5)");
        bankSystem();
    }
}
bankSystem()

// for ac creating
function createAccount(){
    intAMT = parseInt( prompt("Enter the intial amount to create :"))
    if(intAMT >= 2000){
        alert(`Account created successfully with initial amount : ${intAMT}`);
    } else{
        alert("Initial amount should be at least 2000");
        createAccount();
    }
}

// for deposit
function depositAmount(){
    deposit = parseInt (prompt("Enter the amount to deposit :"));
    if(deposit > 0){
        intAMT += deposit;
        alert(`Amount deposited successfully. New balance is : ${intAMT}`);
    } else{
        alert("Please enter valid amount to deposit");
        depositAmount();
    }
}

// for withdraw
function  withdrawAmount(){
    withAMT = parseInt (prompt("Enter how much amount you withdraw :"));
    if(withAMT > 0 && withAMT <= intAMT){
        intAMT -= withAMT;
        alert(`Amount withdrawn successfully. New balance is : ${intAMT}`);
    }else{
        alert("Please enter valid amount to withdraw and it should not exceed the current balance");
        withdrawAmount();
    }
}

// for checking balance
function checkBalance(){
    alert(`Your current balance is : ${intAMT}`);
}


