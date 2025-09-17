import axios from "axios";
import { createContext, useContext, useEffect, useState } from "react"

let searchContext = createContext(null)

export function ContextDemoTwo() {

    const [searchString, setSearchString] = useState('')
    const [memoryAllocate, setMemoryAllocate] = useState('')

    function handleOnChangeInput(e) {
        setSearchString(e.target.value);
    }

    function handleOnClick() {
        setMemoryAllocate(searchString)
    }

    return (
        <div className="m-4 p-3 bg-dark">
            <header className="d-flex justify-content-between text-white">
                <div className="h3">Shopper.</div>
                <div>
                    <div className="input-group">
                        <input onChange={handleOnChangeInput} type="text" className="form-control" placeholder="Search Here" />
                        <button onClick={handleOnClick} className="btn btn-warning bi bi-search"></button>
                    </div>
                </div>
                <div>
                    <span className="bi bi-cart4"></span>
                    <span className="bi bi-person-fill ms-3"></span>
                </div>
            </header>
            <section className="bg-light p-3" style={{ height: "600px" }}>
                <searchContext.Provider value={memoryAllocate}>
                    <SearchResults />
                </searchContext.Provider>
            </section>
        </div>
    )
}


export function SearchResults() {

    let data = useContext(searchContext)

    const [products, setProduct] = useState([{ id: '', title: '', image: '', price: 0, category: '', description: '', rating: { raete: 0, count: 0 } }])

    function LoadSearchResult(category) {
        axios.get(`https://fakestoreapi.com/products/category/${category}`)
            .then(res => {
                setProduct(res.data)
            })
    }

    useEffect(() => {
        if (data === "") {
            LoadSearchResult('electronics')
        } else {
            LoadSearchResult(data)
        }
        // LoadSearchResult('jewelery')
    }, [data])

    return (
        <div>
            <h4 className="text-primary">Search Results</h4>
            <div className="d-flex flex-wrap overflow-auto" style={{width:"100%",  height: "500px"}} >
                {
                products.map(product => (
                    <div key={product.id} className="col-md-3 mb-3 ">
                        <div className="card h-100 m-2">
                            <img src={product.image} className="card-img-top p-3" style={{ height: "200px", objectFit: "contain" }} alt={product.title} />
                            <div className="card-body">
                                <h6 className="card-title" style={{ fontSize: "14px" }}>{product.title}</h6>
                                <p className="text-success fw-bold">${product.price}</p>
                                <p className="text-muted" style={{ fontSize: "12px" }}>{product.category}</p>
                            </div>
                        </div>
                    </div>
                ))}
            </div>
        </div>
    )
}