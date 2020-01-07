function validateForm() {
    var loginForm = document.forms['loginForm']
    var usermail = loginForm['userEmail'].value
    var pwd = loginForm['userPwd'].value
    console.log(loginForm);
    console.log('user mail',usermail); 
    console.log('user password',pwd);   
    
    if(usermail.trim().length>10) {
        console.log('user mail is valid');
        document.getElementById('emailErr').style.display='none'
     } else { 
         document.getElementById('emailErr').style.display='block'
         

         console.log('user mail is invalid');    
     }
        
     if(pwd.trim().length>5) {
        console.log('password is valid');
     } else { 
         console.log('password is invalid');    
     }
}
