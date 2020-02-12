
 var uCheck=document.getElementById("checkbox");
 
 
function validation() {
	 var email = document.getElementById("email").value;
	 var password = document.getElementById("password").value;
	 var userValue = false; 
	 var passwordValue=false;
    
    if(email == "") {
        document.getElementById("uName").innerHTML = " *email should not be empty";
        return false;
    } else if((email.length) < 10) {
        document.getElementById("uName").innerHTML = "*invalid email";
        return false;
    } else {
        document.getElementById("uName").style.display = 'none';
        userValue = true;
    }   


    if (password == "") {
        document.getElementById("uPsw").innerHTML = " *password should not be empty";
        return false;
    } else if((password.length) < 5 ) {
        document.getElementById("uPsw").innerHTML = " *password Contains minimum 5 character";
        return false;
    } else {
        document.getElementById("uPsw").style.display = 'none';
        passwordValue = true;
    
    }   
    if(passwordValue && userValue ) {
    	document.body.appendChild(form);
    	
		form.submit();
		return true;
    }
}

function checkBox() {

    console.log(uCheck.checked);
    if(uCheck.checked){
    	password.type="text";
    }else{
    	password.type="password";
    }
}
