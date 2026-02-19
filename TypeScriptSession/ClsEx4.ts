class Parent
{
    protected x:number;
    protected y:number;

    getData(x:number, y:number)
    {
        this.x = x;
        this.y = y;
    }
}

class  Child extends Parent
{
    private sum:number;
    putData() : number
    {
        console.log("X val :  " + this.x);
        console.log("Y val :  " + this.y);
        this.sum = this.x+this.y;  
        return this.sum;
    }
}

var ch1 = new Child();
ch1.getData(100,300);
console.log("Addition : " + ch1.putData());