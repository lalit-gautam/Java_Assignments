
let jsonData = ` [
    {
        "label": "Dashboard",
        "icon":"fa fa-dashboard",
        "id": 1,
        "href":"#",
        "submenu":[
            {
            "label": "My Profile",
            "icon":"dash",
            "id": 11,
            "href":"#",
            "submenu":[
                {
                "label": "Rewards",
                "icon":"rewards",
                "id": 12,
                "href":"#"
                }
            ]
            },
            {
            "label": "Rewards",
            "icon":"rewards",
            "id": 12,
            "href":"#"
            }
        ]
    },
    {
        "label": "Services",
        "icon":"fa fa-solid fa-gear",
        "id": 2,
        "href":"#",
        "submenu":[
            {
            "label": "App Design",
            "icon":"app design",
            "id": 11,
            "href":"#"
            },
           {"label": "Web Design",
            "icon":"app design",
            "id": 12,
            "href":"#"
            }
        ]
    },
    {
        "label": "Resources",
        "icon":"fa fa-solid fa-server",
        "id": 3,
        "href":"#"
    },
    {
        "label": "About Us",
        "icon":"fa fa-regular fa-address-card",
        "id": 4,
        "href":"#"
    },
    {
        "label": "Contact Us",
        "icon":"fa fa-solid fa-phone",
        "id": 5,
        "href":"#"
    }
]`
let menus = JSON.parse(jsonData);
console.log(menus);
let submenus = menus.filter(menu => menu.submenu).map(menu => menu.submenu);
console.log(submenus);
// import menus from './sidemenu.json';
// console.log(menus);
// let menusdata = require('sidemenu.json');
// console.log( typeof menusdata);
let nav = document.querySelector('nav');

function menuOfJSON(menus, initial = true, key = "") {
    const ul = document.createElement("ul");
    initial ? ul.classList.add('ulMenu') : ''

    if (initial) {
        nav.appendChild(ul)
    } else {
        let position = document.querySelector(`[data-position="${key}"]`);
        if (position) {
            ul.classList.toggle('subUl');
            position.appendChild(ul);
        }
    }

    menus.forEach((menu, key) => {
        const li = document.createElement('li');
        menu?.submenu ? (li.classList.add('submenu'), li.setAttribute('hasDropdown', 'true')) : '';

        let str = menu.label + key;
        li.setAttribute('data-position', str);
        ul.appendChild(li);

        let div = document.createElement('div');
        div.classList.add('li-div');

        const i = document.createElement('i');
        i.setAttribute('class', menu.icon);
        div.appendChild(i);

        const a = document.createElement('a')
        a.setAttribute('href', menu.href)
        a.textContent = menu.label
        div.appendChild(a);

        li.appendChild(div);



        if (menu.submenu) {
            let iconName = "fa fas fa-solid fa-caret-right"
            const i2 = document.createElement('i');
            i2.setAttribute('class', iconName);
            a.appendChild(i2);
        }

        if (menu.submenu) {
            menuOfJSON(menu.submenu, false, str)
        }

    });
}

menuOfJSON(menus);
let listOfMenu = document.querySelectorAll('.ulMenu li');
console.log(listOfMenu);
for (let index = 0; index < listOfMenu.length; index++) {
    listOfMenu[index].addEventListener("click", function () {
        if (listOfMenu[index].hasAttribute('hasDropdown')) {
            let dropdown = document.querySelectorAll("li.submenu div");

            console.log(dropdown);
            for (let i = 0; i < dropdown.length; i++) {
                dropdown[i].parentElement.addEventListener("click", function () {
                    this.classList.toggle("active");
                    let dropdownContent = this.firstChild.nextElementSibling;
                    console.log(dropdownContent);
                    if (dropdownContent) {
                        dropdownContent.classList.toggle('open');
                        // if (dropdownContent.style.display === "block") {
                        //     dropdownContent.classList.toggle('subUl');
                        // } else {
                        //     dropdownContent.style.display = "block";
                        // }
                    } else {
                        this.style.display = "block";
                        let position = this.getAttribute("data-position");
                        let parent = this.parentElement.parentElement.getAttribute("data-position");
                        document.getElementById('output').innerHTML = '<h1>' + parent + " -> parent of " + position + '</h1>';
                    }
                });
            }
        } else {
            let position = listOfMenu[index].getAttribute("data-position");
            document.getElementById('output').innerHTML = '<h1>' + position + '</h1>';
        }
    })
}







