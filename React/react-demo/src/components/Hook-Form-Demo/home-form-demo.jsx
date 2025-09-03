import { useForm } from "react-hook-form"
import { NavBar } from "../../Controlled-Components/navbar";


export function HookFormDemo() {
    
    const {register, handleSubmit, formState:{errors}} = useForm();

    const submit = (values)=>{
        console.log(values)
    }

    return(
        <div className="container-fluid">
            <header>
                < NavBar them="bg-primary text-white" title="Shopper." menuIteams={["Home", "Shop", "About", "Contact"]}  shortCuts={["bi bi-cart4","bi bi-linkedin"]} />
                < NavBar them="bg-warning tex-white" title="Shopper." menuIteams={["Home", "Projects", "Conect"]}  shortCuts={["bi bi-twitter-x","bi bi-basket3-fill", "bi bi-facebook"]} />
            </header>
            <h2>Register User</h2>
            <form onSubmit={handleSubmit(submit)} >
                <dl>
                    <dt>User Name</dt>
                    <dd><input type="text" name="UserName" {...register("UserName", {required:true, minLength:4})} /></dd>
                    <dd className="text-danger">
                        {
                            (errors.UserName?.type === "required")? <span>User Name Required</span> : <span></span> 
                            &&
                            (errors.UserName?.type === "minLength")? <span>Name is too short</span> : <span></span>
                        }
                    </dd>

                    <dt>Mobile</dt>
                    <dd><input type="text" name="Mobile" {...register("Mobile", {required:true, pattern:/\+91\d{10}/})} /></dd>
                    <dd className="text-danger">
                        {
                            (errors.Mobile?.type === "required") ? <span>Mobile Required</span> : <span></span>
                            &&
                            (errors.Mobile?.type === "pattern") ? <span>Invalid Mobile</span> : <span></span>
                        }
                    </dd>
                </dl>
                <button type="submit">Register</button>
            </form>
        </div>
    )
}