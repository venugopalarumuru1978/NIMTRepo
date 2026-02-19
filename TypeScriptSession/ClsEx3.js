var DemoCons = /** @class */ (function () {
    function DemoCons(x, y) {
        this.x = x;
        this.y = y;
        console.log("It is Constructor");
    }
    DemoCons.prototype.printData = function () {
        console.log("X val : " + this.x);
        console.log("Y val : " + this.y);
    };
    return DemoCons;
}());
var con1 = new DemoCons(45, 67);
con1.printData();
