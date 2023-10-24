function akash(){
  let Fname=document.getElementById("first").value;
  let Lname=document.getElementById("second").value;
  let date =document.getElementById("date").value;
  let country=document.getElementById("country").value;
  let profession=document.getElementById("Profession").value;
  let email=document.getElementById("email").value;
  let Mnumber=document.getElementById("num").value;
  let g=document.querySelectorAll('input[type=checkbox]:checked');
  let checked=false;
  g.forEach(checkbox =>{
    if(checkbox.checked){
      checked=true;
      let gender=Array.from(document.querySelectorAll('input[type=checkbox]:checked')).map(input => input.value);
      window.alert(`
        First Name   : ${Fname}
        Last Name    :${Lname}
        Date of Birth: ${date}
        Country      :${country}
        Gender       : ${gender}
        Profession   : ${profession}
        Email        : ${email}
        Mobile Number: ${Mnumber}
        `)

               }
           });
    if (!checked){
      document.write("**********Go Back ********* and Please select one Gender option");
  }


  //window.alert("First Name :  "+Fname+"Last Name : "+Lname+"Date Of Birth : "+date+"country  :"+country+"Gender : "+gender+"Profession : "+profession+"Email : "+email+"Mobile Number : "+Mnumber);




}