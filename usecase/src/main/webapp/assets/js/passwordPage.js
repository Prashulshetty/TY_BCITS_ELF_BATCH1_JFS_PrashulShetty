
function validation() {
		
	var psw = document.getElementById("password").value;
	var cpsw = document.getElementById("cPassword").value;
	
	var pswValid = false;
	var cpswValid = false;
	
	if (psw == "") {
		document.getElementById("pwd").innerHTML = "*field should not be empty..!";
		return false;
	} else if ((psw.length < 5) || (psw.length > 15)) {
		document.getElementById("pwd").innerHTML = "*Should contains 5-10 character";
		return false;
	} else {
		document.getElementById("pwd").style.display = 'none';
		pswValid = true;
	}	
	
	
	if (cpsw == "") {
		document.getElementById("cPwd").innerHTML = "*field should not be empty..!";
		return false;
	} else if (psw != cpsw) {
		document.getElementById("cPwd").innerHTML = "*Password and confirm password should match";
		return false;
	} else {
		document.getElementById("cPwd").style.display = 'none';
		cpswValid = true;
	}	
	
	if (pswValid && cpswValid) {
		document.body.appendChild(form);
		form.submit();
		return true;
	}
}

	

