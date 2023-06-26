import { useState } from "react";
import {PropTypes} from 'prop-types';
import './Counter.css';

export default function Counter() {
    const [count, setCount] = useState(0);

    function incrementCounterParentFunction(by) {
        setCount(count + by);
    }

    return (
        <>
            <span className="count">{count}</span>
            <CounterButton />
            <CounterButton by={2} />
            <CounterButton by={5} />
        </>
    )
}

function CounterButton({by}) {

    // [0, f]
    const [count, setCount] = useState(0);
    
    console.log(by);

    function incrementCounterFunction() {
        setCount(count + by);
    }

    function decrementCounterFunction() {
        setCount(count - by);
    }

    return (
        <div className="Counter">
            <span className="count">{count}</span>
            <div>
                <button className="counterButton" onClick={incrementCounterFunction}>
                    +{by}</button>
                <button className="counterButton" onClick={decrementCounterFunction}>
                    -{by}</button>
            </div>
        </div>
    )
}

CounterButton.propTypes = {
    by: PropTypes.number
}

CounterButton.defaultProps = {
    by: 1
}
