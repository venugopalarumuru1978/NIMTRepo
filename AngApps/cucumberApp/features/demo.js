const {Given, When, Then} = require('@cucumber/cucumber')
    Given('Numbers are provided', function () {
          n1 = 10;
          n2 = 20;
           return console.log('Values are assigned');
         });

    When('Sum up both numbers here', function () {
           sum = n1+n2;
           return console.log('Sum is Done');
         });
    Then('Display sum  of numbers', function () {
           // Write code here that turns the phrase above into concrete actions
           return console.log("Addition is " + sum);
         });