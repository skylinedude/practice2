// Example of a higher-order function
function higherOrderFunction(a,b,ok) {
  // Calling the function passed as an argument
  let res=a+b
 ok(res)
}
higherOrderFunction(10,20,function sayHello(){
  console.log("Hello wrold!!!!!!!!")
});
