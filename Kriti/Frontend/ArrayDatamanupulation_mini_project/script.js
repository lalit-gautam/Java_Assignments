class officeData{
    constructor(year , count , team){
        this.year = year;
        this.count = count;
        this.team = team;
    }
    displayInfo(){
        return this.year +" "+this.count+" "+this.team;
    }
}

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
    ,{
        'year': 2024,
        "count" : 10,
        "team" : "react"
    },
    {
        'year': 2024,
        "count" : 11,
        "team" : "Database"
    }
];

console.log(data);
let distinctYear = []

let dis = data.map(element =>{
    return element.year;
})

let distinct = new Set(dis);


console.log(distinct);

