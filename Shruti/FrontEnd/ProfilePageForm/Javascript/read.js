let view = (user) => {
  return `<div class="edit-icon"><a href="AddContact.html?id=${user['id']}"><i class="fa fa-solid fa-pencil"></i></a>
  <a style="cursor: pointer;" data-bs-toggle="modal" data-bs-target="#exampleModal" ><i class="fa fa-solid fa-trash"></i></a></div>
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
    </div> 
    <!-- Modal -->
    <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
      <div class="modal-dialog">
        <div class="modal-content">
          <div class="modal-header">
            <h5 class="modal-title" id="exampleModalLabel"></h5>
            <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
          </div>
          <div class="modal-body">
          Are you sure you want to delete ${user['firstName']}'s profile
          </div>
          <div class="modal-footer">
            <button type="button" class="btn btn-light" data-bs-dismiss="modal">No</button>
            <button type="button" class="btn btn-danger" onclick="deleteContact(${user['id']}, '${user['firstName']}')">Delete</button>
          </div>
        </div>
      </div>
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

function deleteContact(id) {
  localStorage.setItem('data', JSON.stringify(localData().filter(contact => contact.id != id)));
  location.reload();
  
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
