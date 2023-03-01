function functionOne(){
    let a = "outer";
    console.log(a);
    let b =  function functionTwo(){
        console.log(a);
    }
    a = "inner";
    return b;
}

// const b = functionOne();
// b();

if(true){
    var a = 10;
}

console.log(a);
