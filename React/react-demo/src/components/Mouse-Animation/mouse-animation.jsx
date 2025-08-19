import { useEffect, useState } from 'react'
import './mouse-animation.css'

export function MouseAnimation() {

    const [intiState, setInitState] = useState({animationName: 'spin',animationDuration: '4s',animationIterationCount: 'infinite',animationTimingFunction: 'linear'})
    
    function handleMouseOver() {
        setInitState({
            animationName: 'spin',
            animationDuration: '1s',
            animationIterationCount: 'infinite',
            animationTimingFunction: 'linear'
        })
    }

    function handleMouseOut() {
        setInitState({
            animationName: 'spin',
            animationDuration: '4s',
            animationIterationCount: 'infinite',
            animationTimingFunction: 'linear'
        })
    }

    function handleMouseDown() {
        setInitState({
            animationName: 'zoom',
            animationDuration: '4s',
            animationIterationCount: 'infinite',
            animationTimingFunction: 'linear'
        })
    }


    return(
        <div className="container-fluid bg-dark d-flex justify-content-center align-items-center " style={{height:"100vh"}}>
            <img src='logo512.png' onMouseOut={handleMouseOut} onMouseOver={handleMouseOver} onMouseDown={handleMouseDown} alt="" style={intiState}/>
        </div>
    )
}