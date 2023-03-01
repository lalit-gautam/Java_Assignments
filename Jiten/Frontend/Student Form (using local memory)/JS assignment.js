
// el_up.innerHTML = "Click on button to "
//     + "change the ID of box.";


document.getElementById('save').addEventListener('click', function (e) {
    let stdId = document.getElementById('stdId').value;
    let stdName = document.getElementById('stdName').value;
    console.log(stdId +"  "+ stdName);
})

function GFG_Fun() {
    document.getElementById('div1').id = 'div2';
}