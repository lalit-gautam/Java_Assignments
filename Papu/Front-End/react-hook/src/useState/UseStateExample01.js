import React, { useState } from 'react'
//useState is use to change the state in the component
//useState return an array having two value one is the current state and a function to update it
export default function UseStateExample01() {
    const[counter,setCounter]=useState(0);
  return (
    <div>
        <h1>{counter}</h1>
        <button onClick={()=>setCounter(counter+1)}>Increase</button>
    </div>
  )
}
