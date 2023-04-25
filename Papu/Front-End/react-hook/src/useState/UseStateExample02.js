import React from 'react'
import { useState } from 'react';
//To update what’s on the screen, call the set function with some next state:
export default function UseStateExample02() {
    const[name,setName]=useState("");
  return (
    <div>
        <input placeholder='Enter here' onChange={(e)=>setName(e.target.value)}></input>
        <h1>You entered   :::{name}</h1>
    </div>
  )
}
