import axios from "axios";
import { useEffect, useState } from "react";
import './mouse-event.css';


export function MouseEvent() {
    
    const [mobiles, setMobiles] = useState([{image :''}])
    const [preview, setPreview] = useState('m1.jpg')

    useEffect(()=>{

        axios.get('mobiles.json').then(res =>{
            setMobiles(res.data)
        })

    },[])

    function handleMouseOver(e) {
        setPreview(e.target.src)        
    }

    return(
        <div className="container-fluid">
            <div className="row mt-4">
                <div className="col-1">
                    {
                        mobiles.map(item => 
                            <div className="my-3 " key={item.image}>
                                <img onMouseOver={handleMouseOver} src={item.image} alt="noImage" width="70"/>
                            </div>
                        )
                    }
                </div>
                <div className="col-11 mt-4">
                    <img style={{border:'2px double gray',boxShadow:'2px 2px 2px black'}} src={preview} alt="" width="400" height="420" />
                </div>
            </div>
        </div>
    )
}