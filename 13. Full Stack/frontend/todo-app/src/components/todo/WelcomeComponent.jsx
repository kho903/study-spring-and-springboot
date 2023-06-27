import { Link, useParams } from "react-router-dom";
import axios from "axios";
import { useState } from "react";

function WelcomeComponent() {
    
    const {username} = useParams()

    const [message, setMessage]= useState(null)

    function callHelloWorldRestApi() {
        console.log('called')
        // axios
        axios.get('http://localhost:8080/hello-world')
            .then((response) => successfulResponse(response))
            .catch((error) => errorResponse(error))
            .finally(() => console.log('cleanup'))
    }

    function callHelloWorldBeanRestApi() {
        console.log('called')
        // axios
        axios.get('http://localhost:8080/hello-world-bean')
            .then((response) => successfulBeanResponse(response))
            .catch((error) => errorResponse(error))
            .finally(() => console.log('cleanup'))
    }

    function successfulResponse(response) {
        console.log(response);
        setMessage(response.data);
    }

    function successfulBeanResponse(response) {
        console.log(response);
        setMessage(response.data.message);
    }

    function errorResponse(error) {
        console.log(error);
    }

    return (
        <div className="WelcomeComponent">
            <h1>Welcome {username}</h1>
            <div>
                Manage your todos - <Link to="/todos">Go here</Link>
            </div>
            <div>
                <button className="btn btn-success m-5" onClick={callHelloWorldRestApi}>
                    Call Hello World REST API
                </button>
                <button className="btn btn-success m-5" onClick={callHelloWorldBeanRestApi}>
                    Call Hello World Bean REST API
                </button>
            </div>
            <div className="text-info">{message}</div>
        </div>
    )
}

export default WelcomeComponent;