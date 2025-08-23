import { useEffect, useState } from "react"
import moment from "moment";

export function ThrottleDemo() {

    // const[now , setNow] = useState()
    const [currentDate, setCurrentDate] = useState(moment());

    function updateEverySecond() {
        // var d = new Date()
        // setNow(d.toLocaleDateString())
        setCurrentDate(moment());
    }

    useEffect(() =>{
        setInterval(updateEverySecond,100)
    },[])


    return(
        <div className="container-fluid">
            {/* <h1 className="text-center">{now}</h1> */}
            <h1 className="text-center mt-4">{currentDate.format("DD MMMM YYYY HH:mm:ss")}</h1>
        </div>
    )
}
