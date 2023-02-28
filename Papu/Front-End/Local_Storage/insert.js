class Student{
    name;
    roll;
    id;
    dob;
    hobbies;
    getName() {
        return this.name;
    }
    getRoll() {
        return this.roll;
    }
    getId() {
        return this.id;
    }
    getHobbies() {
        return this.hobbies;
    }
    setName(name) {
        this.name = name;
    }
    setRoll(roll) {
        this.roll = this.roll;
    }
    setId(id) {
        this.id = id;
    }
    setHobbies(hobbies) {
        this.hobbies = hobbies
    }
    setDob(dob)
    {
        this.dob=dob;
    }

}
function clickFunction()
{
    let name=document.getElementById("sname").value;
    let id=document.getElementById("sid").value;
    let department=document.getElementById("sdept").value;
    let dob=document.getElementById("sdob").value;
    let hubbies=document.getElementById("shubbies").value;
     s=new Student();
    s.setId(id);
    s.setHobbies(name);
    s.setHobbies(hubbies);
    s.setDob(dob);
    arr=[];
    localStorage.setItem(JSON.stringify())

}