import axios from "axios";

const apiClient = axios.create(
    {
        baseURL: 'http://localhost:8080'
    }
)

export const retrieveHelloWorldBean 
    = () => apiClient.get('/hello-world-bean')

export const retrieveHelloPathVariable
    = (username) => apiClient.get(`/hello-world/path-variable/${username}`)

