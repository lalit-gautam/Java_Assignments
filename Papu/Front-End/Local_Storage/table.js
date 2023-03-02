console.log("Check");
class Student {
    name;
    dept;
    id;
    dob;
    hobbies;
    getName() {
        return this.name;
    }
    getDept() {
        return this.dept;
    }
    getId() {
        return this.id;
    }
    getDob() {
        return this.dob;
    }
    getHobbies() {
        return this.hobbies;
    }
    setName(name) {
        this.name = name;
    }
    setDept(dept) {
        this.dept = dept;
    }
    setId(id) {
        this.id = id;
    }
    setHobbies(hobbies) {
        this.hobbies = hobbies
    }
    setDob(dob) {
        this.dob = dob;
    }

}

function clickFunction() {
    let name = document.getElementById("sname").value;
    let id = document.getElementById("sid").value;
    let department = document.getElementById("sdept").value;
    let dob = document.getElementById("sdob").value;
    let hubbies = document.getElementById("shubbies").value;
    s = new Student();
    s.setId(id);
    s.setHobbies(hubbies);
    s.setDob(dob);
    s.setName(name);
    s.setDept(department);
    arr = [];
    if (!localStorage.getItem("s")) {
        arr.push(s);
        console.log(JSON.stringify(arr));
        localStorage.setItem("s", JSON.stringify(arr));
        return;
    }
    console.log(JSON.stringify(arr));
    arr = JSON.parse(localStorage.getItem("s"));
    arr.push(s);
    localStorage.setItem("s", JSON.stringify(arr));
    alert("Student is inserted to local storage");
}

function clickEdit() {
    let name = document.getElementById("sname").value;
    let id = document.getElementById("sid").value;
    let department = document.getElementById("sdept").value;
    let dob = document.getElementById("sdob").value;
    let hubbies = document.getElementById("shubbies").value;
    s = new Student();
    s.setId(id);
    s.setHobbies(hubbies);
    s.setDob(dob);
    s.setName(name);
    s.setDept(department);
    arr = [];
    if (!localStorage.getItem("s")) {
        arr.push(s);
        console.log(JSON.stringify(arr));
        localStorage.setItem("s", JSON.stringify(arr));
        return;
    }
    console.log(JSON.stringify(arr));
    arr = JSON.parse(localStorage.getItem("s"));
    arr.push(s);
    localStorage.setItem("s", JSON.stringify(arr));
    alert("Student is inserted to local storage");
}