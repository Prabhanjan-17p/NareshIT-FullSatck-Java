import { createContext, useContext } from "react"

let userContext = createContext(null)

export function ContextDemo() {
    
    return(
        <div className="m-4 p-3 bg-dark text-white">
            <userContext.Provider value={'Jhon'}>
                <h1>Parent Class</h1>
                <Level1 />
            </userContext.Provider>
        </div>
    )
}

export function Level1() {
    
    let context = useContext(userContext)

    return(
        <div className="mt-4 p-3 bg-warning">
            <h2>Level 1 / {context}</h2>
            <Level2 />
        </div>
    )
}

export function Level2() {
    
    let context = useContext(userContext)

    return(
        <div className="mt-4 p-3 bg-danger">
            <h2>Level 2 / {context} </h2>
        </div>
    )
}