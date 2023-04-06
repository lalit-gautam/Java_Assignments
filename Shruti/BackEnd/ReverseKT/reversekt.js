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

//Sum of Salary
// console.log(datas.map(employee => employee.salary).reduce((prev, curr)=> prev + curr)); 

// let salaries = datas.map(employee => employee.salary);
// let sum = 0;
// salaries.forEach(salary => {
//     sum += salary;
// });
// console.log(sum);

// Group all the employees by their manager
// let managers = [...new Set(datas.map(emp => emp.manager))];
// console.log(managers);

// managers.forEach(manager => {
//     console.log('===========================================================================')
//     console.log(`Manager ${manager}`);
//     const employeesPerManager = datas.filter(e => e["manager"] == manager);
//     // Count and display no. of employees who reports to same manager
//     console.log(`Total employees = ${employeesPerManager.length}`);
//     employeesPerManager.forEach(emp => console.log(emp.name));
//     console.log('===========================================================================')
// });
// managers.forEach(manager =>{
//     console.log(`${manager} has these employees ${datas.filter(employee => employee["manager"] == manager).map(emp => emp.name)}`);
// });

//Find all the employees who have joined in 2021
// console.log(datas.filter(employee => employee.hireDate.startsWith("2021")).map(employee => `${employee.name} joined on ${employee.hireDate} `));

console.log(datas.filter(employee => new Date(employee.hireDate).getFullYear() == 2021).map(employee => employee.name));

console.log(datas.filter(employee => employee.hireDate.split("-")[0].includes("2021")).map(employee => employee.name));


//Find all the employees who's name starts with vowel
console.log(datas.filter(emp => "aeiou".includes(emp.name.toLowerCase().charAt(0))).map(emp => emp.name));

console.log(datas.filter(emp => emp.name.toLowerCase().charAt(0) == "a" || emp.name.toLowerCase().charAt(0) == "e" || 
emp.name.toLowerCase().charAt(0) == "i" || emp.name.toLowerCase().charAt(0) == "o" || emp.name.toLowerCase().charAt(0) == "u").map(emp => emp.name));

console.log(datas.map(employee => employee.name.split("")).filter(employee =>"aeiou".includes(employee[0].toLowerCase())).map(emp => emp.join("")));

