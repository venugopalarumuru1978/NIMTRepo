const {Given, When, Then} = require('@cucumber/cucumber')

Given('provide values <{int}> and <{int}>', function (int, int2) {
        n1 = int;
        n2 = int2;
    return console.log('Assigned Values');
        });

         When('perform addition', function () {
           sum = n1+n2;
           return console.log('Arg Addition done');
         });

         Then('print result', function () {
           
           return console.log('Sum Value is : ',sum);
         });

         Given('provide values {int} and {int}', function (int, int2) {
            x = int;
            y = int2;
            return console.log("Values are x = ", x, " and y = ", y);
            });
        
            When('perform addition of two values', function () {
                add = x+y;
                return console.log("x and y addition is done");
            });

            Then('print those results', function () {
                
                return console.log("Addition is = ", add);
              });