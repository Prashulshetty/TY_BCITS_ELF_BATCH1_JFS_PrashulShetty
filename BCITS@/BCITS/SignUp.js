function validateForm() {
    var loginForm = document.forms['loginForm']
    var userN = loginForm['userName'].value
    var userP = loginForm['userPassword'].value
    var userMN = loginForm['userMeterNumber'].value
    var userMobile = loginForm['userMobileNumber'].value

    console.log(loginForm);
    console.log('user Name', userN);
    console.log('user password', userP);
    console.log('user password', userMN);
    console.log('user password', userMobile);

    if (userN.trim().length > 10) {
        console.log('user name is valid');
        document.getElementById('userNError').style.display = 'none'
        document.getElementById('userN').style.border='1px solid black'
    } else {
        console.log('user name is invalid');
        document.getElementById('userNError').style.display='block'
        document.getElementById('userN').style.border='1px solid red'
    }

        

//     if (userP.trim().length > 5) {
//         console.log('password is valid');
//         document.getElementById('userpwdError').style.display = 'none'
//         document.getElementById('userP').style.border='1px solid black'

//     } else {
//         console.log('password is invalid');
//         document.getElementById('userpwdError').style.display = 'block'
//         document.getElementById('userP').style.border='1px solid red'

//      }

//      if (userMobile.trim().length > 10) {
//       console.log(' Mobile number is valid');
//       document.getElementById('userMobileNumberError').style.display = 'none'
//       document.getElementById('userMobile').style.border='1px solid black'
//   } else {
//       console.log('Mobile number is invalid');
//       document.getElementById('userMobileNumberError').style.display='block'
//       document.getElementById('userMobile').style.border='1px solid red'
//   }

//      if (userMN.trim().length > 10) {
//       console.log(' Meter number is valid');
//       document.getElementById('userMeterNumberError').style.display = 'none'
//       document.getElementById('userMN').style.border='1px solid black'
//   } else {
//       console.log('Meter number is invalid');
//       document.getElementById('userMeterNumberError').style.display='block'
//       document.getElementById('userMN').style.border='1px solid red'
//   }

//   function changecolorblue() {
//     var changeblue = document.getElementById('UserSubmit')
//     changeblue.style.backgroundColor='blue'
   

// }
// function changecolorwhite() {
//     var changeW = document.getElementById('UserSubmit')
//     changeW.style.backgroundColor='white'
  

// }


}