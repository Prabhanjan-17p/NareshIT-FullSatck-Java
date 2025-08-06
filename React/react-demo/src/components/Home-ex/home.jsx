import './home.css'

export function Home() {
    return(
        <div className="container-fluid">
            <div className="m-3 border-2 border border-black h-100 form-control-sm bg-success">
                <h1 className="bi bi-house-door  text-center box">React Home</h1>
            </div>
            <div className="alert alert-dismissible alert-success m-3 w-25">
                <h3>Wellcome to React 18x</h3>
                <p>Javascript libries for buliding Native and Web UI.</p>
                <button className='btn btn-success' data-bs-dismiss="alert">OK</button>
            </div>
        </div>
    )
}