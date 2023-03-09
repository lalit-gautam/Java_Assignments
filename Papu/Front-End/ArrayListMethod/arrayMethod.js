


//console.log(require('./dummy.json'));
employee=require('./dummy.json');
//filter method
//includes methods
function getAllEmployeeWhichIsContainingS(employeeList)
{
    fetchEmployee=employeeList.filter((e)=>e.name.toUpperCase().includes('A'));
    return fetchEmployee;
}
//at method
//The at() method takes an integer value and returns the item at that index, allowing for positive and negative integers. Negative integers count back from the last item in the array.
function getTheEmployeeAtIndex(index,employeeList)
{
    employeeAtindex=employeeList.at(index);
    return employeeAtindex;
}
//map
function getAllEmployeeNameAndEmail(employeeList)
{
    return employeeList.map(e=>e.name+"  "+e.email);
}
//console.log(getAllEmployeeName(employee));
//includes
//.operator
for(let item of employee)
{
    console.log(item.address.geo.lat);
}
employee2=[1,2,3,4];
//concat() 
//The concat() method is used to merge two or more arrays. This method does not change the existing arrays, but instead returns a new array.
employee3=employee.concat(employee2);
console.log(employee3);
//copyWithin()
//The copyWithin() method shallow copies part of an array to another location in the same array and returns it without modifying its length.
const array11 = ['a', 'b', 'c', 'd', 'e'];

// Copy to index 0 the element at index 3
//console.log(array1.copyWithin(0, 3, 4));
// Expected output: Array ["d", "b", "c", "d", "e"]

// Copy to index 1 all elements from index 3 to the end
//console.log(array1.copyWithin(1, 3));
// Expected output: Array ["d", "d", "e", "d", "e"]
//entries()
//-----------------
//The entries() method returns a new Array Iterator object that contains the key/value pairs for each index in 
//the array.


const array2 = ['a', 'b', 'c'];

const iterator1 = array2.entries();

console.log(iterator1.next().value);
// expected output: Array [0, "a"]

console.log(iterator1.next().value);
// expected output: Array [1, "b"]

const a = ["a", "b", "c"];

for (const [index, element] of a.entries()) {
  console.log(index, element);
}
//every()
//------------------
//The every() method tests whether all elements in the array pass the test implemented by the provided function. 
//It returns a Boolean value.


const isBelowThreshold = (currentValue) => currentValue < 40;
const array3 = [1, 30, 39, 29, 10, 13];
console.log(array3.every(isBelowThreshold));
// expected output: true


const isSubset = (array1, array2) => array2.every((element) => array1.includes(element));

console.log(isSubset([1, 2, 3, 4, 5, 6, 7], [5, 7, 6])); // true
console.log(isSubset([1, 2, 3, 4, 5, 6, 7], [5, 8, 7])); // false
//fill()
//------------------------
//The fill() method changes all elements in an array to a static value, from a start index (default 0) to an end
// index (default array.length). It returns the modified array.

const array5 = [1, 2, 3, 4];

// fill with 0 from position 2 until position 4
//console.log(array1.fill(0, 2, 4));
// expected output: [1, 2, 0, 0]

// fill with 5 from position 1
//console.log(array1.fill(5, 1));
// expected output: [1, 5, 5, 5]

//console.log(array1.fill(6));
// expected output: [6, 6, 6, 6]
//reverse()
//-----------------------------
//The reverse() method reverses an array in place. The first array element becomes the last, and the last array element becomes the first.

const array1 = ['one', 'two', 'three'];
console.log('array1:', array1);
// expected output: "array1:" Array ["one", "two", "three"]

const reversed = array1.reverse();
console.log('reversed:', reversed);
// expected output: "reversed:" Array ["three", "two", "one"]

// Careful: reverse is destructive -- it changes the original array.
console.log('array1:', array1);
// expected output: "array1:" Array ["three", "two", "one"]
// values()
// ----------------

// The values() method returns a new array iterator object that contains the values for each index in the array.
const valuy= ['a', 'b', 'c'];
const iterator = valuy.values();
for(const value of iterator)
{
    console.log(value);
}
// unshift()
// -----------------------------
// The unshift() method adds one or more elements to the beginning of an array and returns the new length of the array.
const unshi=[1,5,8,9,6];
const unsht=unshi.unshift(4,5);
console.log(unshi);
console.log(unsht);
// shift()
// ------------------------
// The shift() method removes the first element from an array and returns that removed element. This method changes the length of the array.
console.log(unshi.shift());
console.log(unshi);
// push()
// -----------------------
// The push() method adds one or more elements to the end of an array and returns the new length of the array
const pusssh=unshi.push(1,2);
console.log(pusssh);
console.log(unshi);
// pop()
// ------------------
// The pop() method removes the last element from an array and returns that element. This method changes the length of the array.
const poppp=unshi.pop();
console.log(unshi);