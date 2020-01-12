var uName=document.getElementById("eid");
var uPassword=document.getElementById("password");
var uCheck=document.getElementById("checkbox");
var savebox=document.getElementById("savebox");
var pTag=document.getElementById("pele");
var pTag2=document.getElementById("eele");
var success=document.getElementById("success");
function validateForm() {

   if (uPassword.value.trim().length<5&&uName.value.trim().length<5) {
        pTag2.style.display="block";
        pTag.style.display="block";
        uName.style.border="2px solid red";
        uPassword.style.border="2px solid red";
       
        return false;
        
    }else if(uPassword.value.trim().length<5){
        pTag.style.display="block";
        uPassword.style.border="2px solid red"; 
        return false;
    }else if(uName.value.trim().length<5){
        pTag2.style.display="block";
        uName.style.border="2px solid red";
        return false;
    }
   else{
    pTag2.style.display="none";
    pTag.style.display="none";
    uName.style.border="1px solid black";
    uPassword.style.border="1px solid black";
    success.style.display="block";
    if(savebox.checked){
        alert("Saved")
    }
   
    return false;
    }
    
}
function clearData() {

        pTag2.style.display="none";
        pTag.style.display="none";
        uName.style.border="1px solid black";
        uPassword.style.border="1px solid black";
    
    
}
function checkBox() {

    console.log(uCheck.checked);
    if(uCheck.checked){
        uPassword.type="text";
    }else{
        uPassword.type="password";
    }
    
    
}
checkBox();



