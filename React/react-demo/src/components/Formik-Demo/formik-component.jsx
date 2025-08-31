import { ErrorMessage, Field, Form, Formik } from "formik";
import * as yup from "yup"


export function FormikComponent() {



    return (
        <div className="container-fluid">
            <h3>Registe Product</h3>
            <Formik
                initialValues={{ ProductID: 0, Name: '', Mobile: '' }}
                validationSchema={yup.object({
                    ProductID: yup.number().required("ProductID required!!").min(1, "ProductID can't be zero!!"),
                    Name: yup.string().required("Product name required!!").min(4, "Name too short!!").max(15, "Name too long!!"),
                    Mobile: yup.string().required("Mobile required!!").matches(/\+91\d{10}/, "Invalid number!!")
                })}
                onSubmit={(product) => console.log(product)}
            >

                <Form>
                    <dl>
                        <dt>ProductID</dt>
                        <dd> <Field type="number" name="ProductID"></Field></dd>
                        <dd className="text-danger"> <ErrorMessage name="ProductID" /></dd>

                        <dt>Name</dt>
                        <dd> <Field type="string" name="Name"></Field></dd>
                        <dd className="text-danger"> <ErrorMessage name="Name" /></dd>

                        <dt>Mobile</dt>
                        <dd> <Field type="string" name="Mobile"></Field></dd>
                        <dd className="text-danger"> <ErrorMessage name="Mobile" /></dd>
                    </dl>
                    <button type="submit">Register</button>
                </Form>

            </Formik>
        </div>
    )
}