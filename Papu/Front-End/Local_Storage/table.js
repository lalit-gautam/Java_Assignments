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
function containsNumbers(str) {
    return /[0-9]/.test(str);
  }
function clickFunction() {
    let name = document.getElementById("sname").value;
    let id = document.getElementById("sid").value;
    let department = document.getElementById("sdept").value;
    let dob = document.getElementById("sdob").value;
    let hubbies = document.getElementById("shubbies").value;
    if(id==="")
    {
        //document.getElementById("sid").focus();
        //alert("Id is must be a number");
        document.getElementById("idError").innerHTML="Id is required";
        return;
    }
    if(isNaN(id))
    {
        //document.getElementById("sid").focus();
        //alert("Id is must be a number");
        document.getElementById("idError").innerHTML="Id is must be a number";
        return;
    }
    if(parseInt(id)<=0)
    {
        document.getElementById("idError").innerHTML="Id is must be a number";
        //alert("Id is most be greater than zero");
        return;
    }
    if(name=="")
    {
        //alert("Student name is required");
        document.getElementById("nameError").innerHTML="Name most required";
        return;
    }
    if(department=="")
    {
        document.getElementById("deptError").innerHTML="Student required";
        return;
    }
    if(containsNumbers(department))
    {   
        document.getElementById("deptError").innerHTML="Student department don't contain number";
        //alert("Student department don't contain number");
        return;
    }
    // if(dob>="01/01/2022")
    // {
    //     alert("Enter the valid dob");
    // }
    if(containsNumbers(hubbies))
    {
        document.getElementById("hubError").innerHTML="Student hubbies don't contain number";
        //alert("Student hubbies don't contain number");
        return;
    }
    if(hubbies.length<10)
    {
        document.getElementById("deptError").innerHTML="Student hubbies most contains minium 10 character";
       // alert("Student hubbies most contains minium 10 character");
        return;
    }
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