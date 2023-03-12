// let data = require('./biprosCompanyData.json');
// console.log(data);
// import * as data from './biprosCompanyData.json';

data = [
    {
        "year": 2022,
        "count": 21,
        "team": "Java"
    },
    {
        "year": 2022,
        "count": 20,
        "team": "Python"
    },
    {
        "year": 2023,
        "count": 27,
        "team": "Java"
    },
    {
        "year": 2023,
        "count": 30,
        "team": ".Net"
    },
    {
        "year": 2023,
        "count": 25,
        "team": "Python"
    },
    {
        "year": 2021,
        "count": 15,
        "team": "Python"
    },
    {
        "year": 2021,
        "count": 15,
        "team": "Java"
    },
    {
        "year": 2022,
        "count": 23,
        "team": ".Net"
    },
    {
        "year": 2021,
        "count": 19,
        "team": ".Net"
    }
    , {
        'year': 2024,
        "count": 10,
        "team": "react"
    },
    {
        'year': 2024,
        "count": 11,
        "team": "Database"
    },

    {
        'year': 2025,
        "count": 11,
        "team": "Warehouse"
    }
];

// console.log(data);

let table = document.getElementById('table');

//find all year
const yearData = data.map((element) => element.year);
const uniqueYearData = [...new Set(yearData)];
console.log(uniqueYearData);

const teamData = data.map(element => element.team);
const uniqueTeamData = [...new Set(teamData)];
console.log(uniqueTeamData);


let tableRow = document.createElement('tr');
let td = document.createElement('td');
td.innerText = "Year";
tableRow.appendChild(td);
for (team of uniqueTeamData) {
    let td = document.createElement('td');
    td.innerText = team;
    tableRow.appendChild(td);
}
table.appendChild(tableRow);




for (year of uniqueYearData) {
    let tableRow = document.createElement('tr');
    let td = document.createElement('td');
    td.innerText = year;
    tableRow.appendChild(td);
    for (team of uniqueTeamData) {
        let foundData = data.find(element => {

            return element["year"] == year && element["team"] == team;
        });
        let td1 = document.createElement('td');
        if (foundData) {
            td1.innerText = foundData["count"];
        }
        else {
            td1.innerText = "Not Present";
        }
        tableRow.appendChild(td1);

    }
    table.appendChild(tableRow);
}


