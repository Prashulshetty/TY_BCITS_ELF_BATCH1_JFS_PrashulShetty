
function validation() {
	var rrNumber = document.getElementById("rrNumber").value;
	var billAmount = document.getElementById("billAmount").value;
	
	var rrNumberValue = false;
	var billAmountValue = false;
	
	var format = /[!@#$%^&*()_+\-=\[\]{};':"\\|,.<>\/?a-z]+/;
	
	if (rrNumber == "") {
		document.getElementById("num").innerHTML = " *rrNumber should not be empty";
		return false;
	} else if ((rrNumber.length != 10))  {
		document.getElementById("num").innerHTML = "* rrNumber length should be 10 characters";
		return false;
	} else if (format.test(rrNumber)) {
		document.getElementById("num").innerHTML = "*Only upper case characters  and digits are allowed";
		return false;
	} else {
		document.getElementById("num").style.display = 'none';
		rrNumberValue = true;
	}

	
	if (billAmount == "") {
		document.getElementById("amount").innerHTML = " *amount should not be empty";
		return false;
	} else if ((billAmount <= 0)) {
		document.getElementById("amount").innerHTML = " *billAmount should be greater than 0";
		return false;
	} else {
		document.getElementById("amount").style.display = 'none';
		billAmountValue = true;
	}
	if (rrNumberValue && billAmountValue) {
		document.body.appendChild(form);
		form.submit();
		return true;
	}
}

