    import { useEffect, useState } from "react"
    import { useCookies } from "react-cookie"

    export function StateDemo() {
        
        const [cookies, setCookies, removeCookies] = useCookies(['username'])

        const [userName, setUserName] = useState('');

        function handleOnchanegName(e) {
            setUserName(e.target.value)
        }

        function onClickButton() {
            // setCookies('username',userName)
            setCookies('username',userName, {expires: new Date('2025-09-15')})
        }

        function handleSignout() {
            removeCookies('username')
        }

        useEffect(()=>{

        },[])

        return(
            <div className="container-fluid">
                <header className="mt-3 p-3 border border-1 border-dark">
                    {
                        (cookies['username']) ? <span> Hello ! {cookies['username']} <span className="badge rounded rounded-circle border border-1 border-dark"> <img src="flag.gif" alt="" width="20px" height="20px"/></span> <button onClick={handleSignout} className="btn btn-danger">Signout</button></span> : <span>Hello ! Guest <input onChange={handleOnchanegName} type="text"/> <button onClick={onClickButton}>Signin</button></span>
                    }
                </header>
            </div>
        )
    }