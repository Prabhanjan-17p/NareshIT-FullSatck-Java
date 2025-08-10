import { useEffect, useState } from "react"

export function DataBinding() {
   
    const [stock, setSrock] = useState(true)

    useEffect(()=>{

        setSrock(true)

    },[])
    return(
        <div className="container-fluid">
            <h1> Stock : {(stock === true)?"Available":"Out of stock"}</h1>
        </div>
    )

}