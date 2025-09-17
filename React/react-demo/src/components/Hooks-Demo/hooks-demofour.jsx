import { useEffect, useState } from "react";
import { useFetch } from "../../Hooks/use-fetch";


export function SignIn() {

    useEffect(()=>{

        console.log("SignIn Mounted")

        return()=>{
            console.log("SignIn Unmounted")
        }
    },[]);
    
    return(
        <div>
            <h3>User Sign-In</h3>
        </div>
    )
}

export function RegisterUser() {

    useEffect(()=>{

        console.log("Register Mounted")

        return()=>{
            console.log("Register Unmounted")
        }
    },[]);
    
    return(
        <div>
            <h3>New User Register</h3>
        </div>
    )
}


export function HooksDemoFour() {

    const[view , setView] = useState('')

    function handleSingIn() {
        setView(<SignIn/>)
    }
    function handleRegister() {
        setView(<RegisterUser/>)
    }
    
    return (
        <div className="container-fluid">
            <h2>Shooping Mall</h2>
            <span>
                <button className="btn btn-primary " onClick={handleSingIn}>Signin</button>
                <button className="btn btn-secondary ms-3" onClick={handleRegister}>Register</button>
            </span>
            <hr />
            <div className="mt-4 ms-3">
                {
                    (view)
                }
            </div>
        </div>
    )
}