import { useState } from "react";

export function FormDemo() {

    const [product, setProduct] = useState({
        Id: "",
        Name: "",
        Price: "",
        Stock: false,
        City: "",
    });

    const [nameError , setNameError]  = useState('')

    function handleOnSubmit(e) {
        e.preventDefault();
        console.log("Registered Product:", product);
    }

    function handleIdOnChange(e) {
        setProduct({
            Id: e.target.value,
            Name: product.Name,
            Price: product.Price,
            Stock: product.Stock,
            City: product.City
        });
    }

    function handleNameOnChange(e) {
        setProduct({
            Id: product.Id,
            Name: e.target.value,
            Price: product.Price,
            Stock: product.Stock,
            City: product.City
        });
    }

    function handlePriceOnChange(e) {
        setProduct({
            Id: product.Id,
            Name: product.Name,
            Price: e.target.value,
            Stock: product.Stock,
            City: product.City
        });
    }

    function handleStockOnChange(e) {
        setProduct({
            Id: product.Id,
            Name: product.Name,
            Price: product.Price,
            Stock: e.target.checked,
            City: product.City
        });
    }

    function handleCityOnChange(e) {
        setProduct({
            Id: product.Id,
            Name: product.Name,
            Price: product.Price,
            Stock: product.Stock,
            City: e.target.value
        });
    }

    function handleeOnBlurName(e){
        if(e.target.value === ""){
            setNameError('Please enter your name!!')
        }else{
            setNameError('')
        }
    }

    return (
        <div className="container-fluid">
            <form action="" onSubmit={handleOnSubmit}>
                <h2>Register Product</h2>
                <dl>
                    <dt>Product ID</dt>
                    <dd><input type="number" value={product.Id} onChange={handleIdOnChange} /></dd>

                    <dt>Name</dt>
                    <dd><input type="text" value={product.Name} onBlur={handleeOnBlurName} onChange={handleNameOnChange} /></dd>
                    <dd className="text-danger">{nameError}</dd>

                    <dt>Price</dt>
                    <dd><input type="number" value={product.Price} onChange={handlePriceOnChange} /></dd>

                    <dt>Stock</dt>
                    <dd>
                        <input type="checkbox" checked={product.Stock} onChange={handleStockOnChange} />
                        <label>Available</label>
                    </dd>

                    <dt>Shipped To</dt>
                    <dd>
                        <select value={product.City} onChange={handleCityOnChange}>
                            <option value="">Select City</option>
                            <option value="Hyderabad">Hyderabad</option>
                            <option value="Delhi">Delhi</option>
                        </select>
                    </dd>
                </dl>
                <button type="submit">Register</button>
            </form>
        </div>
    );
}
