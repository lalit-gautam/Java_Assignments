//useRef is used to Accessing DOM Elements
//In React, we can add a ref attribute to an element to access it directly in the DOM
import React from 'react'
import { useRef } from 'react';
export default function UseRef03() {
    const inputElement = useRef();

    const focusInput = () => {
        console.log(inputElement.current.formAction);
        inputElement.current.focus();
    };

    return (
        <>
            <input type="text" ref={inputElement} />
            <button onClick={focusInput}>Focus Input</button>
        </>
    );
}
