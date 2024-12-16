// //Object - is a collection of key values pairs and each key is a string and values are any datatype and keys are connected to values


// var obj = {
//     name: 'raj',
//     age : 36,
//     sum : function (){
//         console.log("Hello World")
//     }
// }
// //Dot Notation
// console.log(obj.name)
// console.log(obj.age)
// console.log(obj.address) 
// console.log(obj.sum) 
// obj.sum()
// // console.log(age)
// //Index Signature
// console.log(obj['name'])
// console.log(obj['age'])
// console.log(obj['sum'])

// //create an object which contains id,email and password
// var emp = {
//     id: 1,
//     name : 'raj',
//     email : "raj@example.com",
//     pass : 'pass@example.com'
// }
// console.log(emp.id)
// console.log(emp.name)
// console.log(emp.email)
// console.log(emp.pass)
// console.log(emp['id'])
// console.log(emp['name'])
// console.log(emp['email'])
// console.log(emp['pass'])

// //2- Using Constructor Functions - Object declarations
// function person(id, email, password) {
//     this.id = id // obje.id = id
//     this.email = email // obje.email = email
//     this.password = password // obje.password = password
// }
// var obje = new person(88, "email", "password")
// //this - is a keyword that point to current calling object

// //3- Object.create Method : based on one object it creating another object
// var obj2 ={
//     name : " lamkiah",
//     email : "sacgs@ex.com"
// }
// console.log(Object.keys(obj2))
// var obj3 = Object.create(obj2)
// console.log(obj3)
// obj3.name="kanha"
// console.log(obj3.name)
// console.log(obj3.email)
// var obj4 = Object.create(obj3)
// console.log(obj4)






 //object literal:
 var obj={
    name:"raj",
      age: 28,
      sum: function ()
      {
        console.log("hello world")
      }
}

console.log(obj.name);
console.log(obj['name'])
console.log(obj.age);
console.log(obj.address);
obj.sum()

//create an object which contains id,name,email,password and access them using dot or index signature

//object.create
  var obj2 = {
		name: "bheema",
		email: "a@a.com",
		
}
var obj3 = Object.create(obj2)
obj3.name="john"
var obj4= Object.create(obj3)
console.log(obj4.name)