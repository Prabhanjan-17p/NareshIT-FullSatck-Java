import React from "react";
import { Formik, Form, Field, ErrorMessage } from "formik"
import * as yup from "yup"

export class FormInClassTwo extends React.PureComponent {
    constructor() {
        super();
        this.state = {
        }
    }

    render() {
        return (
            <div className="container-fluid mt-3">
                <h3>Product Registation</h3>
                <Formik
                    initialValues={{ ProductID: 0, Name: '', Mobile: '' }}
                    validationSchema={yup.object({
                        ProductID: yup.number().required("ProductID required!!").min(1, "ProductID can't be zero!!"),
                        Name: yup.string().required("Product name required!!").min(4, "Name too short!!").max(15, "Name too long!!"),
                        Mobile: yup.string().required("Mobile required!!").matches(/\+91\d{10}/, "Invalid number!!")
                    })}
                    onSubmit={(product) => console.log(product)}
                >
                    {
                        form => <Form>
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
                            <button className="me-2" disabled={!form.isValid} type="submit">Register</button>
                            <button className={(form.dirty) ? 'd-inline' : 'd-none'} type="submit">Save</button>
                            <div className={(form.isValid) ? 'd-none' : 'd-block'}>
                                <h4>Please check the following errors</h4>
                                {
                                    Object.keys(form.errors).map(pro => <li key={pro}>{form.errors[pro]}</li>)
                                }
                            </div>

                        </Form>
                    }
                </Formik>
            </div>
        )
    }
}