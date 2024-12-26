let age = 55;
let p = new Promise(function (resolve, reject)
{
    if (age > 25)
    {
        reject("no chocolate for adults")
    }
    else
    {
        setTimeout(function ()
        {
            resolve("chocolate cake")
        }, 10000)
    }
})
console.log(p)
p
    .then(function (res)
    {
        console.log(res)
    })
    .catch(function (err)
    {
        console.log(err)
    });

let mypromise = new Promise(function (resolve, reject) {
    resolve(20);
})
/* promise chaining*/
mypromise
    .then(function (x)
    {
       return x * 2;
    })
    .then(function (y)
    {
        return y * 2;
    })
    .then(function (z)
    {
        console.log(z)
    })
    .catch(function (err)
    {
       console.log(err)
   })