let data = [
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
    },
    {
        "year": 2021,
        "count": 15,
        "team": "Python"
    }
]

// console.log(datas);

//all years
const years = data.map(element => element.year);
console.log(years);

//distinct years
const distinctYear = [...new Set(years)];
console.log(distinctYear);

//all teams
const teams = data.map(element=> element.team);
console.log(teams);

//distinct teams
const distinctTeam = [...new Set(teams)]
console.log(distinctTeam);


for(year of distinctYear){
    for(team of distinctTeam){
        let foundData = data.find(element => element["year"] == year && element["team"] == team) ;
        if(foundData){
            console.log(`${team} teams had ${foundData.count} numbers of employees in ${year}`);

        } else {
            console.log("Not found");
        }
    }
    console.log();
}
