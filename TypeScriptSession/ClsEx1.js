var DemoClass = /** @class */ (function () {
    function DemoClass() {
        this.x = 10;
        this.y = 20;
    }
    DemoClass.prototype.printData = function () {
        console.log("X val : " + this.x);
        console.log("Y val : " + this.y);
    };
    return DemoClass;
}());
var dc1 = new DemoClass();
dc1.printData();
