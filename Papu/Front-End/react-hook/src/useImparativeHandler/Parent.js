//to transfor the data from child to parent
//it is like reverse of forwardRef
import React from 'react'
import Child from './Child';
import { useRef } from 'react';
export default function Parent() {
  const ref1=useRef();
  return (
    <div>
      <Child ref={ref1}/>
          <div>Parent Component</div>
          <button onClick={()=>ref1.current.saySome()}>Click me</button>
    </div>
  )
}
