//The React useMemo Hook returns a memoized value
//The useMemo Hook only runs when one of its dependencies update
//It is used to get good performance of the application.
import React from 'react'
import { useState,useMemo } from 'react';
export default function UseMemo() {
    const[one,setOne]=useState(0);
    const[two,setTwo]=useState(0);
    // const isEven=()=>
    // {
    //     let i=0;
    //     console.log("-----------------------");
    //     while(i<2000000000)i++;
    //     return one%2===0;
    // }
    const isEven=useMemo(()=>
    {
        let i=0;
        while(i<2000000000)i++;
        return one%2===0;
    },[one])
  return (
    <div>
        <button onClick={()=>setOne(one+1)}>IncreOnce{one}</button>
        <span>{isEven?"Even":"Odd"}</span>
        <button onClick={()=>setTwo(two+2)}>IncreTwo{two}</button>
    </div>
  )
}