jiten=
{
    name:"jiten kumar pal",
    clazz:"12th",
     roll_no:13,
     details : ()=>
     {
        return this.name+"  and roll number "+this.roll_no;
     }
};
kriti=
{
    name:"Krit kumar Behera",
    clazz:"8th",
     roll_no:15,
};
Lalit=
{
    name:"Lalit pal",
    clazz:"6th",
     roll_no:17,
};
console.log(jiten.details.call(kriti));