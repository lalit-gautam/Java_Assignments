function getAllData(){
    
    let f_name = document.getElementById("first-name").value;
    let l_Name = document.getElementById("last-name").value;
    let n_Name = document.getElementById("nick-name").value;
    let temp_gender = document.getElementById("gender");
    let mob_No = document.getElementById("mob-no").value;
    let dob = document.getElementById("dob").value;
    let age = ageCalculator(dob);
    let email_intern = document.getElementById("email").value;
    let file_name = document.getElementById("file").value;
    let loc= document.getElementById("location").value;

    temp_gender.checked ? gender = "Male" : gender = "Female";

    let internsData = {
        firstName: f_name,
        lastName:l_Name ,
        nickName: n_Name ,
        intern_gender: gender,
        mobileNo: mob_No,
        age: age,
        email: email_intern,
        file: file_name,
        location: loc
    };
    
    function ageCalculator(dob){
        var dateOfBirth = new Date(dob);
        var time_diff = Date.now() - dateOfBirth.getTime();

        var age_date = new Date(time_diff);
        var year = age_date.getUTCFullYear();

        var age = Math.abs(year - 1970);

        return age;
    }
    
    return internsData;
    
}


function addContact(){

    if(localStorage.getItem("data") == null){

        localStorage.setItem("data",JSON.stringify([getAllData()]));
        
    } else {

    var old_data = JSON.parse(localStorage.getItem("data")) ;
    old_data.push(getAllData());

    localStorage.setItem("data",JSON.stringify(old_data));
    }
    alert("Contact has been added");

}


