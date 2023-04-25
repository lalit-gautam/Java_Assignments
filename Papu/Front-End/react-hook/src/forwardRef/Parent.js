import React, { useRef } from 'react'
import Child from './Child'
export default function Parent() {
    let ref=useRef();
    function updatedInpute()
    {
        ref.current.value="10000";
        ref.current.style.color="red";
        ref.current.focus()
    }
  return (
    <div>
        <h1>Forward Ref</h1>
        <Child ref={ref}></Child>
        <button onClick={updatedInpute}>Click me</button>
    </div>
  )
}
