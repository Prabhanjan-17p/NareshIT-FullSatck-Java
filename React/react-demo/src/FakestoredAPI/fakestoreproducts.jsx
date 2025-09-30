import axios from "axios";
import { useEffect, useState } from "react";
import { Link, useParams } from "react-router-dom";

export function FakeStoreProducts() {
    
    const [products, setProduct] = useState([{ id: 0, title: "", price: 0.1, description: "", category: "", image: "", rating: { rate: 0, count: 0 } }]);

    let param = useParams();

    useEffect(()=>{
        axios.get(`https://fakestoreapi.com/products/category/${param.category}`)
        .then(res=>{
            setProduct(res.data)
        })
    },[])

    return(
        <div>
            <h2>{param.category.toUpperCase()} PRODUCTS</h2>
            <main className="d-flex flex-wrap">
                {
                    products.map(product => 
                        <div className="card m-2 p-2">
                            <Link to={`/details/${product.id}`} >
                                <img src={product.image} className="card-img-top " height="100" />
                            </Link>
                        </div>
                    )
                }
            </main>
            <Link to="/">Back to home</Link>
        </div>
    )
}