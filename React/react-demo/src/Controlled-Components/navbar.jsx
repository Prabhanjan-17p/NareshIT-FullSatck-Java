

export function NavBar(props) {
    

    return(
        <nav className={`container-fluid d-flex justify-content-between mt-3 p-3 ${props.them}`}>
            <div className="fs-5 fw-bold">{ props.title }</div>
            <div>
                {
                    props.menuIteams.map(item => <span className="mx-3" key={item}>{item}</span>)
                }
            </div>
            <div>
                {
                    props.shortCuts.map(shortCut => <button className={`${shortCut} btn mx-3`}></button>)
                }
            </div>
        </nav>
    )
}