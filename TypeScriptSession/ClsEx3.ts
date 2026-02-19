class DemoCons
{
    private x:number;
    private y:number;

    public constructor(x:number, y:number)
    {
        this.x = x;
        this.y = y;
        console.log("It is Constructor");
    }

    public printData():void
    {
        console.log("X val : " + this.x);
        console.log("Y val : " + this.y);
    }
}

var con1 = new DemoCons(45,67);
con1.printData();
