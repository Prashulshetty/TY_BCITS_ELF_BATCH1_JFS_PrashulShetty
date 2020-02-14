var uCheck = document.getElementById("checkbox");


function validation() {
	var empId = document.getElementById("empId").value;
	var password = document.getElementById("password").value;
	var userValue = false;
	var passwordValue = false;
	var format = /[!@#$%^&*()_+\-=\[\]{};':"\\|,.<>\/?a-z]+/;

	
	if (empId == "") {
		document.getElementById("eId").innerHTML = " *empId should not be empty";
		return false;
	} else if ((empId.length != 6)) {
		document.getElementById("eId").innerHTML = "* empId length will be 6 characters";
		return false;
	} else if (format.test(empId)) {
		document.getElementById("eId").innerHTML = "*Only numbers are allowed";
		return false;
	} else {
		document.getElementById("eId").style.display = 'none';
		userValue = true;
	}

	
	if (password == "") {
		document.getElementById("uPsw").innerHTML = " *password should not be empty";
		return false;
	} else if ((password.length < 5) || (password.length > 15)) {
		document.getElementById("uPsw").innerHTML = " *Password Contains  5-15 character";
		return false;
	} else {
		document.getElementById("uPsw").style.display = 'none';
		passwordValue = true;
	}
	if (passwordValue && userValue) {
		document.body.appendChild(form);
		form.submit();
		return true;
	}
}

function checkBox() {
	console.log(uCheck.checked);
	if (uCheck.checked) {
		password.type = "text";
	} else {
		password.type = "password";
	}
}
