export function LoginUser() {
    return (
        <div className="container mt-5">
            <div className="row justify-content-center">
                <div className="col-md-5">
                    <div className="card shadow-lg rounded-3">
                        <div className="card-body p-4">
                            <h3 className="text-center mb-4">Login</h3>
                            <form>
                                {/* Email */}
                                <div className="mb-3">
                                    <label htmlFor="loginEmail" className="form-label">Email address</label>
                                    <input 
                                        type="email" 
                                        className="form-control" 
                                        id="loginEmail" 
                                        placeholder="Enter your email"
                                    />
                                    <div className="form-text">
                                        We'll never share your email with anyone else.
                                    </div>
                                </div>

                                {/* Password */}
                                <div className="mb-3">
                                    <label htmlFor="loginPassword" className="form-label">Password</label>
                                    <input 
                                        type="password" 
                                        className="form-control" 
                                        id="loginPassword" 
                                        placeholder="Enter your password"
                                    />
                                </div>

                                {/* Remember Me */}
                                <div className="form-check mb-3">
                                    <input 
                                        type="checkbox" 
                                        className="form-check-input" 
                                        id="rememberMe" 
                                    />
                                    <label className="form-check-label" htmlFor="rememberMe">
                                        Remember me
                                    </label>
                                </div>

                                {/* Submit Button */}
                                <div className="d-grid">
                                    <button type="submit" className="btn btn-primary">
                                        Login
                                    </button>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    )
}
