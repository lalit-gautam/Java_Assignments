//Passing data deeply into the tree
//Updating data passed via context
//Specifying a fallback default value
//context hold the state
import React from 'react'
import NoteContext from './noteContext';
import React from 'react'

export default function UseContex(props) {
    const state={name:"raja",age:23};
  return (
    <NoteContext.provider value={state}>
        {props.children}
    </NoteContext.provider>
  )
}

