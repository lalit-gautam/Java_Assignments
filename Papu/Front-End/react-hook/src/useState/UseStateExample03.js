//Avoiding recreating the initial state
//To solve this, you may pass it as an initializer function to useState instead:
//it also use the Resetting state with a key 
import React from 'react'
import { useState } from 'react';
function initializer()
{
    const initializers=[];
    for(let i=0;i<25;i++)
    {
        initializers.push({id:i,text:"Item"+i});
    }
    return initializers;
}
export default function UseStateExample03() {
    const[todos,setTodos]=useState(initializer);
    const[text,setText]=useState('');
  return (
    <div>
        <input value={text} placeholder='enter here' onChange={(e)=>setText(e.target.value)}></input>
        <button onClick={()=>
        {
            setTodos([{
                id:todos.length,
                text:text
            },...todos]);
            setText("")
           
        }}>Add</button>
        <ul>
            {todos.map(e=>(
                <li key={todos.id}>
                    {e.text}
                </li>
            ))}
        </ul>
    </div>
  )
}
