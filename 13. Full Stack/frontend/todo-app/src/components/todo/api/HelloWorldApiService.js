import { apiClient } from "./ApiClient";

export const retrieveHelloWorldBean 
    = () => apiClient.get('/hello-world-bean')

// header is present on the requested resource. => Authorization header
export const retrieveHelloPathVariable
    = (username, token) => apiClient.get(`/hello-world/path-variable/${username}`
    // , {
    //     headers: {
    //         Authorization: token
    //     }
    // }
    )
