function getAllData() {
    let student_data = [];
    let form = document.getElementById("student_form").elements;
    let student_id = form.namedItem('student_id').value;
    let student_name = form.namedItem('student_name').value;
    let student_dept = form.namedItem('student_dept').value;
    let student_dob = form.namedItem('student_dob').value;
    let student_hobby = form.namedItem('hobbies').value;
    student_data = {
        id: parseInt(student_id),
        details : {
        name: student_name,
        dept: student_dept,
        dob: student_dob,
        hobby: student_hobby
        }
    };

    return student_data;
}
function getDataFromLocalStorage(){
    let data = JSON.parse(localStorage.getItem("student_list"));
    return data;
}


document.getElementById("save").addEventListener("click" , (e)=>{
    if(!getDataFromLocalStorage()){
        localStorage.setItem("student_list" , JSON.stringify([getAllData()]));
    }
    else{
        data = getDataFromLocalStorage();
        data.push(getAllData()); 
        localStorage.setItem("student_list" , JSON.stringify(data));
    }



})