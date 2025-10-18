import axios from "axios";
import { useEffect, useState } from "react";
import { useCookies } from "react-cookie";
import { Link, useNavigate, useParams } from "react-router-dom";


export function FakeStoreDetails() {

    const [product, setProduct] = useState({ id: 0, title: "", price: 0.1, description: "", category: "", image: "", rating: { rate: 0, count: 0 } });

    const [cookies, setCookie, removeCookie] = useCookies(['username'])

    const navigate = useNavigate()

    let params = useParams();

    useEffect(() => {
        if (cookies['username']) {
            axios.get(`https://fakestoreapi.com/products/${params.id}`)
                .then(res => {
                    setProduct(res.data)
                })
        }else{
            navigate("/")
        }

    }, [params.id])

    return (
        <div>
            <h2>Product Details</h2>
            <dl>
                <img src={product.image} height="200" />

                <dt>Title</dt>
                <dd>{product.title}</dd>

                <dt>Price</dt>
                <dd>{product.price}</dd>

                <dt>Rating</dt>
                <dd>
                    <span className="badge bg-success text-white">{product.rating.rate} <span className="bi bi-star-fill"></span></span>
                    <span>[{product.rating.count}]</span>
                </dd>
            </dl>
            <Link to={`/products/${product.category}`}> Back to product.</Link>
        </div>
    )
}