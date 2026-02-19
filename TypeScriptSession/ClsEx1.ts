class DemoClass
{
    private x:number = 10;
    private y:number = 20;

    public printData():void
    {
        console.log("X val : " + this.x);
        console.log("Y val : " + this.y);
    }
}

var dc1 = new DemoClass();
dc1.printData();