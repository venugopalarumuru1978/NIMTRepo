var Calcuations = /** @class */ (function () {
    function Calcuations() {
    }
    Calcuations.prototype.Square = function (x) {
        return x * x;
    };
    Calcuations.prototype.Cube = function (x) {
        var cb = x * x * x;
        return x + " Cube Value is " + cb;
    };
    return Calcuations;
}());
var calObj = new Calcuations();
console.log("Square Value is " + calObj.Square(10));
console.log(calObj.Cube(10));
