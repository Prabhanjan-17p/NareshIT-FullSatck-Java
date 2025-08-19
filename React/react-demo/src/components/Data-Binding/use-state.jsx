import moment from "moment"
import { useEffect, useState } from "react"
import axios, { Axios } from "axios"

export function UseS() {

    // const [cat , setCat] = useState(['All','Pant','Shirt'])

    // useEffect(()=>{

    // },[])

    // return(
    //     <div className="container-fluid">
    //         <h2>All Select</h2>
    //         <ul className="list-unstyled">
    //             {
    //                 cat.map((ca,index) => <li>{ca}</li>)
    //             }
    //         </ul>
    //     </div>
    // );



    //Object 

    /*
        const [pro,setPro] = useState({})
    
        useEffect(()=>{
            setPro({Name:'Realme TV',Price:65000.00})
        },[])
    
        return(
            <div className="container-fluid">
                <h2>Name</h2>
                <ul>
                    {
                        Object.keys(pro).map(key => <li key={key}>{key} : {pro[key]}</li>)
                    }
                </ul>
            </div>
        );
            */



    //Array of Object
    /*
    const[pro,setPro] = useState([{}])

    useEffect(()=>{
        setPro([{Name : 'TV',Price:95000.00},{Name : 'Mobile',Price:45000.00}])
    },[])

    return(
        <div className="container-fluid">
            <h2>Table</h2>
            <table className="table table-hover">
                <thead>
                    <tr>
                        <th>Name</th>
                        <th>Price</th>
                    </tr>
                </thead>
                <tbody>
                    {
                        pro.map(pro => <tr key={pro.Name}><td>{pro.Name}</td><td>{pro.Price}</td></tr>)
                    }
                </tbody>
            </table>

        </div>
    )
        */

    //Arraya-Object-Array

    // const [pro, setPro] = useState(
    //     [
    //         { Product_Type: 'Eloctronic', Product: ['TV', 'AC'] },
    //         { Product_Type: 'Footwear', Product: ['Sneakers', 'Boots', 'Casuals'] }
    //     ]
    // )

    // return (
    //     <div className="container-fluid">
    //         <h2>Menu</h2>
    //         <ol>
    //             {
    //                 pro.map(item => 
    //                 <li key={item}>{item.Product_Type}
    //                     <ul>
    //                         {item.Product.map(it => <li key={it}>{it}</li>)}
    //                     </ul>
    //                 </li>)
    //             }
    //         </ol>

    //         <h2>Select</h2>
    //         <select >
    //             {
    //                 pro.map(item => 
    //                     <optgroup label={item.Product_Type} key={item}>
    //                         {
    //                             item.Product.map(product => <option key={product}>{product}</option>)

    //                         }
    //                     </optgroup>
    //                 )
    //             }
    //         </select>
    //     </div>
    // )



    //Date Show using Moment
    // const[date] = useState(new Date())

    // return(
    //     <div className="container-fluid">
    //         {
    //             /* <h1>{date.toString()}</h1>  using clasic means javascript */
    //             <h1>{moment(date).format('DD dddd, MMMM YYYY')}</h1>
    //         }

    //     </div>
    // )



    //Two Ways Dinding 

    // const [user,setUser] = useState('')

    // useEffect(()=>{
    //     setUser('Kanha')
    // },[])

    // function ChengeUserName(e) {
    //     setUser(e.target.value);
    // }

    // function VerifyUserName(e) {
    //     if (e.target.value === "") {
    //         alert("Enter Your Name!!")
    //     }
    // }

    // return(
    //     <div className="container-fluid">
    //         <h2>Register</h2>
    //         <dl>
    //             <dt>User Name</dt>
    //             <dd><input type="text" onChange={ChengeUserName} onBlur={VerifyUserName} value={user}/></dd>
    //         </dl>
    //         <h3>Hello ! {user}</h3>
    //     </div>
    // );



    //Custom Arguments in React Events-5

    // function handleClick(e,name,price,stock) {
    //     alert(`Name : ${name} \nPrice : ${price} \nStock : ${stock} \nX Position : ${e.clientX} \nButton ID : ${e.id}`)        
    // }

    // return(
    //     <div className="container-fluid">
    //         <button id="btnInsert" onClick={(e)=>handleClick(e,'TV',9800,true)}>Insert</button>
    //     </div>
    // )



    //Stop Propagration 

    // function navClick(e) {
    //     alert("Nav Cliked!!")
    // }
    // function btnClick(e) {
    //     e.stopPropagation();
    //     alert("Btn Cliked!!")
    // }

    // return (
    //     <div className="container-fluid">
    //         <nav className="nav bg-dark text-white p-2  mt-2" onClick={navClick}>
    //             <span className="h3">NavBar</span>
    //             <button className="btn btn-outline-light ms-auto" onClick={btnClick}>
    //                 <i className="bi bi-search-heart-fill"></i>
    //             </button>
    //         </nav>
    //     </div>
    // );


    //Prevent Default

    // function submitData(e) {
    //     e.preventDefault();
    //     alert("Data submit sucessfully!!")
    // }
    // return(
    //     <div className="container-fluid mt-3">
    //         <form onSubmit={submitData}>
    //             Name : <input name="userName" type="text" /> <button type="submit">Submit</button>
    //         </form>
    //     </div>
    // )

    //Handle Ajax 
    //1- XMLHttpRequest
    // const [product, setProduct] = useState({
    //     title: "", price: 79999, ratings: { rating: 1500, rate: 4.6, reviews: 65000 }, offer: ["", "", "", ""],image:''
    // })

    // function loadData() {

    //     var http = new XMLHttpRequest();

    //     http.open("get", "product.json", true);
    //     http.send();

    //     http.onreadystatechange = function () {
    //         if (http.readyState === 4 && http.status === 200) {
    //             setProduct(JSON.parse(http.responseText));
    //         }
    //     };

    // }

    // useEffect(() => {
    //     loadData()
    // }, [])

    // return (
    //     <div className="container-fluid">
    //         <div className="mt-4 row">
    //             <div className="col-4">
    //                 <img src={product.image} alt="" height="450" width="100%"/>
    //             </div>
    //             <div className="col-8">
    //                 <div className="fs-4">{product.title}</div>
    //                 <div className="mt-2">
    //                     <span className="badge bg-success">{product.ratings.rate} <span className="bi bi-star-fill"></span> </span>
    //                     <span className="text-secondary fw-bold ms-2">{product.ratings.rating.toLocaleString()} rating & {product.ratings.reviews.toLocaleString()} reviews</span>
    //                 </div>
    //                 <div className="mt-3 fw-bold fs-1">
    //                     {
    //                         product.price.toLocaleString('en-in',{style:'currency',currency:'INR'})
    //                     }
    //                 </div>
    //                 <div className="mt-3">
    //                     <h5>Avalaible Offer</h5>
    //                     <ul className="list-unstyled">
    //                         {
    //                             product.offer.map(key => <li className="bi bi-tag-fill my-3 text-success" key={key}><span className="  ms-2 text-secondary">{key}</span></li>)
    //                         }
    //                     </ul>
                        
    //                 </div>
    //             </div>
    //         </div>
    //     </div>
    // );

    //2- Fetch()
    // const [product, setProduct] = useState({
    //     title: "", price: 0, ratings: { rating: 0, rate: 0.0, reviews: 0 }, offer: [],image:''
    // })

    // function loadData() {
    //     fetch("product.json")
    //     .then(res => res.json())
    //     .then(product => setProduct(product))
    // }

    // useEffect(() => {
    //     loadData()
    // }, [])

    // return (
    //     <div className="container-fluid">
    //         <div className="mt-4 row">
    //             <div className="col-4">
    //                 <img src={product.image} alt="" height="450" width="100%"/>
    //             </div>
    //             <div className="col-8">
    //                 <div className="fs-4">{product.title}</div>
    //                 <div className="mt-2">
    //                     <span className="badge bg-success">{product.ratings.rate} <span className="bi bi-star-fill"></span> </span>
    //                     <span className="text-secondary fw-bold ms-2">{product.ratings.rating.toLocaleString()} rating & {product.ratings.reviews.toLocaleString()} reviews</span>
    //                 </div>
    //                 <div className="mt-3 fw-bold fs-1">
    //                     {
    //                         product.price.toLocaleString('en-in',{style:'currency',currency:'INR'})
    //                     }
    //                 </div>
    //                 <div className="mt-3">
    //                     <h5>Avalaible Offer</h5>
    //                     <ul className="list-unstyled">
    //                         {
    //                             product.offer.map(key => <li className="bi bi-tag-fill my-3 text-success" key={key}><span className="  ms-2 text-secondary">{key}</span></li>)
    //                         }
    //                     </ul>
                        
    //                 </div>
    //             </div>
    //         </div>
    //     </div>
    // );


    //3-jQuery method
    //  const [product, setProduct] = useState({
    //     title: "", price: 0, ratings: { rating: 0, rate: 0.0, reviews: 0 }, offer: [],image:''
    // })

    // function loadData() {
    //     $.ajax({
    //         method: "get",
    //         url:"product.json",
    //         success: (product) =>{
    //             setProduct(product)
    //         }
    //     })
    // }

    // useEffect(() => {
    //     loadData()
    // }, [])

    // return (
    //     <div className="container-fluid">
    //         <div className="mt-4 row">
    //             <div className="col-4">
    //                 <img src={product.image} alt="" height="450" width="100%"/>
    //             </div>
    //             <div className="col-8">
    //                 <div className="fs-4">{product.title}</div>
    //                 <div className="mt-2">
    //                     <span className="badge bg-success">{product.ratings.rate} <span className="bi bi-star-fill"></span> </span>
    //                     <span className="text-secondary fw-bold ms-2">{product.ratings.rating.toLocaleString()} rating & {product.ratings.reviews.toLocaleString()} reviews</span>
    //                 </div>
    //                 <div className="mt-3 fw-bold fs-1">
    //                     {
    //                         product.price.toLocaleString('en-in',{style:'currency',currency:'INR'})
    //                     }
    //                 </div>
    //                 <div className="mt-3">
    //                     <h5>Avalaible Offer</h5>
    //                     <ul className="list-unstyled">
    //                         {
    //                             product.offer.map(key => <li className="bi bi-tag-fill my-3 text-success" key={key}><span className="  ms-2 text-secondary">{key}</span></li>)
    //                         }
    //                     </ul>
                        
    //                 </div>
    //             </div>
    //         </div>
    //     </div>
    // );

    //4- Axios (React 3rd party liberies)
     const [product, setProduct] = useState({
        title: "", price: 0, ratings: { rating: 0, rate: 0.0, reviews: 0 }, offer: [],image:''
    })

    function loadData() {
        axios.get('product.json')
        .then(pro =>{
            setProduct(pro.data);
        })
    }

    useEffect(() => {
        loadData()
    }, [])

    return (
        <div className="container-fluid">
            <div className="mt-4 row">
                <div className="col-4">
                    <img src={product.image} alt="" height="450" width="100%"/>
                </div>
                <div className="col-8">
                    <div className="fs-4">{product.title}</div>
                    <div className="mt-2">
                        <span className="badge bg-success">{product.ratings.rate} <span className="bi bi-star-fill"></span> </span>
                        <span className="text-secondary fw-bold ms-2">{product.ratings.rating.toLocaleString()} rating & {product.ratings.reviews.toLocaleString()} reviews</span>
                    </div>
                    <div className="mt-3 fw-bold fs-1">
                        {
                            product.price.toLocaleString('en-in',{style:'currency',currency:'INR'})
                        }
                    </div>
                    <div className="mt-3">
                        <h5>Avalaible Offer</h5>
                        <ul className="list-unstyled">
                            {
                                product.offer.map(key => <li className="bi bi-tag-fill my-3 text-success" key={key}><span className="  ms-2 text-secondary">{key}</span></li>)
                            }
                        </ul>
                        
                    </div>
                </div>
            </div>
        </div>
    );
}