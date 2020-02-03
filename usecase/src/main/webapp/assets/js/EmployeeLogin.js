
 var uCheck=document.getElementById("checkbox");
 
 
function validation() {
	var empId = document.getElementById("empId").value;
	 var password = document.getElementById("password").value;
	 var userValue = false; 
	 var passwordValue=false;
	 var format = /[!@#$%^&*()_+\-=\[\]{};':"\\|,.<>\/?a-z]+/;
    
    if (empId == "") {
        document.getElementById("eId").innerHTML = " *Please fill the field";
        return false;
    } else if ((empId.length < 6) || (empId.length > 9)) {
        document.getElementById("eId").innerHTML = "*Invalid empId";
        return false;
    } else if (format.test(empId)){
        document.getElementById("eId").innerHTML = "*Invalid empId";
        return false;
    } else {
        document.getElementById("eId").style.display = 'none';
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
