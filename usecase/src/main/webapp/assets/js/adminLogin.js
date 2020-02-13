var uCheck = document.getElementById("checkbox");


function validation() {
	var adminId = document.getElementById("adminId").value;
	var password = document.getElementById("password").value;
	var userValue = false;
	var passwordValue = false;
	var format = /[!@#$%^&*()_+\-=\[\]{};':"\\|,.<>\/?]+/;

	
	if (adminId == "") {
		document.getElementById("aId").innerHTML = " *adminId should not be empty";
		return false;
	} else if ((adminId.length < 5) || (adminId.length > 15)) {
		document.getElementById("aId").innerHTML = "* adminId length between 5-15 characters";
		return false;
	} else if (format.test(adminId)) {
		document.getElementById("aId").innerHTML = "*Only numbers are allowed";
		return false;
	} else {
		document.getElementById("aId").style.display = 'none';
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
