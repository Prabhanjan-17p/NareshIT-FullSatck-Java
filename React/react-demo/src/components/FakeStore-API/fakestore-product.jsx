import axios from "axios";
import { useEffect, useRef, useState } from "react";

export function FakeStoreProducts() {

    const [product, setProduct] = useState({ id: 0, title: "", price: 0.1, description: "", category: "", image: "", rating: { rate: 0, count: 0 } });

    const [scrollMsg, setScrollMsg] = useState('')

    const [scrollSty, setScrollSty] = useState('')

    const [maxProduct, setMaxProduct] = useState(20);

    let count = useRef(0);
    let thread = useRef(null);

    function LoadProductByID(id) {
        axios.get(`https://fakestoreapi.com/products/${id}`).then(res => {
            setProduct(res.data);
        });
    }

    useEffect(() => {
        LoadProductByID(1);
        LoadTotalProducts();
    }, []);

    function HandleNextClick() {
        count.current = count.current + 1;
        LoadProductByID(count.current);
    }

    function HandlePreviousClick() {
        count.current = count.current - 1;
        LoadProductByID(count.current);
    }

    function LoadAutoProduct() {
        count.current = count.current + 1;
        axios.get(`https://fakestoreapi.com/products/${count.current}`).then(res => {
            setProduct(res.data);
        });
    }

    function HandleAutoPlay() {
        thread.current = setInterval(LoadAutoProduct, 2000);
        setScrollMsg('Auto Scroll No')
        setScrollSty('text-success')
    }

    function HandlePause() {
        clearInterval(thread.current);
        setScrollMsg('Auto Scroll Off')
        setScrollSty('text-danger')
    }

    function HandleSeekBarOnchange(e) {
        count.current = e.target.value
        LoadProductByID(count.current)
    }

    function LoadTotalProducts() {
        axios.get(`https://fakestoreapi.com/products`).then(res => {
            setMaxProduct(res.data.length);
        });
    }

    return (
        <div className="container-fluid d-flex justify-content-center">
            <div className="card mt-4 w-50">
                <div className="card-header text-center">
                    <div>{product.title}</div>
                    <div className={scrollSty}>{scrollMsg}</div>
                </div>
                <div className="card-body">
                    <div className="row">
                        <div className="col-1 d-flex flex-column justify-content-center align-items-center">
                            <button onClick={HandlePreviousClick} className="btn btn-dark bi bi-chevron-left"></button>
                        </div>
                        <div className="col-10 text-center">
                            <img src={product.image} alt="" height="200" />
                            <p className="mt-2"><strong>Price:</strong> ${product.price}</p>
                            <p><strong>Description:</strong> {product.description}</p>
                            <p><strong>Rating:</strong> {product.rating.rate} ⭐ ({product.rating.count} reviews)</p>
                            <div>
                                <input type="range" min="1" max={maxProduct} value={count.current} style={{width:"100%"}} onChange={HandleSeekBarOnchange}/>                            
                            </div>
                        </div>
                        <div className="col-1 d-flex flex-column justify-content-center align-items-center">
                            <button onClick={HandleNextClick} className="btn btn-dark bi bi-chevron-right"></button>
                        </div>
                    </div>
                </div>
                <div className="card-footer text-center">
                    <button onClick={HandleAutoPlay} className="btn btn-primary bi bi-play"></button>
                    <button onClick={HandlePause} className="btn btn-danger bi bi-pause ms-2"></button>
                </div>
            </div>
        </div>
    );
}
