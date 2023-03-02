let string1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
let string2 = "A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z";

console.log(`Value of string1:      ${string1.length}`); // String length
console.log(`Value of string2:      ${string2.length}`);

console.log(`Value of string1.slice(3) :         ${string1.slice(3)} `); // String Slice
console.log(`Value of string2.slice(3):          ${string2.slice(3)}`);

console.log(`Value of string1.slice(3,7) :       ${string1.slice(3,7)}<`); // String Slice
console.log(`Value of string2.slice(3,7):        ${string2.slice(3,7)}`);

console.log(`Value of string1.substr(3,7) :      ${string1.substr(3,7)}`); // String substr
console.log(`Value of string2.substr(3,7):       ${string2.substr(3,7)}`);

console.log(`Value of string1.substring(3,7) :   ${string1.substring(3,7)}`); // String substring
console.log(`Value of string2.substring(3,7):    ${string2.substring(3,7)}`);

console.log(`Value of string1.replace('A','@@') :   ${string1.replace('A','@@')}`); // String replace, replace the value which given value.
console.log(`Value of string2.replace('A,B','123456789'):    ${string2.replace('A,B','123456789')}`);

console.log(`Value of string1.replaceAll('A','Y') :   ${string1.replaceAll('A','Y')}`); // String replace, replace the value which given value.
console.log(`Value of string2.replaceAll'A,B','123456789'):    ${string2.replaceAll('A,B','123456789')}`);





// String replaceAll()
// String toUpperCase()
// String toLowerCase()
// String concat()
// String trim()
// String trimStart()
// String trimEnd()
// String padStart()
// String padEnd()
// String charAt()
// String charCodeAt()
// String split()