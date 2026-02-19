import {TestModule}  from './DemMod';

class Test
{
    private tm:TestModule = new TestModule();

    print()
    {
        this.tm.get1();
        this.tm.get2();
    }
}

var t1 = new Test();
t1.print();