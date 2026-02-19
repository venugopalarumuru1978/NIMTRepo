// function definition section
//  fun without arg and without return value
function DemoFun()
{
    console.log("This is User Defined Function");
}

// fun with arguments and without return value
function  FunWithArg(x, y)
{
    console.log("X val : " + x);
    console.log("Y val : " + y);
    let sum = x+y;
    console.log("Addition : " + sum);
}

// fun with args and return value
function  Cube(x)
{
    let cb = x*x*x;
    return cb;
}
//  fun without arg and with return value
function  Square()
{
    let x = 10;
    return (x*x);
}

// function calling section
DemoFun();
console.log("Main Function");
DemoFun();
FunWithArg(10,5);
let res = Cube(10);
console.log("10 Cube Value : "+ res);
console.log("10 Square Value is : " + Square());