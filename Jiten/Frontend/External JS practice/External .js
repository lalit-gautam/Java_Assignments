const laptop = {
    brand : "Asus",
    color : 'Black',
    price : 234567,
    model : {SN:1234,model:"xhgf"},
    'lunch date' : "23-Mar-23"
};

console.log(laptop.model.model);

document.getElementById('show').innerHTML = laptop.brand;