let ans = JSON.parse(localStorage.getItem("boot"));
localStorage.removeItem("unique");
var modal = document.getElementById('id01');

let serachButton = getItemById("seachBtn");



let seachBox = getItemById("searchBox");
searchBox.addEventListener('input', () => {
  console.log(seachBox);
  getEmployeeByName(seachBox.value)
});



let info = (ans, i) => `<img  class="img-circle" 
src="https://e9g2x6t2.rocketcdn.me/wp-content/uploads/2020/11/Professional-Headshot-Poses-Blog-Post.jpg"
alt="Card image cap" style="width: 250px;
height: 250px;
border-radius: 50%;
display: flex;
align-items: center;">

<div class="adit_btn row">
  <button type="button" class="btn btn-outline-danger col-12"  onclick=deleteByIndex('${i}')><svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-trash" viewBox="0 0 16 16">
  <path d="M5.5 5.5A.5.5 0 0 1 6 6v6a.5.5 0 0 1-1 0V6a.5.5 0 0 1 .5-.5zm2.5 0a.5.5 0 0 1 .5.5v6a.5.5 0 0 1-1 0V6a.5.5 0 0 1 .5-.5zm3 .5a.5.5 0 0 0-1 0v6a.5.5 0 0 0 1 0V6z"/>
  <path fill-rule="evenodd" d="M14.5 3a1 1 0 0 1-1 1H13v9a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2V4h-.5a1 1 0 0 1-1-1V2a1 1 0 0 1 1-1H6a1 1 0 0 1 1-1h2a1 1 0 0 1 1 1h3.5a1 1 0 0 1 1 1v1zM4.118 4 4 4.059V13a1 1 0 0 0 1 1h6a1 1 0 0 0 1-1V4.059L11.882 4H4.118zM2.5 3V2h11v1h-11z"/>
</svg></button>
  <button type="button" class="btn btn-outline-info col-12"  onclick=editByIndex('${i}')><svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-pen" viewBox="0 0 16 16">
  <path d="m13.498.795.149-.149a1.207 1.207 0 1 1 1.707 1.708l-.149.148a1.5 1.5 0 0 1-.059 2.059L4.854 14.854a.5.5 0 0 1-.233.131l-4 1a.5.5 0 0 1-.606-.606l1-4a.5.5 0 0 1 .131-.232l9.642-9.642a.5.5 0 0 0-.642.056L6.854 4.854a.5.5 0 1 1-.708-.708L9.44.854A1.5 1.5 0 0 1 11.5.796a1.5 1.5 0 0 1 1.998-.001zm-.644.766a.5.5 0 0 0-.707 0L1.95 11.756l-.764 3.057 3.057-.764L14.44 3.854a.5.5 0 0 0 0-.708l-1.585-1.585z"/>
</svg></button>
</div>
<div class="card-body">

<p class="card-text">
<h6 style="text-align:center;"><span >${ans.fname} ${ans.lname}</span></h6>
<h6 style="text-align:center;"><span >(${ans.gender})</span></h6>
  <h6><b>Nick Name:</b><span >${ans.nname}</span></h6>
  <h6><b>Mobile number:</b><span >${ans.mobile}</span></h6>
  <h6><b>Email Id:</b><span>${ans.email}</span></h6>
  <h6><b>Age:</b><span>${Math.abs(new Date(Date.now() - new Date(ans.dob).getTime()).getUTCFullYear() - 1970)}</span></h6>
 
 

  </p>

</div>`;
for (let i = 0; i < ans.length; i++) {
  console.log("customer: " + i);
  let div = document.createElement('div');
  div.className = 'card col-lg-3';
  div.style = "width: 18rem ; margin-left: 10px";
  div.innerHTML = info(ans[i], i);
  document.getElementById("photo-align").appendChild(div);
}
function deleteByIndex(index) {
  alert("Do You Want to delete");
  const arrays = JSON.parse(localStorage.getItem("boot"));
  console.log(index);
  arrays.splice(index, 1);
  localStorage.setItem("boot", JSON.stringify(arrays));
  location.replace("index.html");
}
function editByIndex(index) {
  alert("Do You want to edit");
  location.href = "addUser.html?id=" + index;
}
function getEmployeeByName(name) {
  console.log("in the getEmloyeeName");
  console.log(name);
  getItemById('photo-align').innerHTML = "";
  const result = ans.filter(({ fname }) => fname.includes(name));
  console.log(result);
  for (let i = 0; i < result.length; i++) {
    //console.log("customer: " + i);
    let div = document.createElement('div');
    div.className = 'card col-lg-3';
    div.style = "width: 18rem ; margin-left: 10px";
    div.innerHTML = info(result[i], i);
    document.getElementById("photo-align").appendChild(div);
  }
}
function getItemById(id) {

  return document.getElementById(id);
}
window.onclick = function (event) {
  if (event.target == modal) {
    modal.style.display = "none";
  }
}
// function PopulatePage()