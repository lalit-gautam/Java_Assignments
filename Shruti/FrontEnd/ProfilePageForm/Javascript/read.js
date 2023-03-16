let add = (user) =>{
    return `<div class="edit-icon"><a href="AddContact.html"><i class="fa fa-solid fa-pencil"></i></a></div>
    <img src="Images/6.jpg" class="img-thumbnail" alt="...">
    <div class="card-body">
      <h5 class="card-title">${user['firstName']} ${user['lastName']}</h5>
      <dl class="row">
        <dt class="col-lg-4 offset-md-2">NickName:</dt>
        <dd class="col-lg-6">${user['nickName']}</dd>

        <dt class="col-lg-4 offset-md-2">Mobile No:</dt>
        <dd class="col-lg-6">${user['mobileNo']}</dd>

        <dt class="col-lg-4 offset-md-2">Email:</dt>
        <dd class="col-lg-6">${user['email']}</dd>

        <dt class="col-lg-4 offset-md-2">Age:</dt>
        <dd class="col-lg-6">${user['age']}</dd>
      </dl>

    </div>`
}
let dataFromLocalStorage = function getDataFromLocalStorage() {
    return JSON.parse(localStorage.getItem('data'));
}

dataFromLocalStorage().forEach(element => {
     let tempDiv = document.createElement('div');
     tempDiv.className = "card col-lg-4";
     tempDiv.innerHTML = add(element);
     document.getElementById("cardGroups").appendChild(tempDiv);
});

// if(dataFromLocalStorage() == null){
//   let temp_P = document.createElement('p');
//   temp_P.className = "description";
//   temp_P.innerHTML = 'No Profile Added';
//   document.getElementById("descr").appendChild(temp_P);
// }
// dataFromLocalStorage();
