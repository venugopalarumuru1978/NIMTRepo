class TestClass
{
    private x:number;
    private y:number;

    public getData(x:number, y:number)
    {
        this.x = x;
        this.y = y;
    }

    public printData()
    {
        console.log("X val : " + this.x);
        console.log("Y val : " + this.y);
    }
}

var tc1 = new TestClass();
tc1.getData(10,20);
tc1.printData();

var tc2 = new TestClass();
tc2.getData(110,210);
tc2.printData();
