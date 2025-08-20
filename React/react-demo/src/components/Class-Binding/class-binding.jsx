import { useState } from "react";

// ordinary 
/*
export function ClassBinding() {


    const [them, setThem] = useState('border border-2 border-dark rounded-3 p-4')

    function handleClassBinding(e) {
        if (e.target.checked) {
            setThem('bg-dark text-light p-4 rounded-3 shadow border border-2 border-secondary')
        } else {
            setThem('border border-2 border-dark rounded-3 p-4')
        }
    }

    return (
        <div className="container d-flex justify-content-center align-items-center vh-100 ">
            <div className={them} style={{ width: "400px" }}>

                <div className="form-check form-switch mt-3 text-center">
                    <input className="form-check-input" type="checkbox" id="darkModeToggle" onChange={handleClassBinding} />
                    <label className="form-check-label ms-2" htmlFor="darkModeToggle">
                        Dark Mode
                    </label>
                </div>
                <h3 className="text-center mb-4 ">Login</h3>
                <form >
                    <div className="mb-3">
                        <label className="form-label">Email address</label>
                        <input type="email" className="form-control" placeholder="Enter email" />
                    </div>
                    <div className="mb-3">
                        <label className="form-label">Password</label>
                        <input type="password" className="form-control" placeholder="Enter password" />
                    </div>
                    <button type="submit" className="btn btn-primary w-100">Login</button>
                </form>
            </div>

        </div>
    );
}
    */


//Enhance 
export function ClassBinding() {


    const [them, setThem] = useState('border-dark')
    const [btnThem, setBtnThem] = useState('btn-dark')

    function handleClassBinding(e) {
        if (e.target.checked) {
            setThem('bg-dark text-light border-secondary')
            setBtnThem('btn-primary')
        } else {
            setThem('border-dark')
            setBtnThem('btn-dark')
        }
    }

    return (
        <div className="container d-flex justify-content-center align-items-center vh-100 ">
            <div className={`p-4 rounded-3 shadow border border-2 ${them}`} style={{ width: "400px" }}>

                <div className="form-check form-switch mt-3 text-center">
                    <input className="form-check-input" type="checkbox" id="darkModeToggle" onChange={handleClassBinding} />
                    <label className="form-check-label ms-2" htmlFor="darkModeToggle">
                        Dark Mode
                    </label>
                </div>
                <h3 className="text-center mb-4 ">Login</h3>
                <form >
                    <div className="mb-3">
                        <label className="form-label">Email address</label>
                        <input type="email" className="form-control" placeholder="Enter email" />
                    </div>
                    <div className="mb-3">
                        <label className="form-label">Password</label>
                        <input type="password" className="form-control" placeholder="Enter password" />
                    </div>
                    <button type="submit" className={`btn w-100 ${btnThem}`}>Login</button>
                </form>
            </div>

        </div>
    );
}
