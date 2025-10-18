import axios from "axios";
import { useEffect, useState } from "react";
import { useCookies } from "react-cookie";
import { Link, Outlet, useNavigate, useParams } from "react-router-dom";

export function FakeStoreProducts() {

    const [products, setProduct] = useState([{ id: 0, title: "", price: 0.1, description: "", category: "", image: "", rating: { rate: 0, count: 0 } }]);

    let param = useParams();

    const navigate = useNavigate();

    const [cookies, setCookie, removeCookie] = useCookies(['username'])


    useEffect(() => {
        if (cookies['username']) {
            axios.get(`https://fakestoreapi.com/products/category/${param.category}`)
            .then(res => {
                setProduct(res.data)
            })
        }else{
            navigate('/')
        }
    }, [])

    function handleBackToHome() {
        navigate("/home")
    }

    return (
        <div>
            <h2>{param.category.toUpperCase()} PRODUCTS</h2>
            <div className="row">
                <div className="col-6">
                    <main className="d-flex flex-wrap">
                        {
                            products.map(product =>
                                <div className="card m-2 p-2">
                                    <Link to={`details/${product.id}`} >
                                        <img src={product.image} className="card-img-top " height="100" />
                                    </Link>
                                </div>
                            )
                        }
                    </main> 
                    <div>
                        <button onClick={handleBackToHome} className="btn btn-warning">Back to Home</button>
                    </div>
                </div>
                <div className="col-6">
                    <Outlet />
                </div>
            </div>
        </div>
    )
}