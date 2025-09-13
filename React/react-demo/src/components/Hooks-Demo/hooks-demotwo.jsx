import { useFetch } from "../../Hooks/use-fetch";

export function HooksDemoTwo() {

    let catagories = useFetch('https://fakestoreapi.com/products/categories');

    return (
        <div className="container-fluid">
            <h2>Catagories</h2>
            <ol>
                {
                    catagories.map(cat => <li key={cat}> {cat} </li>)
                }
            </ol>
        </div>
    )
}