import React, { forwardRef, useImperativeHandle } from 'react'
function Child(props,ref) {
    useImperativeHandle(ref,()=>{
        return{
            // say:()=>saySome
            saySome
        };
    });
    const saySome=()=>
    {
        alert("Hello");
    }
  return (
    <div>Child Component</div>
  )
}
export default forwardRef(Child);
