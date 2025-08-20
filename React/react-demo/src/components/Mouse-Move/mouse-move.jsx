import { click } from "@testing-library/user-event/dist/click"
import { useState } from "react"


export function MouseMove() {
    
    const[imgStyle , setImgStyle] = useState({position:'', top:'', left:''})

    function onMouseMoveHandle(e){
        setImgStyle({position:'fixed', top:e.clientY, left:e.clientX})
    }

    return(
        <div className="container-fluid" onMouseMove={onMouseMoveHandle} >
            <div style={{height:'1000px'}}>
                Please Move The Mouse!!
            </div>
            <img style={imgStyle} src="flag.gif" width="70"  height="50" />
        </div>
    )
}