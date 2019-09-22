var util = require('util');

function Person() {
    this.firstName = 'Bhoopendra',
    this.lastName = 'Kumar'
}

Person.prototype.greet = function() {
    console.log(`Hello  ${this.firstName} ${this.lastName}`);
}

function PoliceMan() {
    Person.call(this);
    this.badgeNumber = '1234'
}

util.inherits(PoliceMan, Person);

var officer = new PoliceMan();
officer.greet();