const {When, Then, Given} = require('@cucumber/cucumber')

Given('Numbers are provided', function () {
    n1 = 10;
    n2 = 34;
    return console.log("Values are defined");
  });

  When('Sum up both numbers here', function () {
    sum = n1+n2;
    return console.log("Sum is Done");
  });

  Then('Display sum  of numbers', function () {
    // Write code here that turns the phrase above into concrete actions
    return console.log("Sum value is : ", sum);
  });

  When('minus those numbers', function () {
    sub = n1-n2;
    return console.log("Substraction is Done");
  });

  Then('print minus value', function () {
    
    return console.log("Minus value is : ", sub);
  });