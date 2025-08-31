import { useFormik } from "formik"



export function FormikDemo() {

    function valideteProduct(formikData) {
        var error = {ProductID:'', Name:'', Stock:'', City:'', Mobile:''}

        if (formikData.ProductID === 0) {
            error.ProductID = "ProductID can't be zero & empty!!"
        }

        if (formikData.Name == "") {
            error.Name = "Product name can't be empty!!"
        }else{
            if (formikData.Name.length < 4) {
                error.Name = "Product name too shot"
            }else{
                error.Name = ""
            }
        }


        if (formikData.City == "Select City") {
            error.City = "Enter your city"
        }else{
            error.City = ""
        }

        if (formikData.Mobile.length === 0) {
            error.Mobile = "Mobile Required"
        }else{
            if (formikData.Mobile.match(/^\+91\d{10}$/)) {
                error.Mobile =""
            }else{
                error.Mobile = "Invalid number: +91 10 digits"
            }
        }


        return error
    }

    const formik = useFormik({
        initialValues:{
            ProductID: 0,
            Name: '',
            Stock: false,
            City: 'Select City',
            Mobile: ''
        },
        validate: valideteProduct,
        onSubmit: (product)=>{
            console.log(product)
        }
    })


    return (
        <div className="container-fluid">
            <form onSubmit={formik.handleSubmit} >
                <h2>Product Registration</h2>
                <dl>
                    <dt>ProductID</dt>
                    <dd><input type="number" name="ProductID" onBlur={formik.handleBlur} onChange={formik.handleChange}/></dd>
                    <dd className="text-danger">{formik.errors.ProductID}</dd>

                    <dt>Product Name</dt>
                    <dd><input type="text" name="Name" onBlur={formik.handleBlur} onChange={formik.handleChange} /></dd>
                    <dd className="text-danger">{formik.errors.Name}</dd>

                    <dt>Stock</dt>
                    <dd><input type="checkbox" name="Stock" onChange={formik.handleChange} /> Available</dd>

                    <dt>Select City</dt>
                    <dd>
                        <select name="City" onBlur={formik.handleBlur} onChange={formik.handleChange}>
                            <option >Select City</option>
                            <option >Hyderabad</option>
                            <option >Odisha</option>
                            <option >Delhi</option>
                        </select>
                    </dd>
                    <dd className="text-danger">{formik.errors.City}</dd>

                    <dt>Mobile</dt>
                    <dd><input type="text" onBlur={formik.handleBlur} onChange={formik.handleChange} name="Mobile" /></dd>
                    <dd className="text-danger">{formik.errors.Mobile}</dd>

                </dl>
                <button type="submit">Register</button>
            </form>
        </div>
    )
}