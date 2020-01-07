

function showAlert() {
    alert('Hi.....')
}
function showCreatedElement() {
    var createdElement = document.createElement('h1') 
    
    createdElement.textContent='Hello..Welcome'
    document.body.appendChild(createdElement)
    createdElement.style.display='block'
    
}
function showName() { 
    var dispName = document.getElementById('disp')
   
    if (dispName.style.display ==='' || dispName.style.display==='none' ) {
        
        dispName.style.display='block'
        var hideName = document.getElementById('Display')
        hideName.textContent='click here to hide name'

    } else {
        dispName.style.display='none'
        var hideName = document.getElementById('Display')
        hideName.textContent='click here to show name'

    }
}




function changecolorblue() {
    var changeblue = document.getElementById('change')
    changeblue.style.backgroundColor='blue'
    changeblue.style.fontSize='100px'

}
function changecolorwhite() {
    var changeW = document.getElementById('change')
    changeW.style.backgroundColor='white'
   changeW.style.fontSize='50px'

}

function showData() {
    console.log('working!!');
    
}
function showMessage() {
    console.log('on key executed.......!!');
}
    

function getinputvalue() {
  var inpElements=  document.getElementById('inp')
  console.log(inpElements.value); 

  var values=document.getElementById('hidetext')
  values.textContent=inpElements.value ;
}  


