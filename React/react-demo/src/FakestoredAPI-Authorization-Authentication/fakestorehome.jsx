import axios from "axios"
import { useEffect, useState } from "react"
import { useCookies } from "react-cookie"
import { Link, useNavigate } from "react-router-dom"


export function FakeStoreHome() {
    const [cookies, setCookie, removeCookie] = useCookies(['username'])

    const navigate = useNavigate()

    const [categories, setCategories] = useState([])

    useEffect(() => {
        if (cookies['username']) {
            axios.get('https://fakestoreapi.com/products/categories')
                .then(res => {
                    setCategories(res.data)
                })
        } else {
            navigate('/')
        }
    }, [])

    return (
        <div className="container-fluid">
            <h2>Fakestore Home</h2>
            <ul className="list-unstyled w-25">
                {
                    categories.map(category => <li className="bg-dark text-white p-2 my-3" key={category}> <Link className="btn btn-light w-100" to={`/products/${category}`}>{category.toUpperCase()}</Link> </li>)
                }
            </ul>
        </div>
    )
}