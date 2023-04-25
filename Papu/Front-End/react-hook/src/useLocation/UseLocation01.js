//The useLocation hook returns the location object from the current URL, which includes the following:
//pathname,search,hash
// useLocation object will update each time when the URL change
//We can also extract the query parameters from the URL through the useLocation object and make some decisions, based on the query parameter.
//
import React from 'react'
import { useLocation } from 'react-router-dom';
export default function UseLocation01() {
    const location = useLocation();
    console.log(location);

    return (
    <div className="container">
        <h2>Products page</h2>
        <p>Pathname: {location.pathname}</p>
        {/* <p>Search Parameter: {new URLSearchParams(location.search).get('name')}</p> */}
    </div>
    );
}
