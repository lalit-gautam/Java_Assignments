let datas = [
    {
        "name": "John Doe",
        "position": "Software Engineer",
        "salary": 80000,
        "hireDate": "2022-01-01",
        "manager": "Jane Smith"
    },
    {
        "name": "Jane Smith",
        "position": "UI/UX Designer",
        "salary": 60000,
        "hireDate": "2021-07-15",
        "manager": "Mike Johnson"
    },
    {
        "name": "Mike Johnson",
        "position": "Project Manager",
        "salary": 100000,
        "hireDate": "2020-03-01",
        "manager": null
    },
    {
        "name": "Alice Lee",
        "position": "Data Analyst",
        "salary": 75000,
        "hireDate": "2021-09-01",
        "manager": "Mike Johnson"
    },
    {
        "name": "Bob Chen",
        "position": "Front-end Developer",
        "salary": 70000,
        "hireDate": "2021-08-01",
        "manager": "John Doe"
    },
    {
        "name": "Eva Chen",
        "position": "Back-end Developer",
        "salary": 85000,
        "hireDate": "2022-02-01",
        "manager": "John Doe"
    },
    {
        "name": "Grace Wang",
        "position": "Product Manager",
        "salary": 90000,
        "hireDate": "2022-03-01",
        "manager": "Mike Johnson"
    },
    {
        "name": "David Zhang",
        "position": "Software Engineer",
        "salary": 75000,
        "hireDate": "2022-01-15",
        "manager": "Jane Smith"
    },
    {
        "name": "Olivia Liu",
        "position": "UI/UX Designer",
        "salary": 65000,
        "hireDate": "2021-10-01",
        "manager": "Mike Johnson"
    },
    {
        "name": "James Wang",
        "position": "Front-end Developer",
        "salary": 70000,
        "hireDate": "2021-11-01",
        "manager": "John Doe"
    },
    {
        "name": "Sophie Wu",
        "position": "Back-end Developer",
        "salary": 85000,
        "hireDate": "2022-02-15",
        "manager": "John Doe"
    },
    {
        "name": "Daniel Li",
        "position": "Software Engineer",
        "salary": 75000,
        "hireDate": "2022-01-30",
        "manager": "Jane Smith"
    },
    {
        "name": "Mia Liu",
        "position": "UI/UX Designer",
        "salary": 65000,
        "hireDate": "2021-10-15",
        "manager": "Mike Johnson"
    },
    {
        "name": "Emily Wang",
        "position": "Front-end Developer",
        "salary": 70000,
        "hireDate": "2021-11-15",
        "manager": "John Doe"
    },
    {
        "name": "Jason Chen",
        "position": "Back-end Developer",
        "salary": 85000,
        "hireDate": "2022-03-15",
        "manager": "John Doe"
    }
]
//find the employees whose salary more than 70000
// console.log(datas.filter(employee => employee.salary > 70000).map(employee => employee.name));

// //group by employees by their salaries
// let salaries = [...new Set(datas.map(employee => employee.salary))];
// console.log(salaries);

// salaries.forEach(salary =>{
//     console.log(salary)
//    console.log( datas.filter(employee => employee.salary == salary).map(employee => employee.name));    // console.log(salaryOfEmployee.map(employee => employee.name));
// });

//group by employees by their role in the company
// let positions = [...new Set(datas.map(employee => employee.position))];
// positions.forEach(position =>{
//     console.log(position);
//     let employeePerPosition = datas.filter(employee => employee.position == position).map(employee => employee.name);
//     console.log("Total employees = " + employeePerPosition.length);
//     console.log(employeePerPosition);
//     console.log();
// });

// //give the employee names whose salary is more than 700000 and joined after 2021
// console.log(datas.filter(employee => employee.salary > 70000 && new Date(employee.hireDate).getFullYear() >= 2021).map(employee =>
//     ` ${employee.name} has ${employee.salary} salary joined on ${employee.hireDate}`));

//give the deatils of employee who joined in the month of february after 2020
// console.log(datas.filter(employee => employee.hireDate.split("-")[1].includes(02)).map(employee => employee.name));

//Give the name of the employees whose name not start with vowels
// console.log(datas.filter(employee =>!("aeiou".includes(employee.name.toLowerCase().charAt(0)))).map(employee => employee.name));

//Give the employee details who works under "Mike Johnson" manager
// console.log(datas.filter(employee => employee.manager == "Mike Johnson"));

//doubt
//Give the employee details whose name starts with "J" and put Mr. in their names
// let arrayOfnames = datas.filter(employee => employee.name.startsWith("J")).map(employee => employee.name.split(" "));
// arrayOfnames.forEach(name => {
//     name.splice(0, 0, 'MR')
//     console.log(name);
// })

// let arrOfnames = datas.filter(employee => employee.name.startsWith("J")).map(employee =>"Mr. " +  employee.name);
// arrOfnames.forEach(name => {
//     console.log(name);
// })

//Give the sum of salary of employees who joined in 2022
// console.log(datas.filter(employee => new Date(employee.hireDate).getFullYear() == "2022").map(employee =>
//      employee.salary).reduce((prev, curr) => prev + curr));

//Group employees by their count in particular position in a particular year
let distinctPositions = [...new Set(datas.map(employee => employee.position))];
console.log(distinctPositions);

let distinctYears = [...new Set(datas.map(employee => employee.hireDate.split("-")[0]))];
console.log(distinctYears);

distinctPositions.forEach(team => {
    distinctYears.forEach(year => {
        let employeePerPosition = datas.filter(employee => employee.hireDate.split("-")[0] == year && employee.position == team);
        if(employeePerPosition.length){
        console.log(`${year} = ${employeePerPosition.length} employees in ${team} position`);
        }
    })
    console.log();
})
