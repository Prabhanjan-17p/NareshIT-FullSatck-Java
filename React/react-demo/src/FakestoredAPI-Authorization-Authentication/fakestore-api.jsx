import { BrowserRouter, Link, Route, Routes } from "react-router-dom";
import { FakeStoreHome } from "./fakestorehome";
import { FakeStoreProducts } from "./fakestoreproducts";
import { FakeStoreDetails } from "./fakestoredetails";
import { FakeStoreLogin } from "./fakestore-login";
import { useCookies } from "react-cookie";

export function FakeStoreApiAUTH() {

    const [cookies, setCookie, removeCookie] = useCookies(['username'])

    function handleLogout() {
        removeCookie('username');
        window.location.href = "/";
    }

    return (
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
                {
                    cookies['username'] && (
                        <div className="mb-3">
                            <span>Hello </span>
                            <span>{cookies['username']}</span>
                            {cookies['username'] && (
                                <button className="btn btn-warning ms-2" onClick={handleLogout}>Logout</button>
                            )}
                        </div>
                    )
                }
                <section>
                    <Routes>
                        <Route path="/" element={<FakeStoreLogin />} />
                        <Route path="home" element={<FakeStoreHome />} />
                        <Route path="products/:category" element={<FakeStoreProducts />} >
                            <Route path="details/:id" element={<FakeStoreDetails />} />
                        </Route>
                    </Routes>
                </section>
            </BrowserRouter>
        </div>
    )
}