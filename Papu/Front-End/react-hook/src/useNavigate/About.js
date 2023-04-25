import React from 'react'
import { useNavigate } from 'react-router-dom'

export default function About() {
    const navigate=useNavigate();
  return (
    <>
        <div>About us page</div>
        <button onClick={()=>navigate(-1)}>Go Back Home</button>
    </>
  )
}
