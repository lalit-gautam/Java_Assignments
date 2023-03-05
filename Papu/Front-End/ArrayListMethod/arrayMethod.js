


//console.log(require('./dummy.json'));
employee=require('./dummy.json');
//filter method
function getAllEmployeeWhichIsContainingS(employeeList)
{
    fetchEmployee=employeeList.filter((e)=>e.name.toUpperCase().includes('A'));
    return fetchEmployee;
}
//at method
function getTheEmployeeAtIndex(index,employeeList)
{
    employeeAtindex=employeeList.at(index);
    return employeeAtindex;
}
//map
function getAllEmployeeName(employeeList)
{
    return employeeList.map(e=>e.name+"  "+e.);
}
console.log(getAllEmployeeName(employee));
//includes
