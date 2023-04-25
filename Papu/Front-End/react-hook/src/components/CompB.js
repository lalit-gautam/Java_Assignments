import React, { useContext } from 'react'
import CompA from './CompA'
import { Fname } from '../App'
export default function CompB() {
  const fname=useContext(Fname);
  return (
    // <CompA></CompA>
    <h1>first name{fname}</h1>
  )
}
