let view = (user) => {
  return `<div class="edit-icon"><a href="AddContact.html?id=${user['id']}"><i class="fa fa-solid fa-pencil"></i></a>
  <a style="cursor: pointer;" onclick="deleteContact(${user['id']}, '${user['firstName']}')"><i class="fa fa-solid fa-trash"></i></a></div>
    <img src="Images/2.jpg" class="img-thumbnail" alt="...">
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

let notAdded = () => {
  return `No Profile Added`
}

//Getting Data From LocalStorage

let localData = function getDataFromLocalStorage() {
  const data = localStorage.getItem('data');
  if (data) {
    return JSON.parse(data);
  } else {
    return [];
  }
}

//Delete Contact

function deleteContact(id , firstName) {
  if (confirm('Are you sure you want to delete ' + firstName + "'s profile ?")) {
    localStorage.setItem('data', JSON.stringify(localData().filter(contact => contact.id != id)));
    location.reload();
  }
}

//Read Data From LocalStorage
window.onload = () => {
  if (localData() && localData().length > 0) {
    localData().forEach(element => {
      let tempDiv = document.createElement('div');
      tempDiv.className = "card col-lg-4";
      tempDiv.innerHTML = view(element);
      document.getElementById("cardGroups").appendChild(tempDiv);
    });
  } else {
    
      let temp_P = document.createElement('p');
      temp_P.className = "description";
      temp_P.innerHTML = notAdded();
      document.getElementById("descr").appendChild(temp_P);
    
  }
}
