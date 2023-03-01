class Student {
    name;
    roll;
    getName(){
        return this.name;
    }
    getRoll(){
        return this.roll;
    }
    setName(name){
        this.name = name;
    }
    setRoll(roll){
        this.roll = roll;
    }
    
}

student = new Student();
student.setName("Aswini");
student.setRoll(123);

function makeFunc() {
    const name = "Mozilla";
    console.log(name);
    name= 9;
  }

  console.log(name * name);
  var myFunc = makeFunc();
  myFunc();



