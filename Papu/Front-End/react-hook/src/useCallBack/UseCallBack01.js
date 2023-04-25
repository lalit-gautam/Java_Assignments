//The React useCallback Hook returns a memoized callback function
//
import React, { useCallback } from 'react'
import { useState } from 'react';
import Child from './Child';
export default function UseCallBack01() {
    // const someFunction=()=>
    // {
    //     //some operation
    // }
    const someFunction=useCallback(()=>
    {
        //some operation
    },[])
    const[count,setCount]=useState(0);
  return (
    <div>
        <button onClick={()=>setCount(count+1)}>Addition</button>
        <Child data={someFunction}></Child>
        <h1>{count}</h1>
    </div>
  )
}
