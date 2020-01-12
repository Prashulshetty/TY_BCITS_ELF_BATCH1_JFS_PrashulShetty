var uName=document.getElementById("email");
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




// function validateForm() {
//     var loginForm = document.forms['loginForm']
//     var userN = loginForm['userName'].value
//     var userP = loginForm['userPassword'].value
//     var userMN = loginForm['userMeterNumber'].value
//     var userMobile = loginForm['userMobileNumber'].value

//     console.log(loginForm);
//     console.log('user Name', userN);
//     console.log('user password', userP);
//     console.log('user password', userMN);
//     console.log('user password', userMobile);

//     if (userN.trim().length > 10) {
//         console.log('user name is valid');
//         document.getElementById('userNError').style.display = 'none'
//         document.getElementById('userN').style.border='1px solid black'
//     } else {
//         console.log('user name is invalid');
//         document.getElementById('userNError').style.display='block'
//         document.getElementById('userN').style.border='1px solid red'
//     }

        

//     if (userP.trim().length > 5) {
//         console.log('password is valid');
//         document.getElementById('userpwdError').style.display = 'none'
//         document.getElementById('userP').style.border='1px solid black'

//     } else {
//         console.log('password is invalid');
//         document.getElementById('userpwdError').style.display = 'block'
//         document.getElementById('userP').style.border='1px solid red'

//      }


//   function changecolorblue() {
//     var changeblue = document.getElementById('UserLogin')
//     changeblue.style.backgroundColor='blue'
   

// }
// function changecolorwhite() {
//     var changeW = document.getElementById('UserLogin')
//     changeW.style.backgroundColor='white'
  

// }


// }