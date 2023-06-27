import { useEffect, useState } from "react";
import { deleteTodoApi, retrieveAllTodosForUsernameApi } from "./api/TodoApiService";
import { useAuth } from "./security/AuthContext";

function ListTodosComponent() {

    const [todos, setTodos] = useState([]);
    const [message, setMessage] = useState(null);

    const authContext = useAuth();

    const username = authContext.username;

    useEffect(() => refreshTodos(), [])

    function refreshTodos() {
        retrieveAllTodosForUsernameApi(username)
            .then(response => {
                // console.log(response)
                setTodos(response.data)
            })
            .catch(error => console.log(error))
    }

    function deleteTodo(id) {
        console.log('clicked ' + id)
        deleteTodoApi(username, id)
            .then(
                // 1. Display message
                // 2. Update Todos list
                () => {
                    setMessage(`Delete of todo with id = ${id} successful`)
                    refreshTodos()
                }
            )
            .catch(error => console.log(error))
    }

    return (
        <div className="container">
            <h1>Things You Want To Do!</h1>
            {message && <div className="alert alert-warning">{message}</div>}
            <div>
                <table className="table">
                    <thead>
                        <tr>
                            <th>Description</th>
                            <th>Is Done?</th>
                            <th>Target Date</th>
                            <th>Delete</th>
                        </tr>
                    </thead>
                    <tbody>
                    {
                        todos.map(
                            todo => (
                                <tr key={todo.id}>
                                    <td>{todo.description}</td>
                                    <td>{todo.done.toString()}</td>
                                    {/* <td>{todo.targetDate.toDateString()}</td> */}
                                    <td>{todo.targetDate.toString()}</td>
                                    <td><button className="btn btn-warning"
                                        onClick={() => deleteTodo(todo.id)}>Delete</button></td>
                                </tr>
                            )
                        )
                    }
                    </tbody>
                </table>
            </div>
        </div>
    )
}

export default ListTodosComponent;