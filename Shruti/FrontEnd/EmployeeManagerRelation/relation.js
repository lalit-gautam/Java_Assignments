let datas = [
    {
        "name": "Sushant kumar Rout",
        "department":[
                 {"name": "Java"},
                 {"name": "React"}]
    },
    {
        "name": "Shrutismita Mishra",
        "department":[
                 {"name": ".net"},
                 {"name": "React"}]
    }    
    
]

let colleagueData = datas.map(emp => emp);
console.log(colleagueData);
colleagueData.forEach(emp =>console.log(emp.name +"-") +emp.department.map(deptName => console.log(deptName.name))) 

// let employeesOfColleagues = colleagueData.map(emp => emp.employees);
// console.log(employeesOfColleagues);