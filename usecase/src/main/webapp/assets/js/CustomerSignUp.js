function validation() {
	var format = /[!@#$%^&*()_+\-=\[\]{};':"\\|,.<>\/?0-9]+/;
	var format1 = /[A-Z]+/;
	var format2 = /[!@#$%^&*()_+\-=\[\]{};':"\\|,.<>\/?a-zA-Z]+/;
	var format3 = /[!@#$%^&*()_+\-=\[\]{};':"\\|,.<>\/?a-z]+/;
	
	var fname = document.getElementById("firstName").value;
	var lname = document.getElementById("lastName").value;
	var email = document.getElementById("email").value;
	var pnumber = document.getElementById("phoneNumber").value;
	var psw = document.getElementById("password").value;
	var cpsw = document.getElementById("conPwd").value;
	var rrnum = document.getElementById("rrNumber").value;
	var houseNum = document.getElementById("houseNumber").value;
	var area = document.getElementById("Area").value;
	var pincode = document.getElementById("pincode").value;
	
	var fnameValid = false;
	var lnameValid = false;
	var emailValid = false;
	var pnumberValid = false;
	var pswValid = false;
	var cpswValid = false;
	var rrnumValid = false;
	var houseNumValid = false;
	var areavalid = false;
	var pincodevalid = false;
	
	if (fname == "") {
		document.getElementById("fName").innerHTML = "*field should not be empty..!";
		return false;
	} else if ((fname.length < 3) || (fname.length > 15)) {
		document.getElementById("fName").innerHTML = "*Length must be between 3 and 15";
		return false;
	} else if (format.test(fname)) {
		document.getElementById("fName").innerHTML = "Special character & Number is not allowed";
		return false;
	} else {
		document.getElementById("fName").style.display = 'none';
		fnameValid = true;
	}

	if (lname == "") {
		document.getElementById("lName").innerHTML = " *field should not be empty..!";
		return false;
	} else if (format.test(lname)) {
		document.getElementById("lName").innerHTML = "Special character & Number is not allowed";
		return false;
	} else {
		document.getElementById("lName").style.display = 'none';
		lnameValid = true;
	}

	if (email == "") {
		document.getElementById("email").innerHTML = " *field should not be empty..!";
		return false;
	} else if (format1.test(email)) {
		document.getElementById("email").innerHTML = "*Invalid ..no uppercase";
		return false;
	} else {
		document.getElementById("email").style.display = 'none';
		emailValid = true;
	}
	if (pnumber == "") {
		document.getElementById("number").innerHTML = "*field should not be empty..!";
		return false;
	} else if (format2.test(pnumber)) {
		document.getElementById("number").innerHTML = "*only numbers are allowed";
		return false;
	} else {
		document.getElementById("number").style.display = 'none';
		pnumberValid = true;
	}
	if (psw == "") {
		document.getElementById("pwd").innerHTML = "*field should not be empty..!";
		return false;
	} else if (psw.length < 5) {
		document.getElementById("pwd").innerHTML = "*Should contains minimum 5 character";
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
	if (rrnum == "") {
		document.getElementById("rrNum").innerHTML = " *field should not be empty..!";
		return false;
	} else if ((rrnum.length < 6) || (rrnum.length > 9)) {
		document.getElementById("rrNum").innerHTML = "*Invalid RR Number";
		return false;
	} else if (format3.test(rrnum)) {
		document.getElementById("rrNum").innerHTML = "*Invalid ";
		return false;
	} else {
		document.getElementById("rrNum").style.display = 'none';
		rrnumValid = true;
	}
	if (houseNum == "") {
		document.getElementById("houseNumber").innerHTML = "*field should not be empty..!";
		return false;
	} else {
		document.getElementById("houseNumber").style.display = 'none';
		houseNumValid = true;
	}
	if (area == "") {
		document.getElementById("area").innerHTML = " *field should not be empty..!";
		return false;
	} else {
		document.getElementById("area").style.display = 'none';
		area = true;
	}
	if (pincode == "") {
		document.getElementById("pincode").innerHTML = "*field should not be empty..!";
		return false;
	} else {
		document.getElementById("pincode").style.display = 'none';
		pincode = true;
	}
	if (fnameValid && lnameValid && emailValid && pnumberValid && pswValid
			&& cpswValid && rrnumValid && houseNumValid && pincodevalid && areavalid) {
		form.method('POST');
		document.body.appendChild(form);
		form.submit();
		return true;

	}

}