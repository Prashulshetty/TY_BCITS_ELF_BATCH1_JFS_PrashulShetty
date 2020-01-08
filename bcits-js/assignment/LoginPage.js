function validateForm() {
    var loginForm = document.forms['loginForm']
    var userN = loginForm['userName'].value
    var userP = loginForm['userPwd'].value
    console.log(loginForm);
    console.log('user Name', userN);
    console.log('user password', userP);

    if (userN.trim().length > 10) {
        console.log('user name is valid');
        document.getElementById('userNError').style.display = 'none'
    } else {
        console.log('user name is invalid');
        document.getElementById('userNError').style.display = 'block'
    }

    if (userP.trim().length > 5) {
        console.log('password is valid');
        document.getElementById('userpwdError').style.display = 'none'
    } else {
        console.log('password is invalid');
        document.getElementById('userpwdError').style.display = 'block'
     }
}

function showpassword() {
  var showp = document.getElementById('hidenP')
  var userp = document.getElementById('userP')
userp.style.display='none'
  showp.style.display='block'
 

}