var element=document.getElementById('demo')
console.log(element);


console.log(element.textContent );
element.textContent='content changed';

console.log(element.textContent);

var pelement = document.createElement('p')
pelement.textContent='hi devere'
document.body.appendChild(pelement)
pelement.style.fontSize='100px'
pelement.style.color='red'
