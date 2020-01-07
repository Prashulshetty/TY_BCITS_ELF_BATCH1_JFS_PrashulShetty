function add(a,b){
    var c = a+b;
    return c;
}
var sum =add(10,20);


console.log('sum is ',sum);
console.log('========================');


var n1=10;
var str ='10';
if (n1===str) {
    console.log('equal');
    
} else {
    console.log('not equal');
    
}
console.log('=============================');

console.log(typeof(null));
console.log(typeof(undefined));
console.log(typeof 10);
console.log(typeof 'hhhh');

var nums=[10,20,30]
console.log(typeof nums);

console.log(Array.isArray(nums));

if (Array.isArray(nums)===true) {
    console.log('is array');
    
} else {
    console.log('not array');
    
}
console.log('=====================================');

var addM =(a,b) => a+b;
var s=add(10,20);
console.log('sum ',s);

var sqr =a=>a*a;
var n =sqr(20)
console.log('square is',n);
console.log('=====================================');

console.log(`square of 10 is ${10*10}`);
  
console.log('========================================');



                      




