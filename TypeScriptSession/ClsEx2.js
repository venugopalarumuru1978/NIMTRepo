var TestClass = /** @class */ (function () {
    function TestClass() {
    }
    TestClass.prototype.getData = function (x, y) {
        this.x = x;
        this.y = y;
    };
    TestClass.prototype.printData = function () {
        console.log("X val : " + this.x);
        console.log("Y val : " + this.y);
    };
    return TestClass;
}());
var tc1 = new TestClass();
tc1.getData(10, 20);
tc1.printData();
var tc2 = new TestClass();
tc2.getData(110, 210);
tc2.printData();
