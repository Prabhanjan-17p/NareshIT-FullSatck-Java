import { useCaptcha } from "../../Hooks/use-captcha"

export function HooksDemo() {

    let code = useCaptcha();

    return (
        <div className="container-fluid">
            <h3>User Login</h3>
            <dl>
                <dt>User Name</dt>
                <dd><input type="text" /></dd>

                <dt>Password</dt>
                <dd><input type="password" /></dd>

                <dt>Verify Captcha</dt>
                <dd>
                    {
                        (code)
                    }
                    {/* <button className="bi bi-r">ref</button> */}
                </dd>
            </dl>
            <button>Login</button>
        </div>
    )
}