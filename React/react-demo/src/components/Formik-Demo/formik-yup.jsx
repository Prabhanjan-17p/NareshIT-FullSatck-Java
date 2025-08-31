import { useFormik } from "formik"
import * as yup from "yup"



export function FormikWithYup() {

    const formik = useFormik({
        initialValues:{
            ProductID: 0,
            Name: '',
            Stock: false,
            City: 'Select City',
            Mobile: ''
        },
       
        validationSchema: yup.object({
            ProductID: yup.number().required("ProductID required!!").min(1, "ProductID can't be zero!!"),
            Name: yup.string().required("Product name required!!").min(4, "Name too short!!").max(15, "Name too long!!"),
            Mobile: yup.string().required("Mobile required!!").matches(/\+91\d{10}/, "Invalid number!!")
        }),
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
                    {/* <dd><input type="number" name="ProductID" onBlur={formik.handleBlur} onChange={formik.handleChange}/></dd> */}
                    <dd><input type="number" name="ProductID" {...formik.getFieldProps('ProductID')}/></dd>
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