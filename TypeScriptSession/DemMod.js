"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.TestModule = void 0;
var TestModule = /** @class */ (function () {
    function TestModule() {
    }
    TestModule.prototype.get1 = function () {
        console.log("This is get1() method");
    };
    TestModule.prototype.get2 = function () {
        console.log("This is get2() method");
    };
    return TestModule;
}());
exports.TestModule = TestModule;
