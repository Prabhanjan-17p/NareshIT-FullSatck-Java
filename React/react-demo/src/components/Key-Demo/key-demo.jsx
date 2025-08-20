import axios from "axios"
import { useEffect, useState } from "react"


export function KeyDemo() {
    
    const[users, setUsers] = useState([{user:''}])
    const[msg, setMsg] = useState('')
    const[errMsg, setErrMsg] = useState('')
    const[display , setDisplay] = useState('d-none')

    useEffect(()=>{
        axios.get("users.json")
        .then(res => 
            setUsers(res.data)
        )
    },[])

    function OnMouseKeyUp(e) {
        for (const user of users) {
            if(user.userId === e.target.value){
                setMsg('User Id Taken - Try Another')
                setErrMsg('text-danger')
            }else{
                setMsg('User Name Avialble')
                setErrMsg('text-success')
            }
        }
    }

    function OnVerifyKey(e) {
        if (e.which >= 65 && e.which <=90) {
            setDisplay('d-block')
        }else{
            setDisplay('d-none')
        }
    }

    return(
        <div className="container-fluid">
            <h2>Registration User</h2>
            <dl>
                <dt>User Name</dt>
                <dd><input type="text" onKeyUp={OnMouseKeyUp} /></dd>
                <dd className={errMsg}>{msg}</dd>

                <dt>Password</dt>
                <dd><input type="password" onKeyPress={OnVerifyKey} /></dd>
                <dd className={display}>
                    <span className="bi bi-exclamation-triangle text-warning"> Warining : Caps ON!</span>
                </dd>
            </dl>
        </div>
    )
}