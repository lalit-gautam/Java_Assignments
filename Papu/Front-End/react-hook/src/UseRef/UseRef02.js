//It can be used to store a mutable value that does not cause a re-render when updated
import React from 'react';
import { useRef,useState,useEffect } from 'react';
export default function UseRef02() {
    const [inputValue, setInputValue] = useState("");
    const count = useRef(0);
    useEffect(() => {
      count.current = count.current + 1;
    });
  
    return (
      <>
        <input
          type="text"
          value={inputValue}
          onChange={(e) => setInputValue(e.target.value)}
        />
        <h1>Render Count: {count.current}</h1>
      </>
    );
}
