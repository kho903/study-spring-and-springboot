import { useState } from 'react';
import { useNavigate } from 'react-router-dom';

function LoginComponent() {
    const [username, setUsername]= useState('user')
    const [password, setPassword]= useState('password')
    const [showSuccessMessage, setShowSuccessMessage]= useState(false)
    const [showErrorMessage, setErrorMessage]= useState(false)

    const navigate = useNavigate();

    function handleUsernameChange(event) {
        setUsername(event.target.value);
    }

    function handlePasswordChange(event) {
        setPassword(event.target.value);
    }
    
    function handleSubmit() {
        if (username === 'user' && password === 'password') {
            console.log('Success');
            setShowSuccessMessage(true);
            setErrorMessage(false);
            navigate(`/welcome/${username}`);
        } else {
            console.log('Failed');
            setShowSuccessMessage(false);
            setErrorMessage(true);
        }
    }

    return (
        <div className="Login">
            <h1>Time To Login My Todo App</h1>
            {showSuccessMessage && <div className="successMessage">Authenticated Successfully</div>}
            {showErrorMessage && <div className="errorMessage">Authenticated Failed. Please check your credentials.</div>}
            <div className="LoginForm">
                <div>
                    <label>User Name</label>
                    <input type="text" name="username" value={username} onChange={handleUsernameChange} />
                </div>
                <div>
                    <label>Password</label>
                    <input type="password" name="password" value={password} onChange={handlePasswordChange} />
                </div>
                <div>
                    <button type="button" name="login" onClick={handleSubmit}>login</button>
                </div>
            </div>
        </div>
    )
}

export default LoginComponent;