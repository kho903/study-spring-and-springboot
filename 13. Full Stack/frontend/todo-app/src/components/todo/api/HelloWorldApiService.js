import axios from "axios";

const apiClient = axios.create(
    {
        baseURL: 'http://localhost:8080'
    }
)

export const retrieveHelloWorldBean 
    = () => apiClient.get('/hello-world-bean')

// header is present on the requested resource. => Authorization header
export const retrieveHelloPathVariable
    = (username) => apiClient.get(`/hello-world/path-variable/${username}`, {
        headers: {
            Authorization: 'Basic dXNlcjoxMjM0'
        }
    })

export const executeBasicAuthenticationService
    = (token) => apiClient.get(`/basicauth`, {
        headers: {
            Authorization: token
        }
    })

