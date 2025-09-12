import { useState } from "react"
import { Register } from "../Register/register-demo";
import { LoginUser } from "../Login/login";



export function CustomeRenderingDemo() {
    

    const [component, setComponent] = useState();


    function LoadComponent(e) {
        if (e.target.id === 'Signin') {
            setComponent(<Register/>)
        }else{
            setComponent(<LoginUser/>)
        }
    }


    return(
        <div className="container-fluid table">
            <nav className="mt-3">
                <button id="Signin" onClick={LoadComponent} className="btn btn-warning">Signin</button>
                <button id="Signout" onClick={LoadComponent} className="btn btn-dark ms-2">Register</button>
            </nav>
            <section className="mt-4">
                {
                    component
                }
            </section>
        </div>
    )
}