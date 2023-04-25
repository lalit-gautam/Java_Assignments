//The useReducer Hook is similar to the useState Hook.
//If you find yourself keeping track of multiple pieces of state that rely on complex logic, useReducer may be useful.
//The reducer function contains your custom state logic and the initialStatecan be a simple value but generally will contain an object.
//The useReducer Hook returns the current stateand a dispatchmethod.
//uses
//=====
//A.Adding reducer to a component
//B.Writing a reducer function
//C.Avoiding recreating the initial state
import React, { useReducer } from 'react'
const initialState = {count: 0};
function reducer(state,action) {
    console.log(state,action);
  switch (action.type) {
    case 'increment':
      return {count: state.count + 1};
    case 'decrement':
      return {count: state.count - 1};
    default:
      throw new Error();
  }
}
function Reducer01() {
  const [state, dispatch] = useReducer(reducer, initialState);
  return (
    <>
      Count: {state.count}
      <button onClick={() => dispatch({type: 'decrement'})}>-</button>
      <button onClick={() => dispatch({type: 'increment'})}>+</button>
    </>
  );
}
export default Reducer01;