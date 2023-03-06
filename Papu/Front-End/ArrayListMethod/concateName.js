student = [
    {
        "name": {
            "firstName": "Kriti",
            "middleName": "kumar",
            "lastName": "Behera"
        },
        "userName": "kriti kumar Behera",
        "age": 23
    },
    {
        "name": {
            "firstName": "jiten",
            "middleName": "",
            "lastName": "pal"
        },
        "userName": "jiten pal",
        "age": 25
    },
    {
        "name": {
            "firstName": "Lalit",
            "middleName": "kumar",
            "lastName": "Sahoo"
        },
        "userName": "Lalit kumar Sahoo",
        "age": 22
    },
]
function getFullName(students) {
    // studentFullName = []
    // students.forEach(element => {
    //     element.fullName = element.name.firstName + "  " + element.name.middleName + "  " + element.name.lastName;
    //     //console.log(element);
    //     studentFullName.push(element);
    //     //console.log(element.fullName);
    // });
    let studentFullName = students.map(e=> e.userName.split(" "));
    return studentFullName;
}
console.log(getFullName(student));
// console.log(getFullName(student).map((e) => e.fullName.toUpperCase()));