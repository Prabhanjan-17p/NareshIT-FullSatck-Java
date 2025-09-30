import { BrowserRouter, Link, NavLink, Route, Routes } from "react-router-dom";
import { LoginUser } from "../Login/login";


export function HomeReactRout() {


    return (
        <div className="container-fluid">
            <BrowserRouter>
                <header className="bg-light p-3 mt-3 mb-3 border border-1 border-secondary">
                    <nav className="d-flex justify-content-between">
                        <div className="fs-5 fw-bold">Shopper.</div>
                        <div>
                            <span className="mx-2">
                                <NavLink to="/"
                                    style={({ isActive }) => ({
                                        color: isActive ? "white" : "black",
                                        backgroundColor: isActive ? "blue" : "transparent",
                                        border: isActive ? "1px solid black" : "none",
                                        fontSize: isActive ? "12px" : "16px", // normal size when not active
                                        padding: "4px 8px",  // optional for spacing
                                        borderRadius: "4px", // optional for smooth edges
                                        
                                    })}> Home   </NavLink>
                                {/* <Link to="/" > Home </Link>  */}
                            </span>
                            <span className="mx-2">
                                <NavLink to="kids"
                                    style={({ isActive }) => ({
                                        color: isActive ? "white" : "black",
                                        backgroundColor: isActive ? "blue" : "transparent",
                                        border: isActive ? "1px solid black" : "none",
                                        fontSize: isActive ? "12px" : "16px", // normal size when not active
                                        padding: "4px 8px",  // optional for spacing
                                        borderRadius: "4px", // optional for smooth edges
                                        
                                    })}> Kids Fashion   
                                </NavLink>
                                {/* <Link to="kids"> Kids Fashion </Link>  */}
                            </span>
                            <span className="mx-2"> <Link to="mens" > Men Fashion </Link> </span>
                            <span className="mx-2"> <Link to="women" > Women Fashion </Link> </span>
                        </div>
                        <div>
                            <Link to="login" className="bi bi-person-fill"></Link>
                        </div>
                    </nav>
                </header>

                <section>
                    <Routes >
                        <Route path="/" element={<div> <h2> Home Secetion </h2> <p>Offer on kids, men fashion</p></div>} />
                        <Route path="kids" element={<div> <h2> Kids Fashion </h2> <img src="kids_fashion.avif" style={{ height: "300px", width: "200px" }} /> </div>} />
                        <Route path="mens" element={<div> <h2> Mens Fashion </h2> <img src="mens_fashion.webp" style={{ height: "300px", width: "200px" }} /> </div>} />
                        <Route path="women" element={<div> <h2> Women Fashion </h2> <img src="womens_fashion.webp" style={{ height: "300px", width: "200px" }} /> </div>} />
                        <Route path="login" element={<LoginUser />} />
                        <Route path="*" element={<div> <h2 className="text-danger"> Not Found Data </h2> <p>Sub category not found search another!</p></div>} />
                    </Routes>
                </section>
            </BrowserRouter>
        </div>
    )
}