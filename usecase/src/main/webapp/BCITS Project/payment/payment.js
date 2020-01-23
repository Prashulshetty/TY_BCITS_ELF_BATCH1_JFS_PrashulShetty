var cName=document.getElementById("Name");
var cNumber=document.getElementById("cNumber");
var pTag=document.getElementById("pele");
var pTag2=document.getElementById("eele");


let numberV = cNumber.match(/[0-9]/)

function validateForm() {

   if ((cNumber.value.trim().length!=16) && (numberV ==null) ) {
   
        pTag.style.display="block";
        pTag.style.border="2px solid red";
        cNumber.style.border="2px solid red";
        return false;
    
    }else if(cName.value.trim().length<5) {
        pTag2.style.display="block";
        cName.style.border="2px solid red";
        return false;
    }
   else{
    pTag2.style.display="none";
    pTag.style.display="none";
    uName.style.border="1px solid black";
    uPassword.style.border="1px solid black";
    success.style.display="block";
   
   
    return true;
    }
}

