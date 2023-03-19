
function checkForm() {
    var canSubmit = true;
    const dataObject = getAllData();
    for (let key in dataObject) {
        if (dataObject[key] == null || dataObject[key] == "" || dataObject[key] == NaN) {
            canSubmit = false;
        }
    }
    if (canSubmit) {
        createProfile();
        alert("Contact has been added");
    } else {
        alert("Please insert data");
    }

} 

function getAllData() {

    let f_name = document.getElementById("first-name").value;
    let l_Name = document.getElementById("last-name").value;
    let n_Name = document.getElementById("nick-name").value;

    let selectedGender = "";
    document.getElementsByName('gender').forEach(e => {
        if (e.checked) {
            selectedGender = e.value;
            return;
        }
    });

    let mob_No = document.getElementById("mob-no").value;
    let dob = document.getElementById("dob").value;
    let age = ageCalculator(dob);
    let email_intern = document.getElementById("email").value;
    let file_name = document.getElementById("file").value;
    let loc = document.getElementById("location").value;


    let internsData = {
        firstName: f_name,
        lastName: l_Name,
        nickName: n_Name,
        intern_gender: selectedGender,
        mobileNo: mob_No,
        age: age,
        email: email_intern,
        file: file_name,
        location: loc
    };

    function ageCalculator(dob) {
        var dateOfBirth = new Date(dob);
        var time_diff = Date.now() - dateOfBirth.getTime();

        var age_date = new Date(time_diff);
        var year = age_date.getUTCFullYear();

        var age = Math.abs(year - 1970);

        return age;
    }

    return internsData;

}


function createProfile() {

    if (localStorage.getItem("data") == null) {
        localStorage.setItem("data", JSON.stringify([getAllData()]));
    } else {
        let old_data = JSON.parse(localStorage.getItem("data"));
        
        old_data.push(getAllData());
        localStorage.setItem("data", JSON.stringify(old_data));
        
    }
}

// function getParamFromUrl(queryParam) {
//     const params = new URL(window.location.href).searchParams;
//     return params.get(queryParam);
// }

// function getControlById(key, value = undefined) {
//     let control = document.getElementById(key);
//     if (control && value) {
//         control.value = value;
//     }
//     return control;
// }

// // update profile
// window.onload = () => {
//     const mobilNoFromParam = getParamFromUrl('mobile');

//     if (mobilNoFromParam) {
//         let currentUser = [...localData('data')].find(e => e.mobileNo == mobilNoFromParam);
//         if (currentUser) {
//             let { firstName, lastName, nickName, internGender, mobileNo, age, email, file, location } = currentUser;
//             getControlById('first-name', firstName);
//             getControlById('last-name', lastName);
//             getControlById('nick-name', nickName);
//             getControlById('mob-no', mobileNo);
//             getControlById('dob', age);
//             getControlById('email', email);
//             getControlById('file', file);
//             getControlById('location', location);
//         }
//     }
// }

