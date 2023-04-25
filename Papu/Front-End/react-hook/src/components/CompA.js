////React Context is a way to manage state globally. 
//It can be used together with the useState Hook to share state between deeply nested components more easily than with useState alone
import React from 'react'
import { Fname, Lname } from '../App'
export default function CompA() {
    return (
        <>
            <Fname.Consumer>{(fname)=>{
               return <Lname.Consumer>{(lname)=>
               {
                return <h1>full name is {fname} {lname}</h1>
               }}</Lname.Consumer>
            }}</Fname.Consumer>
        </>
    )
}
