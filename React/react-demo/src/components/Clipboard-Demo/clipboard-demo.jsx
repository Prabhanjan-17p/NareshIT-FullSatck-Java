import { useState } from "react"
import { flushSync } from "react-dom";


export function ClipboardDemo() {
    
    const [status , setStatus] = useState('')

    function HandleCopyStatus() {
        setStatus('Copied to Clipboard')
    }

    function HandleOnBlur() {
        setStatus('')
    }

    function HandlePaste() {
        document.onpaste= () => false;
    }

    function HandleOnContextMenu() {
        alert('Right Click Diseable')
        document.oncontextmenu = () => false;
    }

    function HandleDoubleClick() {
        window.open('m1.jpg','Mobile','width=400 height=500')
    }

    return(
        <div className="container-fluid" style={{height:"100vh"}} onContextMenu={HandleOnContextMenu}>
            <img src="m1.jpg" height='100' width='100' onDoubleClick={HandleDoubleClick} />
            <p>Double clicked to full screen!</p>
            <dl className="mt-4 ms-4">
                <dt>Enter your Acc No</dt>
                <dd><input type="text" onBlur={HandleOnBlur} onCopy={HandleCopyStatus}/></dd>
                <dd>{status}</dd>
                
                <dt>Verify your Acc No</dt>
                <dd><input type="text" onPaste={HandlePaste} /></dd>
            </dl>
        </div>
    )
}