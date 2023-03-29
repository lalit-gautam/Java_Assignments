function checkForm() {
    var canSubmit = true;
    const dataObject = getAllData();
    for (let key in dataObject) {
        if (dataObject[key] == null || dataObject[key] == "" || dataObject[key] == NaN) {
            canSubmit = false;
        }
    }
    if (canSubmit ) {
        addOrUpdateContact();
        alert("Contact has been added");
    } else {
        alert("Please insert data");
    }

}
let localData = () => {
    const data = localStorage.getItem('data');
    if (data) {
        return JSON.parse(data);
    } else {
        return [];
    }
}
function getAllData() {

    let f_name = document.getElementById("first-name").value;
    let l_Name = document.getElementById("last-name").value;
    let n_Name = document.getElementById("nick-name").value;
    let mob_No = document.getElementById("mob-no").value;
    let dob = document.getElementById("dob").value;
    let age = ageCalculator(dob);
    let email_intern = document.getElementById("email").value;
    let file_name = document.getElementById("file").value;
    let loc = document.getElementById("location").value;
    let selectedGender = "";   
    document.getElementsByName('gender').forEach(e => {
        if (e.checked) {
            selectedGender = e.value;
            return;
        }
    });
    let indexOfObject = lengthOfData();

    let internsData = {
        id: indexOfObject,
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

    function lengthOfData(){
        if(localData().length == 0){
            return 1;
        } else {
            let idArray = localData().map(element => element.id);
            let length = Math.max(...idArray);
            return length + 1;
        }
    }
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

// create contact in addContact Form
// function createProfile() {
//     let existingDatas = localData();
//     console.log(existingDatas);
//     existingDatas.push(getAllData());
//     localStorage.setItem("data", JSON.stringify(existingDatas));
// }

function saveContacts(contacts) {
    localStorage.setItem("data", JSON.stringify(contacts));
}

//Loading Data of existing contact for update
function getParamFromUrl(queryParam) {
    const params = new URL(window.location.href).searchParams;
    return params.get(queryParam);
}
function getControlById(key, value = undefined) {
    let control = document.getElementById(key);
    if (control && value) {
        control.value = value;
    }
    return control;
}
window.onload = () => {
    const idFromParam = getParamFromUrl('id');
    console.log(idFromParam);

    if (idFromParam) {
        let currentUser = [...localData('data')].find(e => e.id == idFromParam);
        console.log(currentUser);
        if (currentUser) {
            let {id, firstName, lastName, nickName, internGender, mobileNo, age, email, file, location } = currentUser;
            getControlById('first-name', firstName);
            getControlById('last-name', lastName);
            getControlById('nick-name', nickName);
            getControlById('mob-no', mobileNo);
            // getControlById('dob', age);
            getControlById('email', email);
            getControlById('location', location);
        }
    }
}
//update Contact
function isExistsByMobile(contacts, id, mobileNo) {
    return contacts.some((contact) => (id ? contact.id != id && contact.mobileNo == mobileNo : contact.mobileNo == mobileNo));
    
}

function addContact(contact) {
  let contacts = localData();
  if (isExistsByMobile(contacts, contact.id, contact.mobileNo)) {
    alert("Duplicate Mobile Number");
  } else {
    contacts.push(contact);
    saveContacts(contacts);
    window.location.href = 'index.html';
  }
}
  
function updateContact(contact) {
  let contacts = localData();
  if (isExistsByMobile(contacts, contact.id, contact.mobileNo)) {
    alert("Duplicate Mobile Number");
  } else {
    contacts.splice(contacts.findIndex(c => c.id == contact.id) , 1, contact);
    saveContacts(contacts);
    window.location.href = 'index.html';
  }
}

function addOrUpdateContact() {
  const contactId = getParamFromUrl('id');
  console.log(contactId);
  let contact = getAllData();
  if (contactId) {
    contact.id = Number(contactId);
    updateContact(contact);
  } else {
    addContact(contact);
  }
}


