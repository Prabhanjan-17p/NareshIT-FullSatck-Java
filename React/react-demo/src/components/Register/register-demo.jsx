export function Register() {
    return (
        <div className="container mt-5">
            <div className="row justify-content-center">
                <div className="col-md-6">
                    <div className="card shadow-lg rounded-3">
                        <div className="card-body p-4">
                            <h3 className="text-center mb-4">Register</h3>
                            <form>
                                {/* Name */}
                                <div className="mb-3">
                                    <label className="form-label">Full Name</label>
                                    <input 
                                        type="text" 
                                        className="form-control" 
                                        placeholder="Enter your full name"
                                    />
                                </div>

                                {/* Email */}
                                <div className="mb-3">
                                    <label className="form-label">Email Address</label>
                                    <input 
                                        type="email" 
                                        className="form-control" 
                                        placeholder="Enter your email"
                                    />
                                </div>

                                {/* Password */}
                                <div className="mb-3">
                                    <label className="form-label">Password</label>
                                    <input 
                                        type="password" 
                                        className="form-control" 
                                        placeholder="Enter your password"
                                    />
                                </div>

                                {/* Confirm Password */}
                                <div className="mb-3">
                                    <label className="form-label">Confirm Password</label>
                                    <input 
                                        type="password" 
                                        className="form-control" 
                                        placeholder="Confirm your password"
                                    />
                                </div>

                                {/* Register Button */}
                                <div className="d-grid">
                                    <button type="submit" className="btn btn-primary">
                                        Register
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
