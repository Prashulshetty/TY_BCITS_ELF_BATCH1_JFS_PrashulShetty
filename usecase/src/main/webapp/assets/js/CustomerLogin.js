
 var uCheck=document.getElementById("checkbox");
 
 
function validation() {
	var email = document.getElementById("email").value;
	 var password = document.getElementById("password").value;
	 var userValue = false; 
	 var passwordValue=false;
	 var format = /[!@#$%^&*()_+\-=\[\]{};':"\\|,.<>\/?a-z]+/;
    
    if (email == "") {
        document.getElementById("uName").innerHTML = " *Please fill the email";
        return false;
    } else if ((email.length < 10) || (email.length > 30)) {
        document.getElementById("uName").innerHTML = "*Invalid Username";
        return false;
    }  else {
        document.getElementById("uName").style.display = 'none';
        userValue = true;
    }   


    if (password == "") {
        document.getElementById("uPsw").innerHTML = " *Please fill password field";
        return false;
    }else if( password.length <=5 ){
        document.getElementById("uPsw").innerHTML = " *Password Contains At list 5 character";
        return false;
    }else{
        document.getElementById("uPsw").style.display = 'none';
        passwordValue = true;

    }   
    if(passwordValue && userValue ){
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
