const fruits = ["Banana", "Orange", "Apple", "Mango"];

console.log(fruits.toString()); // To string methods returns an array as a comma separated.

console.log(fruits.join(" @ "));  // join is used to separated by the given symbol.

console.log(fruits.pop());  //POP 
console.log(fruits);

console.log(fruits.push("Jiten")); //Push
console.log(fruits);

console.log(fruits.shift()); //shift means remove first element from array.
console.log(fruits);

console.log(fruits.unshift("Kriti")); //shift means add element to first place of array.
console.log(fruits);

console.log(fruits.length); // length of array.

console.log(fruits);
delete fruits[2]; //delete elements from index number 2.
console.log(fruits); //After delete one element

const Boys = ["Sonu", "Tapas", "Tapan"]; //Another array

const ConcatTwoArray = fruits.concat(Boys); // concatination of two array
console.log(ConcatTwoArray);

let array1 = ["Tiger","Horse","Jackle","Monkey"];
let array2 = ["Math","Eng","Science"];
let array3 = ["Table","Chair"];

const ConcatThreeArray = array1.concat(array2, array3); //Concat three arrays.
console.log(ConcatThreeArray);

array1.sort();// when we ue sort() method on an array it sort based on alphabetically.
console.log(array1);
let number = [7,9,2,5,8,2,5,0,1,7,3,2,9];
number.reverse();
console.log(number);

array1 = ["Tiger","Horse","Jackle","Monkey"];
console.log(array1);
array1.reverse();// reverse()
console.log(array1);

