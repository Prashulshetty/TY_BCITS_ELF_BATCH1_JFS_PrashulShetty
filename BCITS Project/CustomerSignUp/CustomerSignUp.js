

    var fName=document.getElementById("fName");
    var lName=document.getElementById("lName");
    var email=document.getElementById("email");
    var Mobile=document.getElementById("Mobile");
    var password=document.getElementById("password");
    var cPassword=document.getElementById("cpassword");
    var mNumber=document.getElementById("MNumber");
    var PinCode=document.getElementById("PinCode");

    var fNameI=document.getElementById("fNameI");
    var lNameI=document.getElementById("lNameI");
    var emailI=document.getElementById("emailI");
    var MobileI=document.getElementById("MobileI");
    var pele=document.getElementById("pele");
    var cPasswordI=document.getElementById("cpasswordI");
    var mNumberI=document.getElementById("MNumberI");
    var PinCodeI=document.getElementById("PinCodeI");
    
    function passwordValidation(password) {

        let valid = true;
        console.log(password);
        let upperV = password.match(/[A-Z]/)
        let lowerV = password.match(/[a-z]/)
        let numberV = password.match(/[0-9]/)
        let special = password.match(/[!-=]/) //'!@#$%^&*()_+~`|}{[]\:;?><,./-=';
        console.log(special);
        if (numberV !== null && upperV !== null && lowerV !== null && special !== null) {
            valid = false
        }
    
        return valid
    }

var success = document.getElementById("success");
var pTag = document.getElementById("pele");

function validateForm() {
    let valid = true

    if (fName.value.match(/[0-9]/) !== null) {
        fNameI.style.display = "block";
        fName.style.border = "2px solid red";

        valid = false

    } else {
        fNameI.style.display = "none";
        fName.style.border = "1px solid black";
    }
    if (lNamelname.value.match(/[0-9]/) !== null) {
        lNameI.style.display = "block";
        lName.style.border = "2px solid red";
        valid = false

    } else {
        lNameI.style.display = "none";
        lName.style.border = "1px solid black";
    }
    if (Mobile.value.trim().length !== 10) {
        MobileI.style.display = "block";
        Mobile.style.border = "2px solid red";
        valid = false

    } else {
        MobileI.style.display = "none";
        Mobile.style.border = "1px solid black";
    }
    if (mNumber.value.trim().length !== 8) {
        mNumberI.style.display = "block";
        mNumber.style.border = "2px solid red";
        valid = false

    } else {
        mNumberI.style.display = "none";
        mNumber.style.border = "1px solid black";
    }
    if (passwordValidation(password.value)) {
        pTag.style.display = "block";
        password.style.border = "2px solid red";
        valid = false
    } else {
        pTag.style.display = "none";
        password.style.border = "1px solid black";  
    } if (password.value!==cPassword.value) {
        cPasswordI.style.display = "block";
        cPassword.style.border = "2px solid red";
        valid = false
    } else {
        cPasswordI.style.display = "none";
        cPassword.style.border = "1px solid black";  
    }
    return valid;

}





