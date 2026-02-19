interface  iface1
{
    Square(x:number):number;
    Cube(x:number):string;
}

class Calcuations implements iface1
{
    Square(x: number): number {
        return x*x;
    }

    Cube(x: number): string {
        let cb = x*x*x;
        return x + " Cube Value is " + cb; 
    }
}

var calObj = new Calcuations();
console.log("Square Value is " + calObj.Square(10));
console.log(calObj.Cube(10));