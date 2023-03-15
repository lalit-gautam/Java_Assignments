    let ans = JSON.parse(localStorage.getItem("s"));

    function editById(abc) {
        //document.getElementById('student_table_body').innerHTML = '';
       location.replace("./index.html");
        var ids = abc;
        alert("do you want to edit")
            //let ans = JSON.parse(localStorage.getItem("s"));
        const res = ans.find(el => el.id == ids);
        console.log(res);
        document.getElementById("sid").value = res.id;
        document.getElementById("sname").innerHTML = res.name;
        document.getElementById("sdept").innerHTML = res.dept;
        document.getElementById("sdob").innerHTML = res.dob;
        document.getElementById("shubbies").innerHTML = res.hobbies;
        return res;
    }

    var table = document.getElementById("student_table_details");
    for (let i = 0; i < ans.length; i++) {
        var row = table.insertRow(0);
        var cell1 = row.insertCell(0);
        var cell2 = row.insertCell(1);
        var cell3 = row.insertCell(2);
        var cell4 = row.insertCell(3);
        var cell5 = row.insertCell(4);
        var cell6 = row.insertCell(5);
        cell1.innerHTML = ans[i].id;
        cell2.innerHTML = ans[i].name;
        cell3.innerHTML = ans[i].dept;
        cell4.innerHTML = ans[i].dob;
        cell5.innerHTML = ans[i].hobbies;
        cell6.innerHTML = `
        <button style=background-color:red id="${ans[i].id}" onclick=deleteById(this.id)>Delete</button> &nbsp;
        <button style=background-color:green id="${ans[i].id}" onclick=editById(this.id)>Edit</button>
        `;
    }

    function deleteById(abc) {
        alert("Do you want to delete");
        alert(abc);
        const arrays = JSON.parse(localStorage.getItem("s"));
        /*const indexOfObj=array.findIndex(object=>
            {
                return object.id===abc;
            });
        console.log(indexOfObj);
        array.splice(parseInt(abc),1);
        console.log(array); */
        index = arrays.findIndex(x => x.id === abc);
        console.log(arrays);
        console.log(index);
        arrays.splice(index, 1);
        localStorage.setItem("s", JSON.stringify(arrays));
        console.log(arrays);
        document.getElementById('student_table_body').innerHTML = '';
        for (let i = 0; i < arrays.length; i++) {
            var row = table.insertRow(0);
            var cell1 = row.insertCell(0);
            var cell2 = row.insertCell(1);
            var cell3 = row.insertCell(2);
            var cell4 = row.insertCell(3);
            var cell5 = row.insertCell(4);
            var cell6 = row.insertCell(5);
            cell1.innerHTML = arrays[i].id;
            cell2.innerHTML = arrays[i].name;
            cell3.innerHTML = arrays[i].dept;
            cell4.innerHTML = arrays[i].dob;
            cell5.innerHTML = arrays[i].hobbies;
            cell6.innerHTML = "<button style=background-color:red id=" + ans[i].id + " onclick=deleteById(this.id)>Delete</button> &nbsp;<button style=background-color:green  id=" + ans[i].id + "onclick=editById(this.id)>Edit</button> ";
        }

    }