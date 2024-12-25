// var,let,const
// console.log(b) // cannot access let,const before declaration
// var a = 20;
// var a = 15; // redeclare is possible using var
// a = 30; // reassign is possible using var
// let b = 20;
//let b = 15; //let and const cannot declare
// b = 30;// reassign is possible using let
// const c = 10;
// c = 20;// const values cannot re assign
//var is a function scoped variable and let,const are block scoped variables
// function sum ()
// {
//     if (true)
//     {
//         let x = 25;
//     }
//     console.log(x)
// }
// sum()


const nameInput= document.getElementById('name')
const emailInput = document.getElementById("email").value
const passwordInput = document.getElementById("pwd").value
const passwordInput2 = document.getElementById("pwd2").value


document.getElementById('form').addEventListener('submit', function (e)
{
    e.preventDefault();
    console.log(e);
    console.log(nameInput.value.length)
    if (nameInput.value.trim().length < 6)
    {
        alert("name should be minimum 6 characters")
    }
    if (!(emailInput.match("^S+@S+.S{3}+$")))
    {
        document.getElementById('emailError').textContent="Please enter valid email"
    }
    if (passwordInput != passwordInput2)
    {
        alert("Passwords are not matching")
    }
    
})
function revealPassword ()
{
    const pwd = document.getElementById("pwd2")
    alert(pwd.type)
	if (pwd.type == "text") {
		pwd.type = "password"
	} else {
		pwd.type = "text"
	}
}