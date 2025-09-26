import React from "react";

export class FormInClass extends React.PureComponent{
    constructor(){
        super();
        this.state = {
            UserName:'',
            Password:'',
            City:'',
            Photo:''
        }
        this.handleNameChange = this.handleNameChange.bind(this)
        this.handleSubmit = this.handleSubmit.bind(this)
    }

    handleNameChange(e){
        this.setState({UserName: e.target.value})
    }

    handleSubmit(e){
        e.preventDefault();
        console.log(this.state.UserName)
    }

    render(){
        return(
            <div className="container-fluid mt-3">
                <form onSubmit={this.handleSubmit}>
                    <h3>Register Form</h3>
                    <dl>
                        <dt>User Name</dt>
                        <dd><input type="text" name="UserName" /></dd>

                        <dt>Password</dt>
                        <dd><input type="password" name="Password" /></dd>

                        <dt>City</dt>
                        <dd>
                            <select name="City" id="">
                                <option value="">Select City</option>
                                <option value="">Hyderabad</option>
                                <option value="">Delhi</option>
                                <option value="">Odisha</option>
                            </select>
                        </dd>

                        <dt>Your Photo</dt>
                        <dd><input type="file" name="Photo" id="" /></dd>
                    </dl>
                    <button type="submit">Register</button>
                </form>
            </div>
        )
    }
}