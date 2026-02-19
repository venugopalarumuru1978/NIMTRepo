"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var DemMod_1 = require("./DemMod");
var Test = /** @class */ (function () {
    function Test() {
        this.tm = new DemMod_1.TestModule();
    }
    Test.prototype.print = function () {
        this.tm.get1();
        this.tm.get2();
    };
    return Test;
}());
var t1 = new Test();
t1.print();
