import React, { forwardRef } from 'react'
import { useRef } from 'react'
 function Child(porps,ref) {
  return (
    <div>
        <input ref={ref}></input>
    </div>
  )
}
export default forwardRef(Child)