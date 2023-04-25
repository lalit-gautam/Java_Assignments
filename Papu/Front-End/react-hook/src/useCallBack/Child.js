import React, { memo } from 'react'

function Child({abc}) {
    console.log("Child components");
  return (
    <div></div>
  )
}
export default memo(Child)