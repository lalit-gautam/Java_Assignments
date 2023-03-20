let addButton = document.getElementById("addButton");
addButton.addEventListener('click', addCustomer);
let localstr = localStorage.getItem("boot");
let resetButton=getItemById("resetbutton");
resetButton.addEventListener('click',resetPage);
function addCustomer() {
    // validate();
    //console.log("Add button is clicked");
    let first_name = getItemById("fname").value;
    let last_name = getItemById("lname").value;
    let nick_name = getItemById("niname").value;
    let moblie_number = getItemById("mobileNo").value;
    let dob = getItemById("dob").value;
    let email = getItemById("email").value;
    let gender;
        if (document.getElementById('flexRadioDefault1').checked) {
            gender=document.getElementById('flexRadioDefault1').value;
        }
        else if (document.getElementById('flexRadioDefault2').checked) {
            gender=document.getElementById('flexRadioDefault2').value;
        }
    if(first_name=="")
    {
        getItemById("fnameErr").innerHTML="Enter Your first name";
    }
    else if(!validateFname(first_name))
   {
    getItemById("fnameErr").innerHTML="Invalid First name";
   }
   else if(last_name=="")
   {
    getItemById("lnameErr").innerHTML="Enter Your last name";
   }
   else if(!validateLastName(last_name))
   {
    getItemById("lnameErr").innerHTML="Invalid Last name";
   }
   else if(nick_name=="")
   {
    getItemById("nnameErr").innerHTML="Enter Your nick name";
   }
   else if(!validateFname(nick_name))
   {
    getItemById("nnameErr").innerHTML="Enter valid nick name";
   }
   else if(moblie_number=="")
   {
    getItemById("mobileErr").innerHTML="Enter Your mobile number";
   }
   else if(!validateNumber(moblie_number))
   {
    getItemById("mobileErr").innerHTML="Enter Valid number";
   }
   else if(!validateEmail(email))
   {
    getItemById("emailErr").innerHTML="Enter valid email";
   }
   else{
    console.log(first_name + " " + last_name + " " + nick_name + " " + moblie_number + " " + dob + " " + email + "     " + photo);
    data = {
        fname: first_name,
        lname: last_name,
        nname: nick_name,
        mobile: moblie_number,
        dob: dob,
        email: email,
        photo: photo,
         gender:gender
        // page:age
    }
    const id = localStorage.getItem("unique");
    arr = [];
    if (!id) {
        // arr = [];
        if (!localStorage.getItem("boot")) {
            arr.push(data);
            console.log(JSON.stringify(arr));
            localStorage.setItem("boot", JSON.stringify(arr));
            return;
        }
        console.log(JSON.stringify(arr));
        arr = JSON.parse(localStorage.getItem("boot"));
        arr.push(data);
        localStorage.setItem("boot", JSON.stringify(arr));
        alert("Customer is added successfully");
    }
    else{
        let array=JSON.parse(localstr);
        array[id]=data;
        localStorage.setItem("boot", JSON.stringify(array));
        alert("Data updateed");

    }
   }

}
function resetPage()
{
    arr = JSON.parse(localStorage.getItem("boot"));
    // const index=localStorage.getItem("unique");
    const index=getIdFromParam();
    const customer=arr.at(index);
    if (!index) {
        document.getElementById("fname").value = "";
        document.getElementById("lname").value = "";
        console.log(customer);
        document.getElementById("niname").value = "";
        document.getElementById("mobileNo").value = "";
        document.getElementById("dob").value= "";
        document.getElementById("email").value = "";
    }
    else{
        document.getElementById("fname").value = customer.fname;
        document.getElementById("lname").value = customer.lname;
        console.log(customer);
        document.getElementById("niname").value = customer.nname;
        document.getElementById("mobileNo").value = customer.mobile;
        document.getElementById("dob").value = customer.dob;
        document.getElementById("email").value = customer.email;
    }
}
window.onload = () => {
    let index = getIdFromParam();
    let cust = JSON.parse(localstr).at(index);
    if (index) {
        fillData(cust);
    }
}
function fillData(customer) {
    document.getElementById("fname").value = customer.fname;
    document.getElementById("lname").value = customer.lname;
    console.log(customer);
    document.getElementById("niname").value = customer.nname;
    document.getElementById("mobileNo").value = customer.mobile;
    document.getElementById("dob").value = customer.dob;
    document.getElementById("email").value = customer.email;
    document.getElementById("addButton").innerHTML = "Update";
}

function getIdFromParam(){
    let paramId = "id=";
    let param =  location.search;
    let index = param.substring(param.indexOf(paramId)+paramId.length)
    return index;

}

function getItemById(id)
{
    return document.getElementById(id);
}
function validateFname(first_name)
{
    const regexName = new RegExp('^[A-Za-z]+$');
    console.log(regexName.test(first_name));
    return regexName.test(first_name);
}
function validateLastName(last_name)
{
    const regexLast = new RegExp('^[A-Za-z]+$');
    console.log(regexLast.test(last_name));
    return regexLast.test(last_name);
}
function validateNumber(number)
{
    const regexNum=new RegExp('^[7-9][0-9]{9}$');
    return regexNum.test(number);
}
function validateEmail(email) {
    const regexEmail=new RegExp('^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$');
    return regexEmail.test(email);
}

