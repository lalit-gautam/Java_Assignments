//useRef is used to Tracking State Changes
import React from 'react'
import { useState } from 'react';
import { useRef } from 'react';
import { useEffect } from 'react';
export default function UseRef04() {
    const [inputValue, setInputValue] = useState("");
    const previousInputValue = useRef("");
  //it return the previous value of the count
    useEffect(() => {
        previousInputValue.current = inputValue;
    }, [inputValue]);

    return (
        <>
            <input
                type="text"
                value={inputValue}
                onChange={(e) => setInputValue(e.target.value)}
            />
            <h2>Current Value: {inputValue}</h2>
            <h2>Previous Value: {previousInputValue.current}</h2>
        </>
    );
}

