//The useEffect Hook allows you to perform side effects in your components.
//useEffect accepts two arguments. The second argument is optional.
//useEffect runs on every render. That means that when the count changes, a render happens, which then triggers another effect.
//We should always include the second parameter which accepts an array which is dependency in which the usEffect is called. We can optionally pass dependencies to useEffect in this array.
//if we want that the use effect runs one once at application starting then we put the second param is empty array i.e []
//it is used to fetch data from the api at first call.
import React, { useState, useEffect } from 'react'
export default function UseEffectExample01() {
    const [count, setCount] = useState(0);
    const[data,setData]=useState([]);
    const[resourceType,setResourceType]=useState("posts");
    useEffect(() => {
        fetch(`https://jsonplaceholder.typicode.com/${resourceType}`)
            .then(response => response.json())
            .then(json => setData(json));
    }, [resourceType]);
    //here the second parameter is called dependency that which value is changes the that callback method is called
    return (
        <div>
            <button onClick={() => {
                setResourceType("posts")
            }}>Post</button>
            <button onClick={() => {
                setResourceType("users")
            }}>users</button>
            <button onClick={() => {
                setResourceType("comments")
            }}>Commments</button>
            <h1>{resourceType}</h1>
            <h1>Datas are</h1>
            {
                data.map((e)=>
                {
                    return <pre>{JSON.stringify(e)}</pre>
                })
            }
        </div>
    )
}
