import { Button, TextField } from '@mui/material';
import { useState } from 'react';


export function MUIDemo() {

    const[userName, setUserName] = useState('')
    const[password, setPassowrd] = useState('')

    function handleUserNameOnChange(e)  {
        setUserName(e.target.value);
    }
    function handlePasswordOnChange(e)  {
        setPassowrd(e.target.value);
    }

    function handleOnClick() {
        console.log(`User Name = ${userName} / Password = ${password}`)
    }

    return (
        <div className="container-fluid">
            <div className="row">
                <div className="col">
                    <h3>Bootstrap Form</h3>

                    <div className="w-25">
                        <div className="my-2">
                            <label className="form-label">User Name</label>
                            <div>
                                <input type="text" className="form-control" />
                            </div>
                        </div>

                        <div className="my-2">
                            <label className="form-label">Password</label>
                            <div>
                                <input type="password" className="form-control" />
                            </div>
                        </div>
                        <div className="my-2">
                            <button className="btn btn-warning w-100">Login</button>
                        </div>
                    </div>

                </div>

                <div className="col">
                    <h3>MUI FORM</h3>
                    <div className="w-25">
                        <div>
                            <TextField onChange={handleUserNameOnChange} label="User Name" variant='standard'/>
                        </div>
                        <div className='my-2'>
                            <TextField onChange={handlePasswordOnChange} label="Password" variant='standard'/>
                        </div>
                        <div>
                            <Button onClick={handleOnClick} variant='contained' color='warning' > Login </Button>
                        </div>
                    </div>
                </div>
            </div>
        </div>

    )
}