import { BrowserRouter, Link, Route, Routes } from "react-router-dom";
import { FakeStoreHome } from "./fakestorehome";
import { FakeStoreProducts } from "./fakestoreproducts";
import { FakeStoreDetails } from "./fakestoredetails";

export function FakeStoreApi() {
    
    return(
        <div className="container-fluid">
            <BrowserRouter>
                <header className="bg-light p-3 mt-3 mb-3 border border-1 border-secondary d-flex justify-content-between">
                    <div>FakeStoreAPI.</div>
                    <div>
                        <span><Link to="/"> Home </Link></span>
                        <span className="mx-2"><Link to="electronics"> Electronics </Link></span>
                        <span><Link> Jewelery </Link></span>
                    </div>
                </header>
                <section>
                    <Routes>
                        <Route path="/" element={<FakeStoreHome />} />
                        <Route path="products/:category" element={<FakeStoreProducts />} />
                        <Route path="details/:id" element={<FakeStoreDetails />} />
                    </Routes>
                </section>
            </BrowserRouter>
        </div>
    )
}