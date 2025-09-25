import axios from "axios";
import { useCallback, useEffect, useMemo, useState } from "react"



export function Fakestore() {

    const [categories, setCategories] = useState([])
    const [products, setProducts] = useState([{ id: 0, title: '', price: 0, category: '', description: '', image: '', rating: { rate: 0, count: 0 } }]);
    const [cartItem, setCartItem] = useState([])
    const[cartCount, setCartCount] = useState(cartItem.length)

    // function LoadCategories() {
    //     axios.get(`https://fakestoreapi.com/products/categories`)
    //         .then(res => {
    //             res.data.unshift("all");
    //             setCategories(res.data)
    //         })
    // }


    //Async Await Function 
    // function LoadCategories() {
    //     axios.get(`https://fakestoreapi.com/products/categories`)
    //         .then(async res => {
    //             await res.data.unshift("all");
    //             setCategories(await res.data)
    //         })
    // }

    //Cache Data Callback() function --> Acutlly it is a means useCallback is return a function and this function return another function (means function of function --> ex :: function(){return function(){}}) 
    //and if we used useCallback with async wait then it return only one function 
        // useCallback is similar to memo but can memorize a function, so that it can save round trips when even requested.
        // It can re-render only when dependency changes.
        // Essentially, it returns a function that can be reused without being recreated on each render.
        // When used with async/await, `useCallback` still returns a single memoized async function.
        // Example: async function that fetches categories and updates state without recreating the function each render.        
    const LoadCategories = useCallback(async ()=>{

        const response = axios.get(`https://fakestoreapi.com/products/categories`);

        (await response).data.unshift("all");
        setCategories((await response).data);

        //for checking purpose
        var now = new Date();
        console.log(now.toLocaleTimeString())

    },[])

    //For normal means every time request to the server 
    // For normal fetching: makes a server request every time the function is called without caching or memoization.
    // function LoadProducts(url) {
    //     axios.get(url)
    //         .then(res => {
    //             setProducts(res.data)
    //         })
    // }


    // Cache data using useMemo: memoizes an async function to fetch products and update state, preventing unnecessary re-creations on each render.
    // useMemo - is only used to stored the data 
    // not every time used the server only first time any change in API then it will request into the server means
        // useMemo is used to cache the function itself, not call the server every time; the API is requested only when explicitly invoked with a URL.
    const LoadProducts = useMemo(()=> async(url)=>{

        const response = axios.get(url);

        setProducts((await response).data)

    },[])


    //Changin Data Callback() function
    useEffect(() => {
        //for checking purpose
        var now = new Date();
        console.log(now.toLocaleTimeString())

        LoadCategories();
        LoadProducts(`https://fakestoreapi.com/products`)
    }, [LoadCategories, LoadProducts])

    //for only Async Await
    // useEffect(() => {
    //     LoadCategories();
    //     LoadProducts(`https://fakestoreapi.com/products`)
    // }, [])

    function handleCategoryChange(e) {
        if (e.target.value === "all") {
            LoadProducts(`https://fakestoreapi.com/products`)
        }else{
            LoadProducts(`https://fakestoreapi.com/products/category/${e.target.value}`)
        }
    }

    function handleAddToCart(product) {
        cartItem.push(product)
        alert(`${product.title} \nAdd to Cart Sucessfully`)
        setCartCount(cartItem.length)
    }

    return (
        <div className="container-fluid ">
            <header className="d-flex justify-content-between m-4 bg-info p-3">
                <div className="h3">Fakestore.</div>
                <div >
                    <span><a href="">Home</a></span>
                    <span className="mx-4"><a href="">Eloctronics</a></span>
                    <span><a href="">Jewelery</a></span>
                </div>
                <div>
                    <button data-bs-toggle="modal" data-bs-target="#cart" className="btn bi bi-cart4 position-relative">
                        <span className="badge bg-danger position-absolute rounded rounded-circle">{cartCount}</span>
                    </button>
                    <div className="modal fade " id="cart">
                        <div className="modal-dialog bg-white">
                            <div className="modal-header">
                                <h3>Your Cart Items</h3>
                                <button className="btn btn-close " data-bs-dismiss="modal"></button>
                            </div>
                            <div className="modal-body">
                                <table className="table table-hover">
                                    <thead>
                                        <tr>
                                            <th>Title</th>
                                            <th>Preview</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        {
                                            cartItem.map(row=> <tr key={row}>
                                                <td>{row.title}</td>
                                                <td>
                                                    <img src={row.image} width="50" height="50" />
                                                </td>
                                            </tr>)
                                        }
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
            </header>
            <section className="mt-3 row">
                <nav className="col-2">
                    <div>
                        <label className="form-label fw-bold">Select Category</label>
                        <div>
                            <select onChange={handleCategoryChange} className="form-select">
                                {
                                    categories.map(category => <option value={category} key={category}>{category.toUpperCase()}</option>)
                                }
                            </select>
                        </div>
                    </div>
                </nav>
                <main className="col-10 d-flex flex-wrap overflow-auto " style={{ height: "550px" }}>
                    {
                        products.map(product => (
                            <div key={product.id} className="col-md-3 mb-3 ">
                                <div className="card h-100 m-2">
                                    <img src={product.image} className="card-img-top p-3" style={{ height: "200px", objectFit: "contain" }} alt={product.title} />
                                    <div className="card-body">
                                        <h6 className="card-title" style={{ fontSize: "14px" }}>{product.title}</h6>
                                        <p className="text-success fw-bold">${product.price}</p>
                                        <p className="text-muted" style={{ fontSize: "12px" }}>{product.category}</p>
                                    </div>
                                    <div className="card-footer d-flex justify-content-center">
                                        <button onClick={()=>handleAddToCart(product)} className="btn btn-warning bi bi-cart4 "> Add to Cart</button>
                                    </div>
                                </div>
                            </div>
                        ))}
                </main>
            </section>
        </div>
    )
}