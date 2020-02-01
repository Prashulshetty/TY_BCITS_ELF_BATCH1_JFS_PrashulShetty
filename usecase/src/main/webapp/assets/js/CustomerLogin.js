
 var uCheck=document.getElementById("checkbox");
 var rrNum = document.getElementById("rrNum").value;
 var password = document.getElementById("password").value;
 var userValue = false; 
 var passwordValue=false;
 var format = /[!@#$%^&*()_+\-=\[\]{};':"\\|,.<>\/?a-z]+/;
 
function validation() {
    
    if (rrNum == "") {
        document.getElementById("uName").innerHTML = " *Please fill the RR Number";
        return false;
    } else if ((rrNum.length < 6) || (rrNum.length > 9)) {
        document.getElementById("uName").innerHTML = "*Invalid RR Number";
        return false;
    } else if (format.test(rrNum)){
        document.getElementById("uName").innerHTML = "*Invalid RR Number";
        return false;
    } else {
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
