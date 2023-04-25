//useNavigator is use to navigate to another components
import React from 'react'
import { useNavigate } from 'react-router-dom'

export default function UseNavigate01() {
    const nav=useNavigate();
  return (
    <div>
        <button onClick={()=>
        {
            nav("/about")
        }}>About Us</button>
    </div>
  )
}
