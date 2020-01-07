

function showalert() {
    alert('hi welcome to cinema hall......')
}



function showelement() {
    var element = document.createElement('h2')
    element.textContent = 'hi. good evening..'
    document.body.appendChild(element)
}

function displayelement() {
  var displayeleement = document.getElementById('disp')

  var myBtn =document.getElementById('myBtn')
  if(displayelement.style.display===''||
  displayelement.style.display==='none'){

 
  displayelement.style.display='block'
  myBtn.textContent= 'click here to hide h1 element'
  } else {
      displayelement.style.display='none'
      myBtn.textContent='click to show h1'
  }

}

function changecolorblue() {
    var changeblue = document.getElementById('change')
    changeblue.style.backgroundColor='lightgreen'
    changeblue.style.fontSize='50px'

}
function changecolorwhite() {
    var changeW = document.getElementById('change')
    changeW.style.backgroundColor='white'
    changeW.style.fontsize='90px'

}
// function showData() {
//     console.log('working!!');
    
// }
// function showMessage() {
//     console.log('on key executed.......!!');
    
// }
// function getinputvalue() {
//   var inpElements=  document.getElementById('inp')
//   console.log(inpElements.value); 
//   var values=document.getElementById('hidetext')
//   values.textContent=inpElements.value ;
  
// }

