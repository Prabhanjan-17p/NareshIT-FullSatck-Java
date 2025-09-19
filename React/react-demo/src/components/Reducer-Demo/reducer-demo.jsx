import { useReducer } from "react"

let intialState = {
    viewersCount : 0
}

function reducer(state, action) {
    switch (action.type) {
        case "join":
            return {viewersCount: state.viewersCount + 1}
    
        case "exit":
            return {viewersCount: state.viewersCount - 1}
    }
}

export function ReducerDemo() {
    
    const[state, dispatch] = useReducer(reducer, intialState)

    function handleJoinClick() {
        dispatch({type: "join"})
    }
    function handleExitClick() {
        dispatch({type: "exit"})
    }

    return(
        <div className="container-fluid">
            <h2>Watch Live</h2>
            <iframe src="https://www.youtube.com/embed/8SxJNqeq_zc" width="400" height="300"></iframe>
            <div className="mt-4">
                <div className="bi bi-eye">[{state.viewersCount}] viewing</div>
            </div>

            <div className="row mt-4">
                <div className="col">
                    <h3>User1</h3>
                    <button onClick={handleJoinClick} className="bi bi-camera-video btn btn-primary"> Join </button>
                    <button onClick={handleExitClick} className="bi bi-door-open btn btn-danger ms-2"> Exit </button>
                </div>
                <div className="col">
                    <h3>User2</h3>
                    <button onClick={handleJoinClick} className="bi bi-camera-video btn btn-primary"> Join </button>
                    <button onClick={handleExitClick} className="bi bi-door-open btn btn-danger ms-2"> Exit </button>
                </div>
            </div>
        </div>
    )
}