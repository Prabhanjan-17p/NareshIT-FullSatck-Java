import { useRef, useState } from "react"


export function DebounceDemo() {

    const[msg, setMsg] = useState('')

    let thread = useRef(null)

    function V1() {
        setMsg('Volume up by 10%')
    }
    function V2() {
        setMsg('Volume up by 40%')
    }
    function V3() {
        setMsg('Volume up by 100%')
    }
    function VolumeHandleUp() {
        setTimeout(V1, 3000);
        thread.current = setTimeout(V2, 5000);
        setTimeout(V3, 10000);
    }
    function VolumeCancel40() {
        clearTimeout(thread.current);
        alert('Cancled!!')
    }
    
    return(
        <div className="container-fluid">
            <button onClick={VolumeHandleUp} className="bi bi-volume-up btn btn-success ms-3 mt-4"></button>
            <button onClick={VolumeCancel40} className="bi bi-volume-off btn btn-primary ms-3 mt-4">40%</button>
            <p className="mt-4 ms-3 fs-4">{msg}</p>
        </div>
    )
}