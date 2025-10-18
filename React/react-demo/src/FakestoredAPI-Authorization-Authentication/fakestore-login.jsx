import { useState } from "react"
import { useCookies } from "react-cookie"
import { useNavigate } from "react-router-dom"



export function FakeStoreLogin() {

    const [cookies, setCookie, removeCookie] = useCookies(['username'])

    const[userName, setUserName] = useState('')

    const navigate = useNavigate()

    function handleNameChange(e) {
        setUserName(e.target.value)
    }

    function handleOnClickSubmit() {
        setCookie("username", userName)
        navigate('/home')
    }

    return (
        <div className="container-fluid">
            <h3>User Login</h3>
            <dl>
                <dt>User Name</dt>
                <dd><input type="text" onChange={handleNameChange}/></dd>

                <dt>Password</dt>
                <dd><input type="password" name="" id="" /></dd>
            </dl>
            <button onClick={handleOnClickSubmit} className="btn btn-warning">Login</button>
        </div>
    )
}